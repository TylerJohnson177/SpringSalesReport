package edu.wctc;


import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileSalesInput implements SalesInput
{
    public List<Sale> getSales() throws FileNotFoundException {
        File file = new File("sales.txt");
        List<Sale> sales = new ArrayList<>();

        if(file.exists())
        {
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine())
            {
                String[] line = reader.nextLine().split(",");
                sales.add(new Sale(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]), 0));
            }
        }
        return sales;
    }
}
