import com.example.test1.AddAbstractOperation
import com.example.test1.DivideAbstractOperation
import com.example.test1.MultiplyAbstractOperation
import com.example.test1.RemainAbstractOperation
import com.example.test1.SubstractAbstractOperation


fun main() {

    println("계산기 시작!!!")
    println("------------")
    println("계산할 연산식을 입력해주세요. 연산종료는 -1을 눌러주세요")



    // 숫자1 입력
    var num1 = readLine()!!.toInt()         // 숫자1



    // 반복문이 true이면 무한대로 실행
    while (true) {

        // 연산자 입력받기
        var curcul = readLine()!!.toString()    // 연산자


        // -1입력시에는 연산종료(빠져나옴)
        if (curcul == "-1"){
            println("연산종료")
            break
        }


        // 숫자2 입력받기
        var num2 = readLine()!!.toInt()         // 숫자2


            val a =

                when (curcul) {
                "+" -> AddAbstractOperation()
                "-" -> SubstractAbstractOperation()
                "*" -> MultiplyAbstractOperation()
                "/" -> DivideAbstractOperation()
                "%" -> RemainAbstractOperation()
                else -> {
                    println("적용되지 않는 연산자입니다. 다른 연산자를 입력해주세요")
                    continue
                }
            }


            // 계속 추가로 연산할 수 있도록 num1에 넣어줌
            num1 = a.calculator(num1,num2)
            println("= ${num1} 입니다!!!")
            println("추가로 더 연산해보세요")

    }

}