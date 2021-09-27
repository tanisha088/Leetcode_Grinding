class Solution {
    public void wiggleSort(int[] nums) {
        
//           int[] copy = Arrays.copyOf(nums, nums.length);
//         Arrays.sort(copy);
        
//         int n = nums.length;
//         int left = (n + 1) / 2 - 1; // median index
//         int right = n - 1; // largest value index
//         for (int i = 0; i < nums.length; i++)
//         {   // copy large values on odd indexes
//             if(i%2==1){
//                 nums[i] = copy[right];
//                 right--;
//             } else{ // copy values decremeting from median on even indexes
//                 nums[i] = copy[left];
//                 left--;
//             }
//         }
        
        int[] arr=  new int[nums.length];
        
        Arrays.sort(nums);
        
        int ind = nums.length/2 + nums.length%2;
        int end=nums.length-1;
        int i=1;
        while(end>=ind)
        {
            arr[i]=nums[end--];
            i+=2;
        }
        i=0;
        while(end>=0)
        {
            arr[i]=nums[end--];
            i+=2;
        }
        
        for(i=0;i<arr.length;i++)
            nums[i]=arr[i];
    }
}
/*

   a b c d
   
   4

*/



/*
        for (int i = 1; i < n; i+=2) 
        { 
            // If current even element is smaller 
            // than previous 
            if (i>0 && arr[i-1] > arr[i] ) 
                swap(arr, i-1, i); 
  
            // If current even element is smaller 
            // than next 
            if (i<n-1 && arr[i] < arr[i+1] ) 
                swap(arr, i, i + 1); 
        } 
    }
    
    void swap(int arr[], int a, int b) 
	{ 
		int temp = arr[a]; 
		arr[a] = arr[b]; 
		arr[b] = temp; 
	}
    
    }
    }
*/



// 4556
    
    
//     5 6 4 5    ===  - 5 - 6  









