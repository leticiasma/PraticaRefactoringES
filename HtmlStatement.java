import java.util.Enumeration;

public class HtmlStatement extends Statement {


  protected String firstResult(Customer aCustomer){
    Enumeration rentals = aCustomer.getRentals();
    String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
    "</EM></H1><P>\n";
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result = showFiguresForThisRental(result, each);
    }

    return result;  
  }

  private String showFiguresForThisRental(String result, Rental each){
    result += each.getMovie().getTitle()+ ": " +
    String.valueOf(each.getCharge()) + "<BR>\n";

    return result;
  }

  protected String addFooterLines(String result, Customer aCustomer){
      result += "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";

      return result;
  }

}