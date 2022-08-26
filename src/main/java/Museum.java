import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Museum {
    public static void main(String[] args) {
        // Slow evolution of a project.
//        System.out.println("What's your name?");
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        System.out.println("Hello, " + name);

        Scanner in = new Scanner(System.in);
        PaintingService service = new PaintingService();
        boolean visitingMuseum = true;
        while (visitingMuseum) {
            System.out.println("Input command (quit, add, view)");
            String userInput = in.nextLine();
            if (userInput.equals("quit")) {
                visitingMuseum = false;
            } else if (userInput.equals("add")) {
                String paintingTitle = in.nextLine();
//                Painting newPainting = new Painting(paintingTitle, 0, "default");
//                paintings.addPainting(newPainting);
            } else if (userInput.equals("view")) {
                System.out.println(paintings);
            }
        }
    }
}
