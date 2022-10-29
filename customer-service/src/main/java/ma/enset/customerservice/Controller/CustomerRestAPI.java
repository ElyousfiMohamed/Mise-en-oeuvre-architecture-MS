package ma.enset.customerservice.Controller;

import ma.enset.customerservice.Dto.CustomerRequestDTO;
import ma.enset.customerservice.Dto.CustomerResponseDTO;
import ma.enset.customerservice.Repository.CustomerRepository;
import ma.enset.customerservice.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestAPI {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerResponseDTO> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers")
    public CustomerResponseDTO saveCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        return customerService.saveCustomer(customerRequestDTO);
    }

    @GetMapping("/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id) {
        return customerService.getCustomer(id);
    }

    @PutMapping("/customers/{id}")
    public CustomerResponseDTO updateCustomer(@PathVariable String id, @RequestBody CustomerRequestDTO customerRequestDTO) {
        return customerService.updateCustomer(id, customerRequestDTO);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
    }
}
