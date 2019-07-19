class Counter {
private[this] var value = 0
def increment() { value += 1 }
def isLess(other : Counter) = if(value < other.value) true else false
// Can access private field of other object
}
val ob1=new Counter
ob1.increment()
val ob2=new Counter
//ob2.increment()
//ob2.increment()
println(ob2.isLess(ob1))

//Accessing other.value is legal because other is also a Counter object.
//private[this] var value = 0 // Accessing someObject.value is not allowed
//Now, the methods of the Counter class can only access the value field of the
//current object, not of other objects of type Counter . This access is sometimes called
//object-privat
