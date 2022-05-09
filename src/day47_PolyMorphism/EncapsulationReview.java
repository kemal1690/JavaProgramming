package day47_PolyMorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        if(bookTitle==null){//there is no object --> this is just to prevent NullPointerException
            return " ";//there is an object
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {

        if(bookTitle==null || bookTitle.isEmpty()){

            throw new RuntimeException("Invalid data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
