import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int value){
        data=value;
        left=right=null;
    }
}
class Tree{
    Node root;
    Tree(){
        root=null;
    }
    /*boolean searching(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return searching(root.left, key);
        }else{
            return searching(root.right, key);
        }
    }*/
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    Node inserting(Node root,int key){
        if(root==null){
            root =new Node(key);
            return root;
        }
        if(root.data>key){
            root.left= inserting(root.left,key);
        }else{
            root.right=inserting(root.right,key);
        }
        return root;
    }
}
public class SearchingBST{
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(4);
        tree.root.left=new Node(2);
        tree.root.right=new Node(6);
        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(3);
        tree.root.right.left=new Node(5);
        tree.root.right.right=new Node(7);
        tree.inorder(tree.root);
        System.out.println("\n");
        tree.inserting(tree.root,8);
        tree.inorder(tree.root);
    }
}
root=9;
root.left=7
root.right=12;
root.left.right=8;
root.left.left=6;
root.right.left=10;
root.right.right=14;