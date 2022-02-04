package edu.wctc;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;
import java.util.List;

public class SpringApp
{

    public static void main(String[] args) throws FileNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       List<Sale> sales = ((SalesInput)context.getBean("salesInput")).getSales();
        ((ShippingPolicy)context.getBean("shippingPolicy")).applyShipping(sales);
        ((SalesReport)context.getBean("salesReport")).generateReport(sales);


    }
}
