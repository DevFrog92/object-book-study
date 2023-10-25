package domain;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence; // 상영 순번
    private LocalDateTime whenScreened; // 상영 시간


    // 예매하라 메시지의 처리를 담당하는 메서드
    public Reservation reserve(Customer customer, int audienceCount) {

    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }
}
