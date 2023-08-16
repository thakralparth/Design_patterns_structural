package Adapter;

import Adapter.thirdparty.CCAvenue;

public class CCAvenuePGAdapter implements PaymentGatewayInterface{
    private CCAvenue ccAvenue = new CCAvenue();
    @Override
    public void initiate(String orderNumber) {
        ccAvenue.startPayment(orderNumber);
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
