package functional

/**
 * Created by yjlee on 2019-02-24.
 *
 *  대수적 타입
 *  합타임 / 곱타입
 *  패턴 매칭
 *
 */
fun main(args:Array<String>){


    // pattern matching

    val rgb : ColorInterface = Red()

//    val result = when(rgb){
//        is Red -> "Red"
//        is Green -> "Green"
//        is Blue -> "Blue"
//        // PINK에 런타임에 에러가 발생할수 있음
//        else -> throw RuntimeException()
//    }

    val rgb2  : RGB = RGB.BLUE

    val result2 = when(rgb2){
        RGB.BLUE -> "BLUE"
        RGB.GREEN -> "GREEN"
        RGB.RED -> "RED"
    }



}

interface ColorInterface

class Red : ColorInterface
class Green : ColorInterface
class Blue : ColorInterface
class Pink : ColorInterface

// 곱타임
data class Dog(val name:String , val age:Int )

//Dog("A" , 1);
//Dog("B" , 1);
//Dog("C" , 3);
//Dog("D" , 4);
//Dog("E" , 5);
//Dog("F" , 1);
//Dog("H" , 1);
//Dog("..." , 9);

//  SumType ( 합타입)
enum class RGB {
    RED , GREEN , BLUE
}

// SumType  Just 와 None 두가지 타입만 존재함
sealed class Option<out T>
data class Just<T>(val value:T) : Option<T>()
object None : Option<Nothing>()



