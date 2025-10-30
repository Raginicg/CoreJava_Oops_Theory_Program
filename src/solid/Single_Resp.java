package solid;

/**
 * @author ragigupt
 * SOLID-
 * S-Single Responsibility principle--->A class should have only one single responsibility.
 * O-Open-closed principle
 * L-Liskov Substitution
 * I-Interface Segmentation
 * D-Dependency Inversion
 */
public class Single_Resp {
/**
 * S-A class should have only one reason to change. In the project, instead of having a UserService class that
 * handles user data, logging, 
 * and email notification, you are splitting it into-->UserService, UserLogger, EmailNotifier
 * Eg- In e-commerce application, you might have a OrderProcessor class.Instead of handling both order validation and 
 * payment processing, we split responsibilities.
 * OrderValidator-->Validates order details
 * PaymentProcessor-->Handles payment logic
 * 
 * Open /Closed-Entities should be open for extension but closed for modification
 * 
 * Liskov-Subtypes must be substitutable for their base types.
 * In the transportation app, if you have a base class Vehicle, and subclasses like Car and Bike, you
 * should be able to use any subclass in place of Vehicle without breaking functionality.
 * 
 * 
 * Interface Segregation-Client should not be forced to depend on interfaces they do not use.
 * Instead of having larger interface divided into multiple interface. Classes implements only what they need
 * In a media player app, instead of having a single MediaPlayer interface with methods like playAudio(),playVideo(), recordAudio(), split them.
 * 
 * Dependency Inversion- High level modules should not depend on low-level modules.Both should depends On abstraction.
 * In a notification system, instead of a UserNotifier class directly using EmailService, depend on an abstraction.
 * 
 */
}
