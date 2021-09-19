/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinheritance;

/**
 *
 * @author HoangTN
 */
// Java program to illustrate the
// concept of inheritance 
// base class
public class Bicycle {
    // the Bicycle class has two fields

    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("Bánh răng: " + gear + "\n"
                + "Tốc độ của xe đạp là " + speed);
    }
}
