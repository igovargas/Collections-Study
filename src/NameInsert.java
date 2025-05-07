import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NameInsert {

    static List<String> list = new ArrayList<>();
    static List<String> gender = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void simpleNameListInput() {

        System.out.println("****Let's make a 5 name list!****");

        while (list.size() < 5) {
            System.out.println("\nWrite 5 names, each separated by a comma.");
            String enteredNames = input.nextLine();
            
            //Criei um Array para armazenar os nome digitados.
            String[] splitNames = enteredNames.split(",");

            for (String name : splitNames) { //Aqui, o parâmetro (String name : splitNames) vai ver cada nome que foi colocado separado por vírgula lá no Array splitNames(linha 18). Além disso, o comando for vai fazer com que cada nome separado por vírgula seja armazenado na variável "name".    
                String trimmed = name.trim(); //O método trim() vai remover os espaços em branco no início e no final de cada palavra. A variável "trimmed" vai armazenar essa informação para cada nome.
                if (!trimmed.isEmpty()) { //Com o comando isEmpty, o certo seria informar que "está vazio", porém colocando o "!" no início, adicionamos um "não" ao sentido, ou seja, "se "trimmed" não estiver vazio, faça isso".
                    String formatted = trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1).toLowerCase(); // Isso aqui faz com que eu deixe a primeira letra maiúscula e o restante tudo minúsculo, utilizando os índices para guiar o programa.
                    list.add(formatted); //O "faça isso" é adicionar o nome a lista.
                }
                if (list.size() == 5) break; //Se a lista chegar a 5 nomes, ela irá parar, por mais que a pessoa tenha adicionado mais nomes do que isso.
            }
        }

        Collections.sort(list);
        System.out.println("\nThere is the names list:");
        System.out.println(list);

    }

    public static void nameGender() {

        //Aqui o código basicamente se repete em relação ao dos nomes, porém agora voltado para o gênero e com algumas modificações.
        System.out.println("\n****Now, define the gender of each name in the list, in the same order as printed above****");

        while (gender.size() < 5) {
            System.out.println("\nWrite 5 genres in order, each according to the name, each separated by a comma. (M/W)");
            String enteredGender = input.nextLine();
            System.out.println();

            String[] splitGender = enteredGender.split(",");

            for (String eachGender : splitGender) {
                String trimmed = eachGender.trim();
                if (!trimmed.isEmpty()) {
                    if (trimmed.equals("w") || trimmed.equals("woman") || trimmed.equals("f") || trimmed.equals("female")) {
                        gender.add("W");
                    } else if (trimmed.equals("m") || trimmed.equals("man")) {
                        gender.add("M");
                    } else {
                        System.out.println("Invalid gender input. Please, try again");
                    }
                }

                if (gender.size() == 5) break;
            }
        }

        //Utilizei o for para buscar a posição dos nomes e dos generos no Array e juntei eles. No caso dos generos, eu não ordenei do mesmo modo que os nomes.
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - (" + gender.get(i) + ")");
            System.out.println();
        }

        input.close();
    }
}