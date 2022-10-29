package ma.enset.customerservice.Service;

import ma.enset.customerservice.Dto.CustomerRequestDTO;
import ma.enset.customerservice.Dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO saveCustomer(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO updateCustomer(String id, CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> getAllCustomers();
    void deleteCustomer(String id);
}
