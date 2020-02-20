package hw05;

import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nmother=" + mother +
                ",\n father=" + father +
                ",\n children=" + Arrays.toString(children) +
                ",\n pet=" + pet +
                '}';
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void deleteChild(Human child) {
        Human[] currentChildren = this.children;
        Human[] newChildren = new Human[currentChildren.length - 1];
        int newCount = 0;
        for (Human currentChild : currentChildren) {
            if (!currentChild.equals(child)) {
                newChildren[newCount++] = currentChild;
            }
        }
        this.setChildren(newChildren);
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[this.children.length + 1];
        int newCount = 0;
        for (Human currentChild : this.children) {
                newChildren[newCount++] = currentChild;
        }
        newChildren[newChildren.length-1] = child;
        this.setChildren(newChildren);
    }





}