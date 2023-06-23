import java.util.Scanner;

class UserInformation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter their surname
        System.out.println("Enter your surname:");
        String surname = sc.nextLine();

        //prompt the user to enter their last name
        System.out.println("Enter your lastname:");
        String lastname = sc.nextLine();

        //prompt the user to tell their age
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        //Displays and prints the full name of the user
        System.out.println("Full name of user: " + surname +" " + lastname);

        //Displays and prints the age of the user
        System.out.println("Age of user: " + age);
    }
}