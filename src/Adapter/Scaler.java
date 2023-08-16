package Adapter;

import java.util.List;

public class Scaler {
//    PaymentGatewayInterface paymentGateway = new RazorpayPGAdapter();
//
//    void admitStudent(){
//        paymentGateway.initiate("12345678");
//    }

    List<PaymentGatewayInterface> paymentGateways = List.of(new RazorpayPGAdapter());

    Scaler(List<PaymentGatewayInterface> paymentGateways){
        this.paymentGateways = paymentGateways;
    }

    void admitStudent(){
        paymentGateways.get(0).initiate("123456789");
    }

}
