package com.gt.design.prototype

/**
 * Created by gt on 2018/11/20.
 * 简历类 原型模式 做复制
 */
class Resume(var name: String,var sex: String,var age: String):Cloneable{
    var workExper:WorkExper? = WorkExper("tocel","2")
    /**
     * 可以修改基本信息
     */
    fun setInfo(name:String,sex:String,age:String){
        this.name = name
        this.age = age
        this.sex = sex
        workExper = WorkExper("tocel","2")
    }
    /**
     * 复制的类
     */
    public override fun clone(): Any {
        return super.clone()
    }
}