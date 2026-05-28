import java.util.Scanner;

public class Main {
 public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     StudentManager manager = new StudentManager();

     while(true){
         System.out.println("\n---Student Management System-----\n");
         System.out.println(" 1. Add Student");
         System.out.println("2. View Student");
         System.out.println("3. Search Student");
         System.out.println("4. Delete Student");
         System.out.println("5. Exit ");

         System.out.println("Enter your choice");

         int choice;
       try{
        choice = input.nextLine();
       }
      catch(Exception e) {
       System.out.println("Invalid input.");
       input.nextLine();
       continue;
      }
         switch(choice) {
             case 1:
                  System.out.println("Enter StId:");
                  int id = input.nextInt();
                  input.nextLine();
                 System.out.println("Enter the name");
                 String name = input.next();
                 input.nextLine();
                 System.out.println("Enter the age");
                 int age = input.nextInt();
                 input.nextLine();
                 System.out.println("Enter the course");
                 String course = input.next();
                 input.nextLine();
                 Student s = new Student(id, name, age, course);
                 manager.addStudent(s);
                 break;

             case 2:
                  manager.viewStudents();
                  break;


             case 3:
                 System.out.print("Enter Student ID: ");
                 int searchId = input.nextInt();

                 manager.searchStudent(searchId);
                 break;

             case 4:
                 System.out.print("Enter Student ID: ");
                 int deleteId = input.nextInt();

                 manager.deleteStudent(deleteId);
                 break;

             case 5:
                 System.out.println("Thank you!");
                 System.exit(0);

             default:
                 System.out.println("Invalid choice.");

         }


     }
 }
}
