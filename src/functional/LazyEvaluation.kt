package functional

/**
 * Created by yjlee on 2019-02-23.
 */
fun main(args: Array<String>) {

    // 사용할때
    println(lazyValue)

    println(lazyValue)

    println(lazyValue)

    //
    println("===================================================")
    println("lazy sample 2")
    lazyValue2
    lazyValue2
    lazyValue2
    lazyValue2()

    println("===================================================")
    println("lazy sample 2")
    infiniteValue.take(5).forEach { print("$it") }

}

val lazyValue2 : () -> Unit = {
    println("Lazy Value")
}

val lazyValue :String by lazy {
    println("   시간이 오래 걸리는 작업")
    "hello"
}

val infiniteValue = generateSequence(0)  { it + 1};

