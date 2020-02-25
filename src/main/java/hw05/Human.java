package hw05;

import java.util.Arrays;
import java.util.Objects;

class Human {

    private String name;
    private String surname;
    private int dob;
    private int IQ;
    private String[][] schedule;
    private Family family;

    public Human() {
    }


    public Human(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Human(String name, String surname, int dob, int IQ, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.IQ = IQ;
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    private String formSchedule() {
        StringBuilder schedule = new StringBuilder();
        int schLen = this.schedule.length;
        for (int i = 0; i < schLen; i++) {
            schedule.append(this.schedule[i][0]).append(": ").append(this.schedule[i][1]);
            if(i!=schLen-1)schedule.append(", ");
        }

        return schedule.toString();
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dob +
                ", iq=" + IQ +
                ", schedule= " + (schedule!=null&& schedule.length >0?formSchedule():"none") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dob == human.dob &&
                IQ == human.IQ &&
                name.equals(human.name) &&
                surname.equals(human.surname) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dob, IQ);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}

