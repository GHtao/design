package com.gt.design.proxy.dynamic

import com.gt.design.proxy.simple.IGiveGift
import com.gt.design.proxy.simple.Pursuit
import com.gt.design.proxy.simple.SchoolGirl
import java.lang.reflect.Proxy

/**
 * Created by gt on 2018/11/19.
 */
class DynamicTest{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val girl = SchoolGirl("mm")
            val pursuit = Pursuit(girl) as IGiveGift
            val dynamicProxyInvocation = DynamicProxyInvocation(pursuit)
            val proxyPursuit = Proxy.newProxyInstance(IGiveGift::class.java.classLoader,
                arrayOf(IGiveGift::class.java),
                dynamicProxyInvocation) as IGiveGift

//            val proxyPursuit = Proxy.newProxyInstance(IGiveGift::class.java.classLoader,
//                arrayOf(IGiveGift::class.java)
//            ) { p0, p1, p2 ->
//                SysoUtil.syso("dynamic invoke start")
//                val any = p1!!.invoke(pursuit,*(p2 ?: emptyArray()))//*号将数组转换成可变参数
//                SysoUtil.syso("dynamic invoke end")
//                any
//            } as IGiveGift

            proxyPursuit.giveChocolate()

//            val proxyInvocation = ProxyInvocation<IGiveGift>(pursuit)
//            val proxyPursuit = Proxy.newProxyInstance(IGiveGift::class.java.classLoader,
//                arrayOf(IGiveGift::class.java),
//                proxyInvocation) as IGiveGift
//            proxyPursuit.giveChocolate()

//            val p2:Array<String>? = arrayOf("a","b")
//            val p3= (p2 ?: emptyArray())
//            SysoUtil.syso("p3:"+ Arrays.toString(p3))
        }
    }
}