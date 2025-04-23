package ViewConsole;

import Models.Book;

public class ViewConsole {
    public void printArray(Book[] book ){
        for (Book book2 : book) {
            System.out.println(book2.toString());
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }
}
