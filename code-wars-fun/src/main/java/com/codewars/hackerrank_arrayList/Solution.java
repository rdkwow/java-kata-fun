package main.java.com.codewars.hackerrank_arrayList;

import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Solution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            mainList.add(addOneRow(sc.nextInt()));
        }
        List<Point> pointList = new ArrayList<>();

        int m = sc.nextInt();
        for (int z = 0; z < m; z++) {
            pointList.add(getPoint());
        }

        pointList.stream().forEach(e -> isExist(mainList.get(e.getX() - 1), e.getY()));
    }

    private static List<Integer> addOneRow(int countItRow) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < countItRow; i++) {
            resultList.add(sc.nextInt());
        }
        return resultList;

    }

    private static void isExist(List<Integer> list, Integer index) {
        try {
            System.out.println(list.get(index - 1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        }
    }

    private static Point getPoint() {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < 2; i++)
            resultList.add(sc.nextInt());

        return new Point(resultList.get(0), resultList.get(1));
    }
}
