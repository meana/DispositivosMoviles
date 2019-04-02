fun main(args : Array<String>) {
    println(isPrime(3))
    println(obtainPrimeFactors(3))
}

fun isPrime(n:Int):Boolean {
    return when{
        n != 2 && n%2 == 0 -> false
        (3 until n step 2).any{n%it==0} -> false
        else -> true
    }
}

fun obtainPrimeFactors(n: Int):List<Int> {
    var num = n
    val factors = if(n==0) mutableListOf() else mutableListOf(1)
    var factor = 2
    while(num > 1){
        if(num % factor==0){
            factors.add(factor)
            num /= factor
        } else {
            factor += 1
        }
    }

    return factors
}

