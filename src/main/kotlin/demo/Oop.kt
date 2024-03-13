interface Shape {
    fun getArea(): Double
  
    fun getPerimeter() = 0.0 // Optional default implementation
}

class Circle(val radius: Double) : Shape {
    override fun getArea() = Math.PI * radius * radius
    override fun getPerimeter() = 2 * Math.PI * radius
}