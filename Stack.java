
import java.util.Vector;

public class Stack {
    private Vector<Student> stack = new Vector<>() ;
    

    public Stack() {

    }

    public void push(String SID , String Name , double GPA) {
        System.out.println("Push [ " + SID  + Name + "GPA : " + GPA + " ]");
        stack.addElement(new Student(SID, Name, GPA));
    }

    public Student pop() {
        Student temp ;
        if (!isEmpty()) {
            temp = stack.elementAt(stack.size()-1) ;
            stack.removeElementAt(stack.size()-1) ;
            return temp ;
        }
        else {
            System.out.println("Stack is empty");
            return null ;
        }
    }

    public Student peek() {
        return stack.elementAt(stack.size()-1) ;
    }

    public boolean isEmpty() {
        return stack.isEmpty() ;
    }
    
    public int size() {
        return stack.size() ;
    }

    public void disPlay() {
        for (Student s : stack) {
            System.out.println(s);
        }

    }
    

    
    
}
