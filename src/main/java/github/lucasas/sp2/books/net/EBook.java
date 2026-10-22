package github.lucasas.sp2.books.net;

import github.lucasas.sp2.LiteratureType;
import github.lucasas.sp2.books.NetTitle;

public class EBook extends NetTitle {
    private static final double CHARACTERS_PER_PAGE = 1800;
    private static final int EXTRA_PAGES = 20;
    private static final double ILLUSTRATION_BONUS = 1.1;

    private final int characters;
    private final boolean illustrated;

    public EBook(String title, LiteratureType literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    @Override
    protected double calculateBaseValue() {
        double pages = characters / CHARACTERS_PER_PAGE + EXTRA_PAGES;
        return illustrated ? pages * ILLUSTRATION_BONUS : pages;
    }
}
