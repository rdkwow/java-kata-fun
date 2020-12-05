package main.java.com.codewars.war13;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalSort {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        String temp;
        for(int k=0; k < n; k++) {
            for (int z = 1; z < n - k; z++) {
                BigDecimal bigDecimal = new BigDecimal(s[z - 1]);
                BigDecimal val = new BigDecimal(s[z]);
                if (bigDecimal.compareTo(val) == -1) {
                    temp = s[z - 1];
                    s[z - 1] = s[z];
                    s[z] = temp;
                }
            }
        }

        //Write your code here

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }


//    public static void main(String[] args) {
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//
//        List<BigDecimal> list = new ArrayList<>();
//
//        for (int z = 0;z < n;z++){
//            list.add(new BigDecimal(s[z]));
//        }
//
//        s = list.stream().sorted((a, b) -> b.compareTo(a)).map(BigDecimal::toString).toArray(String[]::new);
//        //Write your code here
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//
//       // result();
//    }
//
//    private static void result() {
//        String[] objects = getList().stream().sorted((a, b) -> b.compareTo(a)).map(BigDecimal::toString).toArray(String[]::new);
//        System.out.println(objects[0]);
//    }
//
//    private static List<BigDecimal> getList() {
//        Scanner in = new Scanner(System.in);
//        int elementCount = in.nextInt();
//
//        List<BigDecimal> list = new ArrayList<>();
//
//        for (int i = 0; i < elementCount; i++) {
//            String a = in.next();
//            list.add(new BigDecimal(a));
//        }
//        return list;
//    }
}
