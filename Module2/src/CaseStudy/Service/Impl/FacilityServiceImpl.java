package CaseStudy.Service.Impl;

import CaseStudy.Model.Facility;
import CaseStudy.Model.House;
import CaseStudy.Model.Room;
import CaseStudy.Model.Villa;
import CaseStudy.Service.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityList = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> entry : facilityList.entrySet()){
            System.out.println("Service: "+entry.getKey() + " số lần đã thuê: "+entry.getValue());
        }
    }


    @Override
    public void displayMaintain() {

    }
    //(id,area,rentalPrice, rentaPeopleMax,rentalType);
//        this.standard = standard;
//        this.areaPool = areaPool;
//        this.numberFloor = numberFloor;
    @Override
    public void addNewVilla() {
        System.out.println("Nhap id: ");
        String id= scanner.nextLine();
        System.out.println("Nhap dien tich phong: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia cho thue: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so nguoi nhieu nhat: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap tieu chuan phong: ");
        String standard = scanner.nextLine();
        System.out.println("Nhap dien tich ho boi: ");
        double areaPool= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so tang: ");
        int numberFool= Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id,area,rentalPrice,rentalPeopleMax,rentalType,standard,areaPool,numberFool);
        facilityList.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");
    }

//(id,area,rentalPrice, rentaPeopleMax,rentalType);
//        this.standard = standard;
//        this.areaPool = areaPool;
//        this.numberFloor = numberFloor;
    @Override
    public void addNewRoom() {
        System.out.println("Nhap id: ");
        String id= scanner.nextLine();
        System.out.println("Nhap dien tich phong: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia cho thue: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so nguoi nhieu nhat: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap dich vu mien phi: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id,area,rentalPrice,rentalPeopleMax,rentalType,freeService);
        facilityList.put(room,0);
        System.out.println("Đã thêm mới Room thành công");

    }
//String id, double area, int rentalPrice, int rentaPeopleMax, String styleRenta, String standardVilla, int floor
    @Override
    public void addNewHouse() {
        System.out.println("Nhap id: ");
        String id= scanner.nextLine();
        System.out.println("Nhap dien tich phong: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia cho thue: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so nguoi nhieu nhat: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap tieu chuan phong: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Nhap so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(id,area,rentalPrice,rentalPeopleMax,rentalType,standardVilla,floor);
        facilityList.put(house,0);
        System.out.println("Đã thêm mới House thành công");
    }
}