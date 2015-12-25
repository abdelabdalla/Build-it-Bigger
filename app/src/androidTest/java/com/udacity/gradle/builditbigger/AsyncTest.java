package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import junit.framework.Assert;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Abdel on 25/12/2015.
 */
public class AsyncTest extends AndroidTestCase{

    public void test(){

            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.execute();
        try {
            String output = endpointsAsyncTask.get();
            Log.v("asynctestlog","Non-empty String");
        } catch(Exception e){
            Log.v("asynctestlog",e.getMessage());
        }

    }

}
