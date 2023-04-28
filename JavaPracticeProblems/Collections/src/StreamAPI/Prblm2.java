package StreamAPI;


import java.util.ArrayList;
import java.util.List;  
class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Prblm2 {  
    public static void main(String[] args) {  
        List<Product1> productsList = new ArrayList<Product1>();  
        //Adding Products  
        productsList.add(new Product1(1,"HP Laptop",25000f));  
        productsList.add(new Product1(2,"Dell Laptop",30000f));  
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product1(4,"Sony Laptop",28000f));  
        productsList.add(new Product1(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product1 product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  
    }  
}  

