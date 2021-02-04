package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.codewars.SumFct;
import java.math.BigInteger;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author mary_
 */
public class TestPerimeters {
    
	@Test
	public void test1() {
		Assert.assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
	}
	@Test
	public void test2() {
		Assert.assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
	}
	@Test
	public void test3() {
		Assert.assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
	}

 
}