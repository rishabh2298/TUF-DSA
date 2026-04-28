import java.util.*;
import java.io.*;

class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream input) {
            br = new BufferedReader(new InputStreamReader(input));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private static void printNamesNTimes(int count, int N) {
        if (count > N)
            return;

        System.out.println("Hello");
        printNamesNTimes(++count, N);
    }

    public static void main(String[] args) throws Exception {

        FastReader sc = new FastReader(new FileInputStream("input.txt"));

        printNamesNTimes(1, 5);
    }
}
