import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution
{

    public static int highestProductOf3(int[] arr)
    {

        // calculate the highest product of three numbers
        int length=arr.length;
        
        if(length<3)
        {
            throw new IllegalArgumentException("Array should contain atleast two values");
        }
  
            int maxnum1=Integer.MIN_VALUE;
            int maxnum2=Integer.MIN_VALUE;
            int maxnum3=Integer.MIN_VALUE;
            int minnum1=Integer.MAX_VALUE;
            int minnum2=Integer.MAX_VALUE;
            
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>maxnum1)
                {
                    maxnum3=maxnum2;
                    maxnum2=maxnum1;
                    maxnum1=arr[i];
                }
                else if(arr[i]>maxnum2)
                {
                    maxnum3=maxnum2;
                    maxnum2=arr[i];
                }
                else if(arr[i]>maxnum3)
                {
                    maxnum3=arr[i];
                }
                if(arr[i]<minnum1)
                {
                    minnum2=minnum1;
                    minnum1=arr[i];
                }
                else if(arr[i]<minnum2)
                {
                    minnum2=arr[i];
                }
            }
            return Math.max(minnum1*minnum2*maxnum1,maxnum1*maxnum2*maxnum3);

             // return res;
    }


















    // tests

    @Test
    public void shortArrayTest() {
        final int actual = highestProductOf3(new int[] {1, 2, 3, 4});
        final int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    public void longerArrayTest() {
        final int actual = highestProductOf3(new int[] {6, 1, 3, 5, 7, 8, 2});
        final int expected = 336;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasOneNegativeTest() {
        final int actual = highestProductOf3(new int[] {-5, 4, 8, 2, 3});
        final int expected = 96;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayHasTwoNegativesTest() {
        final int actual = highestProductOf3(new int[] {-10, 1, 3, 2, -10});
        final int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void arrayIsAllNegativesTest() {
        final int actual = highestProductOf3(new int[] {-5, -1, -3, -2});
        final int expected = -6;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void exceptionWithEmptyArrayTest() {
        highestProductOf3(new int[] {});
    }

    @Test(expected = Exception.class)
    public void exceptionWithOneNumberTest() {
        highestProductOf3(new int[] {1});
    }

    @Test(expected = Exception.class)
    public void exceptionWithTwoNumbersTest() {
        highestProductOf3(new int[] {1, 1});
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
