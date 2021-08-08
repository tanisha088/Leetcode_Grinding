class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        
//         int[] res= new int[30];
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         for(int i=0;i<days.length;i++)
//             list.add(days[i]);
//         for(int i=1;i<=days[days.length-1];i++)
//         {
//             if(!list.contains(i))
//                 res[i%30]=res[(i-1)%30];
//             else
//             res[i%30] = Math.min(res[Math.max(0,(i-7)%30)]+costs[1],Math.min(res[Math.max(0,(i-30)%30)]+costs[2],res[(i-1)%30]+costs[0]));
            
//         }
        
//         return res[days[days.length-1]%30];
//     }
     
        
        int[] ans = new int[366];
           HashSet<Integer> h = new HashSet();
        for(int i:days)
            h.add(i);
        int[] day = new int[]{1,7,30};
        for(int j=1;j<366;j++)
        {
           if(!h.contains(j))
           {
               ans[j]=ans[j-1];
               continue;
           }
            int tot=Integer.MAX_VALUE;
            
            for(int i=0;i<costs.length;i++)
            {
                
                int prev = (j-day[i])>0?ans[j-day[i]]+costs[i]:costs[i];
                tot=Math.min(prev,tot);
            }
            
            ans[j]=tot;
         //   System.out.println(ans[j]);
        }
        
        return ans[days[days.length-1]];
    }
}



















/*

1-costs[0]
7-costs[1]
30-costs[2]


1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
2 4 
*/

