package com.dev.pattern.solidPrinciple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * open close principle demo
 * Old implementation is breaking the ocp rules since every time if new filter
 * criteria get added filter class needs to change
 * For new implementation we don't need to change filter class, just add new specification and
 * we can easily implement the changes
 */
public class OCPdemo {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Polo", Size.LARGE, Color.BLACK),
                new Product("LP", Size.MEDIUM, Color.GREEN),
                new Product("VH", Size.SMALL, Color.BLACK)
        );

        // old implementation
        ProductFilter productFilter = new ProductFilter();
//        productFilter.filterByColor(products, Color.BLACK).forEach(p -> System.out.println(p.getName()));
//        productFilter.filterByColorAndSize(products, Color.BLACK, Size.SMALL).forEach(p -> System.out.println(p.getName()));

        // new implementation
        ColorSpecification colorSpecification = new ColorSpecification(Color.BLACK);
        ColorAndSizeSpecification colorAndSizeSpecification = new ColorAndSizeSpecification(Color.BLACK, Size.LARGE);
        NewFilter newFilter = new NewFilter();
        newFilter.filter(products, colorSpecification).forEach(p -> System.out.println(p.getName()));

        newFilter.filter(products, colorAndSizeSpecification).forEach(p -> System.out.println(p.getName()));
    }
}

enum Color {
    RED, BLUE, GREEN, BLACK
}

enum Size {
    SMALL, MEDIUM, LARGE, HUGE
}

class Product {
    private String name;
    private Size size;
    private Color color;

    public Product(String name, Size size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public String getName() {
        return this.name;
    }
}

class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
    }
}

interface Specification<T> {
    boolean isSpecified(T item);
}

interface Filter<T> {
    Stream<T> filter(List<T> item, Specification<T> specification);
}

class ColorSpecification implements  Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSpecified(Product item) {
        return item.getColor() == color;
    }
}

class SizeSpecification implements  Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSpecified(Product item) {
        return item.getSize() == size;
    }
}

class ColorAndSizeSpecification implements Specification<Product> {

    private Color color;
    private Size size;

    public ColorAndSizeSpecification(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean isSpecified(Product item) {
        return item.getSize() == size && item.getColor() == color;
    }
}

class NewFilter implements Filter {
    @Override
    public Stream<Product> filter(List item, Specification specification) {
        return item.stream().filter(p -> specification.isSpecified(p));
    }
}


