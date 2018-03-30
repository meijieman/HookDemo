package com.hongfans.hook;

import com.hongfans.common.log.SL;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * TODO
 * Created by MEI on 2018/3/30.
 */

public class HookHandler implements InvocationHandler {

    private Object mBase;

    public HookHandler(Object rawIActivityManager) {
        mBase = rawIActivityManager;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        SL.i("hooked!");
        SL.i("method " + method.getName() + ", args " + Arrays.toString(args));

        return method.invoke(mBase, args);
    }
}
