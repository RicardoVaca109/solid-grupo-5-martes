// NotificationFactory.java
import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
    private static final Map<String, Notification> notificationMap = new HashMap<>();

    static {
        notificationMap.put("Email", new EmailNotification());
        notificationMap.put("SMS", new SMSNotification());
        notificationMap.put("Push", new PushNotification());
    }

    public static Notification getNotification(String type) {
        return notificationMap.get(type);
    }
}
