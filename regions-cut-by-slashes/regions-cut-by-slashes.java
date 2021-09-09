class Solution {
    public int regionsBySlashes(String[] grid) {
    
        int n =  grid.length+1;
int ans=1;
        int[][] mat = new int[n][n];
        
        int[] parent = new int[n*n];
        for(int i=0;i<parent.length;i++)
            parent[i]=i;
        
        int st = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || j==n-1 || i==n-1)
                {
                    int p1 = find(parent,i*n+j);
                    int p2 = st;
                    
                    parent[p1] = p2;
                }
            }
        }
        
        for(int i:parent)
            System.out.println(i);
        
        for(int i=0;i<grid.length;i++)
        {
            String str = grid[i];
            for(int j=0;j<str.length();j++)
            {
                char m =  str.charAt(j);
                System.out.println(m);
                if(m=='/')
                {
                    int i1 =  find(parent,i*n + j+1);
                    int i2 = find(parent,(i+1)*n + j);
              //   System.out.println(i1+" "+i2+" "+i+" "+j);
                    if(i1==i2)
                        ans++;
                    parent[i1] = i2;
                    
                }
                else if(m=='\\')
                 {
                              int i1 =  find(parent,i*n + j);
                    int i2 = find(parent,(i+1)*n + j+1);
                   //    System.out.println(i1+" "+i2+" "+i+" "+j);
                    if(i1==i2)
                        ans++;
                    parent[i1] = i2;
                    
                        }       
            }
        }
        
        return ans;
    }
    
    public int find(int[]parent,int v)
    {
        if(parent[v]==v)
            return v;
        
        int m =  find(parent,parent[v]);
        parent[v]=m;
        return m;
    }
        
//         int ans=1;
        
//         int n=grid.length;

//         n=n+1;
//         int[][] matrix= new int[n][n];
//         int[] par =new int[n*n];
//         int[] ht = new int[n*n];
        
//         for(int i=0;i<n*n;i++)
//             par[i]=i;
        
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==0 || j==0 || i==n-1 || j==n-1)
                    
//                 {
//                 int[] x= {-1,1,0,0};
//                 int[] y ={0,0,-1,1};
//                 for(int k=0;k<4;k++)
//                 {
//                    int nx = x[k]+ i;
//                     int ny = y[k] +j;
                    
//             if((nx>=0 && nx<n && ny>=0 && ny<n) && (nx==0 || ny==0 || nx==n-1 || ny==n-1))
//                     {
//              //   System.out.println(i+" "+j+"******"+ nx+" "+ny);
//                         union(i*n+j , nx*n+ny , par , ht);
//                     }
//                 }
//                 }
//             }
//         }
        
//         for(int i=0;i<n-1;i++)
//         {
//             int j=0;
//             String str = grid[i];
//             int iter=0;

//             while(j<n-1)
//             {
//                 if(str.charAt(iter)==' ')
//                     j++;
//                 else if(str.charAt(iter)=='/')
//                 {
//                //     System.out.println(i+" "+j+" ***********");
//                    ans = ans + union((i*n)+j+1,((i+1)*n)+j, par,ht);

//                     j++;
//                 } 
//                 else if(str.charAt(iter)=='\\')
//                 {
//                                 //        System.out.println(i+" "+j+" ***********");
//                     ans = ans +  union((i*n)+j,((i+1)*n)+j+1 , par, ht);
                   
//                     j++;
//                 }
//                  iter++;   
//             }
//         }
        
//         return ans;
//     }
    
//     public int find(int a,int[] par)
//     {
//         if(par[a]==a)
//         return a;
        
//         int k = find(par[a],par);
//         par[a]=k;
//      //   System.out.println(ht[a]+" "+count+" "+a+" *************");

//         return k;
//     }
//     public int union(int a,int b,int[] par,int[] ht)
//     {
//         int a1 = find(a,par);
//         int b1 = find(b,par);
//         int count=0;
//       //  System.out.println(count+" "+a1+" "+b1+" "+a+" "+b);
//         if(a1==b1)
//             count++;
//   // System.out.println(a+" "+a1+" "+b+" "+b1+" "+ht[a1]+" "+ht[b1]);
//         if(a1!=b1)
//          {
//              if(ht[a1]==ht[b1])
//               ht[b1]++;
//              if(ht[a1]>ht[b1])
//                par[b1]=a1;
//                else 
//                par[a1]=b1;
//          }

//         return count;
//     }

//     /*
//         int N = grid.length;
//         Node[][] nodes = new Node[N+1][N+1];
//         nodes[0][0] = new Node();
        
//         for(int i = 0; i < nodes.length; i++) {
//             for(int j = 0; j < nodes[i].length; j++) {
//                 if(nodes[i][j] == null) {
//                     nodes[i][j] = new Node();
//                 }
//             }
//         }
        
//         //setting parent of the border
//         fillLine(nodes,0,nodes[0][0]);
//         fillLine(nodes,nodes.length-1,nodes[0][0]);
//         fillColumn(nodes,0,nodes[0][0]);
//         fillColumn(nodes,nodes[0].length-1,nodes[0][0]);
        
        
//         int ans = 1;
        
//         for(int i =0; i < grid.length; i++) {
//             for(int j = 0; j < grid[i].length(); j++) {
//                 char symbol = grid[i].charAt(j);
//                 if(symbol == '\\') {
//                     if(find(nodes[i][j]) == find(nodes[i+1][j+1])) {
//                         ans++;
//                     }
//                     union(nodes[i][j],nodes[i+1][j+1]);
//                 } else if (symbol == '/') {
//                     if (find(nodes[i][j+1]) == find(nodes[i+1][j])) {
//                         ans++;
//                     }
//                     union(nodes[i][j+1],nodes[i+1][j]);
//                 }
//             }
//         }
        
//         return ans;
//     }
//     //find set
//     private Node find(Node n) {
//         Node parent = n.parent;
//         if (n.parent != n) {
//             parent = find(n.parent);
//         }
//         n.parent = parent;//path compression
//         return parent;
//     }
//     //union without ranking
//     private void union(Node a, Node b) {
//         Node pA = find(a);
//         Node pB = find(b);
//         pA.parent = pB;
//     }
//     private void fillLine(Node[][] nodes, int line, Node parent) {
//         for(int j = 0; j < nodes[line].length; j++) {
//             if(nodes[line][j] == null) {
//                 nodes[line][j] = new Node();
//             }
//             nodes[line][j].parent = parent;
//         }
//     }
//     private void fillColumn(Node[][] nodes, int column, Node parent) {
//         for(int i = 0; i < nodes.length; i++) {
//             if(nodes[i][column] == null) {
//                 nodes[i][column] = new Node();
//             }
//             nodes[i][column].parent = parent;
//         }
//     }
//     */
// }

// class Node {
//     public Node parent;
//     public Node () {
//         this.parent = this;
//     }
        
    
        
        
}
