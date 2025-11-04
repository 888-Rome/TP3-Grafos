package interfaces;

public interface ITree<T> {

    // Mandatory Getters & Setters:
    public void setRoot(INode<T> root);
    public INode<T> getRoot();

    // Mandatory Class' Methods:
    public void insert(INode<T> data);
    public void delete(INode<T> target);

    public void traverseInOrder();
    public void traversePreOrder();
    public void traversePostOrder();

    public int compare(IPerson a, IPerson b);

    public boolean search(INode<T> target);

}
