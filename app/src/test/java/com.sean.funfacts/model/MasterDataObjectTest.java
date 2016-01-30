package com.sean.funfacts.model;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;

/**
 * Created by Sean on 1/30/16. :)
 */
public class MasterDataObjectTest {
    private MasterDataObject masterDataObject;

    @Before
    public void Setup(){
        masterDataObject = new MasterDataObject();
    }

    @After
    public void Teardown(){
        masterDataObject = null;
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(MasterDataObject.class, masterDataObject.getClass());
    }

    @Test
    public void testGetters(){
        Assert.assertEquals(anyInt(), masterDataObject.getColor());
        Assert.assertEquals(anyString(), masterDataObject.getFact());
    }
}
