class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int ze=0;
        int on=0;
        /*
        for(int i=0;i<students.length;i++)
            if(students[i]==0)
                ze++;
        else
            on++;
        
        int res=0;
        
        
        for(int i=0;i<sandwiches.length;i++)
        {
            if(sandwiches[i]==1)
            {
                if(on>0)
                on--;
               else
               {
                res+=sandwiches.length-i;
                break;
              }
            }
            else
            {
                if(ze>0)
                    ze--;
                else
                {
                    res+=sandwiches.length-i;
                break;
                }
            }
                
        }
        
        return res;
        
        */
        
          for(int i=0;i<students.length;i++)
            if(students[i]==0)
                ze++;
        else
            on++;
        
        for(int i=0;i<students.length;i++)
        {
            if((sandwiches [i]==0 && ze<=0) || (sandwiches [i]==1 && on<=0))
                return students.length-i;
          if (sandwiches [i]==0)
             ze--;
            else
                on--;
            
        }
        
        return 0;
    }
    
}







