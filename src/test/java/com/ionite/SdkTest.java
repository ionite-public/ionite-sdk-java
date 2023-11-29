package com.ionite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SdkTest {
    @Test
    public void ioniteTest() {
        assertEquals("Coming Soon!", new Sdk().ionite());
    }
}
