package excercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int studentId = 1;
        HashMap<Integer,String> students = new HashMap<>();
        String studentName = "";
        do{
            System.out.println("Enter Student Name:");
            studentName = sc.nextLine();
            if(!studentName.equals("")) {
                students.put(studentId, studentName);
                studentId++;
            }
        }while(!studentName.equals(""));
        students.forEach( (key,value) -> System.out.println("Student Id:"+key+" and name is:"+value) );
        sc.close();
    }
}
