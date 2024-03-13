interface Shape {
  double getArea()
}

def Shape = [
  getArea: { -> 0.0 }
]

println Shape.getArea() // 0.0
