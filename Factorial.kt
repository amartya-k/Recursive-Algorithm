package FactorialKotlin

import java.math.BigInteger

object Factorial {
    fun factorial(n:Int):Int{
        return if (n == 0 || n == 1) {
            n
        } else n * factorial(n - 1)
    }

    fun factorial(n:Long):Long{
        return if (n == 0L || n == 1L) {
            n
        } else n * factorial(n - 1)
    }

    fun factorial(n:BigInteger):BigInteger{
        return if (n == BigInteger.valueOf(0) || n == BigInteger.valueOf(1)) {
            n
        } else n.multiply(factorial(n.subtract(BigInteger.valueOf(1))))
    }

}
fun main(args:Array<String>){
    val kInt = 10
    val kLong = 20
    val kBigInteger = 100
    for(k in 0..5){
        val n = (Math.random()*kInt).toInt()
        System.out.println("Factorial of $n is ${Factorial.factorial(n)}")
    }
    for(k in 0..5){
        val n = (Math.random()*kLong).toLong()
        System.out.println("Factorial of $n is ${Factorial.factorial(n)}")
    }
    for(k in 0..5){
        val n = BigInteger.valueOf((Math.random()*kBigInteger).toLong())
        System.out.println("Factorial of $n is ${Factorial.factorial(n)}")
    }
}