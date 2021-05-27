class Solution {
    public boolean equationsPossible(String[] equations) {
        
       // HashMap<Integer,ArrayList<Integer>> h= new HashMap<Integer,Integer>();
        
        HashMap<Character,Integer> h= new HashMap<Character,Integer>();
        
        ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        int c=-1;
        for(int i=0;i<26;i++)
            list.add(new ArrayList<Integer>());
        
        for(int i=0;i<equations.length;i++)
        {
            char[] k1 = equations[i].toCharArray();
            if(k1[1]=='=')
            {
                char a = k1[0];
                char b =k1[3];
                
               int ina =0;
                int inb =0;
                if(!h.containsKey(a))
                {
                    c++;
                    h.put(a,c);
                }
                ina = h.get(a);
            
                if(!h.containsKey(b))
                {
                    c++;
                    h.put(b,c);
                }
                inb = h.get(b);
            
                
                list.get(ina).add(inb);
                list.get(inb).add(ina);
                
            }
                
        }
          //  System.out.println(h+" "+c);

        int[] par= new int[c+1];
        int[] ht = new int[c+1];
        
        for(int i=0;i<par.length;i++)
            par[i]=i;
        
       for(int i=0;i<list.size();i++)
       {
           for(int j=0;j<list.get(i).size();j++)
           {
               union(i,list.get(i).get(j),par,ht);
           }
       }
        
        for(int i=0;i<equations.length;i++)
        {
            if(equations[i].charAt(1)=='!')
            {
                if(equations[i].charAt(0)==equations[i].charAt(3))
                    return false;
                if(!h.containsKey(equations[i].charAt(0))|| !h.containsKey(equations[i].charAt(3)))
                    continue;
                
             //   System.out.println(find(h.get(equations[i].charAt(0)),par));
                
               //System.out.println(find(h.get(equations[i].charAt(3)),par));
            
                if(find(h.get(equations[i].charAt(0)),par)==find(h.get(equations[i].charAt(3)),par))
                    return false;
            }
        }
        return true;
    }
     public int find(int a,int[] par)
    {
        if(par[a]==a)
        return a;
        
        int k = find(par[a],par);
        par[a]=k;
     //   System.out.println(ht[a]+" "+count+" "+a+" *************");

        return k;
    }
    public void union(int a,int b,int[] par,int[] ht)
    {
        int a1 = find(a,par);
        int b1 = find(b,par);
  // System.out.println(a+" "+a1+" "+b+" "+b1+" "+ht[a1]+" "+ht[b1]);
        if(a1!=b1)
         {
             if(ht[a1]==ht[b1])
              ht[b1]++;
             if(ht[a1]>ht[b1])
               par[b1]=a1;
               else 
               par[a1]=b1;
         }
    }
}