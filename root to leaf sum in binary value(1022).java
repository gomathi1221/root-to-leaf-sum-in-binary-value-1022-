class Solution {
    public int sumRootToLeaf(TreeNode root) {
       
        return helper(root,0);
       

    }
    public int helper(TreeNode root,int currsum){
        if(root==null){
            return 0;
        }
        currsum=currsum*2+root.val;
        if(root.right==null&&root.left==null){
            return currsum;
        }

        int left=helper(root.left,currsum);
        int right=helper(root.right,currsum);
        return left+right;
    }
    
}