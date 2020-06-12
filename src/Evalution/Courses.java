
package Evalution;

import java.io.Serializable;

public class Courses implements Serializable
{
    private String courseName;
    private String courseCode;
    private double courseCredit;
    private String prefferedSem;
    private String preRequisite;
    
    public Courses(String courseCode, String courseName, double courseCredit,String prefferedSem, String preRequisite)
    {
         this.courseCode = courseCode;
         this.courseName = courseName;
         this.courseCredit = courseCredit; 
         this.prefferedSem = prefferedSem;
         this.preRequisite = preRequisite;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }
    public void setCourseCredit(double courseCredit)
    {
        this.courseCredit = courseCredit;
    }
    public void setPrefferedSemester(String prefferedSem)
    {
        this.prefferedSem = prefferedSem;
    }
    public void setPreRequisite(String preRequisite)
    {
        this.preRequisite = preRequisite;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    public String getCourseCode()
    {
         return courseCode;
    }
    public double getCourseCredit()
    {
        return courseCredit;
    }
    public String getPrefferedSemester()
    {
        return prefferedSem;
    }
    public String getPreRequisite()
    {
        return preRequisite;
    }
    
}
