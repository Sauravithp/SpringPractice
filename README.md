
# SpEL:
**SpEL** better known as *Spring Expression Language* is a powerful way of manipulating the objects at runtime. In spring most of the values and beans declared for dependencies are defined at compile time. But their might be a situation where the values and beans might be needed to be declared during the runtime, so for such situations spring has provided an alternative as **SpEL**.

## It provides some functionality like:
-	referring other beans by id 
-	call the methods and properties defined in other beans
-referring to the static constants and call the static methods
-manipulate values mathematically
-perform logical, relational comparisons as well as matching regular expressions
-	provide access to the collections

## While using spel :
-	the expression must be framed in #{}
-	The key to working with static class and constants in SpEL is to use the T() operator
-	any bean can be accessed using the bean id
-	properties and methods of a bean can be accessed a .notation
-	the element of the list can be accessed using the id of the bean it belongs to , list name  and key written within [].








