package com.bridgelabz.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {

    public void insert(Node<T> root, T data){
        if(root == null){
            root = new Node<>(data);
        }
        else if(root.data.compareTo(data) < 0){
            if(root.right == null){
                root.right =  new Node<>(data);
                return;
            }

            insert(root.right,data);
        }else {
            if(root.left == null) {
                root.left = new Node<>(data);
                return;
            }
            insert(root.left,data);

        }

    }
    public void inOrder(Node<T> root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
    public void preOrder(Node<T> root){
        if(root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node<T> root){
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
    public int size(Node<T> root){
        if(root == null){
            return 0;
        }else{
            return 1 + size(root.left) + size(root.right);
        }

    }



}
