package com.sample;

import com.sample.http.ServerTest;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by lizhiqiang on 2017-12-14.
 */
public class NavigationConfigServer {
    public NavigationConfigServer(){
        Thread startThread = new Thread(new Runnable() {
            @Override
            public void run() {
                ServerTest.main(null);
            }
        });
        startThread.setDaemon(true);
        startThread.start();
    }

}
