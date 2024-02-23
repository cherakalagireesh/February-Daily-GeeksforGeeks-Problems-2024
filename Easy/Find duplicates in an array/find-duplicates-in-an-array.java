//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int nums[], int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        Arrays.sort(nums);
        
        while(right < n)
        {
            if(nums[left] != nums[right])
            {
                if((right - left ) > 1)
                    result.add(nums[left]);
                    
                left = right;
            }
            
            right++;
        }
        
        if(right - left > 1)
            result.add(nums[left]);
        
        if(result.isEmpty())
            result.add(-1);
        
        return result;
    }
}
