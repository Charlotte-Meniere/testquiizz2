import java.util.Scanner;

public class QCM {
    QCM(){
    }

    public void poser_question_facile_QCM(){

        System.out.println("La terre est la planete numero ?");
        System.out.println("1, 2, 3 ou 4 ?");

        String good_answerQCMeasy = "3";
        Scanner sc = new Scanner(System.in);
        String user_answerQCMeasy = sc.nextLine();
        if ("1".equals(user_answerQCMeasy)) {
            System.out.println("the earth is the 3rd planet");
        }
        else if ("2".equals(user_answerQCMeasy)) {
            System.out.println("the earth is the 3rd planet");
        }
        else if ("3".equals(user_answerQCMeasy)) {
            System.out.println("it's true, the earth is the 3rd planet");
        }
        else if ("4".equals(user_answerQCMeasy)) {
            System.out.println("the earth is the 3rd planet");
        }
        else {
            System.out.println("this response have to be 1, 2, 3 or 4");
        }
}
    public void poser_question_inter_QCM(){

        System.out.println("Quel train prend Harry pour aller à Poudlard ?");
        System.out.println("1-la Batmobile, 2-Le poudlard express, 3-Titou ou 4-La ligne b entre Peixotto et st Nicolas ?");

        String good_answerQCMinter = "2";
        Scanner sc = new Scanner(System.in);
        String user_answerQCMinter = sc.nextLine();
        if ("1".equals(user_answerQCMinter)) {
            System.out.println("tu me déçois");
        }
        else if ("2".equals(user_answerQCMinter)) {
            System.out.println("Bravo tu est un vrai potterhead");
        }
        else if ("3".equals(user_answerQCMinter)) {
            System.out.println("tu me déçois");
        }
        else if ("4".equals(user_answerQCMinter)) {
            System.out.println("tu me déçois");
        }
        else {
            System.out.println("this response have to be 1, 2, 3 or 4");
        }
    }
    public void poser_question_diff_QCM(){

        System.out.println("Quel train prend Harry pour aller à Poudlard ?");
        System.out.println("1-la Batmobile, 2-Le poudlard express, 3-Titou ou 4-La ligne b entre Peixotto et st Nicolas ?");

        String good_answerQCMdiff = "2";
        Scanner sc = new Scanner(System.in);
        String user_answerQCMdiff = sc.nextLine();
        if ("1".equals(user_answerQCMdiff)) {
            System.out.println("tu me déçois");
        }
        else if ("2".equals(user_answerQCMdiff)) {
            System.out.println("Bravo tu est un vrai potterhead");
        }
        else if ("3".equals(user_answerQCMdiff)) {
            System.out.println("tu me déçois");
        }
        else if ("4".equals(user_answerQCMdiff)) {
            System.out.println("tu me déçois");
        }
        else {
            System.out.println("this response have to be 1, 2, 3 or 4");
        }
    }

}
