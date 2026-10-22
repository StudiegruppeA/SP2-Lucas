package github.lucasas.sp2.books;

import github.lucasas.sp2.LiteratureType;

public abstract class PhysicalTitle extends Title {
    protected final int copies;

    public PhysicalTitle(String title, LiteratureType literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

    @Override
    protected double calculatePoints() {
        return calculateBaseValue() * literatureType.getValue() * copies;
    }

    protected abstract double calculateBaseValue();
}
