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
            System.out.println("\nWrite 5 names, each separated by a comma.");
            String enteredNames = input.nextLine();
            
            //Criei um Array para armazenar os nome digitados.
            String[] splitNames = enteredNames.split(",");

            for (String name : splitNames) { //Aqui, o parâmetro (String name : splitNames) vai ver cada nome que foi colocado separado por vírgula lá no Array splitNames(linha 18). Além disso, o comando for vai fazer com que cada nome separado por vírgula seja armazenado na variável "name".    
                String trimmed = name.trim(); //O método trim() vai remoevr os espaços em branco no início e no final de cada palavra. A variável "trimmed" vai armazenar essa informação para cada nome.
                if (!trimmed.isEmpty()) { //Com o comando isEmpty, o certo seria informar que "está vazio", porém colocando o "!" no início, adicionamos um "não" ao sentido, ou seja, "se "trimmed" não estiver vazio, faça isso".
                    list.add(trimmed); //O "faça isso" é adicionar o nome a lista.
                }
                if (list.size() == 5) break; //Se a lista chegar a 5 nomes, ela irá parar, por mais que a pessoa tenha adicionado mais nomes do que isso.
            }  
        }

        Collections.sort(list);
        System.out.println(list);

        input.close();
    }
}
