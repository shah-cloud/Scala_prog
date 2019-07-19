class Person {
private var privateAge = 0 // Make private and rename
def age = privateAge	// here if the age is greater so it update the age.
def agee(newValue: Int) {
if (newValue > privateAge) privateAge = newValue; // Can’t get younger
}
}
val fred = new Person
fred agee 30
fred agee 31
println(fred.age)


// if we use var it can not update because var is for ariable and def is for method
