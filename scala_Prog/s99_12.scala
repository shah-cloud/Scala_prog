object operation
{
def pack(lst:List[(Int,Symbol)]):List[Symbol]=
{
var res_lst: List[Symbol]=Nil
var ad=0
for(i <- lst)
{
res_lst=res_lst:::List.fill(i._1)(i._2)
}

res_lst
}


def main(arg: Array[String])
{
val lst=List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
println(pack(lst))
}
}
