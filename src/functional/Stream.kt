package functional

/**
 * Created by yjlee on 2019-02-23.
 */

fun main(args:Array<String>){
    val list = listOf(1,2,3,4,5);
    println("map : " + list.map { value -> value * value })
    println(" filter : " + list.filter { s -> s %2 == 0 })
    println(" drop : " + list.drop(1))
    println(" drop while : " + list.dropWhile { s -> s %2 == 1 })
    println(" take : " + list.take(2))

    println(" groupBy : " + list.groupBy { value -> value %2 })

    println(" fold : " + list.fold(0){
       acc , value -> acc + value;
    });



}


