package rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average; 

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.average = 0 ;
    }

    public void addNumber(int number) {
        this.count ++ ;
        this.sum += number ;
        this.average = (double) this.sum / this.count ;
    }
    public String toString() {
        return "Count: " + this.count + ", Sum: " + this.sum + ", Average: " + this.average;
    }

    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum ; 
    }

    public double average() {
        return this.average; 
    }
    }


