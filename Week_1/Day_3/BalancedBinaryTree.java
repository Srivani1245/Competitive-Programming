class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
}


class Height
{
    int height = 0;
}
public class BalancedBinaryTree {
    public boolean isBalanced(BinaryTreeNode root,Height h)
    {
        if(root==null)
        {
            h.height=0;
            return true;
        }
        Height lh=new Height();
        Height rh=new Height();

        boolean leftSTree=isBalanced(root.left,lh);
        boolean rightSTree=isBalanced(root.right,rh);

        h.height=(lh.height>rh.height?lh.height:rh.height)+1;

        if((lh.height-rh.height>=2)||(rh.height-lh.height>=2))
        {
            if((lh.height!=0)&&(rh.height!=0))
                return false;
        }


            return leftSTree & rightSTree;

    }
    public static void main(String[] args) {
        Height height = new Height();
        BalancedBinaryTree tree=new BalancedBinaryTree();
        BinaryTreeNode bt = new BinaryTreeNode(50);


        BinaryTreeNode x1 =bt.insertLeft(30);
        BinaryTreeNode x2 = x1.insertRight(40);
        BinaryTreeNode x3 = x1.insertLeft(20);
        BinaryTreeNode x4 = bt.insertRight(80);
        BinaryTreeNode x5 = x4.insertLeft(70);
        BinaryTreeNode x6 = x4.insertRight(90);



        System.out.println(tree.isBalanced(bt,height));
    }
}
