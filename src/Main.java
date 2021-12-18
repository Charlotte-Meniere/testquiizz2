
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // theme harry potter
        // on declare ici le nom de l'objet
//Partie vrai ou faux

        System.out.println("Partie vrai ou faux");
        VF test1 = new VF("niveau facile: Le soleil est jaune Vrai(v) ou Faux(f) ?","v");
        //test1.poser_question_VF();

        VF test2 = new VF("niveau intermédiaire: les chats de trois couleurs sont toujours des femelles : Vrai(v) ou Faux(f) ?","v");
        //test2.poser_question_VF();

        VF test3 = new VF("niveau difficile: Les dauphins sont des violeurs : Vrai(v) ou Faux(f) ?","v");
        //test3.poser_question_VF();

// partie QCM
        System.out.println("Partie QCM");
        QCM qcm1 = new QCM("niveau facile: Quel train prend Harry pour aller à Poudlard ? : 1-la Batmobile, 2-Le poudlard express ou 3-La ligne b entre Peixotto et st Nicolas ?","2");
        qcm1.poser_question_QCM();

        QCM qcm2 = new QCM("niveau intermédiaire: Dans HP, qui est Nicolas Flammel? : 1-Le créateur de la pierre philosophale, 2-une vendeur de chicha magique ou 3-Un ancien directeur?","3");
        qcm2.poser_question_QCM();

        QCM qcm3 = new QCM("niveau difficile: De quoi la famille Dursley a-t'elle le plus peur? : 1-Des voisins curieux, 2-Des hiboux ou 3-que harry reçoive du courrier ?","3");
        qcm3.poser_question_QCM();
//Partie répponse courte
        System.out.println("Partie RC, veillez a bien tout écrire en minuscule");
        RC rc1 = new RC("niveau facile: Comment s'apelle notre elfe de maison préféré ?","dobby");
        rc1.poser_question_RC();

        RC rc2 = new RC("niveau facile: Quel langue Harry sait-il parlé autre que l'anglais ??","fourchelang");
        rc2.poser_question_RC();

        RC rc3 = new RC("niveau facile: Quel est le nom du pére de Harry ?" ,"james");
        rc3.poser_question_RC();


        ArrayList<Question> Questionlist = new ArrayList<Question>();
        Questionlist.add(test1);
        Questionlist.add(test2);
        Questionlist.add(test3);
        // ajouter ici le reste des quetsion VF RC QCM

        System.out.println(Questionlist);

        // je veux que i prenne les valeurs qui correspondent a tout les index de ma liste. ces index vont de 0 a la taille de ma liste
        // premier valeur : demarrage et declaraction du type de l'itérateur
        // deuxiéme partie: condition d'arrét ( sinon ça boucle a l'infini)
        // troisiéme partie : évolution de l'itérateur a chaque boucle

        for ( int i =0; i< Questionlist.size(); i++) {
            // question courante recup les different objet question
            // on met un get de i pour recup l'index tandis qu'il évolue
            Question questionCourante = Questionlist.get(i);
            questionCourante.poserQuestion();
        }

    }

    //public static void main(String[] args) {
        //System.out.println("Choissisez votre théme");
        //CHOOSETHEME choixtheme1 = new CHOOSETHEME("Harry Potter: Tapez 1","1");
        //choixtheme1.proposertheme();

        //ArrayList<String> themes = new ArrayList<>();
        //themes.add("1.Harry Potter");

        //System.out.println(themes);

        //if(themes.contains("1.Harry Potter"));
    }
