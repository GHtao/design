package com.gt.design.proxy.dynamic

import com.gt.design.utils.SysoUtil
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * Created by gt on 2018/11/19.
 */
class DynamicProxyInvocation<T>(val target:T):InvocationHandler{

    /**
     *  proxy:代表动态代理对象
     *  method：代表正在执行的方法
     *  args：代表调用目标方法时传入的实参
     *  ? 表示当前是否对象可以为空
     *  !! 表示当前对象不为空的情况下执行
     */
    override fun invoke(p0: Any?, p1: Method?, p2:Array<out Any>?): Any? {
        SysoUtil.syso("dynamic invoke start")
        val any = p1!!.invoke(target,*(p2 ?: emptyArray()))//*号将数组转换成可变参数
        SysoUtil.syso("dynamic invoke end")
        return any
    }

}