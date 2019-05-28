package common3;

import java.util.Calendar;

public class TestYear {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
        System.out.println(Calendar.getInstance().get(Calendar.MONTH)+1);
    }
}
