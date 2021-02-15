class MedianFinder {

    /** initialize your data structure here. */
    
    
    
    PriorityQueue<Integer> maxpq;
    PriorityQueue<Integer> minpq ;

    public MedianFinder() {
        maxpq = new PriorityQueue<Integer>((a,b)->b-a);
         minpq = new PriorityQueue<Integer>((a,b)->a-b);
    }
    
    public void addNum(int num) {
        if(maxpq.size()==minpq.size())
        {maxpq.add(num);
            minpq.add(maxpq.poll());
        }
        else
        {
            minpq.add(num);
            maxpq.add(minpq.poll());
        } 
    }
    
    public double findMedian() {
        if(minpq.size()>maxpq.size())
            return minpq.peek()*1.0;
        else
            return (minpq.peek()*1.0+maxpq.peek()*1.0)/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */