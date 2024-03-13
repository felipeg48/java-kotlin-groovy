// ArrayList (ordered, allows duplicates)
def names = ["Alice", "Bob", "Charlie"]
names << "David"  // Adding element using shortcut

// HashSet (unordered, no duplicates)
def numbers = [1, 2, 1] // Duplicate is automatically removed

// Looping with each method
names.each { name -> println(name) }