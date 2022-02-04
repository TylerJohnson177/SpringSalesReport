package edu.wctc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig
{
    @Bean
    public SalesInput salesInput()
    {
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport()
    {
        return new SalesReportSummary();
    }

    @Bean
    public ShippingPolicy shippingPolicy()
    {
        return new FlatRateShippingPolicy();
    }
}
