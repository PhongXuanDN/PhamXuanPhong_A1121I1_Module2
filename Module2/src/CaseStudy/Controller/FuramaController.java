package CaseStudy.Controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    public void displayMainMenu(){
        int choice = -1;
        while(choice != 6){
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Managerment");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");


            System.out.println("Nhap so ma ban muon chon: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    employeeManagement();break;

                case 2:
                    customerManagement();break;
                case 3:
                    facilityManagement();break;
                case 4:
                    bookingManagement();break;
                case 5:
                    promotionManagement();break;
                case 6:
                    System.out.println("Exit");break;
                default:;break;
            }

        }
    }
    public void employeeManagement(){
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  System.out.println("1\tDisplay list employees");break;
                case 2:  System.out.println("2\tAdd new employee");break;
                case 3:  System.out.println("3\tEdit employee");break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public void customerManagement(){
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list customer");
            System.out.println("2\tAdd new customer");
            System.out.println("3\tEdit customer");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  System.out.println("1\tDisplay list customer");break;
                case 2:  System.out.println("2\tAdd new customer");break;
                case 3:  System.out.println("3\tEdit customer");break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public void facilityManagement(){
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tEdit facility maintenance");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  System.out.println("1\tDisplay list facility");break;
                case 2:  System.out.println("2\tAdd new facility");break;
                case 3:  System.out.println("3\tEdit facility maintenance");break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public void bookingManagement(){
        int chon = -1;
        while (chon != 6){
            System.out.println("1\tDisplay list booking");
            System.out.println("2\tAdd new booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  System.out.println("1\tDisplay list facility");break;
                case 2:  System.out.println("2\tAdd new facility");break;
                case 3:  System.out.println("3\tEdit facility maintenance");break;
                case 4:  System.out.println("4\tReturn main menu");break;
                case 5:  System.out.println("5.\tEdit contracts");break;
                case 6:  System.out.println("6.\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public void promotionManagement(){
        int chon = -1;
        while (chon != 3){
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  System.out.println("1.\tDisplay list customers use service");break;
                case 2:  System.out.println("1.\tDisplay list customers get service");break;
                case 3:  System.out.println("3\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
}
