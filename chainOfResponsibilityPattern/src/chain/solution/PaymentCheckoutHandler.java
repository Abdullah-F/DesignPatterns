package chain.solution;


public class PaymentCheckoutHandler extends CheckoutHandler{

    @Override
    public void handlCheckout() {
        System.out.println("Hanling payment of the customer");

        if(nextHandler != null){
            nextHandler.handlCheckout();
        }

    }

}
