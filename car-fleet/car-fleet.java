class Solution {
    
    class Pair
    {
        int pos;
        double time;
        
        Pair(int p,double t)
        {
            this.pos=p;
            this.time=t;
        }
    }
    
    
    public int carFleet(int target, int[] position, int[] speed) {
        
        Pair[] p = new Pair[position.length];
        for(int i=0;i<position.length;i++)
        {
            Pair p1 = new Pair(position[i], ((target-position[i])*1.0)/speed[i]);
            p[i]=p1;
        }
        
   //     for(int i=0;i<p.length;i++)
     //       System.out.println(p[i].pos+" ");
        
        Arrays.sort(p,new Comparator<Pair>()
                    {
                        @Override public int compare(Pair p1,Pair p2)
                        {
                            return p1.pos-p2.pos;
                        }
                    });
        
      double curr=0;
        int ans=0;
        for(int i=p.length-1;i>=0;i--)
        {
            if(p[i].time > curr)
            {
                ans++;
                curr = Math.max(p[i].time,curr);
            }
        }
        
        return ans;
    }
}