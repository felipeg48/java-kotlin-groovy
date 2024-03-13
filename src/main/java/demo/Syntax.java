class Person {
    private String name;
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getName() {
      return name;
    }
}


public class Syntax {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println("Hello, " + person.getName());
    }
}

