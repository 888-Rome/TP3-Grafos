package interfaces;

public interface IPerson {
    // Mandatory Getters & Setters:
    public String getFullName();
    public void setFullName(String fullName);

    public String getID();
    public void setID(String ID);

    public int getAge();
    public void setAge(int age);

    public boolean isForeign();
    public void setForeign(boolean foreign);

    // Mandatory Class' Methods:
    public int compareByID(IPerson other);
    public int compareByFullName(IPerson other);
    public int compareByAge(IPerson other);

}
