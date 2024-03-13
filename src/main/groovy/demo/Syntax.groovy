
class Person {
  String name

  def setName(newName) {
    name = newName
  }

  def getName() {
    return name
  }
}

// Closures for concise operations
def greeter = { name -> println("Hello, $name") }
greeter("Bob")
