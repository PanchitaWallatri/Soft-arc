//package creational;

public interface BookMetadataFormatter {
    BookMetadataFormatter reset();
    BookMetadataFormatter append(Book addbook);
    String getMetadataString();
}