class MyCalendar {
  
    PriorityQueue<int[]> pq;
    public MyCalendar() {
        pq =new PriorityQueue<int[]>((a,b)->((a[0]!=b[0])?a[0]-b[0]:a[1]-b[1]));
    }
    
    public boolean book(int start, int end) {
        if(pq.size()==0)
        {
            pq.add(new int[]{start,end-1});
            return true;
        }
        else
        {
            PriorityQueue<int[]> p1= new PriorityQueue<int[]>((a,b)->((a[0]!=b[0])?a[0]-b[0]:a[1]-b[1]));
            boolean ans=true;
            while(!pq.isEmpty())
            {
                int[] ar= pq.remove();
                if(!(ar[1]<start || ar[0]>=end))
                 ans=false;
                
                p1.add(ar);
            }
            
            pq=p1;
            if(ans)
            pq.add(new int[]{start,end-1});
            return ans;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */