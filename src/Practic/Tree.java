package Practic;
import java.util.Queue;
import java.util.LinkedList;


public class Tree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
        public int TreeDepth(TreeNode pRoot)
        {
            if(pRoot == null){
                return 0;
            }
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.add(pRoot);
            int depth = 0, count = 0, nextCount = 1;
            while(queue.size()!=0){
                TreeNode top = queue.poll();
                count++;
                if(top.left != null){
                    queue.add(top.left);
                }
                if(top.right != null){
                    queue.add(top.right);
                }
                if(count == nextCount){
                    nextCount = queue.size();
                    count = 0;
                    depth++;
                }
            }
            return depth;
        }
    }

