package Adapter;

public class JuspayPGAdapter implements PaymentGatewayInterface{
    @Override
    public void initiate(String orderNumber) {

    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
