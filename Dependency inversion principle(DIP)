//************************************************************************
// Title : Java Program Demonstrating Dependency Inversion Principle
// Author : Razu Sarder, Undergraduate Student, Khulna University
//************************************************************************

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing a notification method.
 */
interface NotificationMethod {
    /**
     * Sends a notification.
     *
     * @param message The message to be sent.
     */
    void sendNotification(String message);
}

/**
 * Class representing a notification system.
 */
class NotificationSystem {
    private final List<NotificationMethod> notificationMethods;

    /**
     * Constructs a new NotificationSystem with the given notification methods.
     *
     * @param notificationMethods The list of notification methods.
     */
    public NotificationSystem(List<NotificationMethod> notificationMethods) {
        this.notificationMethods = notificationMethods;
    }

    /**
     * Sends a notification using all the configured notification methods.
     *
     * @param message The message to be sent.
     */
    public void sendNotification(String message) {
        for (NotificationMethod method : notificationMethods) {
            method.sendNotification(message);
        }
    }
}

/**
 * Class representing an email notification method.
 */
class EmailNotification implements NotificationMethod {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

/**
 * Class representing a SMS notification method.
 */
class SMSNotification implements NotificationMethod {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

/**
 * Demo class demonstrating the usage of a notification system with different notification methods.
 */
public class DependencyInversionPrincipleDemo {
    public static void main(String[] args) {
        // Create email and SMS notification methods
        NotificationMethod emailMethod = new EmailNotification();
        NotificationMethod smsMethod = new SMSNotification();

        // Create a notification system with email and SMS notification methods
        List<NotificationMethod> methods = new ArrayList<>();
        methods.add(emailMethod);
        methods.add(smsMethod);
        NotificationSystem notificationSystem = new NotificationSystem(methods);

        // Send a notification using all methods
        notificationSystem.sendNotification("This is a notification message.");
    }
}

/**
 * The DependencyInversionPrincipleDemo class demonstrates the usage of a notification system
 * with different notification methods. It creates instances of EmailNotification and SMSNotification
 * and configures the notification system with them. This approach adheres to the Dependency Inversion Principle
 * by depending on abstractions (NotificationMethod interface) rather than concrete implementations,
 * promoting code flexibility and maintainability.
 */
