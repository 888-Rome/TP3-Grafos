package interfaces;

public interface INode<T> {

    // Mandatory Getters & Setters
    public T getData();
    public void setData(T data);

    public INode<T> getLeft();
    public void setLeft(INode<T> left);

    public INode<T> getRight();
    public void setRight(INode<T> right);

}
