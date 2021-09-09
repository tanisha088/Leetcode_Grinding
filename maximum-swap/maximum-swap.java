class Solution {
    public int maximumSwap(int num) {
     
           StringBuilder sb = new StringBuilder("");
        int n = num;
        while(n>0)
        {
           int r = n%10;
            sb.append((char)(r+'0'));
            n=n/10;
        }
        
        sb.reverse();
        
   //     System.out.println(sb);
        
        int[][] arr=  new int[sb.length()][2];
        
        for(int i=sb.length()-1;i>=0;i--)
        {
            char c  = sb.charAt(i);
             arr[i][0]=c-'0';
                arr[i][1]=i;
            if(i<sb.length()-1)
            {
              if(arr[i+1][0]>=arr[i][0])
                {
                    arr[i]  = arr[i+1];
                }  
            }
          
        }
        
        for(int i=0;i<sb.length();i++)
        {
            int c = sb.charAt(i)-'0';
         //   System.out.println(arr[i][0]+" "+c);
            if(arr[i][0]>c)
            {
                sb.replace(arr[i][1],arr[i][1]+1,(char)(c+'0')+"");
                sb.replace(i,i+1,(char)(arr[i][0]+'0')+"");
                break;
            }
        }
        
       return Integer.parseInt(sb.toString());
        
    }
}














/*

98351

971380
98370

2198780
912780

10 - size 

0-9

98319

971380

*/













