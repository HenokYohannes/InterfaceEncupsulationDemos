package com.company.class24.interfacedemo4;

public interface I1 {
    void method();
int age=10;
    static void method2() {
        System.out.println(" I am Method2 from Interface 1");
    }

}

interface I2 {
    void method();
int age=20;
    static void method2() {

        System.out.println("I am Method2 from Interface 2");
    }

}

class Test implements I1, I2 {
    @Override
    public void method() {
        System.out.println( I2.age);   // u can change the I.1 ot I.2 to specify which age you are refering.
        System.out.println(" I will be called for both the method from both Interfaces");
    }
}

class Main {

    public static void main(String[] args) {
        I1 i1 = new Test();
        i1.method();

        I2 i2 = new Test();
        i2.method();
        I1.method2();
        I2.method2();

    }
}