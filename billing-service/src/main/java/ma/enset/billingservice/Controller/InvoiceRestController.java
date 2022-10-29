package ma.enset.billingservice.Controller;

import ma.enset.billingservice.Dto.InvoiceRequestDto;
import ma.enset.billingservice.Dto.InvoiceResponseDto;
import ma.enset.billingservice.Service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InvoiceRestController {
    private InvoiceService invoiceService;
    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    public List<InvoiceResponseDto> getInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/invoices/{id}")
    public InvoiceResponseDto getInvoice(String id) {
        return invoiceService.getInvoice(id);
    }

    @PostMapping("/invoices")
    public InvoiceResponseDto saveInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto) {
        return invoiceService.saveInvoice(invoiceRequestDto);
    }

    @PutMapping("/invoices/{id}")
    public InvoiceResponseDto updateInvoice(@PathVariable String id, @RequestBody InvoiceRequestDto invoiceRequestDto) {
        return invoiceService.updateInvoice(id, invoiceRequestDto);
    }

    @DeleteMapping("/invoices/{id}")
    public void deleteInvoice(@PathVariable String id) {
        invoiceService.deleteInvoice(id);
    }

    @GetMapping("/invoices/customer/{customerId}")
    public List<InvoiceResponseDto> getInvoicesByCustomerId(@PathVariable String customerId) {
        return invoiceService.getInvoicesByCustomerId(customerId);
    }

}
