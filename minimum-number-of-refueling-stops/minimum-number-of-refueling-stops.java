class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        int pos=0;
        int res=0;
        for(int i=0;i<stations.length;i++)
        {
            int fuel =  stations[i][0]-pos;
            
            startFuel = startFuel - fuel;
            
            while(startFuel<0 && !pq.isEmpty())
            {
              startFuel =startFuel + pq.remove();res++;
            }
            if(pq.isEmpty()&& startFuel<0)
                return -1;
            pq.add(stations[i][1]);
            pos  = stations[i][0];
        }
        
        
        startFuel =  startFuel - (target-pos);
        
          while(startFuel<0 && !pq.isEmpty())
          {
              startFuel =startFuel + pq.remove(); res++;
          }
            
            if(pq.isEmpty()&& startFuel<0)
                return -1;
            
        return res;
    }
}

/*

st = 1

fuel = pos[i]-pos[i-1]
st = st-fuel
while(st<0)
st= st+pq.pop();

if(st<0 && pq.isEmpty())
return -1;



*/