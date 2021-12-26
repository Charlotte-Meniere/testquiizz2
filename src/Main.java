
import groovy.lang.GString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

// Theme harry Potter
// création du HashMap
        HashMap<String, ArrayList<Question>> dicoThemeQuestion= new HashMap<>();

        ArrayList<Question> questionListHP = getQuestionHP();
        //put = methode de mon hashmap ( on definit que a cette clé ci ce corespond ce contenu) et ça le met dans notre dico
        dicoThemeQuestion.put("Harry Potter",questionListHP);
        System.out.println(dicoThemeQuestion.keySet().toString());

        ArrayList<Question> questionThemeChoisi = dicoThemeQuestion.get("Harry Potter");
        Scanner sc = new Scanner(dicoThemeQuestion);
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
        VF test1 = new VF("niveau facile: Le soleil est jaune Vrai(v) ou Faux(f) ?","v");
        VF test2 = new VF("niveau intermédiaire: les chats de trois couleurs sont toujours des femelles : Vrai(v) ou Faux(f) ?","v");
        VF test3 = new VF("niveau difficile: Les dauphins sont des violeurs : Vrai(v) ou Faux(f) ?","v");
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
    }
