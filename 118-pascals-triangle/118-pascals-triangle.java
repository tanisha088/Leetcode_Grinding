class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ll = new ArrayList();
        List<Integer> temp = new ArrayList();
        
        temp.add(1);
        
        for(int i=0;i<numRows;i++)
        {
            ll.add(new ArrayList(temp));
            List<Integer> temp1 = new ArrayList();
            temp1.add(1);
            for(int j=1;j<temp.size();j++)
                temp1.add(temp.get(j-1)+temp.get(j));
            temp1.add(1);
            temp = temp1;
        }
        
        return ll;
    }
}