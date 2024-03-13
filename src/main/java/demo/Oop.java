public interface Shape {
    double getArea();
}
  
public abstract class Polygon implements Shape {
    public abstract int getNumSides();
  
    public double getPerimeter() {
      // Concrete method providing default implementation
      return getNumSides() * getSideLength();
    }
}
