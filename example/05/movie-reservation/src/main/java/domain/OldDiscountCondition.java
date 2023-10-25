package domain;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class OldDiscountCondition {
        private DiscountConditionType type;
        private int sequence;
        private DayOfWeek dayOfWeek;
        private LocalTime startTime;
        private LocalTime endTime;

        public boolean isSatisfiedBy(Screening screening) { // 만약 할인 정책이 늘어난다명? 비례해서 if - else 구문이 늘어나게 된다
                if (type == DiscountConditionType.PERIOD){
                        return isSatisfiedByPeriod(screening);
                }

                return isSatisfiedBySequence(screening);
        }

        private boolean isSatisfiedBySequence(Screening screening) { // sequence 속성이 바뀌면 로직도 변경된다.
                return sequence == screening.getSequence();
        }

        private boolean isSatisfiedByPeriod(Screening screening) { // 기간 조건이 변경되면 로직도 변경된다.
                return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                        !startTime.isAfter(screening.getWhenScreened().toLocalTime()) &&
                        !endTime.isBefore(screening.getWhenScreened().toLocalTime());
        }
}
