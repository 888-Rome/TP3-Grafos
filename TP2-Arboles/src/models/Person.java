package models;

import interfaces.IPerson;

public class Person implements IPerson {
    // Attributes
    private String fullName;
    private String ID;
    private int age;
    private boolean foreign;

    // Constructors
    public Person() {
    }
    public Person(String fullName, String ID, boolean foreign, int age) {
        this.fullName = fullName;
        this.ID = ID;
        this.foreign = foreign;
        this.age = age;
    }

    // Getters & Setters
    @Override
    public String getFullName() {
        return fullName;
    }
    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getID() {
        return ID;
    }
    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isForeign() {
        return foreign;
    }
    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

    // Métodos de la clase:

    /*
    Comment:

    The standard comparison pattern in Java returns:
        -1 if the current object is less than the other
        0 if they are equal
        1 if they are greater

    If it returned IPerson, it would no longer be a comparison,
    but a selection.
     */

    @Override
    public int compareByID(IPerson other) {
        return this.ID.compareTo(other.getID());
    }
    @Override
    public int compareByFullName(IPerson other) {
        return this.fullName.compareTo(other.getFullName());
    }
    public int compareByAge(IPerson other) {
        if (this.age > other.getAge()) {
            return 1;
        } else if (this.age < other.getAge()) {
            return -1;
        }
        return 0;
    }

    /*
    Comment:

    Se leería: Devolveme la comparación entre el ID de este
    y el ID de este otro.
     */

    // toString
    @Override
    public String toString() {
        return fullName + ", " + age + " [" + ID + "]" + " | ";
    }

}
