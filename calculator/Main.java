package calculator;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main (String[] args) throws Exception {

        List<String> list = new ArrayList<>();
        int i = 0;
        int l = 0;
        int p = 0;
        int m = 0;
        System.out.println("Input");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = in.readLine().split(" ");
        try {
           for (String arr1 : arr ) {
                list.add(arr1);
                i++;
            }
            for (Map.Entry<String, Integer> item : Rim.map.entrySet()) {
                if (item.getKey().equals(list.get(0))) {
                    l = item.getValue();

                }
            }

            for (Map.Entry<String, Integer> item : Rim.map.entrySet()) {
                if (item.getKey().equals(list.get(2))) {
                    p = item.getValue();

                }
            }
        }catch (Exception e) {
            throw new ScannerException("не верный ввод");
        }

        if ((p == 0) && (l==0) && (i == 3)) {
               l = Integer.parseInt(list.get(0));
               p = Integer.parseInt(list.get(2));
               m = 1;

        }
        if ((i != 3) || (l > 10) || (l < 1) || (p > 10) || (p < 1)) {
            throw new ScannerException("не верный ввод");
        }

                Arabian arabian = new Arabian(l, p);

        if (list.get(1).charAt(0) == '+') {
                    if (m == 0)
                    System.out.println("Output" + "\n" + ArabianToRim.toRoman(arabian.sum(l , p)));
                    else System.out.println("Output" + "\n" + arabian.sum(l , p));


        } else if (list.get(1).charAt(0) == '-') {
                    if (m == 0)
                        System.out.println("Output" + "\n" + ArabianToRim.toRoman(arabian.raz(l , p)));
                    else System.out.println("Output" + "\n" + arabian.raz(l , p));


        } else if (list.get(1).charAt(0) == '*') {
                    if (m == 0)
                        System.out.println("Output" + "\n" + ArabianToRim.toRoman(arabian.umn(l , p)));
                    else System.out.println("Output" + "\n" + arabian.umn(l , p));


        } else if (list.get(1).charAt(0) == '/') {
                    if (m == 0)
                        System.out.println("Output" + "\n" + ArabianToRim.toRoman(arabian.del(l , p)));
                    else System.out.println("Output" + "\n" + arabian.del(l , p));

        } else {
                    throw new ScannerException("не верный ввод");
        }
    }
}
