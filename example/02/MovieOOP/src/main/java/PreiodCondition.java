import java.time.DayOfWeek;
import java.time.LocalTime;

public class PreiodCondition implements DiscountCondition{
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PreiodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 정해진 요일에 시작 시간과 종료 시간의 사이에 있을 경우
     * @param screening
     * @return boolean
     */
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime())<=0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >=0;
    }
}
