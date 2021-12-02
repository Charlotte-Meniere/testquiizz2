import java.util.Scanner;

public class VF {
    VF(){
    }

    VF(String text_question){
        question = text_question;
    }

    VF(String text_question, String bonneReponse){
        question = text_question;
    }

    private String question ="Le soleil est jaune Vrai(v) ou Faux(f) ?";

    public void poser_question(){
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        // saut de ligne

        String good_answer = "v";
        String user_answer = sc.nextLine();
        if (good_answer.equals(user_answer)) {
            System.out.println("it's true");
        }
        else if ("f".equals(user_answer)) {
            System.out.println("it's false, the sun is yellow");
        }
        else {
            System.out.println("this response have to be a v or a f");
        }
    }
}
