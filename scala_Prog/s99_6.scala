object operation
{
def isPalindrome(lst:List[Int])={
var last=lst.length-1
var count=0
var result = false
for(i <- 0 until (lst.length/2) if lst(i)==lst(last) )
{
last -= 1
 count += 1
}
if (count==lst.length/2)
result=true
result
}
def main(arg: Array[String])
{
val lst=List(1, 2,3, 2, 1)
println(isPalindrome(lst))
}
}
