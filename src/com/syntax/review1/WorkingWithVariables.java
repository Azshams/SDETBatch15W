package com.syntax.review1;

public class WorkingWithVariables {

    public static void main(String[] args) {

        // create a variable and store value into it
        // declared a variable and initialized it
        int number=10;

         // declared a variable
        int num; //declaration of a variable happens only once
        num = 100; //initialize the variable
        num = 200; //reassign the value;
        num = 2000;
        num = 5000;

        System.out.println(num);//200

        boolean hungry = false;
        hungry = true;
        // hungry="yes"; error

        //String is the most populer datatype
       String myString="Hello";
       String name="Asel";

       String address="123 Test Drive";

       // Hello A
        System.out.println(myString+" "+name);

        int age=21;

        //A is 21 years old
        System.out.println(name +" is "+age+" years old");


        // when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        //14 December
        System.out.println( day+" " +month); //1December

        char date='1';
        System.out.println( date+month); // 63

        System.out.println(date+day);





    }

}
