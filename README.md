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

## Collections

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
```



















