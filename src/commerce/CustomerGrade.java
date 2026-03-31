package commerce;

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
