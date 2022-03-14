package ss10.DanhSach.BaiTap.Bai1;

public class TestMyArrayList {
    public static class Student{
        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private int id;
        private String name;

    }

    public static void main(String[] args) {
        Student a = new Student(1,"Phong");
        Student b = new Student(2,"Ph");
        Student c = new Student(3,"Pho");
        Student d = new Student(4,"ong");
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        for (int i =0; i<studentMyList.size(); i++){
            Student student =(Student) studentMyList.element[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
