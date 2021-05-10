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
    public List<Integer> inorderTraversal(TreeNode root) {
    
        // ITERATIVE IS BASICALLY MORRIS TRAVERSALLLLLLLLLLLLL
// ITERATIVELY FIND THE INORDER TRAVERSAL => MORRIS FOR EVERY NODE PRESENT - WE KNOW PHLE USKA LEFT WALA LIKHA JATA HAI AND THEN  WO NODE AND THEN USKA RIGHT CHILD -- IF WE TALK ABOUT INORDER TRAVERSAL ==> NOW PHLE LEFT KA PURA THEN NODE THEN RIGHT KA PURA => NOW SINCE ITERATIVE HAI HENCE HUM ISME NEECHE SE UPAR RECURSIVE CALLS RETURN HONE KI WAJAH SE NAHI AA SKTE AND HENCE AISA KUCH KARNA PADEGA KI NEECHE WALA KAAM HONE KE BAAD HUM KISI LINK KE THROUGH WAAPAS UPAR AA SAKE --> AB WE KNOW THAT KOI NODE KA OCCURENCE KAB HOGA -> JAB USKE LEFT SUBTREE KI SABHI NODES KHTAM HO JAAYENGI -> BASICALLY JAB LEFT SUBTREE KI RIGHT MOST NODE PRINT KARWA DI JAAYEGI -> AND HENCE LEFT SUBTREE KE RIGHT MOST NODE KE RIGHT MEI AGAR HUM APNI NODE KO ATTACH KAR DENGE TAB NEECHE WALA SAB KAAM HONE KE BAAD IS NODE PE HUM WAAPAS AA JAAYENGE AND IDHAR APNA KAAM KAR LENGE 
        
// NOW AB HUM AGAR KISI NODE PE HAI -> TO HUM DEKHENGE KI AGAR USKA LEFT EXIST KARTA HAI YA NHI -> AGAR NHI TO PRINT NODE AND GO TO RIGHT -> (RIGHT NULL HAI YA NHI YE CHECK KARNE KA MATLAB NHI -> ABHI AAGE SMJH AAYEGA ) -> ELSE IF LEFT IS NOT NULL -> GO TO LEFT AND THEN TO RIGHTMOST NODE -> IF RIGHTMOST NODE.RIGHT = NULL -> SET IT TO NODE AND YE INDICATION HAI KI YE PHLI BAAR TRAVERSE HO RHI ... SO NODE =  NODE.LEFT BHEJ DO KYONKI NEECHE WALI TRAVERSE NHI HUI ABHI TAK--- AND AB IS NODE KE LIYE NEECHE KA SCENE SMBHALE -> ELSE AGAR IS NODE.RIGHT!=NULL AND ==UPAR WALI PARENT NODE THEN YE PART PHLE HI TRAVERSE HO GAYA HAI AUR BAAD MEI WAAPAS AAYA HAI AND HENCE IS PARENT KO PRINT KARO AND RIGHT MEI TRAVERSAL KARO ( RIGHT!=NULL CHECK ISLIYE NHI KARNA KYONKI PHLE HI EK BAAR HAR PARENT APNE CHILD KA RIGHT SET KAR JAAYEGA AND HENCE USKE BAAD RIGHT KE THROUGH HI HUM NODE PE WAAPAS JAAYENGE)
        
       
        LinkedList<Integer> ll = new LinkedList<Integer>();
         /*
        while(root!=null)
        {
            if(root.left==null)
            {
               ll.add(root.val);
                root=root.right;
            }
            else
            {
                TreeNode node =  root.left;
                while(node.right!=null && node.right!=root)
                  node=node.right;
                
                if(node.right==null)
                {
                    node.right =root;
                    root = root.left;
                }
                else
                {
                    ll.add(root.val);
                    root = root.right;
                }
            }
        }
        
        */
        
        // 2ND APPROACH USING STACK ::::::::
        
             Stack<TreeNode> st= new Stack<TreeNode>();
        
        st.push(root);

        if(root==null)
            return ll;
        
        TreeNode curr =root.left;
        while(!st.isEmpty() || curr!=null)
        {
            while(curr!=null)
            {
               st.push(curr);
                curr=curr.left;
            }
            TreeNode n = st.pop();
            ll.add(n.val);
            curr = n.right;
           
        }
        
        return ll;
    }
}