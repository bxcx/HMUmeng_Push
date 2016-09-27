package com.hm.umeng.push;

import android.app.Application;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * App
 * <p>
 * himi on 2016-09-26 07:32
 * version V1.0
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
                System.out.println("onSuccess " + deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                System.out.println("onFailure " + s + s1);

            }
        });
    }
}
