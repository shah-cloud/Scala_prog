import scala.reflect.BeanProperty
class Person {
@BeanProperty var name: String = _
}

val fred = new Person
fred.name = "shah"
println(fred.name)
