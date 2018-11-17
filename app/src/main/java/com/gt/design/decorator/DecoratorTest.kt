package com.gt.design.decorator

import com.gt.design.utils.SysoUtil

/**
 * Created by gt
 * on 2018/11/17
 */
class DecoratorTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var person = Person("gt")
            SysoUtil.syso("first finery:")
            var bigTrouser = BigTrouser()
            var tshirts = Tshirts()

            bigTrouser.decorate(person)//有公共的接口 然后就可以任意添加具体的功能
            tshirts.decorate(bigTrouser)

            tshirts.show()
        }
    }
}