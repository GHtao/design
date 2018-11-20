package com.gt.design.prototype

import com.gt.design.utils.SysoUtil

/**
 * Created by gt on 2018/11/20.
 * 原型模式测试
 */
class PrototypeTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val resume1 = Resume("ming","man","28")
//            resume1.workExper = WorkExper("tocel","2")

            val resume2 = resume1.clone() as Resume
            resume2.setInfo("li","women","30")
            resume2.workExper!!.company = "ttt"
            resume2.workExper!!.time = "3"

            SysoUtil.syso("resume1:${resume1.name}  work:${resume1.workExper!!.company}")
            SysoUtil.syso("resume2:${resume2.name}  work:${resume2.workExper!!.company}")
        }
    }
}