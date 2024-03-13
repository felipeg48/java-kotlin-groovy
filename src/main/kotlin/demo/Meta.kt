val builder = SourceFile.builder(
    packageName = "com.example",
    fileName = "PersonBuilder.kt"
)
// ... Define methods and properties for the builder class
builder.build().writeTo(System.out)
Use code with caution.
