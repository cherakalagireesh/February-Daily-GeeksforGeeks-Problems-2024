//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void Rearrange(int a[], int n)
    {
        ArrayList<Integer> posNums = new ArrayList<>();
        ArrayList<Integer> negNums = new ArrayList<>();
        
        for(int num : a)
        {
            if(num < 0)
                negNums.add(num);
            else
                posNums.add(num);
        }
        
        int index = 0;
        int i = 0;
        
        for(int num : negNums)
            a[i++] = num;
        
        for(int num : posNums)
            a[i++] = num;
    }
}