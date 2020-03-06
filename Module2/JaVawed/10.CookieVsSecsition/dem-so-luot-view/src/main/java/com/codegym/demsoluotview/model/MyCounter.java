package com.codegym.demsoluotview.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyCounter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int count;

    public MyCounter() {
    }

    public MyCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int increment() {
        return count++;
    }
}
