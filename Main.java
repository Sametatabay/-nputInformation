import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	String userName,password;
    Scanner inp =new Scanner(System.in);

    System.out.print("User Name Input :");
    userName=inp.nextLine();
    System.out.print("Password Input :");
    password=inp.nextLine();

    if (userName.equals("patika123") && (password.equals("147075"))){
        System.out.println("Input Succesful.");
    }else{
        System.out.println("User Name or Password Wrong!");
    }

    }
}
