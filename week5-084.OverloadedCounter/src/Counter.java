/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martynas Vanagas
 */
public class Counter {

    int startingValue;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.startingValue += increaseAmount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check == true) {
                if (this.startingValue - decreaseAmount >= 0) {
                    this.startingValue -= decreaseAmount;
                } else {
                    this.startingValue = 0;
                }
            } else {
                this.startingValue -= decreaseAmount;
            }
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
