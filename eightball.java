import skilstak.c;
import java.util.Scanner;
import java.util.List;

public class eightball {
    
    private static final String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
    
    /*
    private static final Object choice(List list) {   
    }
    */
    
    public static final void main(String[] args) {
        System.out.print(c.cl + c.g + "Welcome to the majic 8ball! Pls enter yo questions");
        
        while (true) {
        String question = input("--> " + c.B3);
        }
    }
}    




