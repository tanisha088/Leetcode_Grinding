class Solution {
      int max=Integer.MIN_VALUE;
	void recur(String str,int n,int ind,String s,List<Integer> list)
	{
		if(ind==n)
        {   
           if(isPallin(str))
           {
	           	String st="";
	           	for(int i=0;i<n;i++)
	           		if(!list.contains(i))
	           			st+=s.charAt(i);
                recur1("", st.length(), 0, st,str);
           }
           return;
        }
		recur(str,n,ind+1,s,new ArrayList(list));
		str+=s.charAt(ind);
		list.add(ind);
		recur(str,n,ind+1,s,new ArrayList(list));
	}
	void recur1(String str,int n,int ind,String s,String st)
	{
		if(ind==n)
        {
            if(isPallin(str))
                max=Math.max(max,st.length()*str.length());
            return;
        }
		recur1(str,n,ind+1,s,st);
		str+=s.charAt(ind);
		recur1(str,n,ind+1,s,st);
	}
	boolean isPallin(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
            i++;
            j--;
		}
		return true;
	}
    public int maxProduct(String s) {
    	
        recur("",s.length(),0,s,new ArrayList());
        return max;
    }
}
    