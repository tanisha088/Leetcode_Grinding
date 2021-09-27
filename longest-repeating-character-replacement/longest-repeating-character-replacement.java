class Solution {
    public int characterReplacement(String s, int k) {
//         int st=0;
//         int end=0;
//         int ans=0;
//         int count=0;
//         HashMap<Character,Integer> h = new HashMap<Character,Integer>();
//         while(end<s.length())
//         {
//             char e = s.charAt(end);
//             char es=  s.charAt(st);
//             h.put(e,h.getOrDefault(e,0)+1);
//             end++;
//             if((end-st)-h.get(es)>k)
//             {
//                h.put(es,h.get(es)-1);
//                 st++;
//                  es=  s.charAt(st); 
//             }
            
//             if((end-st)-h.get(es)<=k)
//                 ans=Math.max(end-st,ans);
//         }
        
//         return  ans;
 //   }
    
//      public int characterReplacement(String s, int k) {
//     	if (s == null || s.isEmpty()) return 0;
//     	int left = 0, right = 0, counter = 0, res = 0;
//     	Map<Character, Integer> map = new HashMap<>();
//     	while(right < s.length()) {
//     		char ch = s.charAt(right++);
//     		map.put(ch, map.getOrDefault(ch, 0) + 1);
//     		if (counter < map.get(ch)) counter = map.get(ch);
            
//               System.out.println(right+" "+left+" "+counter);
            
//     		// check how many chars to "flip" by looking at the delta between the
//     		// length of the string and the highest frequency char. If <= k, no problem. Otherwise, move window
//     		while(!(right - left - counter <= k)) { // apply De Morgan and make it right - left - counter > k
              
//     			char tmp = s.charAt(left);
//     			map.put(tmp, map.get(tmp) - 1);
//     			counter = getMax(map);
//     			left++;
//     		}
//     		res = Math.max(res, right - left);
//     	}    	
//     	return res;
//     }
    
//     private int getMax(Map<Character, Integer> map) {
// 		int max = 0;
// 		for(int freq : map.values()) {
// 			max = Math.max(max, freq);
// 		}
// 		return max;
//     }
    
    
//         int[] charray = new int[26];
//         int st=0;
//         int end=0;
//         int res=0;
//         int max=0;
//         for(end=0;end<s.length();end++)
//         {
//             charray[s.charAt(end)-'A']+=1;
//             max = Math.max(max,charray[s.charAt(end)-'A']);
//             while((max+k)<(end-st+1))
//             {
//                 charray[s.charAt(st)-'A']-=1;
//                  max=-1;
//                 for(int i:charray)
//                     max=Math.max(max,i);
            
//  //        max = Math.max(max,charray[s.charAt(st)-'A']);   
//                 st++;

//             }
        
//         //    System.out.print(charray[0]+" "+charray[1]+" "+st+" "+end +" "+(max+k));
//           //  System.out.println();
//             res = Math.max(res,end-st+1);
//       //      System.out.println(res);  
//         }
        
//         return res;
        
        
        
        int[] arr = new int[26];
        
        for(char c:s.toCharArray())
        {
            arr[c-'A']+=1;
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
                continue;
            
            int st=0;
            int end=0;
            int count=0;
            int k1 = k;
            char tc = (char)('A'+i);
            while(end<s.length())
            {
                if(s.charAt(end)!=tc)
                    k1--;
                
                while(k1<0)
                {
                    if(s.charAt(st)!=tc)
                        k1++;
                    
                    st++;
                }
                end++;
                count = Math.max(count,end-st);
            }
            
            ans=Math.max(ans,count);
        }
        
        return ans;
    }
}


