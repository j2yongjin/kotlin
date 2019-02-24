package functional

/**
 * Created by yjlee on 2019-02-23.
 */

fun main(args : Array<String>){

    val list = listOf(1,2);
    val listResult = plusThree(list);
    println(list)
    println(listResult)

}

fun plusThree(list: List<Int>): List<Int> {
    return list.plus(3);
}
