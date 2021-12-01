package com.company.class24.interfaces;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new SDETInstructor();
     person.eat();
     person.sleep();

     //person.teac();
     //person.work();  these two can not be called because the SDET is now a person not an instructor

   Employee employee=new SDETInstructor();

   employee.work();
   //employee.eat(); we can not call eat

   SyntaxEmployees syntaxEmployees =new SDETInstructor();
   syntaxEmployees.teach();
   syntaxEmployees.eat();
   syntaxEmployees.work();
   syntaxEmployees.sleep();

   SDETInstructor sdetInstructor=new SDETInstructor();
   syntaxEmployees.teach();
   syntaxEmployees.eat();
   syntaxEmployees.work();
   syntaxEmployees.sleep();
    }

}
