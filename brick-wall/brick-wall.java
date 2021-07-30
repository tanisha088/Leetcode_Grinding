class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> h = new HashMap();
        int max=0;
        for(int i=0;i<wall.size();i++)
        {
            List<Integer> l = wall.get(i);
            int res=0;
            for(int j=0;j<l.size()-1;j++)
            {
                res=res+l.get(j);
                h.put(res,h.getOrDefault(res,0)+1);
                max=Math.max(h.get(res),max);
            }
        }
        
        return wall.size()-max;
    }
}