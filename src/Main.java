
import groovy.lang.GString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

// appel des thémes
// création du HashMap
        HashMap<String, ArrayList<Question>> dicoThemeQuestion= new HashMap<>();

        ArrayList<Question> questionListHP = getQuestionHP();
        ArrayList<Question> questionListLOR = getQuestionLOR();

        //put = methode de mon hashmap ( on definit que a cette clé ci ce corespond ce contenu) et ça le met dans notre dico
        dicoThemeQuestion.put("Harry Potter",questionListHP);
        dicoThemeQuestion.put("Lord Of Rings",questionListLOR);
        System.out.println(dicoThemeQuestion.keySet().toString());

        //lance le premier theme sur harry potter
        ArrayList<Question> questionThemeChoisi = dicoThemeQuestion.get("Harry Potter");

        //Scanner sc = new Scanner(questionThemeChoisi);


        // récuperer le choix du theme avec un scanner type dicothemequestion.get

        // je veux que i prenne les valeurs qui correspondent a tout les index de ma liste. ces index vont de 0 a la taille de ma liste
        // premier valeur : demarrage et declaraction du type de l'itérateur
        // deuxiéme partie: condition d'arrét ( sinon ça boucle a l'infini)
        // troisiéme partie : évolution de l'itérateur a chaque boucle

        for ( int i =0; i< questionThemeChoisi.size(); i++) {
            // question courante recup les different objet question
            // on met un get de i pour recup l'index tandis qu'il évolue
            Question questionCourante = questionThemeChoisi.get(i);
            questionCourante.poserQuestion();
        }

    }
    private static ArrayList<Question> getQuestionHP(){
//Partie vrai ou faux
        VF test1 = new VF("niveau facile: Malefoy est gentil dés le début(v) ou Faux(f) ?","f");
        VF test2 = new VF("niveau intermédiaire: Neville a peur de rogue : Vrai(v) ou Faux(f) ?","v");
        VF test3 = new VF("niveau difficile: Le BullieName de Luna est Loufoka : Vrai(v) ou Faux(f) ?","v");
// partie QCM
        QCM qcm1 = new QCM("niveau facile: Quel train prend Harry pour aller à Poudlard ? : 1-la Batmobile, 2-Le poudlard express ou 3-La ligne b entre Peixotto et st Nicolas ?","2");
        QCM qcm2 = new QCM("niveau intermédiaire: Dans HP, qui est Nicolas Flammel? : 1-Le créateur de la pierre philosophale, 2-une vendeur de chicha magique ou 3-Un ancien directeur?","3");
        QCM qcm3 = new QCM("niveau difficile: De quoi la famille Dursley a-t'elle le plus peur? : 1-Des voisins curieux, 2-Des hiboux ou 3-que harry reçoive du courrier ?","3");
//Partie répponse courte
        RC rc1 = new RC("niveau facile: Comment s'apelle notre elfe de maison préféré ?","dobby");
        RC rc2 = new RC("niveau facile: Quel langue Harry sait-il parlé autre que l'anglais ??","fourchelang");
        RC rc3 = new RC("niveau facile: Quel est le nom du pére de Harry ?" ,"james");

        ArrayList<Question> questionlist = new ArrayList<>();
        questionlist.add(test1);
        questionlist.add(test2);
        questionlist.add(test3);

        questionlist.add(qcm1);
        questionlist.add(qcm2);
        questionlist.add(qcm3);

        questionlist.add(rc1);
        questionlist.add(rc2);
        questionlist.add(rc3);
        // retourne le contenu ci dessus dans la méthode
        return questionlist;
    }

    private static ArrayList<Question> getQuestionLOR(){
//Partie vrai ou faux
        VF test1 = new VF("niveau facile: Frodon est un nain. Vrai(v) ou Faux(f) ?","f");
        VF test2 = new VF("niveau intermédiaire: Pippin et Merry sont frères. : Vrai(v) ou Faux(f) ?","f");
        VF test3 = new VF("niveau difficile: Thranduil est le père d'Arwen et Legolas. : Vrai(v) ou Faux(f) ?","v");
// partie QCM
        QCM qcm1 = new QCM("niveau facile: qui posséde l'anneau au début de la trilogie ? : 1-Bilbon, 2-Sauron ou 3-Frodon ?","1");
        QCM qcm2 = new QCM("niveau intermédiaire:Comment s'appelle l'auberge de Bree où Gandalf donne rendez-vous aux Hobbits ? : 1-Le chien loufoque, 2-le poney fringuant ou 3-l'hippocampe fou?","2");
        QCM qcm3 = new QCM("niveau difficile: Quel était le nom de Gollum lorsqu'il était encore un gentil hobbit ? : 1-Colargol, 2-Déagol ou 3-Sméargol?","3");
//Partie répponse courte
        RC rc1 = new RC("niveau facile: Quel est le métier de Sam Gamegie  ?","cuisinier");
        RC rc2 = new RC("niveau intermédiaire:  De quel métal est composée la cotte de maille qu'offre Bilbon à son neveu ?","mithril");
        RC rc3 = new RC("niveau difficile: Quelle est la première elfe qui renonce à l'immortalité par amour ?" ,"arwen");

        ArrayList<Question> questionlist = new ArrayList<>();
        questionlist.add(test1);
        questionlist.add(test2);
        questionlist.add(test3);

        questionlist.add(qcm1);
        questionlist.add(qcm2);
        questionlist.add(qcm3);

        questionlist.add(rc1);
        questionlist.add(rc2);
        questionlist.add(rc3);
        // retourne le contenu ci dessus dans la méthode
        return questionlist;
    }
    }
