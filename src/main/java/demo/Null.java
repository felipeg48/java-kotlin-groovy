String name = getCustomer().getName();  // Can be null
if (name != null) {
  System.out.println("Customer name: " + name);
} else {
  System.out.println("Customer name unavailable");
}

//
// Java 8
//

Optional<String> name = Optional.ofNullable(getCustomer().getName());
if (name.isPresent()) {
  System.out.println("Customer name: " + name.get());
} else {
  System.out.println("Customer name unavailable");
}
