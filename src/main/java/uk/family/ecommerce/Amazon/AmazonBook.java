package uk.family.ecommerce.Amazon;

public class AmazonBook {

    private String genre;
    private String name;

    public AmazonBook(String genre, int noOfPages, int price, int noOfChapters, String name, String author) {
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.price = price;
        this.noOfChapters = noOfChapters;
        this.name = name;
        this.author = author;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfChapters() {
        return noOfChapters;
    }

    public void setNoOfChapters(int noOfChapters) {
        this.noOfChapters = noOfChapters;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int noOfPages;
    private int price;
    private String author;
    private int noOfChapters;

    public int getPriceForBooks(int noOfBooks, int price) {
        return (price * noOfBooks);
    }


}
