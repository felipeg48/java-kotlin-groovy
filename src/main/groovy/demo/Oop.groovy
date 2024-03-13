interface Shape {
  double getArea()
}

abstract class Polygon implements Shape {
  abstract int getNumSides()

  def getPerimeter() {
    // Concrete method providing default implementation
    return getNumSides() * getSideLength()
  }
}