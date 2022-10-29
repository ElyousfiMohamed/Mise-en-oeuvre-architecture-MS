package ma.enset.billingservice.Service;

import ma.enset.billingservice.Dto.InvoiceRequestDto;
import ma.enset.billingservice.Dto.InvoiceResponseDto;

import java.util.List;

public interface InvoiceService {
    InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto);
    InvoiceResponseDto getInvoice(String id);
    InvoiceResponseDto updateInvoice(String id, InvoiceRequestDto invoiceRequestDto);
    List<InvoiceResponseDto> getAllInvoices();
    void deleteInvoice(String id);

    List<InvoiceResponseDto> getInvoicesByCustomerId(String customerId);
}
