package day36_Inheritance.tasksAndSolutions.book;

public class EBook extends Book {

    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("reading "+getTitle());
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';


}
}
/*
Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages
			Methods:
				setInfo()
				readBook()
				toString()
 */