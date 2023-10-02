public class InvalidCreditCardNumber extends Exception {
    private int cardNumber, size;
    private String strNumber;
    public InvalidCreditCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
        this.strNumber = Integer.toString(this.cardNumber);
        this.size = strNumber.length();
        if(this.cardNumber < 0 || strNumber.charAt(0)== 0 || strNumber.charAt(size-1)%2 == 0 || size < 10){
            errorType();
        }
    }
    public String errorType(){
        if(size < 10){
            return "Card Number less than 10 digits";
        } else if (this.cardNumber < 0) {
            return "Enter a positive Card Number";
        } else if (strNumber.charAt(0)==0) {
            return "Card Number must not begin with 0";
        } else if (strNumber.charAt(size-1)%2==0) {
            return "Card Number must end with an odd number";
        }else {
            return "";
        }
    }
}
