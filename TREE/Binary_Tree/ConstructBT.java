import java.util.Scanner;

public class ConstructBT {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            val = x;
        }
    }
    public TreeNode construct(int[] arr){
        if(arr==null || arr.length==0) return null;

        TreeNode[] nodes = new TreeNode[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1) nodes[i] = new TreeNode(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (nodes[i] != null) {
                int leftChildIndex = 2 * i + 1;
                int rightChildIndex = 2 * i + 2;

                if (leftChildIndex < arr.length) {
                    nodes[i].left = nodes[leftChildIndex];
                }

                if (rightChildIndex < arr.length) {
                    nodes[i].right = nodes[rightChildIndex];
                }
            }
        }
        return nodes[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        ConstructBT treeBuild = new ConstructBT();
        TreeNode root = treeBuild.construct(arr);
        helper(root);
    }
    public static void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        helper(root.right);
        System.out.print(root.val+" ");
    }
}
