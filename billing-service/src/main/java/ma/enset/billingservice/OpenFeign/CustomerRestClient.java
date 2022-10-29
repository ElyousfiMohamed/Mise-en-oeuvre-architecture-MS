package ma.enset.billingservice.OpenFeign;

import ma.enset.billingservice.Entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping("/api/customers/{id}")
    Customer getCustomerById(@PathVariable String id);

    @GetMapping("/api/customers")
    List<Customer> getAllCustomers();
}
