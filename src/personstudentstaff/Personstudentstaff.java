/*
 * MARION ELLE CHUA LI CHEN
 * BI20110127
 * and open the template in the editor.
 */
package personstudentstaff;

//Person Class
class Person {
//Member Variables
private String name;
private String address;
  
//Constructor
public Person(String name, String address) {
this.name = name;
this.address = address;
}
  
//Getter Methods
public String getName() {
return name;
}

public String getAddress() {
return address;
}
  
//Setter Methods
public void setAddress(String address) {
this.address = address;
}
  
//toString Method
@Override
public String toString() {
return "Person[" + "Name= " + name + ", Address= " + address + ']';
}
}

//Child Class - Student
class Student extends Person {
//Member variables
private String program;
private int year;
private double fee;
  
//Constructor
public Student(String name, String address, String program, int year, double fee) {
super(name, address);
this.program = program;
this.year = year;
this.fee = fee;
}
  
//Getter and Setter methods
public String getProgram() {
return program;
}

public void setProgram(String program) {
this.program = program;
}

public int getYear() {
return year;
}

public void setYear(int year) {
this.year = year;
}

public double getFee() {
return fee;
}

public void setFee(double fee) {
this.fee = fee;
}
  
//toString method
public String toString() {
return "Student[" + super.toString() + ", Program= " + program + ", Year= " + year + ", Fee= " + fee + ']';
}
}

//Child Class 2 - Staff
class Staff extends Person {
//Member Variables
private String school;
private double pay;
  
//Constructor
public Staff(String name, String address, String school, double pay) {
super(name, address);
this.school = school;
this.pay = pay;
}
  
//Getter and Setter Methods
public String getSchool() {
return school;
}

public void setSchool(String school) {
this.school = school;
}

public double getPay() {
return pay;
}

public void setPay(double pay) {
this.pay = pay;
}
  
//toString method
public String toString() {
return "Staf[" + super.toString() + ", School= " + school + ", Pay= " + pay + ']';
}
}

//Main Method class
public class Personstudentstaff {

public static void main(String[] args) {
//Testing methods
Person p = new Person("Sandra Ann Jerry", "Sabah");
Student s = new Student("Marion Elle Chua Li Chen", "University Malaysia Sabah", "Network Engineering", 2021, 936.00);
Staff st = new Staff("Natasha Maya", "KL", "Sunway College", 1750.00);
  
//Printing objects
System.out.println(p);
System.out.println(s);
System.out.println(st);
}
}
