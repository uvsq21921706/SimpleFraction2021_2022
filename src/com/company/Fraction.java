package com.company;

public class Fraction {

    private float num;
    private float denum;

    public  Fraction(){
        this.num = 0;
        this.denum = 1;
    }

    public  Fraction(float num,float denum){
         this.num = num;
         this.denum = denum;
    }

    public String toString(){
        return "La fraction est : "+this.num+"/"+this.denum ;
    }

    public double getDenum() {
        return denum;
    }

    public double getNum() {
        return num;
    }

    public double CalculFraction(){
        return this.num/this.denum;
    }
}
