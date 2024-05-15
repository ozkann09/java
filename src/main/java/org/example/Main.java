package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(true);
        System.out.println("Coffee Empty? " + coffee.isEmpty());
        if (coffee.isEmpty()) {
            coffee.fill();
        }
        coffee.drink();
        System.out.println("Coffee Empty? " + coffee.isEmpty());
    }
}
