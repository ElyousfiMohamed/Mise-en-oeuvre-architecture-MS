package ma.enset.billingservice.Dto;

import ma.enset.billingservice.Entity.Invoice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceResponseDto invoiceToInvoiceResponseDto(Invoice invoice);
    Invoice invoiceRequestDtoToInvoice(InvoiceRequestDto invoiceRequestDto);

    List<InvoiceResponseDto> invoicesToInvoiceResponseDtos(List<Invoice> invoices);
}
