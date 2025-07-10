package day21;

public interface A {

    // 1. Constants
    // All variables in interfaces are implicitly: public, static, and final
    int MAX_SPEED = 120;  // Equivalent to: public static final int MAX_SPEED = 120;

    // 2. Abstract Method
    // Methods in interfaces are implicitly public and abstract (except default/static)
    void drive();  // Equivalent to: public abstract void drive();

    // 3. Default Method (Introduced in Java 8)
    // It has a body and can be overridden in implementing classes
    default void fuel() {
        System.out.println("Filling fuel...");
    }

    // 4. Static Method (Introduced in Java 8)
    // Can have a body. Cannot be overridden.
    static void run() {
        System.out.println("Running engine...");
    }

    // 5. Private Method (Introduced in Java 9)
    // Only accessible within interface to avoid code duplication
    private void log() {
        System.out.println("Logging internal process...");
    }

    // 6. Private Static Method (Java 9)
    private static void helper() {
        System.out.println("Helping method...");
    }
}

