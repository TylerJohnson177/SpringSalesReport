package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class SalesReportSummary implements SalesReport
{
    public void generateReport(List<Sale> salesList)
    {
        if(salesList.size() != 0) {

            List<String> countries = new ArrayList<>();
            List<Double> totalCost = new ArrayList<>();
            List<Double> totalTax = new ArrayList<>();
            List<Double> totalShippingCost = new ArrayList<>();

            for (int i = 0; i < salesList.size(); i++)
            {
                if(!countries.contains(salesList.get(i).getCountry()))
                {
                    countries.add(salesList.get(i).getCountry());
                    totalCost.add(salesList.get(i).getCost());
                    totalTax.add(salesList.get(i).getTax());
                    totalShippingCost.add(salesList.get(i).getShippingCost());
                }
                else
                {
                    int index = countries.indexOf(salesList.get(i).getCountry());

                    totalCost.set(index, salesList.get(i).getCost() + totalCost.get(index));
                    totalTax.set(index, salesList.get(i).getTax() + totalTax.get(index));
                    totalShippingCost.set(index, salesList.get(i).getShippingCost() + totalShippingCost.get(index));
                }
            }

            System.out.println("SALES SUMMARY REPORT \n Country        Amount        Tax        Shipping");

            for(int i = 0; i < countries.size(); i++)
            {
                System.out.println(countries.get(i) + "              " +
                        "$" + totalCost.get(i) + "         " +
                        "$" + totalTax.get(i) + "          " +
                        "$" + totalShippingCost.get(i)
                        );
            }


        }
        else
        {
            System.out.println("No sales to report");
        }



    }
}
