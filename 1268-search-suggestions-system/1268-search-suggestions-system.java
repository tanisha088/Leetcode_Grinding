class Solution {
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        HashMap<Integer,ArrayList<String>> map=  new HashMap();
        int maxCount = -1 ;
        Arrays.sort(products);
        for(int i=0;i<products.length;i++)
        {
            String str =  products[i];
            int count = 0;
            for(char c:str.toCharArray())
            {
                if(count>=searchWord.length() || searchWord.charAt(count)!=c)
                 break;
                
                if(!map.containsKey(count))
                    map.put(count,new ArrayList());
                
                ArrayList<String> ll = map.get(count);
                ll.add(str);
                map.put(count,ll);
                maxCount = Math.max(maxCount,count);
                count++;
            }
            
        }
        
        List<List<String>> ans = new ArrayList();
        
        for(int i=0;i<searchWord.length();i++)
        {
             ArrayList<String> templist;
            if(i>maxCount)
                templist = new ArrayList();
            else
                templist = map.get(i);
            List<String> parts =  new ArrayList();
            for(int j=0;j<Math.min(3,templist.size());j++)
                parts.add(templist.get(j));
            
            ans.add(parts);
        }
        
        return ans;
    }
}
