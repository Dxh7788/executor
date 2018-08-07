package com.diro.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class DiroApplication
{
    /*
    * 有5类
    * */
    private final static ExecutorService cachedService = Executors.newCachedThreadPool();
    private final static ExecutorService fixedService = Executors.newFixedThreadPool(5);
    private final static ExecutorService scheduledService = Executors.newScheduledThreadPool(5);
    private final static ExecutorService singleThreadService = Executors.newSingleThreadExecutor();
    private final static ExecutorService singleThreadscheduledService = Executors.newSingleThreadScheduledExecutor();
    public static void main( String[] args )
    {
        cachedService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("hello World");
                return null;
            }
        });
    }
}
