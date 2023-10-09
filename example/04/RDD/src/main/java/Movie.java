import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;

    /// movie 객체가 알아야할 정보인가?
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    ///
    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public Money getFee() {
        return fee;
    }
}
