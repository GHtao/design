package com.gt.design.prototype

/**
 * Created by gt on 2018/11/20.
 * 工作经历类
 */
class WorkExper(var company:String,var time:String):Cloneable{
    /**
     * 设置工作信息
     */
    fun setWorkExperInfo(company:String,time:String){
        this.company = company
        this.time = time
    }

    public override fun clone(): Any {
        return super.clone()
    }
}