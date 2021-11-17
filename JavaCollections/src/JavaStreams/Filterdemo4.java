package JavaStreams;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {

    int id;
    String name;
    double price;

    public Product(int id , String name , double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public class Filterdemo4 {

    public static void main(String[] args) {

        //A collection (List) that is made up of Products
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(001 , "Laptop" , 1002.00));
        productList.add(new Product(002 , "SuperCool" , 2302.00));
        productList.add(new Product(003 , "Monitor" , 1342.00));
        productList.add(new Product(004 , "PenTop" , 2302.00));
        productList.add(new Product(005 , "Toyota Vitz" , 9983.00));

        System.out.println(productList);

        //To accept list of products that are greater than 2000
        List<Product> products = new ArrayList<Product>();

        products = productList.stream().filter(product -> product.price < 2000).collect(Collectors.toList());
        System.out.println(products);

        productList.stream().filter(product -> product.price < 2000).forEach(product -> System.out.println(product.price));



    }
}
