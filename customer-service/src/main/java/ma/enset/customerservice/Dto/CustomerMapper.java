package ma.enset.customerservice.Dto;

import ma.enset.customerservice.Entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOToCustomer(CustomerRequestDTO customerRequestDTO);

    List<CustomerResponseDTO> customersToCustomerResponseDTOs(List<Customer> customers);
}
