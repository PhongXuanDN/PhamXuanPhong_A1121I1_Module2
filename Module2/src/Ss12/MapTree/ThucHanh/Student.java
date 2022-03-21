package Ss12.MapTree.ThucHanh;

public class Student implements Comparable <Student> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String id, String name,  int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    private String name;
    private String id;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student student){
        return this.getName().compareTo(student.getName());
    }
}
