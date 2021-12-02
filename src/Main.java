
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // on declare ici le nom de l'objet
        VF test1 = new VF();
        test1.poser_question();
        VF test2 = new VF("nouvelle question");
        test2.poser_question();
        QCM qcm1 = new QCM();
        qcm1.poser_question();
    }
}