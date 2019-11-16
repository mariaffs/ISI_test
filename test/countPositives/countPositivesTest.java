package countPositives;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositivesTest
{
   // this test passes
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0};
      assertEquals("Nonzero in first element", 3, countPositives.countPositive(arr)); // count number 0
   }

    // this test fails!
   @Test public void zeroFirstElement() 
   {
      int arr[] = {0, 7, 2};
      assertEquals("Zero in first element", 1, countPositives.countPositive(arr)); // fail because we wait for 1 positive and there are 3 positives
   }
   
   // this test works 
   @Test public void noZeros() // this one has no number 0 in this array, the program works.
   {
      int arr[] = {9, 7, 2};
      assertEquals("Zero in first element", 3, countPositives.countPositive(arr)); // we wait 3 positives and thats what we have
   }
   
   // with negative numbers
   @Test public void negative() 
   {
      int arr[] = {-2, -7, 6};
      assertEquals("Nonzero in first element", 1, countPositives.countPositive(arr)); // count number 0
   }
   
   // empty array
   @Test public void empty() 
   {
      int arr[] = {};
      assertEquals("Nonzero in first element", 0, countPositives.countPositive(arr)); // count number 0
   }
}
