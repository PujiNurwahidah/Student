/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

/**
 *
 * @author Puji
 */
public class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }
    
    public static void main(String[] args) {
        Student student = new Student("Puji Nurwahidah", 21);
        student.displayInfo();
    }
    
}
