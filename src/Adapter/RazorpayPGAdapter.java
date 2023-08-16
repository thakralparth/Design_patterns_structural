package Adapter;

import Adapter.thirdparty.RazorpayPG;

public class RazorpayPGAdapter implements PaymentGatewayInterface{
    private RazorpayPG razorpayPG = new RazorpayPG();
    @Override
    public void initiate(String orderNumber) {

    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
