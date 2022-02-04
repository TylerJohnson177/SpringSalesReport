package edu.wctc;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FreeShippingPolicy implements ShippingPolicy
{
    @Override
    public void applyShipping(List<Sale> sale)
    {
        for (Sale value : sale)
        {
            value.setShippingCost(0);
        }
    }
}
