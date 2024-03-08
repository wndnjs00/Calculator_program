package com.example.test1

class RemainAbstractOperation: AbstractOperation {

    override fun calculator (a: Int, b: Int) : Int {
        var answer = a % b

        return answer
    }
}
