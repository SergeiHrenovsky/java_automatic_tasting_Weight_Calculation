package com.common;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double in = 170;
        double expect = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 170;
        double expect = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expect, out, 0.01);
    }
}
