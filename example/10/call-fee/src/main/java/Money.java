import java.math.BigDecimal;

public class Money {
        public static final Money ZERO = new Money(BigDecimal.ZERO);
        private BigDecimal amount;

        public Money(BigDecimal amount) {
                this.amount = amount;
        }

        public Money plus(Money target) {
                return new Money(amount.add(target.amount));
        }

        public Money times(double num){
                return new Money(amount.multiply(BigDecimal.valueOf(num)));
        }

        public BigDecimal getAmount() {
                return amount;
        }

        public Money minus(Money discountAmount) {
                return new Money(amount.subtract(discountAmount.getAmount()));
        }
}
