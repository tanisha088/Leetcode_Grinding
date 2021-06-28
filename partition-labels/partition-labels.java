class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] arr= new int[26];
        
        for(int i=0;i<26;i++)
            arr[i]=-1;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            int ind  = s.charAt(i)-'a';
            if(arr[ind]==-1)
                arr[ind]=i;
        }
        int end=arr[s.charAt(0)-'a'];
        int st=0;
        List<Integer> ll = new ArrayList<Integer>();
        for(int i=1;i<s.length();i++)
        {
            if(i>end)
            {
                ll.add(end-st+1);
                 st=i;
            }
            
            int ind = s.charAt(i)-'a';
            end = Math.max(arr[ind],end);
        }
        
        ll.add(end-st+1);
        
        return ll;
    }
}