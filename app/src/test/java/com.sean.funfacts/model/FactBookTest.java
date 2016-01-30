package com.sean.funfacts.model;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Sean on 1/30/16. :)
 */
public class FactBookTest {
    private FactBook factBook;

    @Before
    public void Setup(){
        factBook = new FactBook();
    }

    @After
    public void Teardown(){
        factBook = null;
    }

    @Test
    public void testGetFact(){
        Assert.assertEquals("", factBook.getFact());
    }
}
