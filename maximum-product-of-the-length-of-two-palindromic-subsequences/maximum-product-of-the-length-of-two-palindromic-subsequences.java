class Solution {
    
       ArrayList<String> counter = new ArrayList();
    public int maxProduct(String s) {
        
        ArrayList<String> subs =  fn(s);
     
      //  System.out.println(subs.get(3).length()+" "+subs.get(3));
   //     System.out.println(subs);
     //   System.out.println(lps("dbbcd"));
        long ans = 0;
        for(int i=0;i<subs.size();i++)
        {
            String m =  subs.get(i);
            String k2 = counter.get(i);
            
            ans= Math.max(lps(m)*lps(k2),ans);
//             StringBuilder co=new StringBuilder("");
            
//             int a  = 0;
//             int b = 0;
          
//             while(a<m.length() && b<s.length())
//             {
//                 if(m.charAt(a)==s.charAt(b))
//                 {
//                     a++;
//                     b++;
//                 }
//                 else 
//                 {
//                     co.append(s.charAt(b));
//                     b++;
//                 }
                
    
//             }
      
//            while(b<s.length())
//            { co.append(s.charAt(b));
//                     b++;}
            
//          //   if(m.length()!=0)
//        //    System.out.println(m+" "+ lps(m));
            
//             if(m.length()==0 || co.length()==0)
//                 continue;
            
//             long len1  = lps(m);
//             long len2 = lps(co.toString());
//               ans = Math.max(len1*len2,ans);
//             System.out.println(ans+" "+m+" "+co.toString());
            
        //    for(int  j=i+1;j<subs.size();j++)
           //  {
           //     // if(!overlap(subs.get(i),subs.get(j)))
           //    //  {
           //          if(subs.get(i).equals("xxcxx"))
           //          {
           //              System.out.println(subs.get(i)+ " "+subs.get(j) +"****");
           //          }
           //           if(subs.get(j).equals("accca"))
           //          {
           //              System.out.println(subs.get(i)+ " "+subs.get(j) +"????");
           //          }
           //          ans = Math.max(lps(subs.get(i))*lps(subs.get(j)),ans);
           //    //  }
           // }
            
         
            
        }
        
       // System.out.println(lps("lcodcm"));
 
        
        return (int)ans;
   
    }
    
    
    // 25 xxcxx accbca      
    
    public boolean overlap(String a,String b)
    {
       char[] arr = new char[26];
        
        
        for(int i=0;i<a.length();i++)
            arr[a.charAt(i)-'a']+=1;
        
        for(char c:b.toCharArray())
        {
            if(arr[c-'a']>0)
                return true;
        }
        
        return false;
            
    }
    
    public ArrayList<String> fn(String s)
    {
        ArrayList<String> ll =  new ArrayList();
        
        for(int i=0;i<(1<<s.length());i++)
        {
            String ans = "";
            String a1 = "";
      //      System.out.println(i);
            int in = s.length()-1;
            int j = i;
            while(j>0)
            {
                int k = j&1;
                if(k!=0)
                    ans=s.charAt(in)+ans;
                else
                    a1 =s.charAt(in)+a1;
                in--;
                j=j>>1;
            }
            
            ll.add(ans);
            counter.add(a1);
        }
        
        return ll;
    }
    
    public int lps(String str)
    {
        if(str.length()==0)
            return 0;
        int[][] mat =new int[str.length()+1][str.length()+1];
        
        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=1;i<=str.length();i++)
            {
                int  j = i + gap;
                if(j>str.length())
                    continue;
                if(gap==0)
                {
                    mat[i][j]=1;
                    continue;
                }
                if(gap==1)
                {
                    mat[i][j]=1;
                    
                    if(str.charAt(i-1)==str.charAt(j-1))
                        mat[i][j]+=1;
                    continue;
                }
                
            mat[i][j] = Math.max(mat[i][j-1],mat[i+1][j]);
                
                if(str.charAt(i-1)==str.charAt(j-1))
                    mat[i][j]= Math.max(mat[i][j],mat[i+1][j-1]+2);
              
            }
        }
        
//         for(int i=0;i<mat.length;i++)
//         {
//             for(int j=0;j<mat.length;j++)
//             {
//                 System.out.print(mat[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        return mat[1][mat.length-1];
    }
    
    
}