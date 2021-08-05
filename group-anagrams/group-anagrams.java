class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> h =  new HashMap();
        
        for(int i=0;i<strs.length;i++)
        {
            int[] ar = new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                ar[strs[i].charAt(j)-'a']+=1;
            }
            
            String m  = "";
            for(int j=0;j<26;j++)
            {
                m = m + Integer.toString(ar[j]) + "_";
            }
            
            List<String> list = h.getOrDefault(m,new ArrayList<String>());
            list.add(strs[i]);
            h.put(m,list);
        }
    //    System.out.println(h);
        List<List<String>> result =  new ArrayList<List<String>>();
        for(List<String> ll:h.values())
        {
            result.add(ll);
        }
        
        return result;
    }
}