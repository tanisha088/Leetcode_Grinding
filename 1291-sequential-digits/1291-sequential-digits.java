class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> list=  new ArrayList();
        
        
        
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
                   list.add(number);
               }
           }
       }
        
        Collections.sort(list);
        
        return list;
    }
}