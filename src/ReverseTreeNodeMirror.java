//import javax.swing.tree.TreeNode;
//
//import javax.swing.tree.TreeNode;
//
//public class ReverseTreeNodeMirror {
//        public void Mirror(TreeNode root) {
//            if (root == null)
//                return;
//            if (root.left == null && root.right == null)
//                return;
//            TreeNode tmp = null;
//            tmp = root.right;
//            root.right = root.left;
//            root.left = tmp;
//            if (root.left != null)
//                Mirror(root.left);
//            if (root.right != null)
//                Mirror(root.right);
//        }
//    }
//
//