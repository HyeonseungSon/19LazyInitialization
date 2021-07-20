fun main() {
    val obj1 = TestClass1()
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    // println("obj1.a3 : ${obj1.a3}")
    obj1.testMethod1()

    println("obj1.a4 : ${obj1.a4}")
}

class TestClass1{
    var a1 = 100
    var a2:Int
    lateinit var a3:String

    // val 변수 : 변수가 사용 될 때 초기화
    val a4:String by lazy{
        println("a4 init")
        "문자열2"
    }

    init{
        a2 = 200
    }

    fun testMethod1(){
        if(::a3.isInitialized == false){ // 초기화가 되어있지 않다면
            a3 = "문자열"
        }
        println("a3 : $a3")
    }
}