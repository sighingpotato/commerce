package commerce;

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
    public String getDescription() { return description; }
    public int getStock() { return stock; }

    // 재고 변경 setter
    public void setStock(int stock) { this.stock = stock; }
    // 관리자가 가격과 설명 수정 가능하도록 setter 추가
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
