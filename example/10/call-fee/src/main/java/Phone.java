import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
        private RatePolicy ratePolicy;
        private final List<Call> calls = new ArrayList<>();

        public Phone(RatePolicy ratePolicy) { // 생성자 의존성 주입
                this.ratePolicy = ratePolicy;
        }

        public List<Call> getCalls() {
                return Collections.unmodifiableList(calls);
        }

        public Money calculateFee() {
                return ratePolicy.calculateFee(this);
        }
}
