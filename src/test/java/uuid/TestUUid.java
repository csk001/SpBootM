package uuid;

import java.util.UUID;

/**
 * uuid
 *
 * @Author: 88397353
 * @Date: 2019/5/27
 */
public class TestUUid {

//    --------uid=d36c8c15-604a-419e-9eb5-4e57a940daca
//---------imgId =53626e6a-2627-4019-a4b1-7fd6c3c9f359
    public static void main(String[] args) {
        String uId = UUID.randomUUID().toString();
        String imgId = UUID.randomUUID().toString().replace("-", "");
        System.out.println("--------uid=" + uId);
        System.out.println("---------imgId=" + imgId);

    }
}
