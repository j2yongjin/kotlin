package functional

/**
 * Created by yjlee on 2019-02-23.
 *
 * 함수의 값을 전달하지 않고 함수의 이름을 전달 할수 있다.
 * 함수의 이름을 전달하면 , 전달하는 시점에 함수가 실행되지 않는다.
 * 특정 상황에 따라 크고 무거운 연산을 하거나 하지 않을 경우 이름에 의한 호출을 하면 훨씬 효율적이다.
 *
 */

fun main(args:Array<String>){
    callByName()();
    callByValue()

    println(" example ===================================")
    doCallByValue(true, callByValue());
    doCallByValue(false, callByValue());  // 불필요하지만 평가가 된다.
    doCallByName(true, callByName());
    doCallByName(false, callByName());
    println(" example ===================================")
}

fun callByName() : () -> String = {
    println("callByName")
    "callByName"
}

fun callByValue() :String {
    println("callByValue")
    return "callByValue"
}

fun doCallByName(condition : Boolean , callByName : () -> String) {
    if(condition){
        callByName()
    }
}

fun doCallByValue(condition: Boolean,callByValue:String){
    if(condition){
        callByValue
    }
}