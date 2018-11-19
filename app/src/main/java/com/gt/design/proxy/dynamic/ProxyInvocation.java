package com.gt.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gt on 2018/11/19.
 */
public class ProxyInvocation<T> implements InvocationHandler {
    private T target;
    public ProxyInvocation(T target){
        this.target = target;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object obj = method.invoke(target,objects);
        return obj;
    }
}
