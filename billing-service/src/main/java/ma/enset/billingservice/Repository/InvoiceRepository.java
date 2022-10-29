package ma.enset.billingservice.Repository;

import ma.enset.billingservice.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    List<Invoice> findAllByCustomerID(String customerID);
}
