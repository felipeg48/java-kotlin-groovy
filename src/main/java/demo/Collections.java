// ArrayList (ordered, allows duplicates)
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

// HashSet (unordered, no duplicates)
Set<Integer> numbers = new HashSet<>();
numbers.add(1);
numbers.add(2);
numbers.add(1); // Duplicate not added

// Looping through elements
for (String name : names) {
  System.out.println(name);
}
