package edu.wctc;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Component
public class ConsoleSalesInput implements SalesInput
{

    public List<Sale> getSales()
    {
        Scanner keyboard = new Scanner(System.in);
        List<Sale> sales = new ArrayList<>();
        String name = "";

        do
        {
            System.out.println("Enter the name of the buyer or (D) if you are done");
             name = keyboard.nextLine();

             if(name.toUpperCase().equals("D"))
             {
                 break;
             }

            System.out.println("Enter the country");
            String country = keyboard.nextLine();

            System.out.println("Enter the cost of the item ordered");
            double cost = 0;

            try
            {
                cost = Double.parseDouble(keyboard.nextLine());
            }
            catch(Exception e)
            {
                System.out.println("Invalid input, please try again");
            }

            System.out.println("Enter the tax of the item");
            double tax = 0;

            try
            {
                 tax = Double.parseDouble(keyboard.nextLine());
            }
            catch(Exception e)
            {
                System.out.println("Invalid input, please try again");
            }

            sales.add(new Sale(name, country, cost, tax, 0));

        }
        while(!name.toUpperCase().equals("D"));

        return sales;

    }
}
