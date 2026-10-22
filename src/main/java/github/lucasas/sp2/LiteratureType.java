package github.lucasas.sp2;

public enum LiteratureType {
    PICTURE_BOOK(3),
    COMIC(3),
    POETRY(6),
    FICTION(1.7),
    NON_FICTION(1);


    private final double value;

    LiteratureType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
