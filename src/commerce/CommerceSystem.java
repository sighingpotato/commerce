package commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            }
            // 6번 추가
            else if (select == 6) {
                if (checkAdminPassword()) {
                    runAdminMode();
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 6번 내 checkAdminPassword 선언
    private boolean checkAdminPassword() {
        String password = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("관리자 비밀번호를 입력해주세요: ");
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
    private void runAdminMode() {
        while (true) {
            System.out.println("\n[ 관리자 모드 ]");
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 수정");
            System.out.println("3. 상품 삭제");
            System.out.println("0. 메인으로 돌아가기");
            System.out.print("입력 -> ");

            int adminSelect = scanner.nextInt();
            scanner.nextLine();

            if (adminSelect == 0) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break; // 관리자 모드 종료
            } else if (adminSelect == 1) {
                addNewProduct();
            } else if (adminSelect == 2) {
                editProduct();
            } else if (adminSelect == 3) {
                deleteProduct();
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // runAdminMode 내 addNewProduct 선언
    private void addNewProduct() {
        System.out.println("\n어느 카테고리에 상품을 추가하시겠습니까?");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
        }
        System.out.print("입력 -> ");
        int categorySelect = scanner.nextInt();

        if (categorySelect > 0 && categorySelect <= categories.size()) {
            Category selectedCategory = categories.get(categorySelect - 1);

            System.out.println("\n[" + selectedCategory.getCategoryName() + " 카테고리에 상품 추가 ]");
            System.out.print("상품명을 입력해주세요: ");
            String name = scanner.nextLine();

            System.out.print("가격을 입력해주세요: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("상품 설명을 입력해주세요: ");
            String description = scanner.nextLine();

            System.out.print("재고 수량을 입력해주세요: ");
            int stock = scanner.nextInt();
            scanner.nextLine();

            System.out.printf("\n%s | %,d원 | %s | 재고: %d개\n", name, price, description, stock);
            System.out.print("위 정보로 상품을 추가하시겠습니까?\n1. 확인    2. 취소\n입력 -> ");

            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == 1) {
                selectedCategory.addProduct(new Product(name, price, description, stock));
                System.out.println("상품이 성공적으로 추가되었습니다!");
            } else {
                System.out.println("추가가 취소되었습니다.");
            }
        }
    }

    private void editProduct() {
        System.out.print("\n수정할 상품명을 입력해주세요: ");
        String productName = scanner.nextLine();

        // foundProduct 값 초기화, 숫자가 아니므로 0이 아니다.
        Product foundProduct = null;

        // 카테고리 리스트에서 이름이 같은 상품 찾기
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                if (product.getName().equals(productName)) {
                    foundProduct = product;
                    break;
                }
            }
            if (foundProduct != null)
                break;
        }

        // 상품을 못 찾았을 때
        if (foundProduct == null) {
            System.out.println("해당하는 이름의 상품을 찾을 수 없습니다.");
            return;
        }

        // 상품 찾았을 때
        System.out.printf("현재 상품 정보: %s | %,d원 | %s | 재고: %d개\n", foundProduct.getName(), foundProduct.getPrice(), foundProduct.getDescription(), foundProduct.getStock());
        System.out.println("\n수정할 항목을 선택해주세요:");
        System.out.println("1. 가격\n2. 설명\n3. 재고수량");
        System.out.print("입력 -> ");
        int editSelect = scanner.nextInt();
        scanner.nextLine();

        // 가격 수정을 위해 setter 사용
        if (editSelect == 1) {
            System.out.printf("현재 가격: %,d원\n새로운 가격을 입력해주세요: ", foundProduct.getPrice());
            int newPrice = scanner.nextInt();
            int oldPrice = foundProduct.getPrice();
            foundProduct.setPrice(newPrice); // 가격 변경
            System.out.printf("%s의 가격이 %,d원 -> %,d원으로 수정되었습니다.\n", foundProduct.getName(), oldPrice, newPrice);
        } else if (editSelect == 2) {
            System.out.printf("현재 설명: %s\n새로운 설명을 입력해주세요: ", foundProduct.getDescription());
            String newDescription = scanner.nextLine();
            foundProduct.setDescription(newDescription);
            System.out.println("설명이 수정되었습니다.");
        } else if (editSelect == 3) {
            System.out.printf("현재 재고: %d개\n새로운 재고를 입력해주세요: ", foundProduct.getStock());
            int newStock = scanner.nextInt();
            int oldStock = foundProduct.getStock();
            foundProduct.setStock(newStock);
            System.out.printf("%s개의 재고가 %d개 -> %d개로 수정되었습니다.\n", foundProduct.getName(), oldStock, newStock);
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    private void deleteProduct() {
        System.out.print("\n삭제할 상품명을 입력해주세요: ");
        String productName = scanner.nextLine();

        // 어느 상품인지, 어느 카테고리에 있는지 알아야 삭제 가능
        Product foundProduct = null;
        Category foundCategory = null;

        // 상품 찾기
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                if (product.getName().equals(productName)) {
                    foundProduct = product;
                    break;
                }
            }
            if (foundProduct != null)
                break;
        }

        if (foundProduct == null) {
            System.out.println("해당하는 이름의 상품을 찾을 수 없습니다.");
            return;
        }

        // 삭제 확인
        System.out.printf("정말 %s 상품을 삭제하시겠습니까?\n1. 확인    2. 취소\n", foundProduct.getName());
        System.out.print("입력 -> ");
        int select = scanner.nextInt();

        if (select == 1) {
            foundCategory.getProducts().remove(foundProduct);
            // 람다와 removeIf를 이용하여 지운 상품과 이름이 같으면 장바구니에서도 지운다.
            cart.removeIf(cartItem -> cartItem.getProduct().getName().equals(productName));
            System.out.println(foundProduct.getName() + "상품이 성공적으로 삭제되었습니다!");
        } else {
            System.out.println("삭제가 취소되었습니다.");
        }
    }

    private void showCategory(Category category) {
        System.out.println("\n[ " + category.getCategoryName() + " 카테고리 " + "]");
        List<Product> products = category.getProducts();
        System.out.println("1. 전체 상품 보기");
        System.out.println("2. 가격대별 필터링 (100만원 이하)");
        System.out.println("3. 가격대별 필터링 (100만원 초과)");
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");

        int select;
        select = scanner.nextInt();
        scanner.nextLine();

        if (select == 0)
            return;

        List<Product> filteredProducts;

        if (select == 1) {
            filteredProducts = category.getProducts();
            System.out.println("\n[ 전체 상품 목록 ]");// 전체 상품 보기
        } else if (select == 2) {
            filteredProducts = category.getProducts().stream() // 가격이 100만 이하 걸러내고 리스트로 묶기
                    .filter(product -> product.getPrice() <= 1000000)
                    .collect(Collectors.toList());
            System.out.println("\n[ 100만원 이하 상품 목록 ]");
        } else if (select == 3) {
            filteredProducts = category.getProducts().stream()
                    .filter(product -> product.getPrice() > 1000000) // 100만 초과 걸러내고 리스트로 묶기
                    .collect(Collectors.toList());
            System.out.println("\n[ 100만원 초과 상품 목록 ]");
        } else {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        if (filteredProducts.isEmpty()) {
            System.out.println("조건에 맞는 상품이 없습니다.");
            return;
        }

        for (int i = 0; i < filteredProducts.size(); i++) { // products.size() -> filteredProducts.size()로 바꿔준다.
            Product product = filteredProducts.get(i);
            System.out.printf("%d. %-12s | %,10d원 | %s | 재고: %d개\n", (i + 1), product.getName(), product.getPrice(), product.getDescription(), product.getStock());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");

        int productSelect;
        productSelect = scanner.nextInt();
        scanner.nextLine();

        if (productSelect == 0)
            return;

        if (productSelect > 0 && productSelect <= filteredProducts.size()) {
            Product selectedProduct = filteredProducts.get(productSelect - 1);

            // 재고 확인
            if (selectedProduct.getStock() <= 0) {
                System.out.println("죄송합니다. 이 상품은 품절되었습니다.");
                return;
            }

            System.out.printf("\n선택한 상품: %-5s | %,5d원 | %s | 재고: %d개\n", selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDescription(), selectedProduct.getStock());
            // 장바구니 추가
            System.out.println("위 상품을 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인       2. 취소");
            System.out.print("입력 -> ");

            int choice;
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                boolean alreadyInCart = false;

                // 이미 담긴 상품인지 확인
                for(CartItem item : cart) {
                    if(item.getProduct().getName().equals(selectedProduct.getName())) {
                        item.addQuantity(1);
                        alreadyInCart = true;
                        break;
                    }
                }

                // 담긴 상품이 아니면 새로 추가
                if (!alreadyInCart) {
                    cart.add(new CartItem(selectedProduct, 1));
                }
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
            System.out.println("\n고객 등급을 입력해주세요.");
            System.out.println("1. BRONZE   :  0% 할인");
            System.out.println("2. SILVER   :  5% 할인");
            System.out.println("3. GOLD     : 10% 할인");
            System.out.println("4. PLATINUM : 15% 할인");
            System.out.print("입력 -> ");

            int gradeSelect = scanner.nextInt();
            scanner.nextLine();

            // enum의 values() 사용
            CustomerGrade[] grades = CustomerGrade.values();
            CustomerGrade selectedGrade = grades[gradeSelect - 1]; // 1입력 시 0번째부터

            // 할인 금액 계산
            int discountPrice = (int) (totalPrice * selectedGrade.getDiscountRate()); // int * double 이므로 괄호 안에 필요한 타입을 넣어준다.
            int lastPrice = totalPrice - discountPrice;

            System.out.println("\n주문이 완료되었습니다!");
            System.out.printf("할인 전 금액: %,d원\n", totalPrice);
            System.out.printf("%s 등급 할인(%.0f%%): -%,d원\n", selectedGrade.name(), selectedGrade.getDiscountRate() * 100, discountPrice);

            for (int i =0; i < cart.size(); i++) {
                CartItem item = cart.get(i);
                Product selectedProduct = item.getProduct();

                int oldStock = selectedProduct.getStock();
                int newStock = oldStock - item.getQuantity();

                // setter로 재고 수정
                selectedProduct.setStock(newStock);
                System.out.printf("%s 재고가 %d개 → %d개로 업데이트되었습니다.\n", selectedProduct.getName(), oldStock, newStock);
            }

            System.out.printf("최종 결제 금액: %,d원\n", lastPrice);

            cart.clear();
        }
    }
}