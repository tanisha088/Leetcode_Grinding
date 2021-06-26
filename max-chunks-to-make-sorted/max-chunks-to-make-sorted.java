class Solution {
    public int maxChunksToSorted(int[] arr) {
        /*
        int max=0;
        int chunk=1;
        
        for(int i=0;i<arr.length-1;i++)
        {
            max=Math.max(arr[i],max);
            if(i==max)
                chunk++;
        }
        
        return chunk;
    }
}
*/

int st=0;
int end=0;
    int res=0;
while(end<arr.length)
{
    int min=arr[st];
    int max=arr[st];
    
    while(end<arr.length-1 && (max!=end || st!=min))
    {
        end++;
        max=Math.max(max,arr[end]);
        min=Math.min(min,arr[end]);
    }
   st=end+1;
       end+=1;
       res+=1;
}      
     
return res;
    }
}

















