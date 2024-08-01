
package com.graymatter;


public class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
//}

//public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
    }
}
