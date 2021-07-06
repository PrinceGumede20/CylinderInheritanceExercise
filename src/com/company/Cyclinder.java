package com.company;

public class Cyclinder  extends Circle{
    private double height;


    public Cyclinder(double radius,double height) {
        super(radius);
        if(height<0){
            height=0;
            this.height=height;
        }else{
            this.height=height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double calculatedVolume =getArea()*height;
        return calculatedVolume;
    }
}
