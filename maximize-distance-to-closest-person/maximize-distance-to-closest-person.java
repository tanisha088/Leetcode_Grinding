class Solution {
    public int maxDistToClosest(int[] seats) {
        
        /*
        int[] left = new int[seats.length];
        int[] right= new int[seats.length];
        for(int i=1;i<left.length;i++)
        {
            if(seats[i]==1)
                left[i]=0;
            else
                left[i]=left[i-1]+1;
        }
        if(seats[right.length-1]==0)
            right[right.length-1]=Integer.MAX_VALUE;
        for(int i=right.length-2;i>=0;i--)
        {
            if(seats[i]==1)
                right[i]=0;
            else
                right[i]=right[i+1]+1;
        }
        
        
        int max=0;
        
        for(int i=0;i<left.length;i++)
        {
            System.out.println(left[i]+" "+right[i]);
            max=Math.max(max,Math.min(left[i],right[i]));
        }
        
        return max;
    }
    
    */
        
      ///  0 0 0 1 0   st=3    
        
        
        
        int st=0;
        while(st<seats.length && seats[st]==0)
            st++;
        
        int ans=-1;
        
        int ini =st;
    //   System.out.println("**"+ans);
        if(st==seats.length)
            return seats.length;
        
       int end=st+1;
        while(end<seats.length)
        {
            while(end<seats.length && seats[end]==0)
                end++;
            
            if(end==seats.length)
                break;
            
            ans = Math.max(end-st-1,ans);
            
            st = end;
            end=end+1;
        }
     //   System.out.println(st);
       
   //     System.out.println(ans);        
        if(ans%2!=0)
           ans= ans/2 +1;
        else
            ans = ans/2;
        
        ans = Math.max(ans,Math.max(ini,(seats.length-1-st)));
        
        return ans;
}


}



/*

1 0 0 0 1 0 1


---->   ans =  3 
st = end
end -> st+1 -> 1 =2

*/






















