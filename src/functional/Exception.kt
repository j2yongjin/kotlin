package functional

/**
 * Created by yjlee on 2019-02-24.
 *
 * -1 값을 예외값으로 처리하면 -1을 예외로 인식할수 없다.
 *  null  이나 exception을 사용하면 비지니스 로직의 흐름을 끊겨버린다.
 *  앞의 결과를 다음 로직에 사용 하려면 항상 값 체크를 해줘야 한다.
 */

fun main(args:Array<String>){

    // 잘못된 경우
    val a= 0;
    val result = func(0);

    val b = 10;

    // if(result == -1) 예외처리
    val result2 = result * 2;
    println(" 잘못된결과 : " +  result2)

//    val result3 = func5(0).map{}.map{}




}

fun func(value:Int):Int{
    return 10/value;
}

fun func1(value:Int):Int{
    if(value ==0){
        return -1
    }
    return 10/value;
}

//fun func2(value:Int):Int{
//    if(value == 0) {
//        throw RuntimeException("")
//    }
//    return 10/value;
//}

fun func3(value:Int):Int?{
    if(value==0) return null;
    return 10/value;
}

fun func4(value:Int):Int{
    return try{
        10/value
    }catch (e:Throwable){
        -1
    };
}

// 값이 있으면 JUST , None
sealed class Maybe<out T>
data class Just1<T>(val value:T) :Maybe<T>()
object None1 :Maybe<Nothing>()

fun func5(value:Int) : Maybe<Int> {
    return try{
        Just1(10/value)
    }catch (e:Throwable){
        println("throwable : " + e.message)
        None1
    }
}


