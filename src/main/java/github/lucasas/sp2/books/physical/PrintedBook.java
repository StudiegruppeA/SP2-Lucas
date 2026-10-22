package github.lucasas.sp2.books.physical;

import github.lucasas.sp2.LiteratureType;
import github.lucasas.sp2.books.PhysicalTitle;

public class PrintedBook extends PhysicalTitle {
    private final int pages;

    public PrintedBook(String title, LiteratureType literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculateBaseValue() {
        return pages;
    }
}
