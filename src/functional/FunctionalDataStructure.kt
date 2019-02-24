package functional

/**
 * Created by yjlee on 2019-02-23.
 */

fun main(args:Array<String>){

    val value = 3;
    val result = plusValue(value)

    println("result :" + result);
    println("value :" + value);

    val list = listOf(1,2);
    val listResult = plusList(list,5);

    println(" list : " + list);
    println(" listResult : " + listResult)

    println( " listResult tail " + listResult)
}

fun plusValue(value: Int): Int {
    return value + 3;
}

fun plusList(list : List<Int> , plusValue : Int) : List<Int> {
    return list.plus(plusValue);
}
