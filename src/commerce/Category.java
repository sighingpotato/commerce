package commerce;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> products;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.products = new ArrayList<>();
    }

    // 상품 배열에 추가
    public void addProduct (Product product) {
        this.products.add(product);
    }

    public String getCategoryName() {
        return categoryName;
    }
    public List<Product> getProducts() {
        return products;
    }
}
