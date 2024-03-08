package com.example.test1


// AbstractOperation 상속받음
class SubstractAbstractOperation: AbstractOperation {

    override fun calculator (a: Int, b: Int): Int {
        var answer = a - b

        return answer
    }
}