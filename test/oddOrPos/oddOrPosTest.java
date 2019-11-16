package oddOrPos;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{
   // this test passes
   @Test public void nonZeroFirstElement() 
   {
      int arr[] = {2, 7, 0};
      assertEquals("Nonzero in first element", 2, oddOrPos.oddOrPos(arr));
   }

    // this test fails!
   @Test public void zeroFirstElement() 
   {
      int arr[] = {0, 7, 2};
      assertEquals("Zero in first element", 1, oddOrPos.oddOrPos(arr));
   }
   
   // negatives
   @Test public void negatives() 
   {
      int arr[] = {0, -7, -2};
      assertEquals("Zero in first element", 0, oddOrPos.oddOrPos(arr));
   }
}
