package findLast;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
   // this test passes
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0};
      int y = 7;
      assertEquals("Nonzero in first element", 1, findLast.findLast(arr, y));
   }

    // this test fails!
   @Test public void zeroFirstElement() 
   {
      int arr[] = {0, 7, 2};
      int y = 2;
      assertEquals("Zero in first element", 1, findLast.findLast(arr, y)); // y = 2 is in the second position, not in 1
   }
   
   // 
   @Test public void twoequals() 
   {
      int arr[] = {7, 7, 0};
      int y = 7;
      assertEquals("Nonzero in first element", 1, findLast.findLast(arr, y));
   }
   
   // first position
   @Test public void firstPosition() 
   {
      int arr[] = {2, 7, 0};
      int y = 2;
      assertEquals("Nonzero in first element", 0, findLast.findLast(arr, y));
   }
}
