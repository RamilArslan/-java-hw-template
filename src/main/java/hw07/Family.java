package hw07;

import hw07.person.Man;
import hw07.person.Woman;
import hw07.pets.Dog;
import hw07.pets.DomesticCat;
import hw07.pets.Fish;
import hw07.pets.RoboCat;

import java.util.Arrays;

public class Family {

    private Woman mother;
    private Man father;
    private Human[] children = new Human[0];
    private Pet pet;

    public Family(Woman mother, Man father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Woman mother, Man father) {
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
    protected void finalize() {
        System.out.println("Removing " + this.toString());
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
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

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
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


    public boolean deleteChild(Human child) {
        Human[] currentChildren = this.children;
        Human[] newChildren = new Human[currentChildren.length - 1];
        int newCount = 0;
        boolean contains = false;
        for (Human currentChild : currentChildren) {
            if (!currentChild.equals(child)) {
                newChildren[newCount++] = currentChild;
            } else {
                contains = true;
            }
        }
        if (contains)
            this.setChildren(newChildren);
        else {
            System.out.println("There is no such children");
        }
        return contains;
    }

    public boolean deleteChild(int childIndex) {
        Human child;
        try {
            child = children[childIndex];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return deleteChild(child);
    }

    public int countFamily() {
        return (this.mother != null ? 1 : 0) + (this.father != null ? 1 : 0) + (this.pet != null ? 1 : 0) + this.children.length;
    }

    public void greetPet() {
        if(getPet()==null){
            System.out.println("We have no pet9(((9(((99(((((((((((((((((((((((((((((((((9999((9999=");
            return;
        }
        if (Dog.class.equals(getPet().getClass())) {
            System.out.println("HELLO, DEAR DOG!0)");
        } else if (RoboCat.class.equals(getPet().getClass())) {
            System.out.println("HELLO, DEAR ROBOT CAT!0)");
        } else if (DomesticCat.class.equals(getPet().getClass())) {
            System.out.println("HELLO, DEAR DOMESTIC CAT!0)");
        } else if (Fish.class.equals(getPet().getClass())) {
            System.out.println("HELLO, DEAR FISH!0)");
        } else {
            System.out.println("succ");
        }
    }


    public void addChild(Human child) {
        Human[] newChildren = new Human[this.children.length + 1];
        int newCount = 0;
        for (Human currentChild : this.children) {
            newChildren[newCount++] = currentChild;
        }
        newChildren[newChildren.length - 1] = child;
        this.setChildren(newChildren);
    }


}