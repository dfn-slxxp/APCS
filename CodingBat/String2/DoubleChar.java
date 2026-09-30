public class DoubleChar {

  public String doubleChar(String str) {
    String ret = "";
    for (int i = 0; i < str.length(); i++) {ret = ret + str.substring(i, i+1) + str.substring(i, i+1);}
    return ret;
  }
  
}
