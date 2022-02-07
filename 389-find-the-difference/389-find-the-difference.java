class Solution {
    public char findTheDifference(String s, String t) {
        
       char[] arr= new char[26];
        
        for(char c:t.toCharArray())
            arr[c-'a']+=1;
        
        for(char c:s.toCharArray())
        {
            arr[c-'a']-=1;
        }
        
        for(int i=0;i<26;i++)
            if(arr[i]>0)
                return (char)(i+'a');
        
        return '0';
        
    }
}