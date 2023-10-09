package ra.bussinessImp;

import ra.bussiness.IBook;
import utils.InputMethods;

import java.util.Scanner;

public class Book implements IBook {
    Scanner sc = new Scanner(System.in);
    private int bookId;
    private String bookName;
    private String title;
    private String numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, int bookName, String title, String numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = String.valueOf(bookName);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void calProfit() {
        this.interest = (float) (this.exportPrice - this.importPrice);
    }

    public void increaseId(Book[] arrBook, int curIndex) {
        int maxId = 0;
        for (int i = 0; i < curIndex; i++) {
            if (arrBook[i].getBookId() > maxId) {
                maxId = arrBook[i].getBookId();
            }
        }
        this.bookId = maxId + 1;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Nhập mã Sách: ");
        this.bookId = InputMethods.getInteger();
        System.out.println("Nhập tên Sách: ");
        this.bookName = InputMethods.getString();
        System.out.println("Nhập tiêu đề: ");
        String title = InputMethods.getString();
        System.out.println("Gía nhập: ");
        this.importPrice = InputMethods.getFloat();
        System.out.println("Gía bán :");
        this.exportPrice = InputMethods.getFloat();
        System.out.println("Trạng thái: Bán:true - Không bán:phím bất kỳ");
        this.bookStatus = InputMethods.getBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("" + "\nID:" + bookId + "\nName:" + bookName + "\nTitle:" + title + "\nImportPrice:" + importPrice + "\nExportPrice:" + exportPrice + "\nStatus:" + (bookStatus ? "Đang bán" : "không có sẵn"));
    }
}
