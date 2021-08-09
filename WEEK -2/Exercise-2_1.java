// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question21{ 
    public static void main(String args[]){
// Create an object of class Student

// Call 'print()' method of class Student 

// Create an object of class School

// Call 'print()' method of class School
 
	// Create an object of inner class Student
 // This is the outer class named School
 
	// Create an object of inner class Student
		
	// Access the 'print()' method of the inner class Student using the inner class object
	Student stu = new Student();
 
	stu.print();

	School sch = new School();

	sch.print();
     } 
}
