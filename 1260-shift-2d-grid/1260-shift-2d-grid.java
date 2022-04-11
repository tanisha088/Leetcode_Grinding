class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
       List<List<Integer>> ll =  new ArrayList();
            
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> ans = new ArrayList();
            for(int j=0;j<grid[0].length;j++)
            {
                int el =  i*grid[0].length  + j ;
                el = (el - k)%(grid.length*grid[0].length);
                if(el<0)
                    el = el + grid.length*grid[0].length;
             //   System.out.println(i+" "+j+ " " + el);
               // System.out.println(el+" "+grid[0].length+"  "+grid.length+" "+(el/grid.length)+" "+(el%grid[0].length));
                ans.add(grid[el/(grid[0].length)][el%(grid[0].length)]);
            }
            
            ll.add(ans);
        }
        
        return ll;
        
    }
}