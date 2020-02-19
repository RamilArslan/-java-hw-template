package hw04;

class Human {

    private String name;
    private String surname;
    private int dob;
    private int IQ;
    private Pet dog;
    private Human mother;
    private Human father;
    private int[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Human(String name, String surname, int dob, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dob, int IQlevel, Pet pet, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.IQ = IQlevel;
        this.dog = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;

    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getDob() {
        return dob;
    }

    public int getIQlevel() {
        return IQ;
    }


    public Pet getPet() {
        return dog;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public void setDog(Pet dog) {
        this.dog = dog;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + getPet());
    }
    public void describePet() {
        System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + " years old, " + " he is " + (getPet().getTrickLevel()>50?"very sly.":"almost not sly."));
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dob +
                ", iq=" + IQ +
                ", mother=" + mother.getName() + " " + mother.getSurname()  +
                ", father=" + father.getName() + "" + father.getSurname() +
                ", pet=" + (dog==null?"none":dog.toString()) +
                '}';
    }
}

