package  Evalution;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSerial {

    public StudentSerial() {
        Student object = null;

        String name;
        String id;
        int creditCompleted;
        double cgpa;
        int semester;

        ArrayList<Student> studentsList = new ArrayList<Student>();

        Scanner in = new Scanner(System.in);

        name = in.nextLine();
        id = in.nextLine();
        cgpa = in.nextDouble();
        semester = in.nextInt();
        creditCompleted = in.nextInt();

        object = new Student("",name, id, cgpa, semester, creditCompleted);
        studentsList.add(object);
    }

    public void serialMed(Student object) throws IOException 
    {
        FileOutputStream fout = new FileOutputStream("io.txt");
        ObjectOutputStream objOut = new ObjectOutputStream(fout);
        objOut.writeObject(object);
    }
}
