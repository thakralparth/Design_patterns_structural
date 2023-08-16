package Adapter.thirdparty;

import java.util.UUID;

public class JuspayPG {

    public boolean beginPayment(UUID orderNumber){
        System.out.println("Payment started using Juspay");
        return true;
    }
}
