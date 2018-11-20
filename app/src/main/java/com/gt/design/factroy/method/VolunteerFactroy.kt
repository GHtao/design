package com.gt.design.factroy.method

/**
 * Created by gt on 2018/11/20.
 */
class VolunteerFactroy(val name:String):IMethodFactroy{

    override fun createMethodFactroy(): ILeiFeng {
        return Volunteer(name)
    }


}