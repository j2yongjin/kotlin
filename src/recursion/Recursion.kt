package recursion

/**
 * Created by yjlee on 2019-02-23.
 */
fun main(args:Array<String>){
    val result = factorial_std(3);
    println(result)

    val result2 = factorial2(3);
    println(result2)

}

fun factorial_std(num:Int) : Int {
    var result = 1;
    for(i in 1 .. num){
        result *= i;
    }
    return result;
}

fun factorial2 (num : Int) : Int {
    if(num <= 0) return 1;
    return num * factorial2(num - 1);
}

fun getMaxValue(list :List<Int>) : Int  = when {
//    list.isEmpty() -> throw NullPointerException()
    list.size == 1 -> list.first();
    else -> if (list.first() > getMaxValue(list.drop(1))){
        list.first()
    }else{
        getMaxValue(list.drop(1))
    }
}
// 꼬리 재귀 호출
tailrec fun factorial3(num : Int,acc:Int = 1) :Int =
        when(num) {
            1 -> acc  // 종료 조건
            else -> factorial3(num-1,acc*num);
        }

