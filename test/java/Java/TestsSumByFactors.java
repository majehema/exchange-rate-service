package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.codewars.SumByFactors;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author mary_
 */
public class TestsSumByFactors {
    
    
    @Test
    public void testOne() {
        int[] lst = new int[] {12, 15};
        Assert.assertEquals("(2 12)(3 27)(5 15)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void testTwo() {
        int[] lst = new int[] {-33, 112, 440, 351, -45, 225, -67, 223, 21, -35, -97, 476, 157, 127, 33, 297, 68, -86};
        Assert.assertEquals("(2 1010)(3 849)(5 585)(7 574)(11 737)(13 351)(17 544)(43 -86)(67 -67)(97 -97)(127 127)(157 157)(223 223)", SumByFactors.sumOfDivided(lst));
    }

        @Test
    public void testThree() {
        int[] lst = new int[] {15, 21, 24, 30, 45};
        Assert.assertEquals("(2 54)(3 135)(5 90)(7 21)", SumByFactors.sumOfDivided(lst));
    }

        @Test
    public void testFour() {
        int[] lst = new int[] {107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        Assert.assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumByFactors.sumOfDivided(lst));
    }

}