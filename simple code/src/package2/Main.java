package package2;
 
import package1.*;


public class Main {

    public static void main(String[] args) {
        
        
    Department dept =new Department("SWE",35);
    Semester sem =new Semester("Spring 2022",221);
    
    Student Stud1= new Student("Sk Asir Abrar" ,dept,sem,31);
    Student Stud2= new Student("Arup Ratan Dey",dept,sem,31);
    
    System.out.println("Students Information:");
        Stud1.ShowInfo();
        Stud2.ShowInfo();
 
    
    
        System.out.println("Teachers Information:");
        
    }
    
}
