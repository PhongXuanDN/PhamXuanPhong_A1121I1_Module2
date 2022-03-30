package CaseStudy.Service.Impl;

import CaseStudy.Model.Customer;
import CaseStudy.Model.Employee;
import CaseStudy.Service.CustomerService;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display(){
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
    }
    @Override
    public  void add(){
        System.out.println("Nhap id: ");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        String sex= scanner.nextLine();
        System.out.println("Nhap Chung minh: ");
        String idCard = scanner.nextLine();
        System.out.println("Nhap Email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap loai khach: ");
        String typeOfGuest = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id,name,sex,idCard,email,typeOfGuest,address );
        customerList.add(customer);
    }
    @Override
    public  void edit(){
        System.out.println("Nhap vao id muon chinh sua: ");
        int indexId = scanner.nextInt();
        for (int i = 0; i < customerList.size() ; i++) {
            if(customerList.get(i).getId()==indexId){
                System.out.println("Nhap ten: ");
                String name = scanner.nextLine();
                System.out.println("Nhap tuoi: ");
                int age= Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap gioi tinh: ");
                String sex= scanner.nextLine();
                System.out.println("Nhap Chung minh: ");
                String idCard = scanner.nextLine();
                System.out.println("Nhap Email: ");
                String email = scanner.nextLine();
                System.out.println("Nhap loai khach: ");
                String typeOfGuest = scanner.nextLine();
                System.out.println("Nhap dia chi: ");
                String address = scanner.nextLine();
                customerList.set(i,new Customer(indexId,name,age,sex,idCard,email,typeOfGuest,address));
            }
        }
    }

    @Override
    public  void delete() {

    }

    @Override
    public  String toString() {
        return "CustomerServiceImpl{" +
                "customerList=" + customerList +
                ", scanner=" + scanner +
                '}';
    }
}
