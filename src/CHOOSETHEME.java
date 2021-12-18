import java.util.Scanner;

public class CHOOSETHEME {
    // reste vide car on le définit dans le constructeur
    private String question_CHOOSETHEME ="";
    private String answer_CHOOSETHEME = "";

    // ici on accepte toute les strings

    CHOOSETHEME(String text_question, String answer){
        question_CHOOSETHEME = text_question;
        answer_CHOOSETHEME = answer;
    }

    public void proposertheme(){
        System.out.println(question_CHOOSETHEME);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String user_answer = sc.nextLine();
        if(!answer_CHOOSETHEME.equals(1)){
            // si c'est pas une string on va pas plus loin dans le programme
            System.out.println("ok voila Harry potter");

            // bon voila cette partie je suis pas sûre


        }

        // si c'est bien 1, 2 ou 3, verifie si la reponse est bien celle qu'on a définit dans answer
        else if (answer_CHOOSETHEME.equals(user_answer)) {
            // mettre l'affichage de theme harry potter ici
            System.out.println("ta pas choisi le theme");
        }
    }
}
