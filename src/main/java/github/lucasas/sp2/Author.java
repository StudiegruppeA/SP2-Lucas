package github.lucasas.sp2;

import github.lucasas.sp2.books.Title;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private final String name;
    private final List<Title> titles;

    public Author(String name) {
        this.name = name;
        titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double royalties = titles.stream().mapToDouble(Title::calculateRoyalty).sum();
        return Math.round(royalties * 100) / 100.0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f kr.", name, calculateRoyalties());
    }
}
