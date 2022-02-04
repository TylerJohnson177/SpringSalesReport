package edu.wctc;

import java.io.FileNotFoundException;
import java.util.List;

public interface SalesInput
{
    List<Sale> getSales() throws FileNotFoundException;
}
