package ma.enset.billingservice;

import ma.enset.billingservice.Dto.InvoiceRequestDto;
import ma.enset.billingservice.Service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InvoiceService invoiceService) {
        return args -> {
            invoiceService.saveInvoice(new InvoiceRequestDto(new BigDecimal(15006.8), "C01"));
            invoiceService.saveInvoice(new InvoiceRequestDto(new BigDecimal(19520.6), "C02"));
        };
    }
}
