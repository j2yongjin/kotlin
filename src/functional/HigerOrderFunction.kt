package functional

/**
 * Created by yjlee on 2019-02-23.
 *
 * 고차함수 조건
 * Pass a function as an Argument
 * Return a function
 * Pass a function as a Argument Or return a function
 *
 */

fun main(args:Array<String>){

}

fun higherOrderFunction1(func: () -> Unit){
    func()
}

fun higherOrderFunction1() : () -> Unit {
    return { println("hello world")}
}

fun higherOrderFunction3(func: () -> Unit) : () -> Unit {
    return func;
}



