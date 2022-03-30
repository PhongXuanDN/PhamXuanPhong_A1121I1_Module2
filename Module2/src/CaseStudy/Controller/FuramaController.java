package CaseStudy.Controller;

import CaseStudy.Service.Impl.CustomerServiceImpl;
import CaseStudy.Service.Impl.EmployeeServiceImpl;
import CaseStudy.Service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){

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
                    displayEmployeeMenu();break;
                case 2:
                    displayCustomerMenu();break;
                case 3:
                    displayFacilityMenu();break;
                case 4:
                    displayBookingMenu();break;
                case 5:
                    displayPromotionMenu();break;
                case 6:
                    System.out.println("Exit");break;
                default:;break;
            }

        }
    }
    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  employeeService.display();break;
                case 2:  employeeService.add();break;
                case 3:  employeeService.edit();break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public static void displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list customer");
            System.out.println("2\tAdd new customer");
            System.out.println("3\tEdit customer");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  customerService.display();break;
                case 2:  customerService.add();break;
                case 3:  customerService.edit();break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public static void displayFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tEdit facility maintenance");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  facilityService.display();break;
                case 2:  addNewFacilityMenu();break;
                case 3:  System.out.println("3\tEdit facility maintenance");break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public static void addNewFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int chon = -1;
        while (chon != 4){
            System.out.println("1\tAdd new Villa");
            System.out.println("2\tAdd new House");
            System.out.println("3\tAdd new Room");
            System.out.println("4\tReturn main menu");
            chon = scanner.nextInt();
            switch (chon){
                case 1:  facilityService.addNewVilla();break;
                case 2:  facilityService.addNewHouse();break;
                case 3:  facilityService.addNewRoom();break;
                case 4:  System.out.println("4\tReturn main menu");break;
                default:
                    System.out.println("choice sai");break;
            }
        }
    }
    public static void displayBookingMenu(){
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
    public static void displayPromotionMenu(){
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
