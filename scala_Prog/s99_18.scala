object operation
{
def slice(i:Int,k:Int,lst:List[Symbol])
{
var res_lst: List[Symbol]=Nil
println(lst.slice(i,k))
}


def main(arg: Array[String])
{
val lst=List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
slice(2,8,lst)
}
}
