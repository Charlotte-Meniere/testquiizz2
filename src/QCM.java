import java.util.Scanner;

public class QCM implements Question {
    // reste vide car on le définit dans le constructeur
    private String question_QCM ="";
    private String answer_QCM = "";

    // definit les reponses acceptées a uniquement 1,2,3
    // elles sont finals car ce sont de constante ( leur valeur est inchangeable)
    private final String one = "1";
    private final String two = "2";
    private final String three = "3";


    QCM(String text_question, String good_answer){

        question_QCM = text_question;
        answer_QCM = good_answer;
    }

    public void poser_question_QCM(){
        System.out.println("Partie QCM");
        System.out.println(question_QCM);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String user_answer = sc.nextLine();
        if(!one.equals(user_answer)&&!two.equals(user_answer)&&!three.equals(user_answer)){
            // si c'est ni un 1, 2 ou un 3 on va pas plus loin dans le programme
            System.out.println("réponse invalide");
        }

        // si c'est bien 1, 2 ou 3, verifie si la reponse est bien celle qu'on a définit dans good_answer
        else if (answer_QCM.equals(user_answer)) {
            System.out.println("c'est vrai");
        }
        else {
            System.out.println("c'est faux");
        }
}

    @Override
    public void poserQuestion() {
        //pôur cette class poser question c'est poser une question sous la forme de QCM
        poser_question_QCM();
    }
}
