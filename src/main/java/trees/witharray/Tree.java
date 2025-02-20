package trees.witharray;

import queues.ArrayQueue;
import queues.Queue;

public class Tree {
    private TreeNode root;

    private class TreeNode {
        int elem;
        TreeNode[] children;
        // constructor, getters, setters -assume they exist
        TreeNode(int elem) {
            this.elem = elem;
        }
    }

    public void printNodesPreorder() {
        printNodesPreorder(root);
    }

    public StringBuilder serialize() {
        return serialize(root);
    }

    public int numNodes() {
        return numNodes(root);
    }

    public int numLevels() {
        return numLevels(root);
    }

    public int numLeaves() {
        return numLeaves(root);
    }


    public void printByLevel() {
        // FILL IN CODE: print nodes top to bottom, left to right
        Queue queue = new ArrayQueue(100);
        if (root == null)
            return;
        queue.enqueue(root);
        while (!queue.empty()) {
            TreeNode curr = (TreeNode) queue.dequeue();
            // FILL IN CODE

        }

    }

    private void printNodesPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.elem + " ");
            if (root.children == null)
                return;
            int n = root.children.length;
            for (int i = 0; i < n; i++) {
                printNodesPreorder(root.children[i]);
            }
        }
    }


    private StringBuilder serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        // FILL IN CODE:
        // Return a string builder representing the tree.
        // Traverse using preorder, print ) whenever the node has no more children

        return sb;
    }


    private int numNodes(TreeNode root) {
        if (root == null)
            return 0;
        // FILL IN CODE: add a recursive case - compute the number of nodes recursively

        return 0;
    }

    private int numLeaves(TreeNode root) {
        if (root == null)
            return 0;
        // FILL IN CODE: compute the number of leaves recursively

        return 0;
    }

    private boolean isLeaf(TreeNode root) {
        if (root.children == null)
            return true;
        for (TreeNode child: root.children) {
            // array of children exists, but all references are null
            if (child != null)
                return false;
        }
        return true;
    }

    private int numLevels(TreeNode root) {
        if (root == null)
            return 0;
        int maxNumLevelsInChildren = 0;
        // FILL IN CODE: compute the number of levels recursively

        return  maxNumLevelsInChildren + 1;
    }


    /**
                   5
        1          15       22
     80   20             8   9   17
                                0   6
     */
    public void createTree() {
        TreeNode t1 = new TreeNode(5);
        t1.children = new TreeNode[3];
        t1.children[0] = new TreeNode(1);
        t1.children[1] = new TreeNode(15);
        t1.children[2] = new TreeNode(22);
        t1.children[0].children = new TreeNode[2];
        t1.children[0].children[0] = new TreeNode(80);
        t1.children[0].children[1] = new TreeNode(20);
        t1.children[2].children = new TreeNode[3];
        t1.children[2].children[0] = new TreeNode(8);
        t1.children[2].children[1] = new TreeNode(9);
        t1.children[2].children[2] = new TreeNode(17);
        t1.children[2].children[2].children = new TreeNode[2];
        t1.children[2].children[2].children[0] = new TreeNode(0);
        t1.children[2].children[2].children[1] = new TreeNode(6);
        root = t1;

    }
}
