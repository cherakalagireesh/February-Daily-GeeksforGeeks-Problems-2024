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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        
        ArrayList<Integer> posNums = new ArrayList<>();
        ArrayList<Integer> negNums = new ArrayList<>();
        
        for(int num : arr)
        {
            if(num >= 0)
            {
                posNums.add(num);
            }
            else
                negNums.add(num);
        }
        
        int index = 0;
        int i = 0;
        
        while(index < posNums.size() && index < negNums.size())
        {
            arr[i++] = posNums.get(index);
            arr[i++] = negNums.get(index);
            index++;
        }
        
        while(index < posNums.size())
            arr[i++] = posNums.get(index++);
            
        while(index < negNums.size())
            arr[i++] = negNums.get(index++);
            
    }
}