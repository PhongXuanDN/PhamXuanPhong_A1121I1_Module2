package Ss12.MapTree.ThucHanh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DSSinhVienTheoDoTuoi{
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith", 30);
//        hashMap.put("Anderson", 31);
//        hashMap.put("Lewis", 29);
//        hashMap.put("Cook", 29);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
//        System.out.println("Display entries in HashMap");
//        System.out.println(student + "\n");
//        System.out.println(student.keySet());
//        System.out.println(student.values());
        Map<Integer,Student> student  = new HashMap<>();
        student.put(23,new Student("A001","Phong",23));
        student.put(24,new Student("A002","Pham",24));
        student.put(21,new Student("A003","Xuan",21));
        student.put(20,new Student("A004","Phong Xuan",20));

        Set<Integer> keys = student.keySet();
        for(Integer key:keys){
            System.out.println(key);
            System.out.println(student.get(key).toString());
        }
        Map<Integer, Student> treeMap = new TreeMap<>(student);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    }


}
