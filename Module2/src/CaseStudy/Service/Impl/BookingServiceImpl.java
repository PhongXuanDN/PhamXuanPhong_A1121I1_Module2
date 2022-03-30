package CaseStudy.Service.Impl;

import CaseStudy.Model.*;
import CaseStudy.Service.BookingService;
import CaseStudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList  = new ArrayList<>();

    static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
         customerList.add(new Customer(1,"Phong", "Nam",
                "1233654", "phong@gamil", "Vip", "ĐN"));
        customerList.add(new Customer(2,"Pham", "Nam",
                "464864", "pham@gamil", "Vipp", "HN"));
        facilityIntegerMap.put(new Villa("1",1,1,1,"Phong",
                "Pham",3,20),0);
        facilityIntegerMap.put(new House("2",36,36000,2,"Phong",
                "Pham",2),0);
    }

    @Override
    public void addBooking() {
        int id= 1;
        if(!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
    }

    @Override
    public void displayListBooking() {

    }

    public static Customer chooseCustomer(){
        System.out.println("Danh Sách khách hàng: ");
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check){
            for (Customer customer : customerList){
                if (customer.getId()== id){
                    check = false;
                    return customer;
                }
            }
            if(check){
                System.out.println("Bạn đã nhập sai vui lòng Nhập lại id khách hàng:  " );
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
}
