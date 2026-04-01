# 커머스 과제

## 커머스 필수 과제

### 클래스 정의

- Main : 시작 지점이 되는 클래스, `public static void main(String[] args)`
- Product: 개별 상품 정보를 가지는 클래스
    - 상품명, 가격, 설명, 재고수량
        - 예시: Galaxy S24, 1200000, 최신 스마트폰, 50
        - `new Product("Galaxy S24", 1200000, "최신 스마트폰", 50)`
- CommerceSystem: 프로그램 비즈니스 로직 클래스
- Category: Product 클래스를 관리하는 클래스
    - 예시 : 전자제품, 의류, 식품 등 각 카테고리 내에 여러 `Product`를 포함합니다.

### STEP 1. 객체 지향 설계를 적용해 상품 관리 시스템을 프로그래밍해보자

- [ ]  **상품 목록 출력**
    - [ ]  JAVA 프로그램을 실행하면 여러 전자제품을 출력합니다.
    - [ ]  제시된 상품 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
- [ ]  **`Product` 클래스 생성하기**
    - [ ]  설명 : 개별 상품을 관리하는 클래스입니다. 현재는 전자제품만 관리합니다.
    - [ ]  클래스는 `상품명`, `가격`, `설명`, `재고수량` 필드를 갖습니다.
- [ ]  `main` **함수에서 `Product` 클래스를 생성하여 상품 목록을 추가합니다.**
    - [ ]  `Product` 객체 생성을 통해 `상품명`, `가격`, `설명`, `재고수량`을 세팅합니다.
        - [ ]  키워드: `new`
    - [ ]  `List`를 선언하여 여러 `Product`을 추가합니다.
        - [ ]  `List<Product> products = new ArrayList<>();`
    - [ ]  반복문을 활용해 `products`를 탐색하면서 하나씩 접근합니다.
- [ ]  **STEP 1을 구현하면 터미널에 이렇게 보여집니다.**
    
    ```java
    [ 실시간 커머스 플랫폼 - 전자제품 ]
    1. Galaxy S25     | 1,200,000원 | 최신 안드로이드 스마트폰
    2. iPhone 16      | 1,350,000원 | Apple의 최신 스마트폰
    3. MacBook Pro    | 2,400,000원 | M3 칩셋이 탑재된 노트북
    4. AirPods Pro    |   350,000원 | 노이즈 캔슬링 무선 이어폰
    0. 종료           | 프로그램 종료
    0 <- // 0을 입력
    
    커머스 플랫폼을 종료합니다.
    ```
    

### **STEP 2**. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기

- [ ]  **`CommerceSystem` 클래스 생성하기**
    - [ ]  **설명**: 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스입니다.
    - [ ]  `Product`를 관리하는 리스트가 필드로 존재합니다.
    - [ ]  `main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.
    - [ ]  `List<Product> products` 는 `CommerceSystem` 클래스 생성자를 통해 값을 할당합니다.
        - [ ]  `CommerceSystem` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.
### **STEP 3**. 객체 지향 설계를 적용해 상품 카테고리와 고객 관리를 클래스 기반으로 관리하기

- [ ]  **`Category` 클래스 생성하기**
    - [ ]  설명 : Product 클래스를 관리하는 클래스입니다.
    - [ ]  전자제품, 의류, 식품 등 각 카테고리 내에 여러 `Product`를 만들어 줍니다.
    - [ ]  `List<Product>` 은 `CommerceSystem` 클래스가 관리하기에 적절하지 않으므로 Category 클래스가 관리하도록 변경합니다.
    - [ ]  여러 상품들을 포함하는 상위 개념 '전자제품' 같은 `카테고리 이름` 필드를 갖습니다.
    - [ ]  카테고리 이름을 반환하는 메서드가 구현되어야 합니다.
- [ ]  **`Customer` 클래스 생성하기**
    - [ ]  설명 : 고객 정보를 관리하는 클래스입니다.
    - [ ]  클래스는 `고객명`, `이메일`, `등급` 필드를 갖습니다.
- [ ]  구조 예시
    
    ```java
    public static void main(String[] args) {
            // CommerceSystem 객체 생성 및 초기화
            
            // CommerceSystem 내 시작하는 함수 호출
    }
    
    public class CommerceSystem {
    				// 적절한 생성자 선언
    
            start() {
            
            //비즈니스 로직 작성
            }
    
    }
    
    public class Category {
            // Product 클래스를 List로 관리
    
            // 구조에 맞게 메소드 선언 
    }
    
    public class Product {
            // 상품명, 가격, 설명, 재고수량 필드 선언하여 관리
    
            // 구조에 맞게 메소드 선언 
    }
    
    public class Customer {
            // 고객명, 이메일, 등급 필드 선언하여 관리
    
            // 구조에 맞게 메소드 선언 
    }
    ```
    
- [ ]  **STEP 3를 구현하면 터미널에 이렇게 보여집니다.**
    
    ```java
    [ 실시간 커머스 플랫폼 메인 ]
    1. 전자제품
    2. 의류
    3. 식품
    0. 종료      | 프로그램 종료
    1 <- // 1을 입력
    
    [ 전자제품 카테고리 ]
    1. Galaxy S24     | 1,200,000원 | 최신 안드로이드 스마트폰
    2. iPhone 15      | 1,350,000원 | Apple의 최신 스마트폰
    3. MacBook Pro    | 2,400,000원 | M3 칩셋이 탑재된 노트북
    4. AirPods Pro    |   350,000원 | 노이즈 캔슬링 무선 이어폰
    0. 뒤로가기
    2 <- // 2를 입력
    선택한 상품: iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰 | 재고: 30개
    
    [ 실시간 커머스 플랫폼 메인 ]
    1. 전자제품
    2. 의류
    3. 식품
    0. 종료      | 프로그램 종료
    0 <- // 0을 입력
    커머스 플랫폼을 종료합니다.
    
    ```
    

### **STEP 4**. 캡슐화 적용하기

- [ ]  `Product`, `Category`, `Customer` 그리고 `CommerceSystem` 클래스의 필드에 직접 접근하지 못하도록 설정합니다.
- [ ]  Getter와 Setter 메서드를 사용해 데이터를 관리합니다.

#

먼저, 조건에 맞게 Product, Customer, Category, CommerceSystem, Main 클래스를 만들어줬다.

Product 클래스를 가장 먼저 작성하기 시작했는데 예시와 같이 제품에 필요한 이름, 가격, 설명, 재고를 캡슐화 하여 선언해줬다. 그리고 생성자를 통해 4가지를 지정해줬다.

그 다음 캡슐화된 정보를 볼 수 있게 getter를 이용하고 재고를 수정할 수 있게 하기 위해 setter를 사용하여 다음과 같은 코드가 나오게 됐다.

```java
public class Product {
    // 속성
    private String name;
    private int price;
    private String description;
    private int stock;

    // 생성자
    public Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // 정보 가져오기 getter
    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getDescription() { 
    return description; }
    public int getStock() { return stock; }

    // 재고 변경 setter
    public void setStock(int stock) { this.stock = stock; }
}
```

다음엔 고객의 정보를 담은 Customer 클래스를 작업해줬다. 안전하게 접근할 수 있게 해야 하므로 private으로 이름, 이메일, 등급을 선언해준 후 생성자로 지정해준다. 그리고 정보를 볼 수 있게 getter를 이용해줬다.

그 후에는 Category 클래스를 작업해줬다.

카테고리의 이름과 상품을 진열할 리스트가 필요해서 선언해줬고 함부로 카테고리의 이름과 상품의 리스트에 함부로 접근할 수 없도록 캡슐화를 해줬다.

생성자를 통하여 카테고리 이름과 상품 리스트를 준비해줬고 addProduct를 선언하여 상품을 추가할 수 있도록 해줬다. 그리고 getter를 이용하여 카테고리 이름과 리스트에 접근할 수 있도록 해줬다.

이제 상품과 고객에 관련된 정보의 클래스는 만들었으니 본격적인 시스템 클래스를 만들고자 CommerceSystem을 작업했다. 시스템에서는 카테고리 리스트를 불러올 수 있어야 하여 리스트를 선언해줬고 그 다음 생성자를 통해 카테고리 리스트를 준비해줬다.

리스트도 준비했으니 조건에 나온대로 start를 이용하게 되었는데 무엇을 뜻하는 변수인지 알 수 없고 공용으로 사용하는 것이니 public void start로 선언해줬다.

반복을 해줘야 하므로 while문을 이용하였고 카테고리 목록은 for문을 이용해서 출력했다. 카테고리 목록 선택은 scanner를 이용하여 입력을 받았고 if, else if, else문을 사용하여 카테고리 번호가 맞는지도 확인해줬다.

그 다음엔 카테고리가 0이 아닌 정상적으로 입력되었을 때는 카테고리 안을 보여줄 수 있도록 선언해줬고 내부에서 불러와야 할 상품의 리스트는 Category 클래스에 private으로 캡슐화가 되어 있으므로 getter를 이용해 불러와줬다.

다음도 카테고리 목록 내부와 같이 for문과 scanner를 이용하였고 이번엔 상품을 선택해서 출력만 해주면 되므로 if문을 이용하여 선택한 상품을 출력할 수 있게만 해줬다. 
```java
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private List<Category> categories;
    private Scanner scanner = new Scanner(System.in);


    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
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
            System.out.println((i + 1) + ". " + product.getName() + "     | " + product.getPrice() + "원 | " + product.getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");

        int select;
        select = scanner.nextInt();

        if (select > 0 && select <= products.size()) {
            Product selectedProduct = products.get(select - 1);
            System.out.println(("선택한 상품: " + selectedProduct.getName() + " | " + selectedProduct.getPrice() + " | " + selectedProduct.getDescription() + " | " + selectedProduct.getStock()));
        }
    }
}
```
이젠 이 모든걸 실행시켜 줄 Main 클래스를 작업해줬다.

카테고리 생성, 상품 생성, 카테고리에 추가, CommerceSystem 생성 및 전달, start 시작 역할을 해줘야 하는 Main 클래스는 예시를 참고하여 다음과 같이 나왔다.
```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 카테고리 생성
        Category electronics = new Category("전자제품");
        Category cloths = new Category("의류");
        Category food = new Category("식품");

        // 상품 배열에 올리기
        electronics.addProduct(new Product("Galaxy S24", 1200000, "최신 스마트폰", 40));
        electronics.addProduct(new Product("iPhone 15", 1350000, "Apple의 최신 스마트폰", 30));
        electronics.addProduct(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 10));
        electronics.addProduct(new Product("Airpods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 60));

        cloths.addProduct(new Product("코트", 100000, "롱 코트", 60));
        cloths.addProduct(new Product("바지", 80000, "슬렉스 바지", 75));

        food.addProduct(new Product("치킨", 15000, "양념 통닭", 35));
        food.addProduct(new Product("고기", 10000, "돼지고기 1인분", 40));

        // 전체 리스트
        List<Category> allCategories = new ArrayList<>();
        allCategories.add(electronics);
        allCategories.add(cloths);
        allCategories.add(food);

        CommerceSystem system = new CommerceSystem(allCategories);
        system.start();
    }
}
```
필수 과제의 구현은 우선 이렇게 끝이 났다. 하지만 출력을 시도했을 때 가격이 예시와 다르게  | 1,200,000원 | 이 아닌  | 1200000원 | 같은 방식으로 출력이 되었고 무엇이 문제인지 고민을 해보게 되었다.

그렇게 검색을 해본 결과 printf를 통해 해결할 수 있다는 것을 알게 되었다. printf에서 f는 Format의 약자로 printf는 미리 % 모양의 구멍을 뚫어놓은 문장을 만들어 그 구멍에 넣을 재료들을 순서대로 던져주는 방식이었다.

%d (Decimal): 정수가 들어갈 구멍

%s (String): 문자열이 들어갈 구멍

위 정보를 토대로 아래와 같이 수정할 수 있었다.

카테고리 가격 및 정렬 수정 전

```java
private void showCategory(Category category) {
        System.out.println("[" + category.getCategoryName() + "]");
        List<Product> products = category.getProducts();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + "     | " + product.getPrice() + "원 | " + product.getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");
```

카테고리 가격 및 정렬 수정 후

```java
private void showCategory(Category category) {
        System.out.println("[" + category.getCategoryName() + "]");
        List<Product> products = category.getProducts();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.printf("%d. %-12s | %,10d원 | %s\n", (i + 1), product.getName(), product.getPrice(), product.getDescription());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("입력 -> ");
```

선택한 상품 가격 및 정렬 수정 전

```java
if (select > 0 && select <= products.size()) {
						Product selectedProduct = products.get(select - 1);
						System.out.println(("선택한 상품: " + selectedProduct.getName() + " | " + selectedProduct.getPrice() + " | " + selectedProduct.getDescription() + " | " + selectedProduct.getStock()));
						]
```

선택한 상품 가격 및 정렬 수정 후

```java
if (select > 0 && select <= products.size()) {
            Product selectedProduct = products.get(select - 1);
            System.out.printf("%-5s | %,5d원 | %s\n", selectedProduct.getName(), selectedProduct.getPrice(), selectedProduct.getDescription(), selectedProduct.getStock());
            }
```

"%d. %-12s | %,10d원 | %s\n" 위 코드에서 사용한 문장을 다음과 같이 정리해봤다.

- %d: 상품 번호 숫자.
- %-12s: 상품명 자리
    - 12: 이름 길이에 상관 없이 줄을 맞추기 위해 12칸의 빈 공간 확보
    - -: 글자는 왼쪽(-)으로 붙여서 정렬 (안쓰는 경우엔 오른쪽 정렬)
- %-10d원: 가격 자리.
    - 12: 오른쪽 정렬로 숫자가 들어갈 12칸의 공간 확보
    - ,: 천 단위마다 콤마를 찍어주는 것
- %s: 상품 설명
- \n: printf는 출력이 끝난 후 줄바꿈을 안해주므로 줄바꿈 명령어를 넣어줘야 한다.

위와 같이 코드를 수정하자 예시에 나온 것처럼 정상적으로 결과 값이 정렬되어 콤마가 찍혀나오는 것을 볼 수 있었다.

## 커머스 도전 과제

도전 기능 가이드

<aside>

- 스스로 판단해 **필요한 객체**를 자유롭게 정의하고, **객체 간 협력 흐름**을 설계해보세요.
- ‘자바 개념 확장’ 및 기존 과제에서 학습한 **Enum, 람다, 스트림**을 적극 활용해 **고객 등급별 할인, 가격대 필터링, 장바구니 항목 제거/검색** 등의 기능을 설계·구현해보세요.
</aside>

### Lv 1. 장바구니 및 주문하기 기능을 추가하기

- [ ]  **장바구니 생성 및 관리 기능**
    - [ ]  사용자가 선택한 상품을 장바구니에 추가할 수 있는 기능을 제공합니다.
    - [ ]  장바구니는 상품명, 수량, 가격 정보를 저장하며, 항목을 동적으로 추가 및 조회할 수 있어야 합니다.
    - [ ]  사용자가 잘못된 선택을 했을 경우 예외를 처리합니다(예: 유효하지 않은 상품 번호 입력)
- [ ]  **재고 관리 시스템**
    - [ ]  상품을 장바구니에 담을 때 재고를 확인하고, 재고가 부족할 경우 경고 메시지를 출력합니다.
    - [ ]  주문 완료 시 해당 상품의 재고를 차감합니다.
- [ ]  **장바구니 출력 및 금액 계산**
    - [ ]  사용자가 주문을 시도하기 전에, 장바구니에 담긴 모든 상품과 총 금액을 출력합니다.
    - [ ]  출력 예시
        - [ ]  각 상품의 이름, 가격, 수량
        - [ ]  총 금액 합계
- [ ]  **장바구니 담기 기능**
    - [ ]  상품을 선택하면 장바구니에 추가할 지 물어보고, 입력값에 따라 "추가", "취소" 처리합니다.
    - [ ]  장바구니에 담은 목록을 출력합니다.
- [ ]  **주문 기능**
    - [ ]  장바구니에 담긴 모든 항목을 출력합니다.
    - [ ]  합산하여 총 금액을 계산하고, "주문하기"를 누르면 장바구니를 초기화하고 재고를 차감합니다.
- 구현 예시
    
    ```java
    
    1. 전자제품
    2. 의류
    3. 식품
    0. 종료      | 프로그램 종료
    1 <- // 1을 입력
    
    [ 전자제품 카테고리 ]
    1. Galaxy S24     | 1,200,000원 | 최신 안드로이드 스마트폰 | 재고: 25개
    2. iPhone 15      | 1,350,000원 | Apple의 최신 스마트폰 | 재고: 30개
    3. MacBook Pro    | 2,400,000원 | M3 칩셋이 탑재된 노트북 | 재고: 15개
    4. AirPods Pro    |   350,000원 | 노이즈 캔슬링 무선 이어폰 | 재고: 50개
    0. 뒤로가기
    2 <- // 2를 입력
    선택한 상품: iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰 | 재고: 30개
    
    // 2번을 누르면 나오는 메뉴입니다.
    "iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰"
    위 상품을 장바구니에 추가하시겠습니까?
    1. 확인        2. 취소
    1 <-
    
    // 1번을 누르면 나오는 메뉴입니다.
    iPhone 15가 장바구니에 추가되었습니다.
    
    // 장바구니에 상품이 들어 있으면 아래와 같이 [ 주문 관리 ] 가 추가로 출력됩니다.
    // 만약에 장바구니에 상품이 들어 있지 않다면 [ 주문 관리 ] 가 출력되지 않습니다.
    // 미출력일 때 4,5 번을 누르면 예외를 던져줘야 합니다.
    아래 메뉴를 선택해주세요.
    
    [ 실시간 커머스 플랫폼 메인 ]
    1. 전자제품
    2. 의류
    3. 식품
    0. 종료      | 프로그램 종료
    
    [ 주문 관리 ]
    4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.
    5. 주문 취소       | 진행중인 주문을 취소합니다.
    4 <- // 4를 입력
    
    // 4번을 누르면 나오는 메뉴입니다.
    아래와 같이 주문 하시겠습니까?
    
    [ 장바구니 내역 ]
    iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰 | 수량: 1개
    
    [ 총 주문 금액 ]
    1,350,000원
    
    1. 주문 확정      2. 메인으로 돌아가기
    1 <-
    
    // 1번을 누르면 나오는 메뉴입니다.
    주문이 완료되었습니다! 총 금액: 1,350,000원
    iPhone 15 재고가 30개 → 29개로 업데이트되었습니다.
    ```
    

우선은 LV 1 부터 작업을 시작했다. 먼저 추가만 해주면 되는 장바구니와 재고 관리 시스템부터 작업해줬다. 장바구니는 담기, 관리 기능을 먼저 추가해줬을 때 CartItem 클래스를 생성해주게 되었고 다음과 같이 나왔다.

```java
public class CartItem {
    private Product product;
    private int quantitiy;

    public CartItem(Product product, int quantitiy) {
        this.product = product;
        this.quantitiy = quantitiy;
    }

    // private에 접근하기 위한 getter
    public Product getProduct() {
        return product;
    }
    public int getQuantitiy () {
        return quantitiy;
    }

    // 상품 추가 시 수량 증가
    public void addQuantity(int amount) {
        this.quantitiy += amount;
    }
}
```

장바구니를 세팅할 때 헤맨 부분인데 리스트에 있는 상품을 그대로 장바구니에 넣으면 안된다. 리스트의 상품은 원본 정보이고, 장바구니에 담길 때는 수량 정보가 추가로 필요하므로 새로운 리스트가 필요해서 새로운 리스트를 선언해줬다. 처음엔 주석처리된 부분 처럼 선언해줬지만 이 곳은 변수를 선언하는 구역이고 대입은할 수 없는 구역이라 생성자 안에서 해줬다.

```java
public class CommerceSystem {
    private List<Category> categories;
    private List<CartItem> cart;
//    cart = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
        this.cart = new ArrayList<>(); // 대입은 '생성자' 안에서 하기
```

CommerceSystem 클래스의 경우 장바구리 관리 시스템을 추가 하기 위해서 가격 출력 전에 약간의 과정이 필요해졌는데 그 부분은 다음과 같이 바뀌었다.

```java
if (select for (int i = 0; i < products.size(); i++) {
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
                System.out.println(selectedProduct.getName()+ "가 장바구니에 추가되었습니다.\");
            } else {
                System.out.println("취소되었습니다.");
            }
```

이제는 결제를 위하여 장바구니가 비어있지 않을 때만 주문 관리 메뉴가 나타날 수 있도록 start()를 수정해줬다.

```java
public void start() {
        while (true) {
            System.out.println("\n[ 실시간 커머스 플랫폼 메인 ]");
            // ... 기존 카테고리 출력 로직 ...

            // 장바구니가 차 있으면 메뉴 출력
            if (!cart.isEmpty()) {
                System.out.println("\n[ 주문 관리 ]");
                System.out.println("4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. 주문 취소       | 진행중인 주문을 취소합니다.");
            }
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
        }
    }
```

다음엔 주문 및 재고 차감을 반영하기 위해 order를 만들어 CommerceSystem 맨 아래에 추가해줬다. 예시를 참고하여 작성하여 다음과 같이 마무리했다.

```java
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
```
### LV 2. 관리자 모드 추가

- [ ]  **관리자 인증 기능**
    - [ ]  관리자용 비밀번호 설정 및 인증 시스템 구현
    - [ ]  메인 메뉴에 "6. 관리자 모드" 옵션 추가
    - [ ]  비밀번호 입력 시 3회 실패하면 메인 메뉴로 돌아가기
- [ ]  **상품 추가 기능**
    - [ ]  새로운 상품의 정보를 입력받아 기존 카테고리에 추가
    - [ ]  입력받을 정보: 상품명, 가격, 설명, 재고수량
    - [ ]  카테고리 선택 후 해당 카테고리에 상품 추가
    - [ ]  중복 상품명 검증 (같은 카테고리 내에서)
- [ ]  **상품 수정 기능**
    - [ ]  기존 상품의 정보 수정 (가격, 설명, 재고수량)
    - [ ]  상품명으로 검색하여 수정할 상품 선택
    - [ ]  수정할 항목 선택 후 새로운 값 입력
- [ ]  **상품 삭제 기능**
    - [ ]  기존 상품을 카테고리에서 제거
    - [ ]  삭제 전 확인 메시지 출력
    - [ ]  삭제된 상품이 장바구니에 있다면 장바구니에서도 제거
- 구현 예시
    
    ```java
    [ 실시간 커머스 플랫폼 메인 ]
    1. 전자제품
    2. 의류  
    3. 식품
    0. 종료      | 프로그램 종료
    6. 관리자 모드
    6 <- *// 6을 입력*
    
    관리자 비밀번호를 입력해주세요: 
    admin123 <- *// 비밀번호 입력*
    
    [ 관리자 모드 ]
    1. 상품 추가
    2. 상품 수정
    3. 상품 삭제
    4. 전체 상품 현황
    0. 메인으로 돌아가기
    1 <- *// 1을 입력*
    
    어느 카테고리에 상품을 추가하시겠습니까?
    1. 전자제품
    2. 의류
    3. 식품
    1 <- *// 1을 입력*
    
    [ 전자제품 카테고리에 상품 추가 ]
    상품명을 입력해주세요: Galaxy Tab S9
    가격을 입력해주세요: 800000
    상품 설명을 입력해주세요: 최신 안드로이드 태블릿
    재고수량을 입력해주세요: 20
    
    Galaxy Tab S9 | 800,000원 | 최신 안드로이드 태블릿 | 재고: 20개
    위 정보로 상품을 추가하시겠습니까?
    1. 확인    2. 취소
    1 <- *// 1을 입력*
    
    상품이 성공적으로 추가되었습니다!
    
    [ 관리자 모드 ]
    1. 상품 추가
    2. 상품 수정
    3. 상품 삭제
    4. 전체 상품 현황
    0. 메인으로 돌아가기
    2 <- *// 2를 입력*
    
    수정할 상품명을 입력해주세요: iPhone 15
    현재 상품 정보: iPhone 15 | 1,350,000원 | Apple의 최신 스마트폰 | 재고: 29개
    
    수정할 항목을 선택해주세요:
    1. 가격
    2. 설명  
    3. 재고수량
    1 <- *// 1을 입력*
    
    현재 가격: 1,350,000원
    새로운 가격을 입력해주세요: 1250000
    
    iPhone 15의 가격이 1,350,000원 → 1,250,000원으로 수정되었습니다.
    ```
    

이번엔 LV 2에 도전해봤다. 우선 start()에 6. 관리자 모드를 만들고 이를 통해 비밀번호를 검사하는 방식을 만들어줬다.

```java
public void start() {
        while (true) {
            ...
            System.out.println("6. 관리자 모드"); // 관리자 모드 메뉴 추가
...

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
```

그 다음 checkAdminPassword와 runAdminMode를 호출하기 위해 예시 조건에 맞게 start() 아래에 선언해줬다.

```java
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
```

```java
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
```

관리자 모드 내에 상품 추가, 수정, 삭제 기능도 추가해줘야 하므로 runAdminMode 내부에서 호출한 것들도 선언해줬다.

```java
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
```

```java
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
```

```java
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
```

위의 세 개의 기능을 추가하면서 사용하면서도 자주 헷갈리던 Scanner의 버퍼 처리에 대한 감을 잡을 수 있었는데 nextInt()를 쓴 후에는 무조건 엔터키 찌꺼기가 남으므로 scanner.nextLine();을 이용해 한 번 날려주면 되는 것을 깨달았다. 

 cart.removeIf(cartItem -> cartItem.getProduct().getName().equals(productName));

또한 코드가 많이 길어지다 보니까 위 같은 람다식을 사용하게 되었는데 →에 대한 것 정도는 어느 정도 정리가 되어있었지만 어떻게 지울 수 있을지는 떠오르는 방법이 없었다. 그렇게 검색을 하던 중 removeIf라는 방법을 찾게 되었는데 조건에 맞으면 지워주는 편리한 자동화 기계였다. 덕분에 코드가 더 길어질 수도 있었던 것을 한 줄로 처리할 수 있었고 LV 2는 이렇게 마무리할 수 있었다.

### Lv 3. Enum, 람다 & 스트림을 활용한 고급 관리 기능

- [ ]  **Enum을 활용한 고객 등급별 할인율 관리하기**
    - [ ]  고객 등급의 Enum 정의 및 각 등급에 따른 할인율 적용
        - [ ]  예시 : BRONZE(0%), SILVER(5%), GOLD(10%), PLATINUM(15%)
    - [ ]  주문 시, 고객 등급에 맞는 할인율 적용해 총 금액 계산
- [ ]  **람다 & 스트림을 활용한 상품 검색 및 관리 기능**
    - [ ]  기존에 생성한 Category의 Product를 조회 할 때 스트림을 사용하여 출력하도록 수정
    - [ ]  가격대별 상품 필터링 기능을 통한 스트림 활용
        - [ ]  예시 : 100만원 이하 상품만 보기, stream.filter를 활용하여 특정 가격 조건을 만족하는 상품만 출력
    - [ ]  장바구니에서 특정 상품 제거 기능
        - [ ]  예시 : 장바구니에 iPhone 15가 들어 있다면, stream.filter를 활용하여 특정 상품 이름을 가진 상품을 장바구니에서 제거
    - 구현 예시
        
        ```java
        [ 실시간 커머스 플랫폼 메인 ]
        1. 전자제품
        2. 의류
        3. 식품
        0. 종료      | 프로그램 종료
        1 <- // 1을 입력
        
        [ 전자제품 카테고리 ]
        1. 전체 상품 보기
        2. 가격대별 필터링 (100만원 이하)
        3. 가격대별 필터링 (100만원 초과)
        0. 뒤로가기
        2 <- // 2을 입력
        
        [ 100만원 이하 상품 목록 ]
        1. AirPods Pro    |   350,000원 | 노이즈 캔슬링 무선 이어폰 | 재고: 50개
        0. 뒤로가기
        1 <- // 1을 입력
        선택한 상품: AirPods Pro | 350,000원 | 노이즈 캔슬링 무선 이어폰 | 재고: 50개
        
        // 1번을 누르면 나오는 메뉴입니다.
        "AirPods Pro | 350,000원 | 노이즈 캔슬링 무선 이어폰"
        위 상품을 장바구니에 추가하시겠습니까?
        1. 확인        2. 취소
        1 <-
        
        // 1번을 누르면 나오는 메뉴입니다.
        AirPods Pro가 장바구니에 추가되었습니다.
        
        [ 주문 관리 ]
        4. 장바구니 확인    | 장바구니를 확인 후 주문합니다.
        5. 주문 취소       | 진행중인 주문을 취소합니다.
        4 <- // 4를 입력
        
        // 4번을 누르면 나오는 메뉴입니다.
        아래와 같이 주문 하시겠습니까?
        
        [ 장바구니 내역 ]
        AirPods Pro | 350,000원 | 노이즈 캔슬링 무선 이어폰 | 수량: 1개
        
        [ 총 주문 금액 ]
        350,000원
        
        1. 주문 확정      2. 메인으로 돌아가기
        1 <-
        
        // 1번을 누르면 할인 정보를 제공해줍니다.
        고객 등급을 입력해주세요.
        1. BRONZE   :  0% 할인
        2. SILVER   :  5% 할인
        3. GOLD     : 10% 할인
        4. PLATINUM : 15% 할인
        3 <- // 3을 입력 (GOLD 등급)
        
        // 3번을 누르면 나오는 메뉴입니다.
        주문이 완료되었습니다!
        할인 전 금액: 350,000원
        GOLD 등급 할인(10%): -35,000원
        최종 결제 금액: 315,000원
        AirPods Pro 재고가 50개 → 49개로 업데이트되었습니다.
        ```
        

오늘은 도전 과제의 마지막 단계인 LV 3를 구현했다. 마침 오전에 들었던 달리기반 강의도 Enum, Stream 강의가 포함되어 있어 어려웠지만 조금이나마 도움이 되었던 것 같다.

우선  예시에 따라 등급을 나눠줘야 하므로 Enum을 도입하여 CustomerGrade 클래스를 만들어줬다.

```java
public enum CustomerGrade {
    BRONZE(0.0), // 0% 할인
    SILVER(0.05), // 5% 할인
    GOLD(0.10), // 10% 할인
    PLATINUM(0.15); // 15% 할인

    private final double discountRate;

    // 생성자
    CustomerGrade(double discountRate) {
        this.discountRate = discountRate;
    }

    // 할인율 꺼내보기
    public double getDiscountRate() {
        return discountRate;
    }
}
```

다음엔 CommerceSystem에서 예시에 맞게 필터링 메뉴를 띄워줄 수 있게 해줬다. 그렇게 하기 위해서 먼저 리스트를 만들어야 했고 필터링을 하기 위해서 Stream을 사용해야 했다.

그래서 showCategory 안에 옵션 선택을 할 수 있도록 먼저 다음과 같은 문장들을 추가해줬다.

```java
private void showCategory(Category category) {
    System.out.println("\n[ " + category.getCategoryName() + " 카테고리 ]");
    System.out.println("1. 전체 상품 보기");
    System.out.println("2. 가격대별 필터링 (100만원 이하)");
    System.out.println("3. 가격대별 필터링 (100만원 초과)");
    System.out.println("0. 뒤로가기");
    System.out.print("입력 <- ");
    
    int filterSelect = scanner.nextInt();
    scanner.nextLine();
```

다음엔 필터링된 상품의 리스트를 선언하고 선택한 옵션에 따라 리스트를 묶을 수 있도록 if else문을 사용해줬다.

```java
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
```

이제는 할인을 적용해줘야 할 차례이므로 order 메서드를 수정해줬다. 우선 주문 확정 시 고객 등급을 나타내야 하므로 if (orderSelect == 1) 아래에 다음과 같은 문장을 추가해줬다.

```java
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

```
처음 enum의 values()를 사용할 때 []를 이용하는 것을 몰라 계속 오류를 뿜었다. 검색을 해본 후에야 []로 배열 범위를 지정해줘야 한다는 것을 알게 되어 반영 후에 작업할 수 있었다.

또한, discountPrice의 계산을 할 때 계산식이 int * double 형태라 어떻게 해야 할지 모르고 있었다. 그냥 계산하면 double형으로 계산되어 나오는데 이렇게 되면 오차가 날 수 있다고 알고 있었기 때문이다. 이것도 검색해보니 계산식 앞에 (int) 같이 괄호 안에 필요한 타입을 넣어주면 그 타입으로 계산된다는 것을 알 수 있었고 (int)를 넣어 해결해줬다.

마지막으로 메모리 누수 방지에 익숙해져보고자 scanner.close();를 넣어야 할 곳을 찾아봤는데 처음에는 그저 코드가 끝나는 마지막에 넣으면 되는 줄 알고 넣었다가 작동하지 않거나 출력에서 오류가 발생하는 문제가 있었지만 검색을 해보니 프로그램이 완전히 종료되는 순간에 넣으면 된다는 것을 알았고 메인 메뉴에서 종료 이후인 while문 바로 밑 줄에 넣어 해결할 수 있었다. 

이렇게 하여 필수 과제에 이어 도전 과제까지 모두 완성되었다.