package com.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.main.OddEven;

public class OddEvenTest {
	@Test
    public void testSortCorrect() {
        OddEven obj = new OddEven();
        Integer[] input = {3,4,2,1,6,7};
        Integer[] output = {3,1,7,4,2,6};       
        assertArrayEquals(output, obj.sortList(input));
    }
	
	@Test
    public void testSortCorrect2() {
        OddEven obj = new OddEven();
        Integer[] input = {3,4,2,1,6,7,9,8};
        Integer[] output = {3,1,7,9,4,2,6,8};       
        assertArrayEquals(output, obj.sortList(input));
    }
}
