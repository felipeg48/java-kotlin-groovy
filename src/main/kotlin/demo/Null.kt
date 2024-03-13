val name = getCustomer()?.name  // Returns null if getCustomer() is null
if (name != null) {
  println("Customer name: $name")
} else {
  println("Customer name unavailable")
}


// 
// Elvis Operator
//

val name = getCustomer()?.name ?: "Customer name unavailable"
println(name)