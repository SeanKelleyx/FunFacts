package com.sean.funfacts.controller;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Sean on 1/30/16. :)
 */
public class FunFactsActivityTest {
    private FunFactsActivity funFactsActivity;

    @Before
    public void Setup(){
        funFactsActivity = new FunFactsActivity();
    }

    @After
    public void Teardown(){
        funFactsActivity = null;
    }

    @Test
    public void test(){
        Assert.assertEquals(FunFactsActivity.class, funFactsActivity.getClass());
        Assert.assertEquals("FunFactsActivity",FunFactsActivity.TAG);
    }
}

