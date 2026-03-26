package commerce;

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
