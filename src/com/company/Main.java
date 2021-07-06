package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle =new Circle(3.75);
	System.out.println("circle.radius :" + circle.getRadius());
	System.out.println("circle.area =" + circle.getArea());
	Cyclinder cyclinder = new Cyclinder(5.55,7.25);
	System.out.println("Cyclinder.radius= " + cyclinder.getRadius());
	System.out.println("Cyclinder.height= " + cyclinder.getHeight());
	System.out.println("Cyclinder.area= " + cyclinder.getArea());
	System.out.println("Cyclinder.volume= " + cyclinder.getVolume());
	
    }
}
