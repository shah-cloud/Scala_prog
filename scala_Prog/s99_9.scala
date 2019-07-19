object operation
{
def pack(lst:List[Symbol]): List[List[Symbol]] = {
var res_lst : List[List[Symbol]] =Nil
var ad=0
for(i <- 0 to (lst.length-2) if lst(i)!=lst(i+1))
{
res_lst=res_lst:::List(lst.slice(ad,i+1))
ad=i+1
}
res_lst=res_lst:::List(lst.slice(ad,lst.length))
res_lst
}
def main(arg: Array[String])
{
val lst=List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println(pack(lst))
}
}
