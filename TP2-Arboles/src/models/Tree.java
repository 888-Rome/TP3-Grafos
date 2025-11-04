package models;

import interfaces.INode;
import interfaces.IPerson;
import interfaces.ITree;
import enums.SortingCriterion;

public class Tree<T> implements ITree<T> {

    // Attributes:
    private INode<T> root;
    private SortingCriterion criterion = SortingCriterion.ID;

    // Constructors:
    public Tree() {
        this.root = null;
    }
    public Tree(INode<T> root) {
        this.root = root;
    }

    // Getters & Setters:
    @Override
    public INode<T> getRoot() {
        return root;
    }
    @Override
    public void setRoot(INode<T> root) {
        this.root = root;
    }

    public SortingCriterion getCriterion() {
        return criterion;
    }
    public void setCriterion(SortingCriterion criterion) {
        this.criterion = criterion;
    }

    // Class' Methods:
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int compare(IPerson a, IPerson b) {
        return criterion.compare(a,b);
    }

    @Override
    public void insert(INode<T> data) {
        if (isEmpty()) {
            root = data;
        }

        else {
            insertRecursive(root, data);
        }
    }
    public void insertRecursive(INode<T> current, INode<T> incoming) {
        IPerson currentData = (IPerson) current.getData();
        IPerson incomingData = (IPerson) incoming.getData();

        int comparison = compare(incomingData, currentData);

        if (comparison < 0) {
            if (current.getLeft() == null) {
                current.setLeft(incoming);
            } else {
                insertRecursive(current.getLeft(), incoming);
            }
        }
        else if (comparison > 0) {
            if (current.getRight() == null) {
                current.setRight(incoming);
            } else {
                insertRecursive(current.getRight(), incoming);
            }
        }

        // If it is the same, we would not be interested in inserting it.
    }

    @Override
    public void delete(INode<T> target) {
        if (isEmpty()) return;
        if (!search(target)) return;

        root = deleteRecursive(root, target);
    }
    public INode<T> deleteRecursive(INode<T> current, INode<T> target) {
        if (current == null) return null;

        IPerson currentData = (IPerson) current.getData();
        IPerson targetData = (IPerson) target.getData();

        int comparison = compare(targetData, currentData);

        if (comparison < 0) {
            current.setLeft(deleteRecursive(current.getLeft(), target));
        } else if (comparison > 0) {
            current.setRight(deleteRecursive(current.getRight(), target));
        } else {
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            if (current.getLeft() == null) {
                return current.getRight();
            }
            if (current.getRight() == null) {
                return current.getLeft();
            }

            INode<T> successor = findSuccesor(current);
            current.setData(successor.getData());
            current.setRight(deleteRecursive(current.getRight(), successor));
        }

        return current;
    }
    private INode<T> findSuccesor(INode<T> node) {
        INode<T> current = node.getRight();
        while (current != null && current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }
    // findSuccesor returns the smallest of the largest.

    @Override
    public boolean search(INode<T> target) {
        if (root == null) return false;
        return searchRecursive(root, target);
    }
    public boolean searchRecursive(INode<T> current, INode<T> target) {
        if (current == null) {
            return false;
        }

        /*
        En lugar de evaluar root == null, puse current porque
        significaría que llegué a un null habiendo recorrido
        hasta una hoja sin encontrar el dato.
         */

        IPerson currentData = (IPerson) current.getData();
        IPerson targetData = (IPerson) target.getData();

        int comparison = compare(targetData, currentData);

        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return searchRecursive(current.getLeft(),target);
        } else {
            return searchRecursive(current.getRight(),target);
        }
    }

    @Override
    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }
    public void traverseInOrderRecursive(INode<T> current) {
        if (current != null) {
            traverseInOrderRecursive(current.getLeft());
            System.out.print(current.getData() + " ");
            traverseInOrderRecursive(current.getRight());
        }
    }

    @Override
    public void traversePreOrder() {
        traversePreOrderRecursive(root);
    }
    public void traversePreOrderRecursive(INode<T> current) {
        if (current != null) {
            System.out.print(current.getData() + " ");
            traversePreOrderRecursive(current.getLeft());
            traversePreOrderRecursive(current.getRight());
        }
    }

    @Override
    public void traversePostOrder() {
        traversePostOrderRecursive(root);
    }
    public void traversePostOrderRecursive(INode<T> current) {
        if (current != null) {
            traversePostOrderRecursive(current.getLeft());
            traversePostOrderRecursive(current.getRight());
            System.out.print(current.getData() + " ");
        }
    }

}
