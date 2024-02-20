import java.util.*;;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data = data;
        this.left =null;
        this.right =null;
    }
}
class Pair{
    int f1;
    Node f2;
    public Pair(int f1,Node f2){
        this.f1 = f1;
        this.f2 = f2;
    }
}
public class ConstructBST {
    public static  Node createBst(Node root,int n){
        if(root==null){
            root = new Node(n);
            return root;
        }
        if(root.data>n){
            root.left = createBst(root.left, n);
        }
        else{
            root.right = createBst(root.right, n);
        }
        return root;
    }
    public static void leftview(Node root,List<Integer> arr,int i){
        if(root==null) return;
        if(i==arr.size()) arr.add(root.data);
        leftview(root.left, arr, i+1);
        leftview(root.right, arr, i+1);
    }
    public static void main(String[] args) {
        Node root = null;
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            root = createBst(root, arr[i]);
        }
        List<Integer> ans  = new ArrayList<>();
        leftview(root,ans,0);
        // System.out.println(ans);
        // inorder(root);
        // System.out.println();
        // int p = 2;
        // int q = 8;
        // int ans = lca(root,p,q);
        // System.out.println(ans);

        int target = 15;
        boolean res = haspathsum(root,target);
        System.out.println(res);
        List<Integer> ans1 = new ArrayList<>();
        topview(root,ans1);
    }
    public static boolean haspathsum(Node root,int sum){
        if(root==null) return false;
        boolean ans = false;

        int subsum = sum - root.data;

        if(subsum==0 && root.left==null && root.right==null) return ans=true;

        if(root.left!=null){
            ans = ans || haspathsum(root.left, subsum);
        }
        if(root.right!=null){
            ans = ans || haspathsum(root.right, subsum);
        }
        return ans;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int lca (Node root,int p ,int q){
        if(p==root.data || q == root.data ) return root.data;
        if(p==q) return p;
        
        boolean lft = search(root.left,p);
        boolean rgt = search(root.right,q);
        if(lft==true && rgt==true || lft!= true && rgt!=true) return root.data;
        if(lft==true && rgt!=true) return  lca(root.left, p, q);
        if(lft!=true && rgt==true) return  lca(root.right, p, q);
        return 0;
    }
    public static boolean search(Node root,int p){
        if(root==null) return false;
        if(root.data==p) return true;
        return search(root.left, p) || search(root.right, p);
    }
    public static void topview(Node root,List<Integer> ans){
	    Queue<Pair> q = new LinkedList<>();
	    TreeMap<Integer,Integer> h = new TreeMap<>();
	    q.add(new Pair(0,root));
	    while(q.size() > 0){
	        Pair pp = q.remove();
	        int val = pp.f1;
	        Node rot = pp.f2;
	        if(!h.containsKey(val)) h.put(val,rot.data);
	        if(rot.left!=null){
	            q.add(new Pair(val-1, rot.left));
	        }
	        if(rot.right!=null){
	            q.add(new Pair(val+1,rot.right));
	        }
	    }
	    for(var it:h.entrySet()){
	        ans.add(it.getValue());
	    }

}
