class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] arr1 =  version1.split("\\.");
        String[] arr2 = version2.split("\\.");
     
    //    System.out.println(arr1.length);
        int i=0;
        int j=0;
        
        while(i<arr1.length && j<arr2.length)
        {
            StringBuilder sb1 = simplify(arr1[i]);
            StringBuilder sb2 =  simplify(arr2[i]);
         //   System.out.println(sb1+" "+sb2+" "+sb1.compareTo(sb2));
            int a = Integer.parseInt(sb1.toString());
            int b  = Integer.parseInt(sb2.toString());
           
            if(a>b)
                return 1;
            else if(a<b)
                return -1;
            i++;
            j++;
        }
        
        while(i<arr1.length)
        {
             StringBuilder sb1 = simplify(arr1[i]);
             if(!sb1.toString().equals("0"))
                 return 1;
            i++;
        }
        
           while(j<arr2.length)
        {
             StringBuilder sb2 = simplify(arr2[j]);
        //       System.out.println(sb2+ " " + sb2.equals("0") );
             if(!sb2.toString().equals("0"))
                 return -1;
            j++;
        }
        
        return 0;
        
    }
    
    public StringBuilder simplify(String arr1)
    {
        
            StringBuilder b =  new StringBuilder("");
            int j = 0;
            while(j<arr1.length() && arr1.charAt(j)=='0')
                j++;
            
            b.append(arr1.substring(j,arr1.length()));
            if(b.length()==0)
                b.append("0");
        
        
        return b;
        
    }
}