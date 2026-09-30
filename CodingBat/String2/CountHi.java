public class CountHi {

  public int countHi(String str) {
    int cnt = 0;
    for (int i = 0; i < str.length() - 1; i++) {if (str.substring(i, i+2).equals("hi")) {cnt ++;}}
    return cnt;

  }

}
