class Solution {
    public boolean equationsPossible(String[] equations) {
        
       // HashMap<Integer,ArrayList<Integer>> h= new HashMap<Integer,Integer>();
        /*
        SIMPLE 15 LINE CODE IT IS""::::::::::::::::::::::::::::::::
        *********************************************************
         int[] uf = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; ++i) uf[i] = i;
        for (String e : equations)
            if (e.charAt(1) == '=')
                uf[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
        for (String e : equations)
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a'))
                return false;
        return true;
    }

    public int find(int x) {
        if (x != uf[x]) uf[x] = find(uf[x]);
        return uf[x];
    }
        
        */
            
        ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        int c=-1;
        for(int i=0;i<26;i++)
            list.add(new ArrayList<Integer>());
        /*
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
*/
        int[] par= new int[26];
        int[] ht = new int[26];
        
        for(int i=0;i<par.length;i++)
            par[i]=i;
        
       for(String e:equations)
       {
           if(e.charAt(1)=='!')
               continue;
         
               union(e.charAt(0)-'a',e.charAt(3)-'a',par,ht);
           
       }
          for(String e:equations)
       {
//         System.out.println(find(e.charAt(0)-'a',par)+" "+find(e.charAt(3)-'a',par));
           if(e.charAt(1)=='!' && find(e.charAt(0)-'a',par)==find(e.charAt(3)-'a',par))
               return false;
       }
        /*
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
        */
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
  //System.out.println(a+" "+a1+" "+b+" "+b1+" "+ht[a1]+" "+ht[b1]);
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