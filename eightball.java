import skilstak.c;
import java.util.Scanner;
import java.util.List;

public class eightball {
    
    private static String[] list = {"Yes.","No.","Maybe So."};

    private static final String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
    
    
    private static final String choice(String[] list) {   
        int index = (int) (Math.random()*list.length);
        return list[index];
    }
    
    
    public static final void main(String[] args) {
        System.out.print(c.cl + c.g + "Welcome to the magic 8ball! Pls enter yo questions");
        
        while (true) {
        String question = input("--> " + c.B3);
        System.out.println(choice(list));
        //System.out.println(question);
        }
    }
}    




