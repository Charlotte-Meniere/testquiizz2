
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // on declare ici le nom de l'objet

        VF test1 = new VF("niveau facile// Le soleil est jaune Vrai(v) ou Faux(f) ?","v");
        test1.poser_question_VF();


        VF test2 = new VF("niveau intermédiaire// les chats de trois couleurs sont toujours des femelles : Vrai(v) ou Faux(f) ?","v");
        test2.poser_question_VF();

        VF test3 = new VF("niveau difficile// Les dauphins sont des violeurs : Vrai(v) ou Faux(f) ?","v");
        test3.poser_question_VF();

        QCM qcm1 = new QCM();
        qcm1.poser_question_facile_QCM();

        QCM qcm2 = new QCM();
        qcm2.poser_question_inter_QCM();

        QCM qcm3 = new QCM();
        qcm3.poser_question_diff_QCM();
    }
}