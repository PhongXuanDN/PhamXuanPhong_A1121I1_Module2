package CaseStudy.Service.Impl;

import CaseStudy.Model.Employee;
import CaseStudy.Service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements CustomerService {
    private static List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void display(){
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }
    @Override
    public void add(){
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
        System.out.println("Nhap Chuc vu: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        int salary = scanner.nextInt();
        Employee employee = new Employee(id,name,sex,idCard,email,level,position,salary);
        employeeList.add(employee);
    }
    @Override
    public void edit(){
        System.out.println("Nhap vao id can chinh sua: ");
        int indexEdit = scanner.nextInt();
        for (int i = 0; i < employeeList.size() ; i++) {
            if(employeeList.get(i).getId() == indexEdit){
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
                System.out.println("Nhap Chuc vu: ");
                String level = scanner.nextLine();
                System.out.println("Nhap vi tri: ");
                String position = scanner.nextLine();
                System.out.println("Nhap luong: ");
                int salary = scanner.nextInt();
                employeeList.set(i,new Employee(indexEdit,name,age,sex,idCard,email,level,position,salary));
            }
        }
    }

    @Override
    public void delete() {

    }

}
