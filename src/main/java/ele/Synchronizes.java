package ele;

public class Synchronizes {

    public static String buildReceivingLock(String urlKey, ThirdPartyApplication application) {
        return joinIntern("RECEIVING", urlKey, application.name());
    }

    public static String buildUserReceiveLock(ThirdPartyApplication application, long userId) {
        return joinIntern("USER_RECEIVE", application.name(), Long.toString(userId));
    }

    private static String joinIntern(String... elements) {
        return String.join("::", elements).intern();
    }

}
