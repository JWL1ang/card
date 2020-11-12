import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 会员卡测试类
 *
 * @author Ljwin
 * @date 2020/11/04 23:32
 */
public class Test {
    public static void main(String[] args) {
        // 测试验证时间
        List<LocalTime> times = new ArrayList<>();
        times.add(LocalTime.of(13, 0, 0));
        times.add(LocalTime.of(16, 30, 1));
        times.add(LocalTime.of(20, 0, 0));
        times.add(LocalTime.of(22, 0, 1));
        times.add(LocalTime.of(23, 0, 0));
        times.add(LocalTime.of(4, 0, 1));

        // 测试用例1
        // 16:30 - 20:00
        Card card1 = new Card(LocalTime.of(16, 30, 0), LocalTime.of(20, 0, 0));

        System.out.println("----------------------------------------");
        System.out.println(card1.toString());
        times.forEach(it -> System.out.println("验证时间: " + it + "\t" + (CardUtil.verify(card1, it) ? "可用" : "不可用")));

        System.out.println("----------------------------------------");

        // 测试用例2
        // 22:00 - 4:00
        Card card2 = new Card(LocalTime.of(22, 0, 0), LocalTime.of(4, 0, 0));

        System.out.println(card2.toString());
        times.forEach(it -> System.out.println("验证时间: " + it + "\t" + (CardUtil.verify(card2, it) ? "可用" : "不可用")));

        System.out.println();
        // 验证当前时间会员卡是否可用
        System.out.println("会员卡1可用时间为：" + card1.getStartTime() + "-" + card1.getEndTime() +
                "\n当前时间为：" + LocalTime.now() + "\t" + (CardUtil.verify(card1) ? "可用" : "不可用"));
        System.out.println("会员卡2可用时间为：" + card2.getStartTime() + "-" + card2.getEndTime() +
                "\n当前时间为：" + LocalTime.now() + "\t" + (CardUtil.verify(card2) ? "可用" : "不可用"));
    }
}
