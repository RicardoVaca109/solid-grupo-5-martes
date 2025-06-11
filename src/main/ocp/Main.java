// Main.java
public class Main {
    public static void main(String[] args) {
        sendNotification("Email", "Hello via Email!");
        sendNotification("SMS", "Hello via SMS!");
        sendNotification("Push", "Hello via Push Notification!");
        sendNotification("Fax", "Hello via Fax!"); // No definida
    }

    public static void sendNotification(String type, String message) {
        Notification notification = NotificationFactory.getNotification(type);
        if (notification != null) {
            notification.send(message);
        } else {
            System.out.println("Invalid notification type!");
        }
    }
}
