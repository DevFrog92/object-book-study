import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class Application {
        public static void main(String[] args) {
                Phone phone = new Phone(new Money(BigDecimal.valueOf(5)), Duration.ofSeconds(10));
                phone.call(new Call(LocalDateTime.of(2023, 1, 1, 12, 10, 0),
                        LocalDateTime.of(2023, 1, 1, 12, 11, 0))
                );

                phone.call(new Call(LocalDateTime.of(2023, 1, 1, 12, 10, 0),
                        LocalDateTime.of(2023, 1, 1, 12, 11, 0))
                );

                Money money = phone.calculateFee();

                System.out.println("TotalFee:" +money.getAmount());
        }
}
