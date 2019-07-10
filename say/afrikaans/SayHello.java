package say.afrikaans;
import java.util.*;

public class SayHello{
    public static void main(String[] args) {
    
   while(true) {

	Scanner input = new Scanner(System.in);

		StringBuilder welcome = new StringBuilder();
		welcome.append("Welcome !! ");
		welcome.append("\nWould you like to continue ? [y/n] : ");
		
		System.out.println(welcome);
		
	String option = input.next();

if (option.equalsIgnoreCase("y")){

	System.out.println("please enter your name below : ");

	Scanner inputName = new Scanner(System.in);
	String name = inputName.next();

	StringBuilder hello = new StringBuilder();
	hello.append("Hallo, ");
	hello.append(name);
	System.out.println(hello);
	inputName.close(); 
	break;   
}
 else if ( option.equalsIgnoreCase("n")){

	System.out.println("Good-bye");
    break;
   
    }else{
 	System.out.println("select y/n to continue");
	}
	input.close();
    }
}
}
