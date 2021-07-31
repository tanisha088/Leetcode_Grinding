class Solution {
    public int numRabbits(int[] answers) {
//         Arrays.sort(answers);
//         HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        
//         for(int i=0;i<answers.length;i++)
//         {
//          //   System.out.
//             if(answers[i]==0)
//             {
//                 h.put(1,h.getOrDefault(1,0)+1);
//             }
//             if(!h.containsKey(answers[i]+1))
//                 h.put(answers[i]+1,0);
            
//         }
//         int size=0;
//    //   System.out.println(h);
//         for(Map.Entry<Integer,Integer>e:h.entrySet())
//         {
        
//             size+=e.getKey();
//         }
//         return size+h.get(1)-1;
//     }
        
         HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        
        for(int i:answers)
            h.put(i,h.getOrDefault(i,0)+1);
        int res=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            int key = e.getKey();
            int val = e.getValue();
            
            res = res + ((int)Math.ceil(val*1.0/(key+1)))*(key+1);
        }
        
        return res;
}
}


// a b c d e 

// a -2
// b -2
// c -2
// d -2
// e -2
// f -2
    
// a b c d e f

// a-1
// b-1
// c-1
// d-1
// e-1
    
//     3*2
    
// count/(i+1) * (i+1)