package commerce;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Category> categories;
    private List<CartItem> cart;
//    cart = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
        this.cart = new ArrayList<>(); // 대입은 '생성자' 안에서 하기
    }

    // 작업 시작
    public void start() {
        while (true) {
            System.out.println("\n[ 실시간 커머스 플랫폼 메인 ]");
            // 목록 출력
            for (int i = 0; i < categories.size(); i++) { // 컴퓨터는 숫자를 0부터 센다.
                System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
            }
            System.out.println("0. 종료     | 프로그램 종료");
            System.out.println("6. 관리자 모드"); // 관리자 모드 메뉴 추가

            // 장바구니가 차 있으면 메뉴 출력
            if (!cart.isEmpty()) {
                System.out.println("\n[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소       | 진행중인 주문을 취소합니다.");
            }
            System.out.print("입력 -> ");

            int select;
            select = scanner.nextInt();
            scanner.nextLine(); // 다음 글자 입력을 위해 버퍼 타입 초기화

            if (select == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
                // 카테고리 이동
            } else if (select > 0 && select <= categories.size()) {
                Category selectedCategory = categories.get(select - 1); // 1 누르면 0번째 카테고리
                showCategory(selectedCategory);
            }
            // 4, 5번 추가
            else if (select == 4) {
                if (cart.isEmpty()) throw new IllegalArgumentException("장바구니가 비어있습니다.");
                order(); // 아래에 있는 결제 호출
            } else if (select == 5) {
                if (cart.isEmpty()) throw new IllegalArgumentException("장바구니가 비어있습니다.");
                // 메인으로 되돌아가기 위해 장바구니 비우기
                cart.clear();
            } else {
                System.out.println("잘못된 입력입니다.");
            }
            // 6번 추가
            if (select == 6) {
                if (checkAdminPassword()) {
                    runAdminMode();
                }
            }
        }
    }
    // 6번 내 checkAdminPassword 선언
    private boolean checkAdminPassword() {
        String password = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("관리자 비밀번호를 입력해주세요: ");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                return true;
            } else {
                attempts++;
                System.out.println("비밀번호가 틀렸습니다. (남은 횟수: " + (3 - attempts) + ")");
            }
        }
        System.out.println("비밀번호 3회 오류로 메인 메뉴로 돌아갑니다.");
        return false;
    }
    // 6번 내 runAdminMode 선언
    private void runAdminMode() {}

    private void showCategory(Category category) {
        System.out.println("\n[ " + category.getCategoryName() + " 카테고리 " + "]");
        List<Product> products = category.getProducts();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf("%d. %-12s | %,10d원 | %s\n", (i + 1), product.getName(), product.getPrice(), product.getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");

        int select;
        select = scanner.nextInt();

        if (select > 0 && select <= products.size()) {
            Product selectedProduct = products.get(select - 1);

            // 재고 확인
            if (selectedProduct.getStock() <= 0) {
                System.out.println("죄송합니다. 이 상품은 품절되었습니다.");
                return;
            }

            System.out.printf("%-5s | %,5d원 | %s | 재고: %d개\n", selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDescription(), selectedProduct.getStock());
            // 장바구니 추가
            System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인       2. 취소");
            System.out.print("입력 -> ");

            int select2;
            select2 = scanner.nextInt();

            if (select2 == 1) {
                cart.add(new CartItem(selectedProduct, 1));
                System.out.println(selectedProduct.getName()+ "가 장바구니에 추가되었습니다.\n");
            } else {
                System.out.println("취소되었습니다.\n");
            }
        }
    }
    private void order() {
        System.out.println("\n아래와 같이 주문 하시겠습니까?");
        System.out.println("\n[ 장바구니 내역 ]");

        // 총 금액 계산 초기화
        int totalPrice = 0;

        // 장바구니 물건 출력
        for (int i = 0; i < cart.size(); i++) {
            CartItem item = cart.get(i);
            Product selectedProduct = item.getProduct();
            System.out.printf("%s | %,d원, | %s | 수량: %d개\n",selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDescription(), item.getQuantity());

            totalPrice += selectedProduct.getPrice() * item.getQuantity();
        }

        System.out.println("\n[ 총 주문 금액 ]");
        System.out.printf("%,d원\n", totalPrice);
        System.out.println("\n1. 주문 확정      2. 메인으로 돌아가기");
        System.out.print("입력 -> ");

        int orderSelect;
        orderSelect = scanner.nextInt();

        if (orderSelect == 1) {
            for (int i =0; i < cart.size(); i++) {
                CartItem item = cart.get(i);
                Product selectedProduct = item.getProduct();

                int oldStock = selectedProduct.getStock();
                int newStock = oldStock - item.getQuantity();

                // setter로 재고 수정
                selectedProduct.setStock(newStock);
                System.out.printf("%s 재고가 %d개 → %d개로 업데이트되었습니다.\n", selectedProduct.getName(), oldStock, newStock);
            }

            System.out.printf("주문이 완료되었습니다! 총 금액: %,d원\n", totalPrice);
            cart.clear();
        }
    }
}