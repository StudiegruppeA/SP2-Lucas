package github.lucasas.sp2.books;

import github.lucasas.sp2.LiteratureType;

public abstract class NetTitle extends Title {
    private static final int REACH_WEIGHT = 5;
    private static final double AVAILABILITY_WEIGHT = 0.5;

    private final int availability;
    private final int reach;
    private final int use;

    public NetTitle(String title, LiteratureType literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    @Override
    protected double calculatePoints() {
        return calculateBaseValue() * literatureType.getValue() * getPseudoCopies();
    }

    protected abstract double calculateBaseValue();

    private double getPseudoCopies() {
        return (reach * REACH_WEIGHT) + (availability * AVAILABILITY_WEIGHT) + getUseFactor();
    }

    private int getUseFactor() {
        return use;
    }
}
