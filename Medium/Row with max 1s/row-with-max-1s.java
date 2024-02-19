//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        
        int maxOnes = 0;
        int result = -1;
        
        for(int i = 0 ; i < n ; i++)
        {
            int count = countOnes(arr[i]);
            
            if(maxOnes < count)
            {
                result = i;
                maxOnes = count;
            }
        }
        
        return result;
    }
    
    int countOnes(int nums[])
    {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(nums[mid] == 1)
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low == nums.length ? 0 : nums.length - low;
    }
    
}