import java.util.Enumeration;

public class TextStatement extends Statement {

  protected String addFooterLines(String result, Customer aCustomer){
      result += "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";

      return result;
  }

  private String showFiguresForThisRental(String result, Rental each){
    result += "\t" + each.getMovie().getTitle()+ "\t" +
    String.valueOf(each.getCharge()) + "\n";

    return result;
  }

  protected String firstResult(Customer aCustomer){
    Enumeration rentals = aCustomer.getRentals();
    String result = "Rental Record for " + aCustomer.getName() +
    "\n";
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result = showFiguresForThisRental(result, each);
    } 

    return result;  
  }

}