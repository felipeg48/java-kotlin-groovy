def person = new Person(name: "Bob")

person.metaClass.setProperty { String name ->
  println("Setting name to: $name")
  delegate.name = name
}

person.name = "Alice" // Triggers the modified setter