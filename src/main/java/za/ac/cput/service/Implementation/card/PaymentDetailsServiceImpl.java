package za.ac.cput.service.Implementation.card;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.card.PaymentDetail;
import za.ac.cput.service.card.PaymentDetailService;
import za.ac.cput.repositories.cardRepository.PaymentDetailRepository;
import za.ac.cput.repositories.implimentation.cardRepositoryImp.PaymentDetailRepositoryImpl;

import java.util.Set;

@Service("PaymentDetailsServiceImpl")
public class PaymentDetailsServiceImpl  implements PaymentDetailService {

    private static PaymentDetailsServiceImpl service = null;
    private PaymentDetailRepository repository;

    private PaymentDetailsServiceImpl(){this.repository = PaymentDetailRepositoryImpl.getRepository(); }

    private static PaymentDetailsServiceImpl getService()
    {
        if(service == null) service = new PaymentDetailsServiceImpl();
        return  service;
    }

    @Override
    public Set<PaymentDetail> getAll() {
        return repository.getAll();
    }

    @Override
    public PaymentDetail create(PaymentDetail paymentDetail) {
        return repository.create(paymentDetail);
    }

    @Override
    public PaymentDetail update(PaymentDetail paymentDetail) {
        return repository.update(paymentDetail);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public PaymentDetail read(String s) {
        return repository.read(s);
    }
}
