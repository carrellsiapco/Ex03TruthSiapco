/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TRUTH
 */
public class Scholars {
    String name;
    String food;
    String lastYearSection;
    String address;
    double gwa;
    int age;
    
    
    public void eat(){
        System.out.println( name+ "ate their" + food + ". It tasted very nice.");
    }
    
    public void introduce(){
        System.out.println("Hi, I am " + name + ". I live in " + address + ". I was " + lastYearSection + " last year. I am " + age + " years old.I look forward to working with you this school year.");
    }
    
   
    
}
