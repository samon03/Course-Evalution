
package Evalution;
import java.io.Serializable;


public class Student implements Serializable{
    private String name;
    private String id;
    private int creditCompleted;
    private double cgpa;
    private int semester;
    private String pass;
    
    public Student(String name, String id, String pass, double cgpa, int semester, int creditCompleted)
    {
        this.pass = pass;
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.semester = semester;
        this.creditCompleted = creditCompleted;
              
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setSemester(int semester)
    {
        this.semester = semester;
    }
    public void setCompletedCredit(int creditCompleted)
    {
        this.creditCompleted = creditCompleted;
    }
    public void setCgpa(double cgpa)
    {
        this.cgpa = cgpa;
    }
    
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public int getSemester()
    {
        return semester;
    }
    public int getCompletedCredit()
    {
        return creditCompleted;
    }
    public double getCgpa()
    {
        return cgpa;
    }
    
}
