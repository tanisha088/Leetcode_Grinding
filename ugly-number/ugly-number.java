class Solution {
    public boolean isUgly(int n) {
        
        // ek number bina uske prime factors ke ban hi nhi skta toh if ek number 2,3,5, se divisble hai to usse divide kar do and if agar koi point aaye jaha wo number kisi bhi 2,3,5 se divisible na ho then wo number ugly nhi hai --- and since agar 2,3,5 ke alawa ek bhi prime factor hoga kisi bhi number ka then wo pakka encounter hoga hi hoga.
        
        
        /*
        if(n<=0)
            return false;
       
        while(n!=1)
        {
            if(n%2==0)
                n/=2;
            else if(n%3==0)
                n/=3;
            else if(n%5==0)
                n/=5;
            else
                return false;
        }
        
        return true;
        
        */
        
        
  while(n>1 && n%2==0)
  {
      n=n/2;
  }

while(n>1 && n%3==0)
{
    n=n/3;
}
while(n>1 && n%5==0)
    n=n/5;

///System.out.println(n);
if(n>1 || n<=0)
    return false;
return true;
        
          /*
        
        if(n==1 || n==2 || n==3 || n==5)
            return true;
        
        if(n%2==0)
            return isUgly(n/2);
        else if(n%3==0)
            return isUgly(n/3);
        else if(n%5==0)
            return isUgly(n/5);
        else
            return false;
            */
    }
    
}



