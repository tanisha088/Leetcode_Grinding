class Solution {
    public String multiply(String num1, String num2) {
        
        int[] arr = new int[num1.length()+num2.length()+1];
    
        int ind1=0;
        int ind2=0;
        
        for(int i=num1.length()-1;i>=0;i--)
        {
            ind2=0;
            for(int j=num2.length()-1;j>=0;j--)
            {
            arr[ind1+ind2] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                ind2++;
            }
            ind1++;
        }
        
        int car=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"*");
            int sum =  arr[i]+car;
             car = sum/10;
            sum = sum%10;
           
            arr[i] = sum;
            
       //     System.out.println(arr[i]);
        }
        
        StringBuilder sb=  new StringBuilder("");
        
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        
        sb.reverse();
        
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0')
             i++;
        
        if(i==sb.length())
            return "0";
        
        
        return sb.substring(i,sb.length()).toString();
        
    }
}

