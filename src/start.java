import StudentManage.Student;
import StudentManage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
    public static void main(String[] args)throws IOException {
        System.out.println("Welcome to Student Management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("press 1 to add student");
            System.out.println("press 2 to delete student");
            System.out.println("press 3 to display student");
            System.out.println("press 4 to exit app");
            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                //add student..
                System.out.println("Enter user name :");
                String name= br.readLine();

                System.out.println("Enter user phone :");
                int phone = Integer.parseInt(br.readLine());

                System.out.println("Enter user city :");
                String city =br.readLine();

                // create student object store student
                Student st = new Student(name,phone,city);
                boolean answer = StudentDao.inserStudentToDB(st);
                if(answer)
                {
                    System.out.println("Student is added succesfully...");
                }else
                {
                    System.out.println("Something Went wrong try again...");
                }
                System.out.println(st);

            } else if (c == 2) {
                //delet student..
            } else if (c == 3) {
                //display  student
            } else if (c == 4) {
                //exit
                break;
            } else {

            }

        }
        System.out.println("Thank you for using my applicaation...");
        System.out.println("See yopu soon...");
    }
}