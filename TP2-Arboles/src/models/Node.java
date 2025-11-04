package models;

import interfaces.INode;

public class Node<T> implements INode<T> {

    // Attributes
    private T data;
    private INode<T> left;
    private INode<T> right;

    // Constructors
    public Node() {
    }
    public Node(T data, INode<T> left, INode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // Getters & Setters
    @Override
    public T getData() {
        return data;
    }
    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public INode<T> getLeft() {
        return left;
    }
    @Override
    public void setLeft(INode<T> left) {
        this.left = left;
    }

    @Override
    public INode<T> getRight() {
        return right;
    }
    @Override
    public void setRight(INode<T> right) {
        this.right = right;
    }

}

