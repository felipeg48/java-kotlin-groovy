// Mutable list (ordered, allows duplicates)
val names: MutableList<String> = mutableListOf("Alice", "Bob", "Charlie")
names.add("David")

// Set (unordered, no duplicates)
val numbers: Set<Int> = setOf(1, 2, 1) // Duplicate is ignored

// Using lambda expression for iteration
names.forEach { name -> println(name) }