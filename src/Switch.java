import java.util.Scanner;

//this is an example of nested switch.
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = scanner.next();
        System.out.println("Enter class: ");
        String className = scanner.next();
        switch (name) {
            case "pooja" : switch (className) {
                case "Sci" :
                    System.out.println(name + " studies in "+className); break;
                case "Arts" :
                    System.out.println(name + " studies in "+className); break;
                default:
                    System.out.println("not here");
            }
                break;
            case "ravi"  : switch (className) {
                case "Com" :
                    System.out.println(name + " studies in "+className); break;
                case "Sports" :
                    System.out.println(name + " studies in "+className); break;
                case "Sci" :
                    System.out.println(name + " studies in "+className); break;
                case "Arts" :
                    System.out.println(name + " studies in "+className); break;
                default:
                    System.out.println("not here too");
            }
                break;
            default:
                System.out.println("not eligible.");
        }
    }
}
