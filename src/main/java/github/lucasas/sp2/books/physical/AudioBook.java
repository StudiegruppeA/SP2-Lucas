package github.lucasas.sp2.books.physical;

import github.lucasas.sp2.LiteratureType;
import github.lucasas.sp2.books.IAudioBook;
import github.lucasas.sp2.books.PhysicalTitle;

public class AudioBook extends PhysicalTitle implements IAudioBook {
    private static final double DURATION_FACTOR = 0.5;

    private final int durationInMinutes;

    public AudioBook(String title, LiteratureType literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculateBaseValue() {
        return durationInMinutes * DURATION_FACTOR;
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
