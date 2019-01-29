package com.company;

public class ClassDemo {

    public static void main(String[] args) {

        Car myCar = new Car("Range Rover", "Evo");

        myCar.setModel("Nitro");
        myCar.setMake("Dodge");

        String fullName = new String("Jamie" + "Brooks");
        String lowerCase = new String(fullName.toLowerCase());

        System.out.println(fullName.equalsIgnoreCase(lowerCase));

        System.out.println(fullName.length());
        System.out.println(fullName.concat(lowerCase));
        System.out.println(fullName.charAt(4));

        String myName = new String("Jamie" + "Brooks")


/*        System.out.println("The car's make is " + myCar.model);
        System.out.println("The car's make is " + myCar.make);*/
        myCar.printCarDetails();
	// write your code here
    }
}
