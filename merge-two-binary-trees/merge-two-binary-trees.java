/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
       
if(r1==null && r2==null)return null;

int data = 0;

if(r1!=null) data+=r1.val;

if(r2!=null) data+=r2.val;

TreeNode node =  new TreeNode(data);

node.left =  mergeTrees(r1==null?r1:r1.left,r2==null?r2:r2.left);
node.right = mergeTrees(r1==null?r1:r1.right,r2==null?r2:r2.right);


return node;
    }
    
    /*
    
     3,1
     
    
    */
}










/*











*/











