package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlatRateShippingPolicy implements ShippingPolicy
{
    @Override
    public void applyShipping(List<Sale> sale)
    {
        for (int i = 0; i < sale.size(); i++)
        {
            double shippingCost = sale.get(i).getCost() / 5;
            sale.get(i).setShippingCost(shippingCost);
        }
    }
}
