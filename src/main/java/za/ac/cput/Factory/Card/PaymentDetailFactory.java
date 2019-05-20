package za.ac.cput.Factory.Card;

import za.ac.cput.Domain.Card.PaymentDetail;

public class PaymentDetailFactory {
    public static PaymentDetail getPaymentDetail(String date)
    {
        return (PaymentDetail) new PaymentDetail.Builder()
                .date(date)
                .build();
    }
}
