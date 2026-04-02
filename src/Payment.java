public class Payment {
    // Payment 객체 개선
    private String type;
    private int amount;

    // 로직 위치 변경
    public Payment(String type, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("금액이 올바르지 않습니다.");
        }
        this.type = type;
        this.amount = amount;
    }

    // 메서드 추가
    public boolean isMatchedType(String targetType) {
        return this.type.equals(targetType);
    }

    // 메서드 추가
    public void executePayment() {
        if (isMatchedType("card")) {
            System.out.println("카드 결제: " + this.amount);
        } else if (isMatchedType("kakao")) {
            System.out.println("카카오페이 결제: " + this.amount);
        } else {
            System.out.println("지원하지 않는 결제 방식");
        }
    }
}