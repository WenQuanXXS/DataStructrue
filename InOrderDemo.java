package DataStructure;

public class InOrderDemo {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);

        n1.lchild = n2;
        n1.rchild = n3;

        n2.lchild = n4;
        n2.rchild = n5;

        n3.rchild = n6;

        System.out.print("InOrder:  ");
        InOrderTraversal(n1);
    }

    public static void InOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        InOrderTraversal(node.lchild);
        System.out.print(node.data + "  ");
        InOrderTraversal(node.rchild);
    }
}

class TreeNode{
    int data;
    TreeNode lchild = null;
    TreeNode rchild = null;

    public TreeNode(int data) {
        this.data = data;
    }
}