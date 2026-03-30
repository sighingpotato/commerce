package commerce;

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
    public int getQuantity () {
        return quantitiy;
    }

    // 상품 추가 시 수량 증가
    public void addQuantity(int amount) {
        this.quantitiy += amount;
    }
}
