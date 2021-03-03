package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.codewars.Stringy;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

/**
 *
 * @author mary_
 */
public class StringyTest {
    
  @Test
  public void startTest() {
    assertEquals("Your string should start with a 1", '1', Stringy.stringy(3).charAt(0));
  }
  
  @Test
  public void lengthTests() {
    Random randGen = new Random();
    for (int i = 0; i < 10; i++) {
      int size = randGen.nextInt(50);
      assertEquals("Wrong length using size " + size, size, Stringy.stringy(size).length());
    }
  }
 
}