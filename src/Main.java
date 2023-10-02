public class Main {
    public static void main(String [] args) {

        try {
            CreditCard card = new CreditCard(1215656013, 3000.0);
            System.out.println("Credit Card State:");
            System.out.println(card.getCreditState());

            try {
                System.out.println("\n\tBuying $1500");
                card.buy(1500.00);
                System.out.println("\nCredit Card State:");
                System.out.println(card.getCreditState());

                System.out.println("\n\tBuying $200.00\n");
                card.buy(200.00);
                System.out.println("Credit Card State:");
                System.out.println(card.getCreditState());

                System.out.println("\n\tPaying $700.00\n");
                card.paidCreditCard(700);
                System.out.println("Credit Card State:");
                System.out.println(card.getCreditState());

                System.out.println("\nRaising Limit $2000");
                card.increaseLimit(2000);
                System.out.println("Credit Card State:");
                System.out.println(card.getCreditState());

            } catch (ExceededCreditCardLimitException e) {
                System.out.println("Card Declined!!!, Limit Exceeded by " + e.getExceededAmount());
            }

        } catch (InvalidCreditCardNumber e) {
            System.out.println("Invalid Credit Card Number: " + e.errorType());
        }
    }
}