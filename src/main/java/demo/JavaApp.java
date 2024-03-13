package demo;

public class JavaApp {
    
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new JavaApp().getGreeting());
    }
}