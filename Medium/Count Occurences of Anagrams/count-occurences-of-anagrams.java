//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {    

    int search(String pat, String txt) {
        
        int result = 0;
        int len1 = pat.length();
        int len2 = txt.length();
        int left = 0;
        int right = len1 - 1;
        int patFreq[] = findFreq(pat);
        int currFreq[] = findFreq(txt.substring(0, len1));
        
        while(right < len2)
        {

            if(left != 0)
            {
                currFreq[txt.charAt(left - 1) - 'a']--;
                currFreq[txt.charAt(right) - 'a']++;
            }
            
            if(Arrays.equals(patFreq,currFreq))
                result++;
                
            left++;
            right++;
            
        }
        
        return result;
    }
    
    int[] findFreq(String s)
    {
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()) 
            freq[ch - 'a']++;
            
        return freq;
    }
}