import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);
  static Scanner scan = new Scanner(System.in);
  static double Airlinefinalprice = 0;
  static String paymentAgain = "no";
  static int year; 
  static int month;
  static int passcodeLength;

  public static void main(String[] args) {
    System.out.println("Hello Welcome to air canada where would you like to go today?");
    System.out.println("Please type the contry you want to go to");
    System.out.println("Rome \nHalifax \nChina \nCalgary \nUSA \nCalifornaia");
    String TravelW = sc.nextLine().toLowerCase();
    System.out.println("You have chose to go to " + TravelW);
    System.out.println("Please wait as we get your ticket ready");
    Airlinefinalprice = Airlinefinalprice+252.40;
    try
{
    Thread.sleep(5000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    System.out.println("\n*Anoucement* This is the final boarding call for passengers Erin and Fred Collins booked on flight 372A to Calgary. Please proceed to gate 3 immediately. The final checks are being completed and the captain will order for the doors of the aircraft to close in approximately five minutes time. I repeat. This is the final boarding call for Erin and Fred Collins. Thank you.");
      try
{
    Thread.sleep(3000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    System.out.println("\nAlright how many people are you going with?");
    int numpeople = scan.nextInt();
    Airlinefinalprice = Airlinefinalprice+35.94;
    System.out.println("Alright you are going with " + numpeople + " people");
      try
{
    Thread.sleep(3000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    System.out.println("\nhow many carry on packages do you have?");
    int numsuiton = scan.nextInt();
    Airlinefinalprice = Airlinefinalprice+60.98;
    System.out.println("Alright you are going with " + numsuiton + " carry on package");
      try
{
    Thread.sleep(3000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}
    System.out.println("\nAlright how many suitcases do you have?");
    int numsuitcase = scan.nextInt();
    Airlinefinalprice = Airlinefinalprice+35.94;
    System.out.println("Alright you are going with " + numsuitcase + " suitcases");
      try
{
    Thread.sleep(3000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

System.out.println("\n You total comes to $" + Airlinefinalprice);
System.out.println("\nHow would you like to pay? \nEnter cash or card");
    String CashOrCard = sc.nextLine().toLowerCase();
    
    if (CashOrCard.equals("card")) {
      System.out.println("What is your card type you want to use? \nvisa \nmaster  \ndebit \nmcd");
      String cardType = sc.nextLine().toLowerCase();

      System.out.println("What is your " + cardType +" card number");
      String card = sc.nextLine();
      int cardLen = card.length();

      if (cardLen == 16) {
        System.out.println("What is your expiry month?");
        month = scan.nextInt();
         
        if (month > 0 && month <= 12) {
          System.out.println("What is your expiry year?");
          year = scan.nextInt();
        }
        else {
          System.out.println("Error, please try again, this is an invalid month");
          System.out.println("Do you want to try the payment again? \nYes \nNo");
          paymentAgain = sc.nextLine().toLowerCase();
          if(paymentAgain.equals("yes")) {
            
          }
        }
      }
      else {
        System.out.println("Error, please try again, this is an invalid card");
        System.out.println("Do you want to try the payment again? \nYes \nNo");
        paymentAgain = sc.nextLine().toLowerCase();
        if(paymentAgain.equals("yes")) {
          
        }
      }

      if (year > 2022 && year <= 2030){
        System.out.println("What is your passcode");
        String passcode = sc.nextLine();
        
      }
      else{
        System.out.println("Error, please try again");
        System.out.println("Do you want to try the payment again? \nYes \nNo");
        paymentAgain = sc.nextLine().toLowerCase();
        if(paymentAgain.equals("yes")) {
          
        }
      }

      if (passcodeLength == 4){
        System.out.println("Payment recieved, Here is you ticket enjoy!");
      }
      else {
        System.out.println("Error, please try again, wrong password");
        System.out.println("Do you want to try the payment again? \nYes \nNo");
        paymentAgain = sc.nextLine().toLowerCase();
        if(paymentAgain.equals("yes")) {
          
        }
      }
    }
    else if (CashOrCard.equals("cash")) {
      System.out.println("Alright here is you ticket enjoy!");
    }
    paymentAgain = "no";
  }
  }
