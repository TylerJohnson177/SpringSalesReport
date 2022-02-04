package edu.wctc;

import java.util.List;

public interface ShippingPolicy
{
    void applyShipping(List<Sale> sale);
}
