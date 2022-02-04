package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportDetail implements SalesReport

{
    public void generateReport(List<Sale> salesList)
    {
        if(salesList.size() != 0)
        {
            System.out.println
                    ("SALES DETAIL REPORT \n " + "Customer              Country          Amount          Tax          Shipping \n");

            for (Sale sale : salesList)
            {
                System.out.println((sale.getName()) + "          " +
                        sale.getCountry() + "          " +
                        "$" + sale.getCost() + "          " +
                        "$" + sale.getTax() + "          " +
                        "$" + sale.getShippingCost()
                );
            }
        }
        else
        {
            System.out.println("No sales to report");
        }



    }
}
