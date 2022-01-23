class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> list=  new ArrayList();
        
        ArrayList<Integer>[] array =  new ArrayList[9];
        
        for(int i=0;i<9;i++)
            array[i] = (new ArrayList());
        
       for(int i=1;i<=9;i++)
       {
           StringBuilder str = new StringBuilder("");
           int num=i;
           while(num<10)
           {
               str.append(num++);
               int number=Integer.parseInt(str.toString());
               if(number>=low && number<=high)
               {
                   
                  array[str.length()-1].add(number);
               }
           }
       }
        
        for(int i=0;i<array.length;i++)
        {
            ArrayList<Integer> ll =  array[i];
            for(int j=0;j<ll.size();j++)
                list.add(ll.get(j));
        }
        
        return list;
    }
}