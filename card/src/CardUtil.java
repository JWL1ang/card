import java.time.LocalTime;

/**
 * @author Ljw
 * @date 2020/11/04 22:16
 */
public class CardUtil {

    /**
     * 验证某时间会员卡是否可用
     *
     * @param card 会员卡
     * @param time 时间
     * @return boolean
     */
    public static boolean verify(Card card, LocalTime time) {
        if (time == null) {
            time = LocalTime.now();
        }
        if (card.getEndTime().isBefore(card.getStartTime())) {
            return time.isAfter(card.getStartTime()) || time.isBefore(card.getEndTime());
        }
        return time.isAfter(card.getStartTime()) && time.isBefore(card.getEndTime());
    }

    /**
     * 验证当前时间会员卡是否可用
     *
     * @param card 会员卡
     * @return boolean
     */
    public static boolean verify(Card card) {
        return CardUtil.verify(card, null);
    }

}
