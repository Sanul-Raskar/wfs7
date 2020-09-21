
import java.util.Scanner;

class EmployeeRegistration{
    static Scanner input = new Scanner(System.in);
    public static void main(String a[]){
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age= input.nextInt();
        Employee employee = new Employee(age,name);
        try{
            if(employee.getName().toLowerCase().equals("raj"))
                throw new EmployeeWongDataException("name already Exists!!");
            if(employee.getAge()<18 || employee.getAge()>60)
                throw new EmployeeWongDataException("Your age is invalid according to company policies");
            System.out.println("Your Data is been added into the system!!");
        } catch (EmployeeWongDataException ex) {
            System.out.println("Error Message: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
