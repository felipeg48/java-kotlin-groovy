package demo

class GroovyApp {
    String getGreeting() {
        return 'Hello World!'
    }

    static void main(String[] args) {
        println new GroovyApp().greeting
    }
}