import java.util.Scanner;

public class VF {

    // reste vide car on le définit dans le constructeur
    private String question_VF ="";
    private String answer_VF = "";

    VF(){
    }

    VF(String text_question, String good_answer){
        question_VF = text_question;
        answer_VF = good_answer;
    }

    //question de niveau facile

    public void poser_question_VF(){
        System.out.println(question_VF);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String user_answer = sc.nextLine();

        if (answer_VF.equals(user_answer)) {
            System.out.println("c'est vrai");
        }
        else {
            System.out.println("c'est faux");
        }
    }

}
