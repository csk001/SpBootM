package comm3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 倒计时
 *
 * @Author: 88397353
 * @Date: 2019/5/8
 */
public class TestTimer {
    private static long minute = 0;
    private static long second = 0;
    private static long totalSeconds = 0;

    public static void getDate() {
        final Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            public void run() {
                if (totalSeconds >= 60) {
                    minute = totalSeconds / 60;
                    second = totalSeconds % 60;
                    System.out.println("倒计时：" + minute + "分钟" + second + "秒");
                    totalSeconds--;
                } else if (totalSeconds > 0) {
                    second = totalSeconds % 60;
                    System.out.println("倒计时：0分钟" + second + "秒");
                    totalSeconds--;
                } else {
                    System.out.println("倒计时结束");
                    timer2.cancel();
                }

            }
        }, 0, 1000);
    }

    public static void main(String[] args) {
        String endD = "2019-05-08 09:56:00";
        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date endDDate;
        try {
            endDDate = sdfd.parse(endD);
        } catch (ParseException e) {
            e.printStackTrace();
            endDDate = new Date();
        }
        totalSeconds = (endDDate.getTime() - (new Date().getTime())) / 1000;

        System.out.println("----------totalSeconds:" + totalSeconds);
        getDate();
    }
}
