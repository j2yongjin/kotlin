package functional

/**
 * Created by yjlee on 2019-02-23.
 */

fun main(args:Array<String>){
//    println(nonPureFucntion(" non pure1"))
//    println(nonPureFucntion(" non pure1"))

    println("salesAmount : " + nonPureFunction(100))
    salesAmount = 200;
    println("salesAmount : " + nonPureFunction(100))


}

//val strBuilder : kotlin.text.StringBuilder = kotlin.text.StringBuilder("hello  ")
//fun nonPureFucntion(input:String) : String {
//    return strBuilder.append(input).toString();
//}


var salesAmount =1000;

fun nonPureFunction(input : Int) : Int{
    return input + salesAmount;
}
