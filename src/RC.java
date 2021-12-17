import java.util.Scanner;

public class RC {
    // reste vide car on le définit dans le constructeur
    private String question_RC ="";
    private String answer_RC = "";

    // ici on accepte toute les strings

    RC(String text_question, String good_answer){
        question_RC = text_question;
        answer_RC = good_answer;
    }

    public void poser_question_RC(){
        System.out.println(question_RC);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String user_answer = sc.nextLine();
        if(!answer_RC.equals(user_answer)){
            // si c'est pas une string on va pas plus loin dans le programme
            System.out.println("réponse invalide");
        }

        // si c'est bien 1, 2 ou 3, verifie si la reponse est bien celle qu'on a définit dans good_answer
        else if (answer_RC.equals(user_answer)) {
            System.out.println("c'est vrai");
        }
        else {
            System.out.println("c'est faux");
        }
    }
}
