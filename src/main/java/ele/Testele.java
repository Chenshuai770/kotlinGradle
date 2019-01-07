package ele;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testele {
    private static final Pattern SN_PATTERN = Pattern.compile("sn=([0-9a-f]{16})");
    private static Matcher matcher;
    //饿了吗红包链接
    private static String url = "https://h5.ele.me/hongbao/#hardware_id=&is_lucky_group=True&lucky_number=0&track_id=&platform=0&sn=2a1e8ff7291e08ed&theme_id=3547&device_id=&refer_user_id=54577719";

    public static void main(String[] args) {
        String urlKey = null;
        matcher = SN_PATTERN.matcher(url);
        if (matcher.find()) {
            urlKey = matcher.group(1);
            System.out.println(urlKey);
        }
        ThirdPartyApplication application = ThirdPartyApplication.ELE;
        String receivingLock = Synchronizes.buildReceivingLock(urlKey,  ThirdPartyApplication.ELE);
        System.out.println(receivingLock);
        long userId = 2267603162L;//用户的userId
        String userReceiveLock = Synchronizes.buildUserReceiveLock(application, userId);
        System.out.println(userReceiveLock);
        /*ReceivingDTO receivingDTO = null;
        synchronized (receivingLock) {
            synchronized (userReceiveLock) {
                receivingDTO = receivingService.save(urlKey, url, phone, application, userId, force);
            }
        }*/


    }
}
