class Node 
{
    int data;
    Node left;
    Node right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 

class BinaryTree 
{
     Node root;  
     public void preOrder(Node node)
    {
        if(node!=null)
        {
            System.out.print(" "+node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node)
    {
        if(node!=null)
        {
            inOrder(node.left);
            System.out.print(" "+node.data);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node)
    {
        if(node!=null)
        {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+node.data);
        }
    }


    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        
        System.out.print("preorder : ");
        tree.preOrder(tree.root);
        System.out.print("\ninorder : ");
        tree.inOrder(tree.root);
        System.out.print("\npostorder : ");
        tree.postOrder(tree.root);


    }
}