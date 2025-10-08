

public class Student {
    
  
    private String name;
    private double average;
    private String id; 
    
    
    public Student(String name, double average, String id) {
        this.name = name;
        this.id = id;
        
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average; 
            }
        }
        
    }
    
    //all set 
    public void setName(String name) {
        this.name = name;
    }
    public void setAverage(double studentAverage) {
        
        if (studentAverage > 0.0) {
            if (studentAverage <= 100.0) {
                this.average = studentAverage;
            }
        }
    }
    public void setID(String id) {
        this.id = id;
    }


    
    //all get 
    public String getName() {
        return name;
    }
    public double getAverage() {
        return average;
    }
    public String getID() {
        return id;
    }



    
    public String getLetterGrade() {
        String letterGrade = ""; 
        
        if (average >= 90.0) {
            letterGrade = "A+";
        } else if (average >= 80.0) {
            letterGrade = "A";
        } else if (average >= 70.0) {
            letterGrade = "A-";
        } else if (average >= 60.0) {
            letterGrade = "B";
        } else {
            letterGrade = "F"; 
        }

        return letterGrade;
    } // end method 
} // end class Student