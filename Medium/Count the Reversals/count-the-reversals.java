//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        
        Stack<Character> stackOpen = new Stack<>();
        Stack<Character> stackClose = new Stack<>();
        int result = 0;
        
        for(char ch : s.toCharArray())
        {
            
            if(ch == '{')    
            {
                stackOpen.push(ch);
            }
            else if(!stackOpen.isEmpty() && ch == '}')
            {
                stackOpen.pop();
            }
            else
            {
                stackClose.push(ch);
            }
        }
        
        int n = stackOpen.size();
        int m = stackClose.size();
        
        if((n + m) % 2 != 0) 
            return -1;
        
        result += n / 2 + (n % 2);
        result += m / 2 + (m % 2);
        
        
        
        return result;
    }
}