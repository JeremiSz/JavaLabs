package labSheet4.exercise4;

public class Book {
    String title;
    double price;
    String ISBN;
    int pages;

    public Book(){
        this("unavailable",0,"unavailable",0);
    }
    public Book(String title,double price,String ISBN,int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                '}';
    }
}
