package com.driver;

class A {
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        //task 3
        A obj1= new B(); //polymorphism
        System.out.println(obj1.meth());
        B obj2= new B();
        System.out.println(obj2.meth());
    }
}