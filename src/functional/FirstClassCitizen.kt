package functional

/**
 * Created by yjlee on 2019-02-23.
 *
 * 일급객체 조건
 * Pass a function as an Argument
 * Return a function
 * Assign a function to a data structure
 */

fun main(args : Array<String>){
    execFunction();

    val inputFunction : () -> Unit = { println("input function")}
    inputArgsFunction(inputFunction)
}

fun execFunction() : () -> Unit {
    return { println("execFunction")}
}

fun inputArgsFunction(param : ()-> Unit){
    // something
    param()
}
