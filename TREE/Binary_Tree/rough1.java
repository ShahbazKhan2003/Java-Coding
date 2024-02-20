public class rough1 {
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.data = x;
        }
    }
    public TreeNode constructbt(int[] arr,int idx){
        TreeNode root = null;

        if(idx < arr.length){
            if(arr[idx] != -1){
                TreeNode node = new TreeNode(arr[idx]); 
                root = node;

                root.left = constructbt(arr, 2*idx+1);
                root.right = constructbt(arr, 2*idx+2);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,-1,6,-1,1,7};
        rough1 tree = new rough1();
        TreeNode root = tree.constructbt(arr,0);
        helper(root);

    }
    public static void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        helper(root.right);
        System.out.print(root.data+" ");
    }
}
