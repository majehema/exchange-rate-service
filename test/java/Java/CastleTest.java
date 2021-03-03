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
public class CastleTest {
    
	@Test
	public void test1() {
		Assert.assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
	}
 
}