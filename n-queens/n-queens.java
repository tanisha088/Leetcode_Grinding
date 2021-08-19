class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        
        List<List<String>> res = new ArrayList<>();
        String[][] arr= new String[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=".";
        }
        
        List<String> l1 = new ArrayList<String>();
        
        for(int i=0;i<n*n;i++)
            l1.add(".");
            
        
        fn(res,n,0,0,0,arr,l1);
            
        
       List<List<String>> answer = new ArrayList<>();
        
   //     System.out.println(res);
        
        for(int i=0;i<res.size();i++)
        {
            List<String> m1 = new ArrayList<>();
            String string  = "";
            for(int j=0;j<res.get(i).size();j++)
            {
                string =  string + res.get(i).get(j);
                if(j%n == n-1)
                {
                    m1.add(string);
                    string= "";
                }
            }
            answer.add(m1);
        }
        
        
            return answer;
        
    }
    
    public void fn(List<List<String>> res,int n,int placed,int row,int column,String[][] arr,List<String> l1)
    {
        if(row>n)
            return;
        
        if(placed==n)
        {
        
//             for(int in=0;in<n;in++)
//             {
//                 for(int iq=0;iq<n;iq++)
//                 {
//                     System.out.print(arr[in][iq]+" ");
//                 }
                
//                 System.out.println();
//             }
            
            
            res.add(new ArrayList<String>(l1));
            

            
             return;
        }
        
        if(row==n)
            return;
        
        for(int j=0;j<n;j++)
        {
        if(isvalid(arr,row,j))
        {
            arr[row][j]="Q";

            l1.set(row*n+j,"Q");
            fn(res,n,placed+1,row+1,j,arr,l1);
            arr[row][j]=".";
            l1.set(row*n+j,".");
        }
        }
        
    }
    
    public boolean isvalid(String[][] arr,int row,int col)
    {
        for(int i=0;i<arr.length;i++)
            if(arr[i][col].equals("Q"))
                return false;
         for(int i=0;i<arr.length;i++)
            if(arr[row][i].equals("Q"))
                return false;
        
        int a1=row;
        int b1=col;
        
        row--;
        col--;
     
        
        while(row>=0 && col>=0)
        {
            if(arr[row][col].equals("Q"))
                return false;
            
            row--;
            col--;
                
        }
        
       
     
        a1--;
        b1++;
        
        while(a1>=0 && b1<arr.length)
        {
            if(arr[a1][b1].equals("Q"))
                return false;
            a1--;
            b1++;
        }
        
        
        
        return true;
    }
    
   
}

