package github.lucasas.sp2.books.net;

import github.lucasas.sp2.LiteratureType;
import github.lucasas.sp2.books.IAudioBook;
import github.lucasas.sp2.books.NetTitle;

public class EAudioBook extends NetTitle implements IAudioBook {
    private static final double DURATION_FACTOR = 0.5;

    private final int durationInMinutes;

    public EAudioBook(String title, LiteratureType literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
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
