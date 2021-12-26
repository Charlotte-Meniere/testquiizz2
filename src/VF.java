import java.util.Scanner;

public class VF implements Question {

    // reste vide car on le définit dans le constructeur
    private String question_VF ="";
    private String answer_VF = "";

    // definit les reponses acceptées a uniquement v ou f
    // elles sont finals car ce sont de constante ( leur valeur est inchangeable)
    private final String vrai = "v";
    private final String faux = "f";



    VF(String text_question, String good_answer){
        question_VF = text_question;
        answer_VF = good_answer;
    }

    //question de niveau facile

    public void poser_question_VF(){
        System.out.println("Partie vrai ou faux");
        System.out.println(question_VF);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String user_answer = sc.nextLine();
        if(!vrai.equals(user_answer)&&!faux.equals(user_answer)){
            // si c'est ni un v ou un f on va pas plus loin dans le programme
            System.out.println("réponse invalide");
        }
        // si c'est bien v ou f, verifie si la reponse est bien celle qu'on a définit dans good_answer
        else if (answer_VF.equals(user_answer)) {
            System.out.println("c'est vrai");
        }
        else {
            System.out.println("c'est faux");
        }
    }

    @Override
    public void poserQuestion() {
        poser_question_VF();
    }
}
