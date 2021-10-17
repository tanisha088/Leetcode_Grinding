class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
       
        
        Arrays.sort(boxTypes,((a,b)->(b[1]-a[1])));
        
        int ans=0;
        int count=0;
        for(int i=0;i<boxTypes.length;i++)
        {
            if(boxTypes[i][0]+count<=truckSize)
            {
                ans+= (boxTypes[i][0])*(boxTypes[i][1]);
                count+=boxTypes[i][0];
            }
            else
            {
                ans+= (truckSize-count)*(boxTypes[i][1]);
                break;
            }
        }
        
        return ans;
    }
}