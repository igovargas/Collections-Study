import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NameInsert {

    public static void simpleNameListInput() {

        System.out.println("Let's make a 5 name list!");
        
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (list.size() < 5) {
            System.out.println("\nEnter a name");
            String enteredName = input.nextLine();
            list.add(enteredName);
        }

        Collections.sort(list);
        System.out.println(list);

        input.close();
    }
}
