import javax.swing.tree.TreeNode;
import java.util.*;

public class Balance {





    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Balance {
        public boolean isBalance(TreeNode root) {
            // write code here
            if(root==null)
                return true;
            if(Math.abs(deepth(node2Depth, root.left)-deepth(node2Depth, root.right))>1)
                return false;
            else
                return isBalance(node2Depth, root.left) && isBalance(node2Depth, root.right);
        }

        public int deepth(TreeNode root){
            if(root==null)
                return 0;

            if(node2Depth.containsKey(root)){
                return node2Depth.get(root);
            }else{
                int depth = Math.max(deepth(root.left),deepth(root.right))+1;
                node2Depth.put(root, depth);
                return depth;
            }
        }
    }
}

}
