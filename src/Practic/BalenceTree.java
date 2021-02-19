package Practic;

public class BalenceTree {

        public boolean IsBalanced_Solution(TreeNode root) {
            if(root == null) {
                return true;
            }
            return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
                    IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }

        private int maxDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

