package display_person_info;

import java.util.ArrayList;
import java.util.Scanner;

public class Display_Person_Info {

    public static void main(String[] args) {
        System.out.println("=====Management Person programer=====");
        ArrayList<String> namelist = new ArrayList<>();
        ArrayList<String> addresslist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Input Information of Person");
            System.out.print("Please input name: ");
            Scanner sn = new Scanner(System.in);
            String name = sn.nextLine();
            namelist.add(name);
            System.out.print("Please input address: ");
            String address = sn.nextLine();
            addresslist.add(address);
            boolean checkdigit = false;
            int salary = 0;
            while (!checkdigit) {
                System.out.print("Pleasr input salary: ");
                if (sn.hasNextInt()) {
                    checkdigit = true;
                    salary = sn.nextInt();
                    while (salary < 0) {
                        System.out.println("Salary is greater than zero");
                        System.out.print("Please input salary: ");
                        salary = sn.nextInt();
                    }
                }
                else {
                System.out.println("You must input digit");
                sn.next();
                }
            }
            
        }

    }

}
