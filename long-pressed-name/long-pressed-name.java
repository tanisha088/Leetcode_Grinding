class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        /*
        int i=0;
        int j=0;
        
        while(i<name.length() && j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(j>0 && typed.charAt(j)==typed.charAt(j-1))
            {
                j++;
            }
            else
                return false;
        }
        if(j>0 && j<typed.length())
            while(j<typed.length() && typed.charAt(j-1)==typed.charAt(j))
                j++;
        
        if(i>=name.length() && j>=typed.length())
            return true;
        
        return false;
   */
        
        
int i=0;
int j=0;
    
while(i<name.length() && j<typed.length())
{
    if(name.charAt(i)!=typed.charAt(j))
        return false;
    
while(i<name.length() && j<typed.length() && name.charAt(i)==typed.charAt(j))
{
    i++;
    j++;
}
    char m = typed.charAt(j-1);
    while(j<typed.length() && m==typed.charAt(j))
    {
        j++;
    }   
}

if(j<typed.length() || i<name.length())
    return false;

return true;

        
    }
    
}

















       




