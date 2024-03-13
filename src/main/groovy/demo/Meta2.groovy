class Person {
  String name
}

Person.metaClass.greet = { println "Hello, $name!" }

def person = new Person(name: "Alice")
person.greet()  // Calling the dynamically added method