package functional

/**
 * Created by yjlee on 2019-02-23.
 */

/**
 *  함수형 프로그래밍의 PureFunction 과 immutable 과  mutable 객체의 개념 및 예제
 *  plus 함수를 호출할경우 기존 객체는 변화지 않고 plus를 수행한 이후의 객체을 리턴한다.
 */

fun main(args:Array<String>){

    var mutableInt : Int = 10;
    println(mutableInt);
    mutableInt = 5;
    println(mutableInt);

    var mutableString : String = "mutable string"
    println(mutableString);
    mutableString = "mutable study";
    println(mutableString);

    val immutableInt : Int = 10;
    //immutableInt = 5;

    val immutableString = "immutableString";
    //    immutableString = "chage string";

    var mutableList : MutableList<Int> = mutableListOf(1,2,3);
    mutableList.add(100);
    println("mutableList " + mutableList )
    mutableList.plus(10)
    println("mutableList plus " + mutableList )
    println("mutableList.plus(10) " + mutableList.plus(10))

    val immutableList : List<Int> = listOf(1,2,3);
//    immutableList.add(100);
    println("immutableList " + immutableList )

    immutableList.plus(10)

    println("immutableList plus " + immutableList )

    println("immutableList.plus(10) " + immutableList.plus(10) )

}
