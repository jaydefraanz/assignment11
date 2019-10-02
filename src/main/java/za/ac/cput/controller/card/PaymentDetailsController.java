package za.ac.cput.controller.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.service.card.PaymentDetailService;

import java.util.Set;

@RestController
@RequestMapping("/paymentdetails")
public class PaymentDetailsController {

    @Autowired
    //@Qualifier("PaymentDetailsServiceImpl")
    private PaymentDetailService paymentDetailService;

    @PostMapping("/create")
    @ResponseBody
    public PaymentDetail create(@PathVariable PaymentDetail paymentDetail)
    {
        return paymentDetailService.create(paymentDetail);
    }

    @GetMapping(path = "/read/{id}")
    public PaymentDetail read (@PathVariable String id)
    {
        PaymentDetail paymentDetail = paymentDetailService.read(id);
        return paymentDetail;
    }

    @PutMapping("/update")
    @ResponseBody
    public PaymentDetail update(@PathVariable PaymentDetail paymentDetail)
    {
        return paymentDetailService.update(paymentDetail);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        paymentDetailService.delete(id);
    }

    @GetMapping("/getall")
    public Set<PaymentDetail> getAll()
    {
        return paymentDetailService.getAll();
    }
}
