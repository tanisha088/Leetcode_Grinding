class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->((a[0]==b[0])?b[1]-a[1] : a[0]-b[0]));
        
        Arrays.sort(firstList,((a,b)->((a[0]==b[0])?b[1]-a[1] : a[0]-b[0])));

         Arrays.sort(secondList,((a,b)->((a[0]==b[0])?b[1]-a[1] : a[0]-b[0])));
        
//   [[13,23],[24,25]]
// [[15,24],[25,26]]      nst=13 nend=12   ans->{1,2}  {5,5} {8,10} 
        int i=0;
        int j=0;
        
        List<int[]> ans =  new ArrayList<int[]>();
        
        while(i<firstList.length && j<secondList.length)
        {
            int nst =  Math.max(firstList[i][0],secondList[j][0]);
            int nend  = Math.min(firstList[i][1],secondList[j][1]);
            
            if(nend<nst)
            {
                if(firstList[i][1]<secondList[j][0])
                {
                    i++;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                if(secondList[j][1]>=firstList[i][1])
                {
                  
                    secondList[j] = new int[]{firstList[i][1],secondList[j][1]};
                    ans.add(new int[]{nst,nend});
                     i++;
                }
                else
                {
                   
                    firstList[i] = new int[]{secondList[j][1],firstList[i][1]};
                    ans.add(new int[]{nst,nend});
                     j++;
                    
                }
            }
        }
        
   //     System.out.println(i+" "+j);
        int[][] array = new int[ans.size()][2];
ans.toArray(array);
        return array;
    }
}