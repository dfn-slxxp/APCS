public class BobThere {

  public boolean bobThere(String str) {
    int cnt = 0; for (int i = 0; i < str.length() - 2; i++) {if (str.substring(i,i+1).equals("b") && str.substring(i, i+1).equals(str.substring(i+2, i+3))) cnt ++;} return cnt > 0;
    }

}
