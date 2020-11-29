package main.tutorials.dataStructures.BST;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insertNode(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.inOrder();
        }
    }

    public TreeNode search(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }
}
