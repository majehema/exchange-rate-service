package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.codewars.Greed;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author mary_
 */
public class GreedTest {
    
    @Test
    public void test1() {
        Assert.assertEquals("Score for [5,1,3,4,1] must be 250:", 250, Greed.greedy(new int[]{5,1,3,4,1}));
    }

    @Test
    public void test2() {
        Assert.assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, Greed.greedy(new int[]{1,1,1,3,1}));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Score for [2,4,4,5,4] must be 450:", 450, Greed.greedy(new int[]{2,4,4,5,4}));
    }

}