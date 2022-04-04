package Ss17.BinaryFile.BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageProduct implements Serializable {
    private String id;
    private String name;
    private String product;
    private int price;
    private String description;

    public ManageProduct() {
    }

    public ManageProduct(String id, String name, String product, int price, String description) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ManageProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public static void writeFile(String path, List<ManageProduct> productList){
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<ManageProduct> readFile(String path){
        List<ManageProduct> products = new ArrayList<>();
        try {
            FileInputStream stream = new FileInputStream(path);
            ObjectInputStream streamIntput = new ObjectInputStream(stream);
            products = (List<ManageProduct>) streamIntput.readObject();
            stream.close();
            streamIntput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }

    public static void main(String[] args) {
        List<ManageProduct> products = new ArrayList<>();
        products.add(new ManageProduct("A01","Banh","Khongbiet",23000,"Chua them"));
        products.add(new ManageProduct("A01","Banh","Khongbiet",23000,"Chua them"));
        products.add(new ManageProduct("A01","Banh","Khongbiet",23000,"Chua them"));
        products.add(new ManageProduct("A01","Banh","Khongbiet",23000,"Chua them"));
        products.add(new ManageProduct("A01","Banh","Khongbiet",23000,"Chua them"));
        writeFile("Product.txt",products);
        List<ManageProduct> productFile = readFile("Product.txt");
        for (ManageProduct product: productFile) {
            System.out.println(product);
        }
    }

}
