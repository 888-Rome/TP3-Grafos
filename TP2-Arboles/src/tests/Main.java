package tests;

import models.Node;
import models.Person;
import enums.SortingCriterion;
import models.Tree;

public class Main {
    public static void main(String[] args) {

        // 🌿 Create the tree:
        Tree<Person> tree = new Tree<>();

        // 🌱 Create 15 people:
        Person[] people = {
                new Person("Lucía Gómez", "DNI001", false, 28),
                new Person("Ana Torres", "DNI002", false, 35),
                new Person("Martín Pérez", "DNI003", false, 42),
                new Person("Bruno Díaz", "DNI004", false, 30),
                new Person("Zoe Ramírez", "DNI005", false, 25),
                new Person("Carlos Méndez", "DNI006", false, 50),
                new Person("Valentina Ruiz", "DNI007", false, 33),
                new Person("Julián Castro", "DNI008", false, 29),
                new Person("Sofía Herrera", "DNI009", false, 31),
                new Person("Diego López", "DNI010", false, 40),
                new Person("Camila Varela", "DNI011", false, 27),
                new Person("Federico Ibarra", "DNI012", false, 36),
                new Person("Elena Suárez", "DNI013", false, 38),
                new Person("Tomás Aguirre", "DNI014", false, 45),
                new Person("Renata Ponce", "DNI015", false, 26)
        };

        // 🌱 Insert by name (also available by age or ID).
        tree.setCriterion(SortingCriterion.NAME);

        for (Person p : people) {
            tree.insert(new Node<>(p, null, null));
        }

        // 🌱 3 types of tree traversals:
        System.out.println("\n\n" + "Tree sorted by name: ");
        System.out.print("\n" + "InOrder: "); tree.traverseInOrder();
        System.out.print("\n" + "PreOrder: "); tree.traversePreOrder();
        System.out.print("\n" + "PostOrder: "); tree.traversePostOrder();

        // 🔍 Search for a person:
        Person target = new Person("Zoe Ramírez", "DNI005", false, 25);
        boolean searchingResult = tree.search(new Node<>(target, null, null));
        System.out.println("\n\n" + "Is Zoe Ramírez in the tree? " + searchingResult);

        // 🧹 Delete a person:
        tree.delete(new Node<>(target, null, null));
        System.out.println("Tree after deleting Zoe: ");
        System.out.print("InOrder: "); tree.traverseInOrder();

        // 🌱 Restart and insert by ID:
        tree = new Tree<>();

        tree.setCriterion(SortingCriterion.ID);
        for (Person p : people) {
            tree.insert(new Node<>(p, null, null));
        }

        System.out.println("\n\n" + "Tree sorted by ID: ");
        System.out.print("\n" + "InOrder: "); tree.traverseInOrder();
        System.out.print("\n" + "PreOrder: "); tree.traversePreOrder();
        System.out.print("\n" + "PostOrder: "); tree.traversePostOrder();

        // 🔍 Search by ID:
        searchingResult = tree.search(new Node<>(target, null, null));
        System.out.println("\n\nIs Zoe Ramírez in the tree by ID? " + searchingResult);

        // 🧹 Delete by ID:
        tree.delete(new Node<>(target, null, null));
        System.out.println("\n🌿 Tree after deleting Zoe:");
        System.out.print("InOrder: "); tree.traverseInOrder();
    }
}
