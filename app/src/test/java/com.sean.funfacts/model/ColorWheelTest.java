package com.sean.funfacts.model;

import android.graphics.Color;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by snkelley on 3/27/2015.
 *
 */
public class ColorWheelTest {
    private Random randomGenerator;
    private ColorWheel colorWheel;

    @Before
    public void Setup(){
        colorWheel = new ColorWheel();
        randomGenerator = mock(Random.class);
        when(randomGenerator.nextInt()).thenReturn(0);
    }

    @After
    public void Teardown(){
        colorWheel = null;
        randomGenerator = null;
    }

    @Test
    public void testGetter(){
        Assert.assertEquals(anyInt(), colorWheel.getColor());
        Assert.assertEquals(0, colorWheel.getColor());
    }
}
