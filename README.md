# The Basics

## Hello world
```kotlin
// fun is used to delcare a function
// main() function is where your program starts from
fun main() {
    //this function prints their arguments to standard output
    println("Hello, world!")
}
```
## Variables
- read-only variables with **val**
- mutable variables with **var**
- variables can be declared outside main() function (**top level**)

```kotlin
val popcorn = 5
val hotdog = 7
var customers = 10

customers = 8 
println(customers) // standard output is 8
```
## String templates
```kotlin
val customers = 10
println("There are $customers customers") 
// There are 10 customers

println("There are ${customers + 1} customers") 
// There are 11 customers
```

## Basic Types
| Category                | Basic Types                |
|-------------------------|----------------------------|
| Integers                | Byte, Short, Int, Long     |
| Unsigned integers       | UByte, UShort, UInt, ULong |
| Floating-poing numbers  | Float, Double              |
| Booleans                | Boolean                    |
| Strings                 | String                     |


## Operators
```kotlin
var customers = 10

customers = 8 // assigment
customers = customers + 3 // addition
customers += 7 // addition
customers -= 3 // subtraction
customers *= 2 // multiplication
customers /= 3 // division

```  

# Collections

| Collection type | Description                                                             |
|-----------------|-------------------------------------------------------------------------|
| Lists           | Ordered collections of items                                            |
| Sets            | Unique unordered collections of items                                   |
| Maps            | Sets of key-value pairs where keys are unique and map to only one value |

## List
```kotlin
// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)
// access to an index
println("The first item in the list is: ${readOnlyShapes[0]}")
// access to fist item
println("The first item in the list is: ${readOnlyShapes.first()}")
// access to last item
println("The first item in the list is: ${readOnlyShapes.last()}")
// count
println("This list has ${readOnlyShapes.count()} items")

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes)

// Casting to prevent unwanted modifications
val shapesLocked: List<String> = shapes

// to check that an item is in a list
println("circle" in readOnlyShapes) // true

// add items 
shapes.add("pentagon")

// remove items
shapes.remove("pentagon")

```

## Set
```kotlin
// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry") // [apple, banana, cherry]

// Mutable set with explicit type declaration
val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")

// access to fist item
println("The first item in the set is: ${fruits.first()}")
// access to last item
println("The first item in the set is: ${fruits.last()}")
// count
println("This set has ${fruits.count()} items")

// casting 
val fruitLocked: Set<String> = fruits

// to check that an item is in a Set
println("apple" in readOnlyFruit) // true

// add items 
fruits.add("dragonfruit")

// remove items
fruits.remove("dragonfruit")

```

## Map
```kotlin
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu) // {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

// access to an index
println("The value of apple juice is: ${juiceMenu["apple"]}")
// count
println("This map has ${juiceMenu.count()} key-value pairs")

// casting
val juiceMenuLocked: Map<String, Int> = juiceMenu

// Add pair
juiceMenu.put("coconut", 150)

// Remove pair
juiceMenu.remove("orange")

// Check if a specific key is already in a map
juiceMenu.containsKey("orange")

// obtain a collection of keys
println(juiceMenu.keys)

// obtain a collection of values
println(juiceMenu.values)

// check that a key is in a map
println("orange" in juiceMenu.keys)

// check that a value is in a map
println(200 in juiceMenu.values)

```

# Control flow
## Conditional expressions
### if
```kotlin
var d: Int
val check = true
if(check) {
    d = 1
} else {
    d = 2
}
println(d) // 1
```

### Ternary operator
```kotlin
// there is no ternary operator in kotlin instead if can be used as an expresion
val a = 1
val b = 2
println(if (a > b) a else b) // prints a value: 2
```

### When
```kotlin
// when as a statement
val obj = "Hello"
when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown")
}
// standard output: Greeting

// when is assigned immediately to a variable
val result = when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown")
}
println(result) // standard output: Greeting

// when is also useful when you need to check a chain of Boolean expressions
val temp = 18
val description = when {
    temp < 0 -> "very cold"
    temp < 10 -> "a bit cold"
    temp < 20 -> "warm"
    else -> "hot"
}
println(description) // standard output: warm

```

### Ranges
```kotlin
/*
Operators: .. , ..< , downTo , step
 1..4 is equivalent to 1, 2, 3, 4
 1..<4 is equivalent to 1, 2, 3
 4 downTo 1 is equivalent to 4, 3, 2, 1
 1..5 step 2 is equivalent to 1, 3, 5
*/

```

### Loop For
```kotlin
for(number in 1..5) {
    print(number)
}
// 12345

val cakes = listOf("carrot", "cheese", "chocolate")
for (cake in cakes) {
    println("it's a $cake cake!")
}
// it's a carrot cake!
// it's a cheese cake!
// it's a chocolate cake!
```
### Loop While
```kotlin
// while
var cakesEaten = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
// Eat a cake
// Eat a cake
// Eat a cake
```
```kotlin
// do-while
var cakesEaten = 0
var cakesBaked = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
do {
    println("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten)
// Eat a cake
// Eat a cake
// Eat a cake
// Bake a cake
// Bake a cake
// Bake a cake
```

# Functions

## Declare a funtion
```kotlin
fun hello() {
    return print("Hello, world!")
}

fun main() {
    hello() // Hello, world!
}

```
```kotlin
// function with two Int arguments and Int return type
fun sum(x: Int, y: Int): Int {
    return x + y
}

// function without arguments and return type
fun main() {
    println(sum(1, 2)) // 3
}
```

## Named arguments
```kotlin
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}
```
## Default parameter values
```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // function called with both parameters
    printMessageWithPrefix("Hello", "Log")
    // [Log] Hello  
    
    // function called with only message parameter
    printMessageWithPrefix("Hello")
    // [Info] Hello
    
    // function called with both declared parameters
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}
```

## Single expression functions
```kotlin
// no need to delcare function return type and changed {} for =
fun sum(x: Int, y: Int) = x + y

fun main() {
    println(sum(1, 2)) // 3
}
```

## Lambda expressions
```kotlin
// this function ...
fun uppercaseString(string: String): String {
    return string.uppercase()
}

// ... can also be written as lambda expression
fun main() {
    println({ string: String -> string.uppercase() }("Hello"))
    // HELLO
}

// if declare a lambda without parameters, there is no need to use ->
{ println("Log message") }

// assign a lambda expression to a variable
fun main() {
    val upperCaseString =  { string: String -> string.uppercase() }
    println(upperCaseString("hello"))
    // HELLO
}

// pass to another function
// example filter
val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { x -> x < 0 }
println(positives) 
// [1, 3, 5]
println(negatives)
// [-2, -4, -6]

// example map
val doubled = numbers.map { x -> x * 2 }
val tripled = numbers.map { x -> x * 3 }

println(doubled)
// [2, -4, 6, -8, 10, -12]
println(tripled)
// [3, -6, 9, -12, 15, -18]

```
### function types
```kotlin
val upperCaseString: (String) -> String = { string -> string.uppercase() }

fun main() {
    println(upperCaseString("hello"))
    // HELLO
}

```
```kotlin
// the following example won't work
val upperCaseString = { str -> str.uppercase()}
```

### Return from a function
```kotlin
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60  }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs
}
```

### Invoke separately
```kotlin
println({ string: String -> string.uppercase() }("hello")) //HELLO
```

### Trailing lambdas
```kotlin
// the initial value is zero
// the operation sums the initial value with every item in the list cumulatively
println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) //6

// alternatively, in the form of a trailing lambda
println(listOf(1, 2, 3).fold(0) { x, item -> x + item } ) //6
```

# Classes
### Declare a class
```kotlin
class Customer
```

### Properties
```kotlin
// with parentheses
class Contact(val id: Int, var email: String)

// Within the class body defined by curly braces
class Contact(val id: Int, var email: String) {
    val category: String = ""
}

// class with default values
class Contact(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}
```

### Create instance
```kotlin
class Contact(val id: Int, var email: String)

fun main() {
    val contract = Contact(1, "mary@gmail.com")
}
```

### Access properties
```kotlin
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    
    println(contact.email) // mary@gmail.com
    
    contact.email = "jane@gmail.com"
    
    println(contact.email) // jane@gmail.com

    println("Their email address is: ${contact.email}") // Their email address is: jane@gmail.com
}
```

### Member functions
```kotlin
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // calls member function printId()
    contact.printId() // 1
}
```

## Data Classes
- Data classes particulary useful for storing data. they come automatically with additional member functions to avoid boilerplate

**to declare add keyword data**
```kotlin
data class User(val name: String, val id: Int)
```
**Print as a string**
```kotlin
data class User(val name: String, val id: Int)
val user: User = User("Alex", 1)
println(user) //User(name=Alex, id=1)

```
**Compare instance**
```kotlin
data class User(val name: String, val id: Int)
val user: User = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// compares user to second user
println("user == secondUser: ${user == secondUser}") // user == secondUser: true

// compares user to third user
println("user == thirdUser: ${user == thirdUser}") // user == thirdUser: false

```
**Copy instance**
```kotlin
data class User(val name: String, val id: Int)
val user: User = User("Alex", 1)

// Create an exact copy of user
println(user.copy()) // User(name=Alex, id=1)

// Create a copy of user with id: 3
println(user.copy(id = 3)) // User(name=Alex, id=3)
```

# Null safety
## Nullable types
- kotlin types allows the possibility for the declares type to have null values
- Nullable types are declared by explicitly adding ? after the type declaration

```kotlin
fun main() {
    // neverNull has String type
    var neverNull: String = "this can't be null"
    
    // neverNull = null Throws a compiler error
    
    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    
    //this is OK
    nullable = null
    
    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    
    println(strLength(neverNull)) // 18
    println(strLength(nullable)) // Throws a compiler error
 }
```

## Check for null values
```kotlin
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    var nullString: String? = null
    println(describeString(nullString)) // Empty or null string
}
```

## Use safe calls
```kotlin
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    var nullString: String? = null
    println(lengthString(nullString)) // null
}
```
- Safe calls can be chained so that if any property of an object contains a null value, then null is returned without an error being thrown. For example:
```
person.company?.address?.country
```

## Elvis operator
```kotlin
// return a default value is a null value is detected
fun main() {
    var nullString: String? = null
    println(nullString?.length ?: 0) // 0
}
```