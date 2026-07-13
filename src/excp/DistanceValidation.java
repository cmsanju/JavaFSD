package excp;

public class DistanceValidation{
  public void checkDistance(String d1)
  {
    for(char c : d1.toCharArray())
      {
      if(!Character.isDigit(c))
      {
        throw(new NumValidationException("Invalid distance value"));
      }
      else
      {
        throw(new NumValidationException("valid distance value"));
      }
      }
  }
}
