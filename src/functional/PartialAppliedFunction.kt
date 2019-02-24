package functional

/**
 * Created by yjlee on 2019-02-23.
 */

fun main(args :Array<String>) {

    val func : (Int,Int) -> Int =  { x,y -> x+y}
    println(func(5,10));

    val partial = func.partialAppliedFunction(5);
    //dosomething

    println(" partail : " + partial(10))


    val multiThreeParam = {x :Int , y:Int , z : Int -> x*y*z}
    println(multiThreeParam(1,2,3));

    val partial2 = multiThreeParam.partialAppliedFunction(1);

    println(" partial2 : " + partial2(2,3))

    val curriedMulti = multiThreeParam.curried()
    println(" curriedMulti :" + curriedMulti(1)(2)(3))

    val p1 = curriedMulti(1);
    val p2 = p1(2);
    val p3 = p2(3);

    println(" total p3 : " + p3)


}

fun <P1 , P2,R> ((P1,P2) -> R).partialAppliedFunction(x:P1) : (P2) -> R {
    return {p2 -> this(x,p2)}
}

fun <P1,P2,P3,R> ((P1,P2,P3) ->R).partialAppliedFunction(x:P1) : (P2,P3) -> R {
    return {p2,p3 -> this(x,p2,p3)}
}

// Curring 부분적용 x 값은 컴파일 타임에 알고 있고 , x, y를 런타임에 각각 전달 받겠다.

fun <P1,P2,P3,R> ((P1,P2,P3) ->R).curried() : (P1) -> (P2) -> (P3)-> R =
        {p1:P1 -> {p2:P2 -> {p3:P3 ->this(p1,p2,p3)}}}






