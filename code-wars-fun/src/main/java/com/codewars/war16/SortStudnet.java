package main.java.com.codewars.war16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudnet {
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
class Solution {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(33, "Ruma", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));
        StudentComparator studentComparator = new StudentComparator();
        studentList = studentList.stream().sorted((s1, s2) -> studentComparator.compare(s2,s1)).collect(Collectors.toList());
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }

    static   class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (Double.compare(o1.getCgpa(), o2.getCgpa()) != 0) {
                return Double.compare(o1.getCgpa(), o2.getCgpa());
            } else if (o1.getFname().compareTo(o2.getFname()) != 0) {
                return o2.getFname().compareTo(o1.getFname());
            } else return Integer.compare(o1.getId(), o2.getId());
        }
    }
}
