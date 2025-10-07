package br.com.exemplo.visibilidade.modificadores;

/*
 * Esta classe representa a superclasse
 */
public class Carro {
    // modificadores "static" e "final"

    public final static int wheels = 4;
    // modificador "private"
    private static String color = "blue";
    private String windowColor = "transparent";
    // modificador "protected"
    protected int passengers = 1;
    // modificador "default"
    int width = 10;

    // modificador "public"
    public void goFast() {
        System.out.println("Car go fast!");
    }

    // modificador "public"
    public void goSlow() {
        System.out.println("Car go slow!");
    }

    // modificador "protected"
    protected void buzina() {
        System.out.println("bibi");
    }

    // modificador "public"
    public void getDetails() {
        System.out.println("I am a Car");
    }

    // modificadores "public static final"
    public static final void getColor() {
        System.out.println("The color of this car is " + color);
    }

    // // modificador "default"
    void getMyWheels() {
        System.out.println("My car have " + wheels + " wheels");
    }
}
