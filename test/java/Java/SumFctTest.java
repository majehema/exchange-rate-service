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
public class SumFctTest {
    
    
    @Test
    public void thirty() {
        Assert.assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
    }

 
}