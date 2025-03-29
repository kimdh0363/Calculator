import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        ArrayList<Integer> list = new ArrayList<>();

        String numbers = st.nextToken();
        String opertor = st.nextToken();

        float result = 0;

        StringTokenizer st2 = new StringTokenizer(numbers, ",:");

        while (st2.hasMoreTokens()) {
            list.add(Integer.parseInt(st2.nextToken()));
        }
        if (Objects.equals(opertor, "+")) {
            for (Integer integer : list) {
                result += integer;
            }
        }
        if (Objects.equals(opertor, "-")) {
            result = list.getFirst();
            for (int i = 1; i < list.size();i++) {
                result -= list.get(i);
            }
        }
        if (Objects.equals(opertor, "*")) {
            for (Integer integer : list) {
                result *= integer;
            }
        }
        if (Objects.equals(opertor, "/")) {
            result = list.getFirst();
            for (int i = 1; i < list.size();i++) {
                result /= list.get(i);
            }
        }

        System.out.printf("%.1f", result);
    }
}
