class Solution {
    
    class Pair
    {
        int dis;
        int price;
        int row;
        int col;
        
        Pair(int dis,int price,int row,int col)
        {
            this.dis= dis;
            this.price = price;
            this.row = row;
            this.col = col;
        }
    }
    
    public class PairComp implements Comparator<Pair>
    {
        public  int compare(Pair p1,Pair p2)
        {
            if(p1.dis!=p2.dis)
            {
               return p1.dis-p2.dis;
            }
            else if(p1.price!=p2.price)
            {
               return p1.price-p2.price;
            }
            else if(p1.row!=p2.row)
            {
              return  p1.row - p2.row;
            }
            else
               return p1.col - p2.col;
        }
    }
    
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        
        List<Pair> ans =  new ArrayList();
        
        List<List<Integer>> result=  new ArrayList();
        
         HashSet<String> set =  new HashSet<String>();
        
        LinkedList<int[]> queue=  new LinkedList();
        
        set.add(start[0]+" "+start[1]);
        queue.add(new int[]{start[0],start[1]});
         if(grid[start[0]][start[1]]>=pricing[0] && grid[start[0]][start[1]]<=pricing[1])
                        ans.add(new Pair(-1,grid[start[0]][start[1]],start[0],start[1]));
        
       
        
        int count = 0;
        while(!queue.isEmpty())
        {
          int size=  queue.size();
        
            while(size-- !=0)
            {
                  int[] arr=  queue.remove();
                 int[] x=  {-1,0,0,1};
                int[] y = {0,1,-1,0};
                
                for(int i=0;i<4;i++)
                {
                    int nx=  x[i] + arr[0];
                    int ny = y[i] + arr[1];
                    
                    if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length &&  !set.contains(nx+" "+ny) && grid[nx][ny]>0)
                    {
                        queue.add(new int[]{nx,ny});
                        set.add(nx+" "+ny);
                        
                        if(grid[nx][ny]>=pricing[0] && grid[nx][ny]<=pricing[1])
                        ans.add(new Pair(count,grid[nx][ny],nx,ny));
                    }
                }
            }
            
            count++;
            
        }
        
        Collections.sort(ans,new PairComp());
        int i=0;
        while(i<k && i<ans.size())
        {
            List<Integer> re =  new ArrayList();
            Pair p1  =  ans.get(i++);
            re.add(p1.row);
            re.add(p1.col);
            result.add(re);
        }
            
        return result;
        
    }
}

// 0-wall
// 1-free
// else-price