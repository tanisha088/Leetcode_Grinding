class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       
         
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->(a[0]-b[0]));
        
        for(int i=0;i<matrix[0].length;i++)
        {
            pq.add(new int[]{matrix[0][i],0,i});
            if(pq.size()==k)
                break;
        }
        int res=0;
        while(true)
        {
            int[] m = pq.remove();
            res=res+1;
            if(res==k)
                return m[0];
            
          if(m[1]==matrix.length-1)
              continue;
            pq.add(new int[]{matrix[m[1]+1][m[2]],m[1]+1,m[2]});
        }
        
       
    }
}


