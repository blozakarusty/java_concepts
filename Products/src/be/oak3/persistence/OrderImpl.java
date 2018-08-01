package be.oak3.persistence;

import be.oak3.model.Parfum;
import be.oak3.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderImpl implements Order {

    // INSTANCE VARIABELEN
    private List<Product> products;
    private static int productNumber = 1000;

    // CONSTRUCTORS
    public OrderImpl() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        product.setProductNumber(productNumber++);
        products.add(product);
    }

    @Override
    public void sortOnBrandName() {
        //TODO: implement method using sortOnBrandName() of method of class PRODUCT.

        products.stream().sorted(Product.sortOnBrandName()).forEach(System.out::println);


    }

    @Override
    public void showProductsOfBrandName(String brandName) {
        //TODO: implement method using lambda's and streams
        products.stream().filter(product -> {
            return product.getBrandName().equals(brandName);
        }).forEach(System.out::println);

    }

    @Override
    public void showOnlyParfums() {

        products.stream().filter(product -> product instanceof Parfum).forEach(System.out::println);
    }

    @Override
    public Product searchMostExpensiveProduct() {
        //TODO: implement method using lambda's and streams -> DONE
        //double maxPrice = products.stream().mapToDouble(value -> value.getPrice()).max().getAsDouble();
        //Product maxPriceProduct = products.stream().filter(product -> product.getPrice() == maxPrice).findFirst().get();
        return products.stream().max(Comparator.comparingDouble(Product::getPrice)).get();
    }

    @Override
    public void sort() {
        //TODO: implement method using lambda's and streams -> DONE
        products.stream().sorted().forEach(System.out::println);
    }

    @Override
    public void sortOnVolume() {
        //TODO: implement method using lambda's and streams -> DONE
        products.stream().sorted(Comparator.comparingInt(Product::getVolume)).forEach(System.out::println);
    }

    @Override
    public void showAllProductsWithPriceLowerThen50() {
        //TODO: implement method using lambda's and streams -> DONE
        products.stream().filter(product -> product.getPrice() < 50).forEach(System.out::println);
    }

    @Override
    public double totalPrice() {
        //TODO: implement method using lambda's and streams -> DONE
        return products.stream().mapToDouble(value -> value.getPrice()).sum();
    }
}
