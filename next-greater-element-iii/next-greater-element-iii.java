class Solution {
    public int nextGreaterElement(int n) {
        
        String m = Integer.toString(n);
        
        int i=m.length()-1;
        if(n<=11)
            return -1;
        
        while(i>0 && (m.charAt(i-1)-'0')>=(m.charAt(i)-'0'))
        {
          i--;
        }
        
        
        if(i==0)
            return -1;
    
        int j= i-1;
        int el = m.charAt(i-1)-'0';
        
        char[] arr= m.toCharArray();
        
         i = binsearch(j+1,arr.length-1,el,arr);
        
        
        
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        
        int n1= arr.length-1;
        j=j+1;
        while(j<n1)
        {
             t = arr[j];
            arr[j]=arr[n1];
            arr[n1]=t;
            j++;
            n1--;
        }
        
        long mstr =  Long.parseLong(new String(arr));
        
        if(mstr>Integer.MAX_VALUE)
            return -1;
        else
            return (int)mstr;
    }
    
    public int binsearch(int low,int high,int el,char[] arr)
    {
        
        int ind=-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]-'0'>el)
            {
                if(mid>ind)
                {
                   ind = mid;
                }
                    low=mid+1;
            }
                else
                {
                    high=mid-1;
                }

        }
        
        return ind;
    }
}