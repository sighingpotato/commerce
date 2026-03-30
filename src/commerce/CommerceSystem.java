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
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            // 목록 출력
            for (int i = 0; i < categories.size(); i++) { // 컴퓨터는 숫자를 0부터 센다.
                System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
            }
            System.out.println("0. 종료     | 프로그램 종료");
            System.out.print("입력 -> ");

            int select;
            select = scanner.nextInt();

            if (select == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
                // 카테고리 이동
            } else if (select > 0 && select <= categories.size()) {
                Category selectedCategory = categories.get(select - 1); // 1 누르면 0번째 카테고리
                showCategory(selectedCategory);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showCategory(Category category) {
        System.out.println("[" + category.getCategoryName() + "]");
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

            System.out.printf("%-5s | %,5d원 | %s\n", selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDescription(), selectedProduct.getStock());
            // 장바구니 추가
            System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인       2. 취소");
            System.out.print("입력 -> ");

            int select1;
            select1 = scanner.nextInt();

            if (select1 == 1) {
                cart.add(new CartItem(selectedProduct, 1));
                System.out.println(selectedProduct.getName()+ "가 장바구니에 추가되었습니다.");
            } else {
                System.out.println("취소되었습니다.");
            }

        }
    }
}