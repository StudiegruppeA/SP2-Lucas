package github.lucasas.sp2;

import github.lucasas.sp2.books.physical.AudioBook;
import github.lucasas.sp2.books.net.EAudioBook;
import github.lucasas.sp2.books.net.EBook;
import github.lucasas.sp2.books.physical.PrintedBook;

public class LibraryRoyaltyCalculator {
    void main() {
        Author author = new Author("Uncle Bob");
        author.addTitle(new AudioBook("Project Hail Mary",LiteratureType.FICTION,2000, 120));
        author.addTitle(new PrintedBook("Sapiens: A Brief History of Humankind", LiteratureType.NON_FICTION, 200, 528));
        author.addTitle(new PrintedBook("The Complete Poems of Emily Dickinson", LiteratureType.POETRY,1000, 300));

        System.out.println(author);

        Author author1 = new Author("Olga Ravn");
        author1.addTitle(new PrintedBook("Celestine",LiteratureType.FICTION,140, 166));
        author1.addTitle(new AudioBook("Celestine",LiteratureType.FICTION,140, 192));
        System.out.println(author1);

        Author author2 = new Author("Kim larsen");
        author2.addTitle(new EBook("Fandango", LiteratureType.NON_FICTION, 97, 50, 205, 360000, false));
        author2.addTitle(new EBook("Fandango 2", LiteratureType.NON_FICTION, 97, 50, 205, 360000, true));
        author2.addTitle(new EAudioBook("Fandango", LiteratureType.NON_FICTION, 97, 50, 205, 440));
        System.out.println(author2);
    }
}
