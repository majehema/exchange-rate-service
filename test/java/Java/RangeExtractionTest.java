package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.codewars.RangeExtraction;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author mary_
 */
public class RangeExtractionTest {
    
	@Test
	public void test1() {
            Assert.assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", RangeExtraction.rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
	}
        
        @Test
	public void test2() {
            Assert.assertEquals("-3--1,2,10,15,16,18-20", RangeExtraction.rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
        }
 
}