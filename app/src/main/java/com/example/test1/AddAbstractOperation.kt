package com.example.test1


// Operate 상속받음
class AddAbstractOperation: AbstractOperation {

    override fun calculator (a: Int, b: Int) : Int {
        var answer = a + b

        return answer
    }
}

