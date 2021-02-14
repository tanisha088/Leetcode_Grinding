class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length ==0 || nums2.length==0)
            return new int[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        int l=0;
        int h=nums2.length-1;
        int i=0;
        while(i<nums1.length)
        {
            int lo=l;
            int hi=h;
            while(lo<hi)
            {
                int mid=lo + (hi-lo)/2;
                if(nums2[mid]<nums1[i])
                    lo=mid+1;
                else
                    hi=mid;
            }
            System.out.println(lo+" "+hi);
            if(nums2[hi]!=nums1[i])
            {
                i++;
                continue;
            }
            int val=nums1[i];
            int c1=0;
            int c2=0;
            while(i<nums1.length && nums1[i]==val)
            {
                i++;
                c1++;
            }
                
            l=lo;
            
            while(l<nums2.length && nums2[l]==val)
            {
                l++;
                c2++;
            }
            System.out.println(l+" "+c1+" "+c2);
            int va1 = Math.min(c1,c2);
            while(va1--!=0)
                list.add(val);
        }
        int[] arr=new int[list.size()];
        for( i=0;i<arr.length;i++)
            arr[i]=list.get(i);
        
        return arr;
    }
}