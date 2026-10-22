package github.lucasas.sp2.books;

import github.lucasas.sp2.LiteratureType;

public abstract class Title {
    private static final double RATE = 0.067574;

    private final String title;
    protected final LiteratureType literatureType;

    public Title(String title, LiteratureType literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    protected abstract double calculatePoints();

    public String getTitle() {
        return title;
    }
}
