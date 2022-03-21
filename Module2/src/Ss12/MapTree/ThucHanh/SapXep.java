package Ss12.MapTree.ThucHanh;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SapXep extends Student {
    public static void main(String[] args) {
        Student student = new Student("Kien", "Phong", 23);
        Student student1 = new Student("Nam", "Xuan", 25);
        Student student2 = new Student("Anh", "Pham", 22 );
        Student student3 = new Student("Tung", "PX", 24);

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
