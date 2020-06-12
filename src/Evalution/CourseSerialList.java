
package Evalution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CourseSerialList
{
    Table tab =  new Table();
    
    public CourseSerialList(String takenText)
    {
        int size = Cover.courseList.size();
        String courses[] = new String[size];
        double coursesCredit[] = new double[Cover.courseList.size()];
        
        for(int i = 0; i<courses.length; i++)
        {
            courses[i] = Cover.courseList.get(i).getCourseName();
            coursesCredit[i] = Cover.courseList.get(i).getCourseCredit();
        }
        
        int credit = Integer.parseInt(takenText);
        
        for(int j = 1; j<=courses.length; j++)
        {
            CourseMethod(courses, j, 0, new String[courses.length], coursesCredit, credit);
        }
    }

    
    public void CourseMethod(String[] splitCourse, int len, int startPosition, String[] result, double[] credits, int credit)
    {
        if (len == 0)
        {
            double sum = 0;
            
            for(int m = 0; m<splitCourse.length; m++)
            {
                for(int n = 0; n<result.length; n++)
                {
                    if(result[n] != null)
                    {
                        if(result[n].equals(splitCourse[m]))
                        {
                            sum += credits[m];
                        }
                    }
                }
            }
            if(credit == sum)
            {   
                tab.setTable(result);
                
            }
            
            sum = 0;
            return;
        }       
        for (int i = startPosition; i <= splitCourse.length-len; i++)
        {
            result[result.length - len] = splitCourse[i];
            CourseMethod(splitCourse, len-1, i+1, result, credits, credit);
           
        }
          
        tab.setVisible(true);
         
    }
} 
 
