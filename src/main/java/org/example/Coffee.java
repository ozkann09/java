package org.example;

public class Coffee {

    private boolean isEmpty;

    public Coffee() {
        this(false);
    }

    public Coffee(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void fill() {
        if (!isEmpty) {
            throw new CoffeeFullException();
        }
        isEmpty = false;
        System.out.println("Filling...");
    }
    public void drink(){
        if (isEmpty){
            throw new CoffeeEmptyException();
        }
        isEmpty = true;
        System.out.println("Drinking...");
    }

}
