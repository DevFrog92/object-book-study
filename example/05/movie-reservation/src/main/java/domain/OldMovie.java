package domain;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public abstract class OldMovie {
        private String title;
        private Duration runningTime;
        private Money fee;
        private List<DiscountCondition> discountConditions;

        private Money discountAmount;
        private Money discountPercent;

        public OldMovie(String title, Duration runningTime, Money fee, DiscountCondition ...discountConditions) {
                this.title = title;
                this.runningTime = runningTime;
                this.fee = fee;
                this.discountConditions = Arrays.asList(discountConditions);
        }

        public Money calculateMovieFee(Screening screening) {
                if (isDiscountable(screening)) {
                        return fee.minus(calculateDiscountAmount());
                }

                return fee;
        }

        private Money calculateDiscountAmount() {
                switch (movieType) {
                        case AMOUNT_DISCOUNT -> calculateAmountDiscountAmount();
                        case PERCENT_DISCOUNT -> calculateAmountPercentAmount();
                        case NONE_DISCOUNT -> calculateNoneDiscountAmount();
                }

                throw new IllegalStateException();
        }


        private Money calculateAmountDiscountAmount() {
                return discountAmount;
        }

        private Money calculateAmountPercentAmount() {
                return discountPercent;
        }

        private Money calculateNoneDiscountAmount(){
                return Money.zero;
        }

        private boolean isDiscountable(Screening screening) {
                return discountConditions.stream()
                        .anyMatch(condition -> condition.isSatisfiedBy(screening));
        }


}
