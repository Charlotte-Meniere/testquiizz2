import java.util.Scanner;

public class QCM {
    QCM(){
    }

    public void poser_question(){


        System.out.println("La terre est la planete numer ?");
        System.out.println("1, 2, 3, 4 ?");
        // saut de ligne

        String good_answer2 = "3";
        Scanner sc = new Scanner(System.in);
        String user_answer2 = sc.nextLine();
        if ("1".equals(user_answer2)) {
            System.out.println("the earth is the 3rd planet");
        }
        else if ("2".equals(user_answer2)) {
            System.out.println("the earth is the 3rd planet");
        }
        else if ("3".equals(user_answer2)) {
            System.out.println("it's true");
        }
        else if ("4".equals(user_answer2)) {
            System.out.println("the earth is the 3rd planet");
        }
        else {
            System.out.println("this response have to be a v or a f");
        }
}}
