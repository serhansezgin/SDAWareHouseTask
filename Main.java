package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Warehouse motorWareHouse = new Warehouse("Motor");
        Main main = new Main();
        main.addNewProductToWareHouse(motorWareHouse);

        for (Product product : motorWareHouse.getProducts()){
            System.out.println(product.getName());
        }

    }

    public void addNewProductToWareHouse(Warehouse motorWareHouse){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Aprilia"));
        productList.add(new Product("Ducati"));
        productList.add(new Product("KTM"));
        motorWareHouse.setProducts(productList);




    }

}
