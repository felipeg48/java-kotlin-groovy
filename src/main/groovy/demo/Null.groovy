def name = customer?.name  // Returns null if customer is null
if (name != null) {
  println("Customer name: $name")
} else {
  println("Customer name unavailable")
}