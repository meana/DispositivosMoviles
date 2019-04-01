fun main(args : Array<String>) {
    println(even(2))
    println(even(3))

    println(fact(2))
    println(fact(5))
}

fun even(x:Int) = x%2==0

fun fact(x:Int):Int {
    if(x == 0){
        return 0
    }
    var result = 1
    for(n in 1..x){
        result*=n
    }

    return result
}

//fun fact2(x:Int) = if(x<=1) 1 else x*fact2(x-1)