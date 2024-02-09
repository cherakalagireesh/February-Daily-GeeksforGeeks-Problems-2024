//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
         String binaryForm = binary(N);
        int oneCount=0;
        int result=0;
        for(char ch:binaryForm.toCharArray())
        {
           if (ch == '1') {
                oneCount++;
                result = Math.max(result, oneCount);
            } else {
             oneCount = 0;
            }
        }
        return result;
    }
    public static String binary(int num)
    {
        StringBuilder sb = new StringBuilder();
        while(num!=0)
        {
            sb.append(num%2);
            num/=2;
        }
        return sb.reverse().toString();
    }
    
}



//{ Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}



// } Driver Code Ends