class Solution {
    public int slidingPuzzle(int[][] board) {
     
            LinkedList<String> list= new LinkedList<String>();
        String app="";
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
                app=app+board[i][j];
        }
        
        list.add(app);
        
        HashSet<String> hash= new HashSet<String>();
        hash.add(app);
        int ans=0;
       while(!list.isEmpty())
       {
           int size = list.size();
           while(size!=0)
           {
           String m = list.remove();
        //       System.out.println(m+"******");
           hash.add(m);
           if(m.equals("123450"))
               return ans;
           String a="";
           String b="";
           String c="";
           
               char[] car= m.toCharArray();
            int indx = -1;
               
               for(int j=0;j<car.length;j++)
                   if(car[j]=='0')
                       indx=j;
               
              char[] car1 = car;
               
               if(indx!=0 && indx!=3)
               {
                   char k1 = car1[indx-1];
                   car1[indx] = car1[indx-1];
                   car1[indx-1]='0';
                   if(!hash.contains(new String(car1)))
                   list.add(new String(car1));
                   hash.add(new String(car1));
                   car1[indx]='0';
                   car1[indx-1]=k1;
               }
               
                 if(indx!=car1.length-1 && indx!=2)
               {
                   char k1 = car1[indx+1];
                   car1[indx] = car1[indx+1];
                   car1[indx+1]='0';
                   if(!hash.contains(new String(car1)))
                   list.add(new String(car1));
                   hash.add(new String(car1));
                   car1[indx]='0';
                   car1[indx+1]=k1;
                }
               
            if(indx+3<car1.length)
            {
                 char k1 = car1[indx+3];
                   car1[indx] = car1[indx+3];
                   car1[indx+3]='0';
                   if(!hash.contains(new String(car1)))
                   list.add(new String(car1));
                   hash.add(new String(car1));
                   car1[indx]='0';
                   car1[indx+3]=k1;
            }
                if(indx-3>=0)
            {
                 char k1 = car1[indx-3];
                   car1[indx] = car1[indx-3];
                   car1[indx-3]='0';
                   if(!hash.contains(new String(car1)))
                   list.add(new String(car1));
                   hash.add(new String(car1));
                   car1[indx]='0';
                   car1[indx-3]=k1;
            }
               
//System.out.println(car[0]+" "+car1[0]);
                   
       
                 size--; 
               
           }
             System.out.println(list);
        ans++;
       }
        
        return -1;
    }
}