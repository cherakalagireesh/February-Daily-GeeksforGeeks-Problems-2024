//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        
         int n = S.length();
        int maxLength = 0;
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int start = 0;
        for (int end = 0; end < n; end++) {
            char currentChar = S.charAt(end);
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }
            lastIndex[currentChar] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }
    return maxLength;
        
    }
}