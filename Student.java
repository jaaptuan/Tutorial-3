public class Student {
    private String Name ;
    private String SID ;
    private double  GPA ;

    public Student(String SID , String Name , double GPA) {
        this.Name = Name ;
        this.SID = SID ;
        this.GPA = GPA ;
    }

    public String getName() {
        return Name ;
    }

    public String getSID() {
        return SID ;
    }

    public double  getGPA() {
        return GPA ;
    }

    public String toString() {
        return this.SID + " " + this.Name + " GPA :" +this.GPA ;
    }
    
}
