public abstract class Statement {

  protected abstract String firstResult(Customer aCustomer);

  protected abstract String addFooterLines(String result, Customer aCustomer);

   public String value(Customer aCustomer) {
      String result = firstResult(aCustomer);
      result = addFooterLines(result, aCustomer);

      return result;
   }

}