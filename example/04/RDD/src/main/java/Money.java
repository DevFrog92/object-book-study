import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static Money wons(long aount) {
        return new Money(BigDecimal.valueOf(aount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public Money minus(Money money) {
        return new Money(this.amount.subtract(money.getAmount()));
    }
}
