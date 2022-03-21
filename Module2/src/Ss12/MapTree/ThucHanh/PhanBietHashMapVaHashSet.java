package Ss12.MapTree.ThucHanh;
import java.util.*;

public class PhanBietHashMapVaHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("A001","Phong",20);
        Student student2 = new Student("A002","Phong",22);
        Student student3 = new Student("A003","Phong",21);
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(100,student2);
        studentMap.put(10,student3);
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        for(Student student: studentSet){
            System.out.println(student.toString());
        }
    }

}
