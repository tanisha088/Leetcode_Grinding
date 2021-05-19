class Solution {
    class Pair
    {
        int a;
        int b;
       
        
        Pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        
        LinkedList<Pair> ll= new LinkedList<Pair>();
         for(int i=0;i<mat.length;i++)
        for(int j=0;j<mat[0].length;j++)
        {
            if(mat[i][j]!=0)
            {
                mat[i][j]=Integer.MAX_VALUE;
                continue;
            }
          ll.add(new Pair(i,j));
        }
        
         while(!ll.isEmpty())
        {
           Pair p1 = ll.remove();
             int xval = p1.a;
             int yval = p1.b;
            int[] x = {-1,0,1,0};
            int[] y = {0,1,0,-1};
            
            for(int i=0;i<4;i++)
            {
                int nx = x[i]+xval;
                int ny = y[i]+yval;
                
                if(nx>=0 && nx<mat.length && ny>=0 && ny<mat[0].length && mat[nx][ny]>mat[xval][yval]+1)
                {
                    mat[nx][ny]=mat[xval][yval]+1;
                    ll.add(new Pair(nx,ny));
                }
                   
            }
        }
        
        return mat;
        
        
        /*
        LinkedList<Pair> ll= new LinkedList<Pair>();
    
        ArrayList<String> list= new ArrayList<>();
        
        for(int i=0;i<mat.length;i++)
        for(int j=0;j<mat[0].length;j++)
        {
            if(mat[i][j]!=0)
            {
                mat[i][j]=Integer.MAX_VALUE;
                continue;
            }
          ll.add(new Pair(i+" "+j,0));
            list.add(i+" "+j);
        }

        while(!ll.isEmpty())
        {
            Pair p1= ll.remove();
            int val = p1.b;
            list.add(p1.a);
            String[] arr= p1.a.split("\\s+");
            int xval =  Integer.parseInt(arr[0]);
            int yval = Integer.parseInt(arr[1]);
            mat[xval][yval]=val;
            
            int[] x = {-1,0,1,0};
            int[] y = {0,1,0,-1};
            
            for(int i=0;i<4;i++)
            {
                int nx = x[i]+xval;
                int ny = y[i]+yval;
                
                if(nx>=0 && nx<mat.length && ny>=0 && ny<mat[0].length && !list.contains(nx+" "+ny) && mat[nx][ny]>val+1)
                    ll.add(new Pair(nx+" "+ny,val+1));
                list.add(nx+" "+ny);
            }
        }
        
        return mat;
        */
    }
}