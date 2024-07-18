package com.example;
import java.util.List;

public class Lion {
    Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws IllegalArgumentException {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new IllegalArgumentException("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        if (feline == null) {
            throw new IllegalStateException("Feline не ясно");
        }
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        if (feline == null) {
            throw new IllegalStateException("Feline не ясно");
        }
        return feline.getFood("Хищник");
    }

}
