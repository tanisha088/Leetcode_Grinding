class Solution {
    public String pushDominoes(String dominoes) {
        
        /*   L    R // NOTHING 
             R    L // MID - LEFT R RIGHT L AND ODD - MID .
             L    L //  LEFT
             R    R  // RIGHT 
             
        */
          
          
        if(dominoes.length()<=1)
            return dominoes;
        
        
            dominoes='L'+ dominoes;
            dominoes=dominoes+'R';
                      
          char[] arr = dominoes.toCharArray();
          
        int j=arr.length-1;
        
        while(j>=0 && arr[j]=='.')
            j--;
        
        while(j>=0)
        {
            int i=j-1;
            
            while(i>=0 && arr[i]=='.')
                i--;
    
             if(i<0)
                 break;
            
            if(arr[i]=='R' && arr[j]=='L')
            {
                int len = j-i-1;
                if(len<0)
                    continue;
                
                int count=len/2;
                int st=i+1;
                while(count!=0)
                {
                    arr[st]='R';
                    st++;
                    count--;
                }
                
                count=len/2;
                st=j-1;
                while(count!=0)
                {
                    arr[st]='L';
                    st--;
                    count--;
                }
                  
            }
            else if(arr[i]=='R')
            {
                int st = i+1;
                while(st<j)
                {
                    arr[st]='R';
                    st++;
                }
            }
            else if(arr[j]=='L')
            {
                int st =j-1;
                while(st>i)
                {
                    arr[st]='L';
                        st--;
                }
            }
                
               j=i; 
            while(j>=0 && arr[j]=='.')
            j--;
        }
        
        
         String str = "";
        for(int i=1;i<arr.length-1;i++)
            str=str+arr[i];
        
        return str;
        
        
        /*
        if(dominoes.length()<=1)
            return dominoes;
        
          char[] arr = dominoes.toCharArray();
          
        boolean[] b1 = new boolean[arr.length];
        for(int i=dominoes.length()-1;i>=0;i--)
        {
            if(arr[i]=='.')
            {
                if(i<arr.length-1 && arr[i+1]=='L' && !b1[i+1])
                {
                    if(i>0 && arr[i-1]!='R')
                    {
                        arr[i]='L';
                        b1[i]=true;
                     }
                    else
                        i--;
                }
                
            }
            else if(arr[i]=='R' && i<arr.length-1 && arr[i+1]=='.')
            {
                arr[i+1]='R';
                b1[i+1]=true;
            }
        }
        
        if(!b1[1] && arr[1]=='L' && arr[0]=='.')
            arr[0]='L';
         
        String str = "";
        for(char c:arr)
            str=str+c;
        
        return str;
        
        */
    }
}


//  L L . R R . L L R R L L . .  

// L L . R R . L L R R L L . .      L -> i-1  and also i-2 ? R  ,  . on i-1 ? R  

     // RR.L   

//  