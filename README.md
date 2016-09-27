# HMUmeng_Push

[![](https://jitpack.io/v/bxcx/HMUmeng_Push.svg)](https://jitpack.io/#bxcx/HMUmeng_Push)


	dependencies {
	        compile 'com.github.bxcx:HMUmeng_Push:v0.0.1'
	}
      
      
On your acitvity onCreate:  
      PushAgent.getInstance(this).onAppStart();
  
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

