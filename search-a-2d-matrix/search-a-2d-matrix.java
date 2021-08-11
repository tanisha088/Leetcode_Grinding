class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
//        boolean res=false;
        
//         int l=0;
//         int r=matrix.length*matrix[0].length -1;
//         while(l<=r)
//         {
//             int mid = l + (r-l)/2;
//             int row = mid/matrix[0].length;
//             int col = mid%matrix[0].length;
//             System.out.println(l+" "+r+" "+mid);
           
//             if(matrix[row][col]==target)
//             {
//                 res=true;
//                 break;
//             }
//             //   if(l==r)
//              //      break;
            
//             else if(matrix[row][col]>target)
//             {
//                 r=mid-1;
//             }
//             else
//                 l=mid+1;
//         }

//         return res;
        
        int l = 0;
        int r = matrix.length*matrix[0].length -1;
        
        while(l<=r)
        {
            int mid=  l + (r-l)/2;
            int x = mid/matrix[0].length;
            int y = mid%matrix[0].length;
            if(matrix[x][y]==target)
            {
                return true;
            }
            if(matrix[x][y]>target)
            {
                r  = mid-1;
            }
            else
            {
                l= mid+1;
            }
        }
        
        return false;
    }
    
}


