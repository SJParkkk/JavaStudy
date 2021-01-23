package Java8FuntionalAndLamda;

public class Book {
    private String name;
    private Integer price;
    private String author;

    public Book() {
    }

    public Book(String name, Integer price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean priceCheck(){
        return this.price > 10;
    }
}
