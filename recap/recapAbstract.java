package com.company.class24.recap;

abstract class Parent {

abstract void method();
abstract void method2();


}
abstract class Child extends Parent{
    @Override
    void method(){
        System.out.println("Method 1 in Child");
    }
}

class GrandChild extends Child{
    @Override
    void method2(){
        System.out.println(" Metehod two from GrandChild");
    }
}

class Tester {

    public static void main(String[] args) {
        Child child = new GrandChild();
        child.method2();
        child.method2();
    }
}