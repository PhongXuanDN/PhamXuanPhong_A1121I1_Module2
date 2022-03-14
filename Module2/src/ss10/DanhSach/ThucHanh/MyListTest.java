package ss10.DanhSach.ThucHanh;

public class MyListTest {
    public MyListTest() {
    }

    public MyListTest(int id, String name) {
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

    public static void main(String[] args) {
        MyListTest a = new MyListTest(1, "Phong");
        MyListTest b = new MyListTest(2, "Pham");
        MyListTest c = new MyListTest(3, "Xuan");
        MyListTest d = new MyListTest(4, "Phonggg");
        MyList<MyListTest> myListTestMyList = new MyList<>();
        myListTestMyList.add(a);
        myListTestMyList.add(b);
        myListTestMyList.add(c);
        myListTestMyList.add(d);
        for (int i = 0;i<myListTestMyList.getSize();i++){
            MyListTest myListTest =(MyListTest) myListTestMyList.getElements()[i];
            System.out.println(myListTest.getId());
            System.out.println(myListTest.getName());
        }

    }
}
