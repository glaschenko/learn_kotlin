package learn.kotlin


/*
 * Author: glaschenko
 * Created: 10.12.2017
 */
val PI = 3.14;

fun main(args: Array<String>){
    var b = 2
    var s1 = "b is $b";
    b += 1
    println("Sum of 3 and 5 is " + sum(3,5))
    printSum(7,b)
    println("PI $PI")
    println("${s1.replace("is", "was")}, but now is $b")

}

fun sum(a: Int, b: Int) = a+b;

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a+b}")
}




