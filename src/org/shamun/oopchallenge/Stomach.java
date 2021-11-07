package org.shamun.oopchallenge;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }
    public  void digest() {
        System.out.println("Digesting...");
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()) {
            System.out.println("need to be feed");
        }else {
            System.out.println("Stomach is full");
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
