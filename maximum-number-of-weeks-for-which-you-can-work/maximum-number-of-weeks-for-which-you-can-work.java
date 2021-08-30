class Solution {
    
//     class Pair
//     {
//         int a;
//         int b;
        
//         Pair(int left,int val)
//         {
//             this.a=left;
//             this.b =val;
//         }
//     }
    public long numberOfWeeks(int[] milestones) {
        
        if(milestones.length==1)
            return 1;
        
//         PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->(b.a-a.a));
//         if(milestones.length==1)
//             return 1;
//         for(int i=0;i<milestones.length;i++)
//         {
//             pq.add(new Pair(milestones[i],-10));
//         }
        
//         if(pq.size()>2)
//         {
//             Pair p =  pq.remove();
//             if(p.a==pq.peek().a)
//             {
//                 long res=0;
//                 for(int i:milestones)
//                     res=res+i;
//                 return res;
//             }
//             else
//                 pq.add(p);
//         }
        
//         long res=0;
//         int count=0;
//         while(pq.size()!=1)
//         {
//             Pair big = pq.remove();
//             Pair small = pq.remove();
//             long k1 =  (long)(((long)Math.min(big.a,small.a))*2);
//             res = res + (long)(((long)Math.min(big.a,small.a))*2);
//             boolean j1=false;
            
//              System.out.println(big.a+" "+small.a+" "+count+" "+big.b+" "+res);

            
//             if((big.a!=small.a) && big.b!=(count-1))
//             {
//                j1 =true;
//                 res+=1;
//                 k1+=1;
//             }
            
//             int newval =   (int)(big.a + small.a - k1);
//            System.out.println(newval+" "+res); 
//             if(newval==0)
//                 continue;
//             if(count==-10)
//                 count=0;
//             if(j1==true)
//             pq.add(new Pair(newval,count));
//             else
//                 pq.add(new Pair(newval,count-5));
//             count+=1;
//         }
//         return res;
        
        
        Arrays.sort(milestones);
        long sum=0;
        for(int i:milestones)
            sum+=i;
        
        int max=milestones[milestones.length-1];
        
        long ros = sum-max;
        if(milestones[milestones.length-2]==max || (ros+1)>=max)
             return sum;
     
        return 2*(long)ros+1;
//        max<=rest of sum + 1 =>  all 
       //  1 3 4    d d d d
           
//            2*rest of sum + 1 
           
//       rest of sum+1 
           
//            1 2 5 5 5 6 6 
//            a b c d e f g
           
//            d e d e d e d c e d e d e 
           
        
//         1 2 3 3 
           
//            3_3_3
        
        
//            duplicates repeat - always 
        
//         1 2 5 
        
//            c a c a c b c 
           
           
//         3 4 5
           
         
        
        
        
        
        
    }
}