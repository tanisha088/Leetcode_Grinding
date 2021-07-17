class Solution {
    public int longestWPI(int[] hours) {
        
        HashMap<Integer,Integer> h=  new HashMap<Integer,Integer>();
        int size=0;
        h.put(0,-1);
        int sum=0;
        for(int i=0;i<hours.length;i++)
        {
            sum = sum + (hours[i]>8?1:-1);
            
            if(!h.containsKey(sum))
                h.put(sum,i);
//                       System.out.println(i+" "+sum+" "+h+" "+size);

            
           if(sum>0)
               size=i+1;
               else
           {
                   
                   if(!h.containsKey(sum-1))
                       continue;
            int g = h.get(sum-1);
            
            size = Math.max(size,i-g);
           }
        }
 // -1
//  0,-1  1,0  2,1 -1,
        return size;
    }
}


/*
011
-1
0
1
000011000101111000



*/