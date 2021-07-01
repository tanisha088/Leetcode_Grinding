class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        HashSet<Character> set=  new HashSet<Character>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('o');
        set.add('O');
        set.add('E');
        set.add('I');
        set.add('U');
        set.add('i');
        set.add('u');
        
        while(i<j)
        {
            if(set.contains(arr[i]) && set.contains(arr[j]) )
            {
                char t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }
            else if(set.contains(arr[i]))
                j--;
            else if(set.contains(arr[j]))
                i++;
            else
            {
                i++;
                j--;
            }
                
        }
        
        String k = "";
        for(char c:arr)
            k=k+c;
        
        return k;
    }
}