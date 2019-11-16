package lastZero;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
   // this test passes
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0}; // last 0 in position 2
      assertEquals("Nonzero in first element", 2, lastZero.lastZero(arr));
   }

    // this test fails!
   @Test public void zeroFirstElement() 
   {
      int arr[] = {0, 7, 2}; // fail because 0 position is not 1, is position 0 
      assertEquals("Zero in first element", 1, lastZero.lastZero(arr));
   }
   
   // few 0
   @Test public void few() 
   {
      int arr[] = {0, 0, 2};
      assertEquals("Zero in first element", 1, lastZero.lastZero(arr)); // return the first 0 that finds in the array. 
      // This is not what it has to do, it has to return the LAST 0, in this case in the position 1, no that one in the 0 position
   }
   
   // middle 0
   @Test public void middle() 
   {
      int arr[] = {3, 0, 2};
      assertEquals("Zero in first element", 1, lastZero.lastZero(arr)); // 
   }
}
