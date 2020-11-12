import java.time.LocalTime;

/**
 * 会员卡
 * @author Ljw
 * @date 2020/11/04 22:20
 */
public class Card {

    private LocalTime startTime;

    private LocalTime endTime;

    public Card(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return ("会员卡可用时间：" + startTime + "-" + endTime);
    }
}
