package main.java.com.codewars.war8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PaginationHelperTest {

    PaginationHelper<String> paginationHelper = new PaginationHelper<>(Arrays.asList("a","b","c","d","e"),1);

    @Test
    public void test1232() {
        int i = paginationHelper.pageCount();
        System.out.println(i);

        System.out.println(paginationHelper.pageItemCount(-1));
        System.out.println(paginationHelper.pageItemCount(0));
        System.out.println(paginationHelper.pageItemCount(1));
        System.out.println(paginationHelper.pageItemCount(3));
    }

    @Test
    public void pageIndex() {



        System.out.println(paginationHelper.pageIndex(-1));
        System.out.println(paginationHelper.pageIndex(0));
        System.out.println(paginationHelper.pageIndex(1));
        System.out.println(paginationHelper.pageIndex(2));
        System.out.println(paginationHelper.pageIndex(3));
        System.out.println(paginationHelper.pageIndex(4));
        System.out.println(paginationHelper.pageIndex(5));

    }
}
