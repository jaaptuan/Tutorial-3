import java.util.Stack ;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack() ;

        System.out.println();
        stack.push(new Student("672115042", "Ranticha", 3.56)) ;
        stack.push(new Student("672115037", "Phutawan", 3.62)) ;
        stack.push(new Student("672115039", "Metavee", 3.83)) ;
        stack.push(new Student("672115016", "Natthapat", 3.46)) ;
        stack.push(new Student("672115019", "Thinnapop", 3.65)) ;
        stack.push(new Student("672115024", "Tat", 3.89)) ;
        stack.push(new Student("672115045", "Virawit", 3.95)) ;

        System.out.println();
        stack.disPlay() ;
        System.out.println("Element at top is : " + stack.peek());
        System.out.println("popped " + stack.pop());
        System.out.println("popped " + stack.pop());
        System.out.println("popped " + stack.pop());
        System.out.println("Stack size is : " + stack.size());
    }
    
}
