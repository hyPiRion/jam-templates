import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java { // <- change me
  static BufferedReader stdin = new BufferedReader(new
      InputStreamReader(System.in));
  static StringTokenizer st = new StringTokenizer("");
  public static void main(String[] args) throws Exception {
    final int T = readInt();
    for (int t = 1; t <= T; t++) {
      System.out.printf("Case #%d: %s\n", t, "my solution");
    }
  }
  
  static String readString() throws Exception {
    while (!st.hasMoreTokens()) {
      st = new StringTokenizer(stdin.readLine());
    }
    return st.nextToken();
  }
  
  static int readInt() throws Exception {
    return Integer.parseInt(readString());
  }
  
  static double readDouble() throws Exception {
    return Double.parseDouble(readString());
  }
}
