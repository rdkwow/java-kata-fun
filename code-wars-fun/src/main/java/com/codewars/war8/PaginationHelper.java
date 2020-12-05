package main.java.com.codewars.war8;

import java.util.List;

public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;

    PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        if (collection.size() <= 0) {
            return -1;
        }
        double ceil = Math.ceil((double) collection.size() / (double) itemsPerPage);
        return (int) ceil;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if (pageIndex >= 0 && pageIndex + 1 <= pageCount()) {
            if (pageIndex + 1 == pageCount())
                return itemCount() - ((pageCount() - 1) * itemsPerPage);
            return itemsPerPage;
        }
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= itemCount() || itemIndex < 0)
            return -1;
        else
            return itemIndex / itemsPerPage;
    }
}
