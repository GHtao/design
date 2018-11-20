package com.gt.design.factroy.method

/**
 * Created by gt on 2018/11/20.
 */
class MethodFactroyTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val studentFactroy = StudentFactroy("xiao ming")
            val student = studentFactroy.createMethodFactroy()
            student.buyRice()
            student.sweep()
            student.wash()

            val volunteerFactroy = VolunteerFactroy("xiao li")
            val volunteer = volunteerFactroy.createMethodFactroy()
            volunteer.sweep()
            volunteer.wash()
            volunteer.buyRice()
        }
    }
}