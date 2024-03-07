package com.example.test1



fun main() {

    println("계산기 시작!!!")
    println("------------")
    println("계산할 연산식을 입력해주세요. 종료는 -1을 눌러주세요")

    // 숫자1 입력
    var num1 = readLine()!!.toInt()         // 숫자1


    // 반복문이 true이면
    while (true){

        // 연산자 입력받기
        var curcul = readLine()!!.toString()    // 연산자


        // -1입력시에는 연산종료(빠져나옴)
        if (curcul == "-1"){
            println("연산종료")
            break
        }


        // 숫자2 입력받기
        var num2 = readLine()!!.toInt()         // 숫자2



        // when문으로 curcul에 대한 조건걸기
        when (curcul){
            "+" -> {
                num1 = num1 + num2
                println("=${num1} 입니다")
                println("추가로 더 연산해보세요")
            }

            "-" -> {
                num1 = num1 - num2
                println("=${num1} 입니다")
                println("추가로 더 연산해보세요")
            }

            "*" -> {
                num1 = num1 * num2
                println("=${num1} 입니다")
                println("추가로 더 연산해보세요")
            }

            "/" -> {
                num1 = num1 / num2
                println("=${num1} 입니다")
                println("추가로 더 연산해보세요")
            }

            "%" -> {
                num1 = num1 % num2
                println("=${num1} 입니다")
                println("추가로 더 연산해보세요")
            }

            else -> {
                println("적용되지 않는 연산자입니다. 다른 연산자를 입력해주세요")
            }

        }



    }




}


















