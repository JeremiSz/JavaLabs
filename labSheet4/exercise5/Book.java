package labSheet4.exercise5;

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

        this.price =(price>50000|| price<0)?0:price;
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

        this.ISBN =  (ISBN.isEmpty()||ISBN==null)?"No Valid ISBN Supplied":ISBN;;
    }

    public void setPages(int pages) {
        this.pages = (pages>4000|| pages<=0)?0:pages;
    }

    public void setTitle(String title) {

        this.title = (title.isEmpty()||title==null)?"No Valid Title Supplied":title;
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
