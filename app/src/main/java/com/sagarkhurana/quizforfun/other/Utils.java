package com.sagarkhurana.quizforfun.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.sagarkhurana.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }




    public static Map<String,Map<String,Boolean>> getCatAQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("opreşte şi cedează trecerea vehiculelor care vin din sens opus;",true);
        answer1.put("continuă să circule, deoarece gabaritul îi permite acest lucru;",false);
        answer1.put("opreşte şi acordă prioritate numai pietonilor;",false);
        answer1.put("staționează",false);
        questions.put("La întâlnirea indicatorului „Prioritate pentru circulaţia din sens invers”, motociclistul:",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("pe străzile cu sens unic;",true);
        answer2.put("în nicio situaţie;",false);
        answer2.put("pe şoselele cu bandă laterală consolidată;",false);
        answer2.put("în orice situaţie",false);
        questions.put("Unde vă este permisă staţionarea pe partea stângă în direcţia de mers?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("da, atât vehiculelor care circulă din sens opus, cât şi pietonilor aflaţi în traversare;",true);
        answer3.put("da, numai pietonilor aflaţi în traversarea străzii pe care urmează să intre;",false);
        answer3.put("da, dar numai vehiculelor care circulă din sens invers;",false);
        answer3.put("nu;",false);
        questions.put("Dacă semnalul verde este în funcţiune, motociclistul are obligaţia de a ceda trecerea la schimbarea direcţiei de mers spre stânga?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("în toate direcţiile;",true);
        answer4.put("pe direcţia înainte sau la dreapta;",false);
        answer4.put("numai pe direcţia înainte;",false);
        answer4.put("numai la dreapta",false);
        questions.put("Când semaforul arată culoarea verde, motociclistul poate să circule prin intersecţie:",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("la semnalul patrulelor şcolare de circulaţie la trecerile pentru pietoni din apropierea unităţilor şcolare;",true);
        answer5.put("la semnalul conducătorului grupurilor organizate;",false);
        answer5.put("când se apropie de o intersecţie sau când este semnalizat cu farurile de un alt participant la trafic;",false);
        answer5.put("în nicio situație",false);
        questions.put("Când este obligat conducătorul unei motociclete să oprească?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("pe partea laterală a epiglotei (Mărul lui Adam), în scobitura dintre trahee şi muşchii gâtului;",true);
        answer6.put("lângă ureche;",false);
        answer6.put("sub mandibulă;",false);
        answer6.put("la încheietură",false);
        questions.put("În cazul unui accidentat care nu respiră, pulsul este verificat:",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("prin folosirea atelelor;",true);
        answer7.put("prin bandajarea strânsă a locului fracturii;",false);
        answer7.put("prin folosirea pansamentului compresiv;",false);
        answer7.put("în acest caz nu se intervine.",false);
        questions.put("Imobilizarea membrului inferior fracturat al unei victime într-un accident de circulaţie se face:",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("vehiculelor care circulă pe drumul judeţean;",true);
        answer8.put("vehiculelor care circulă pe drumul comunal sau local;",false);
        answer8.put("vehiculelor care vin din dreapta;",false);
        answer8.put("vehiculelor care vin din stânga",false);
        questions.put("La intersecţia nedirijată dintre un drum judeţean şi unul comunal sau local, prioritatea de trecere se acordă:",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("să oprească imediat;",true);
        answer9.put("să reducă viteza;",false);
        answer9.put("să continue deplasarea;",false);
        answer9.put("să staționeze",false);
        questions.put("La semnalul poliţistului având braţul stâng întins orizontal, orientat cu faţa către motocicleta care se apropie, conducătorul acesteia trebuie:",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("să înmâneze documentele prevăzute de lege;",true);
        answer10.put("să prezinte documentele personale;",false);
        answer10.put("să prezinte certificatul de înmatriculare şi cartea de identitate a motocicletei;",false);
        answer10.put("nu are nicio obligație",false);
        questions.put("Ce obligaţii are conducătorul unei motociclete atunci când un poliţist îi solicită documentele pentru control?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("îndrumătorii de circulaţie ai Ministerului Apărării;",true);
        answer11.put("un conducător auto rămas în pană;",false);
        answer11.put("poliţiştii comunitari;",false);
        answer11.put("poliţiştii locali",false);
        questions.put("Aveţi obligaţia de a opri imediat motocicleta la semnalele adresate de:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("interzice intrarea în intersecţie, dacă motocicleta poate fi oprită în condiţii de siguranţă;",true);
        answer12.put("permite schimbarea direcţiei de mers către dreapta;",false);
        answer12.put("permite intrarea în intersecţie, dacă urmează după lumina verde;",false);
        answer12.put("obligă oprirea motocicletei",false);
        questions.put("Semnalul galben al semaforului:",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("prin nările victimei;",true);
        answer13.put("prin gura închisă a victimei;",false);
        answer13.put("în acest caz nu se mai face respiraţie artificială;",false);
        answer13.put("se așteaptă ambulanța;",false);
        questions.put("Când gura unui rănit rămâne încleştată, respiraţia artificială se poate face:",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("tuturor vehiculelor cu care vă intersectaţi;",true);
        answer14.put("doar vehiculelor care vin din partea dreaptă",false);
        answer14.put("pietonilor de pe sensul opus de circulaţie;",false);
        answer14.put("autovehiculelor;",false);
        questions.put("La ieşirea din zonele rezidenţiale sau pietonale, sunteţi obligat să acordaţi prioritate:",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("semnalele şi indicaţiile poliţistului;",true);
        answer15.put("semnalizarea temporară, care modifică regimul normal de desfăşurare a circulaţiei;",false);
        answer15.put("semnalele luminoase;",false);
        answer15.put("culoarea semaforului",false);
        questions.put("Care dintre tipurile de semnalizare de mai jos vor fi respectate cu prioritate?",answer15);

        HashMap<String,Boolean> answer16 = new HashMap<>();
        answer16.put("pe oricare direcţie, dacă printr-un mijloc de semnalizare nu se dispune altfel;",true);
        answer16.put("numai pe direcţia înainte;",false);
        answer16.put("pe oricare direcţie, dacă vehiculul se află pe banda din mijloc;",false);
        answer16.put("numai la dreapta",false);
        questions.put("Semnalul verde al semaforului permite deplasarea:",answer16);

        HashMap<String,Boolean> answer17 = new HashMap<>();
        answer17.put("traversează prin locuri semnalizate cu indicatoare sau marcaje pentru trecerea pietonilor;",true);
        answer17.put("traversează pe la colţul intersecţiei;",false);
        answer17.put("traversează în grup;",false);
        answer17.put("traversează pe partea dreaptă a intersecţiei",false);
        questions.put("Motociclistul este obligat să acorde prioritate pietonilor care:",answer17);

        HashMap<String,Boolean> answer18 = new HashMap<>();
        answer18.put("nu;",true);
        answer18.put("da, pentru oprire în caz de urgenţă;",false);
        answer18.put("da, pentru întoarcere, în zona intersecţiilor;",false);
        answer18.put("da, în cazul în care nu este niciun autovehicul pe sensul opus ; ",false);
        questions.put("Este permisă pătrunderea pe racordurile dintre cele două părţi carosabile ale unei autostrăzi?",answer18);

        HashMap<String,Boolean> answer19 = new HashMap<>();
        answer19.put("pe banda din dreapta, de la cel puţin 50 m;",true);
        answer19.put("pe banda de lângă axul drumului, de la cel puţin 100 m;",false);
        answer19.put("pe oricare bandă, de la cel puţin 50 m;",false);
        answer19.put("pe oricare bandă, de la cel puţin 100 m;",false);
        questions.put("Pe care dintre benzi trebuie să se încadreze motociclistul şi de la ce distanţă faţă de intersecţie, pentru a schimba direcţia de mers spre dreapta, într-o localitate?",answer19);

        HashMap<String,Boolean> answer20 = new HashMap<>();
        answer20.put("atunci când semafoarele nu funcţionează ;",true);
        answer20.put("atunci când traficul este redus;",false);
        answer20.put("atunci când indicatoarele sunt instalate împreună cu semaforul pe acelaşi suport;",false);
        answer20.put("în orice caz;",false);
        questions.put("Semnificaţia indicatoarelor „Oprire” şi „Cedează trecerea”, instalate în intersecţiile semaforizate, trebuie respectată:",answer20);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getCatBQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("pe drumurile cu trafic redus;",false);
        answer1.put("pe orice drum;",false);
        answer1.put("pe drumurile cu sens unic, dacă rămâne liberă cel puţin o bandă de circulaţie;",true);
        answer1.put("pe niciun drum",false);
        questions.put("Pe ce drumuri sunt permise oprirea şi staţionarea vehiculelor şi pe partea stângă, în sensul de mers?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("să opriţi în spatele acestuia şi să vă reluaţi deplasarea numai după ce uşile tramvaiului au fost închise;",true);
        answer2.put("să opriţi în dreptul ultimei uşi;",false);
        answer2.put("să continue deplasarea; opriţi la o distanţă de 25 m de tramvai;",false);
        answer2.put("să vă continuaţi deplasarea;",false);
        questions.put("Cum trebuie să procedaţi când ajungeţi în spatele unui tramvai oprit într-o staţie fără refugiu pentru pietoni?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("transportaţi rănitul la medic, fără să faceţi nimic altceva;",false);
        answer3.put("acoperiţi rana şi opriţi sângerarea, apoi transportaţi rănitul la medic sau la spital;",true);
        answer3.put("opriţi sângerarea prin coaserea plăgii;",false);
        answer3.put("nu se intervine în acest caz",false);
        questions.put("Cum se acordă primul ajutor în cazul plăgilor tăiate?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("ambele vehicule",false);
        answer4.put("vehiculul uşor;",false);
        answer4.put("vehiculul greu;",false);
        answer4.put("vehiculul uşor;",true);
        questions.put("La întâlnirea unui vehicul greu cu unul uşor, pe un drum public îngust, pentru a face posibilă trecerea va manevra cu spatele:",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("ajută conducătorii auto să se orienteze pe timp de noapte;",false);
        answer5.put("nu permite încălcarea lui de către conducătorii de vehicule;",true);
        answer5.put("permite depăşirea vehiculelor;",false);
        answer5.put("permite depășirea",false);
        questions.put("Ce semnificaţie are marcajul longitudinal aplicat sub forma unei linii continue pe axul drumurilor publice?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("vă prezentaţi de urgenţă la cea mai apropiată unitate de poliţie;",false);
        answer6.put("anunţaţi imediat poliţia, nu modificaţi sau ştergeţi urmele accidentului şi rămâneţi pe loc;",true);
        answer6.put("deoarece vinovăţia nu vă aparţine, puteţi continua drumul dacă accidentul nu este grav;",false);
        answer6.put("nu aveți nicio obligaţiie legală",false);
        questions.put("Aţi accidentat un pieton care traversa strada neregulamentar. Ce obligaţii legale vă revin?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("o poziţie care să permită o bună respiraţie;",true);
        answer7.put("o poziţie comodă pentru transport;",false);
        answer7.put("o poziţie cât mai comodă;",false);
        answer7.put("o poziţie normală",false);
        questions.put("Până la transportarea victimei la spital, poziţia de aşteptare poate fi:",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("astfel încât să vedeţi şi să fiţi văzut, fără a-i stânjeni pe ceilalţi participanţi la trafic;",true);
        answer8.put("să vedeţi cât mai bine în faţă, indiferent dacă sunt deranjaţi ceilalţi participanţi la trafic cu care vă întersectaţi;",false);
        answer8.put("să asiguraţi, cel puţin, funcţionarea farului din partea dreaptă",false);
        answer8.put("stânga",false);
        questions.put("Cum trebuie să aveţi reglat sistemul de lumini pentru circulaţia pe timp de noapte?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("reduceţi viteza şi vă deplasaţi în spatele bicicletei, până când drumul vă oferă condiţii bune de vizibilitate pentru depăşire;",true);
        answer9.put("claxonaţi pentru a atrage atenţia biciclistului că îl depăşiţi;",false);
        answer9.put("vă continuaţi deplasarea, deoarece în această situaţie bicicletele pot fi depăşite;",false);
        answer9.put("opriți",false);
        questions.put("Cum veţi proceda într-o curbă lipsită de vizibilitate, dacă în faţa dvs. circulă o bicicletă?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("să măriţi viteza de deplasare a autovehiculului;",true);
        answer10.put("să ocoliţi obstacolul creat în carosabil, circulând în sens giratoriu;",false);
        answer10.put("să ocoliţi obstacolul indicat de acesta;",false);
        answer10.put("să opriți",false);
        questions.put("La semnalul dat de personalul autorizat din zona lucrărilor pe drumurile publice, prin rotirea vioaie a braţului, aveţi obligaţia:",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("să acorde prioritate de trecere ambulanţei;",true);
        answer11.put("să respecte semnificaţia culorii semaforului;",false);
        answer11.put("să reducă viteza şi să-şi continue drumul cu atenţie;",false);
        answer11.put("să oprească",false);
        questions.put("Într-o intersecţie, prezenţa unei ambulanţe ce se deplasează la o intervenţie obligă pe ceilalţi conducători:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("apă oxigenata sau iod;",true);
        answer12.put("ser fiziologic;",false);
        answer12.put("apă potabilă;",false);
        answer12.put("spirt medicinal",false);
        questions.put("Dezinfecția plăgilor ce necesită a fi pansate se face cu:",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("cresterea consumului de combustibil;",true);
        answer13.put("reducerea consumului de combustibil;",false);
        answer13.put("scaderea puternica a gradului de confort;",false);
        answer13.put("nu are niciun efect",false);
        questions.put("Utilizarea sistemului de climatizare are ca efect:",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("pe banda de urgenta;",true);
        answer14.put("între banda din stânga si banda din mijloc;",false);
        answer14.put("între banda din dreapta si banda din mijloc;",false);
        answer14.put("pe banda din dreapta\n",false);
        questions.put("Pe o autostrada cu trei benzi, s-a blocat circulatia. Pe unde vor circula vehiculele de interventie?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("sa provocati in mers socuri autovehiculului.",true);
        answer15.put("sa efectuati mersul inapoi",false);
        answer15.put("sa depasiti alte autovehicule;",false);
        answer15.put("sa intoarceti",false);
        questions.put("Atunci cand transportati marfuri sau produse periculoase va este interzis:",answer15);

        HashMap<String,Boolean> answer16 = new HashMap<>();
        answer16.put("să acordaţi prioritate de trecere pietonilor aflaţi în traversare;",true);
        answer16.put("să reduceţi viteza şi să vă strecuraţi printre pietoni;\n",false);
        answer16.put("să acordaţi prioritate de trecere şi pietonilor care circulă pe celălalt sens de mers;",false);
        answer16.put("nicio variantă nu este corectă",false);
        questions.put("Ce obligaţii aveţi la trecerea pentru pietoni, pe sensul dvs. de mers?",answer16);

        HashMap<String,Boolean> answer17 = new HashMap<>();
        answer17.put("da, dacă linia discontinuă este cea mai apropiată de vehicul în direcţia de mers;",true);
        answer17.put("da, dacă marcajul nu este într-o curbă;",false);
        answer17.put("nu, chiar în cazul în care linia discontinuă este cea mai apropiată de vehicul;",false);
        answer17.put("nicio variantă nu este corectă",false);
        questions.put("Este permisă trecerea peste marcajul longitudinal format dintr-o linie continuă şi alta discontinuă?",answer17);

        HashMap<String,Boolean> answer18 = new HashMap<>();
        answer18.put("cu o viteză care să permită oprirea, pentru a acorda prioritate de trecere participanţilor la trafic care au acest drept;",true);
        answer18.put("limita maximă de viteză va fi respectată doar în cazul intersecţiilor dirijate;",false);
        answer18.put("limita maximă de viteză în localităţi va fi de 50 km/h, iar în afara localităţilor de 130 km/h;",false);
        answer18.put("nicio variantă nu este corectă",false);
        questions.put("Cu ce viteză se poate circula în apropierea unei intersecţii?",answer18);

        HashMap<String,Boolean> answer19 = new HashMap<>();
        answer19.put("nu acţionaţi frâna şi rotiţi volanul în sens invers derapării;",true);
        answer19.put("frânaţi la maximum;",false);
        answer19.put("opriţi motorul;",false);
        answer19.put("acceleraţi",false);
        questions.put("La frânare, vehiculul derapează. Cum reacţionaţi corect?",answer19);

        HashMap<String,Boolean> answer20 = new HashMap<>();
        answer20.put("în locul cu vizibilitate maximă, fără a depăşi indicatorul;",true);
        answer20.put("cât mai aproape de calea ferată, dar nu mai puţin de 5 m de aceasta;",false);
        answer20.put("la cel mult 5 m de calea ferată;",false);
        answer20.put("la cel mult 2 m de calea ferată;",false);
        questions.put("La întâlnirea indicatorului de avertizare în cruce, amplasat la trecerile la nivel cu calea ferată fără bariere, conducătorii de vehicule vor opri:",answer20);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getCatCQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Maya Angelou",true);
        answer1.put("Robert Hass",false);
        answer1.put("Jessica Hagdorn",false);
        answer1.put("Micheal Palmer",false);
        questions.put("Which American writer published ‘A brave and startling truth’ in 1996",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Acrostic ",true);
        answer2.put("Haiku",false);
        answer2.put("Epic",false);
        answer2.put("Alliterative",false);
        questions.put("What is a poem called whose first letters of each line spell out a word?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Limerick",true);
        answer3.put("Quartet",false);
        answer3.put("Sextet",false);
        answer3.put("Palindrome",false);
        questions.put("What is a funny poem of five lines called?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Robert Greene",true);
        answer4.put("John Milton",false);
        answer4.put("Philip Sidney",false);
        answer4.put("Christopher Marlowe",false);
        questions.put("Who succeeded Lyly?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Hamlet",true);
        answer5.put("Cymbeline",false);
        answer5.put("Titus Andronicus",false);
        answer5.put("Pericles, Prince of Tyre",false);
        questions.put("Which famous Shakespeare play does the quote,”Neither a borrower nor a lender be” come from?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("In which century was Shakespeare born?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("A thief",true);
        answer7.put("A clerk",false);
        answer7.put("A teacher",false);
        answer7.put("A dentist",false);
        questions.put("Who is Mr. Tench in The Power and the Glory?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Coleridge",true);
        answer8.put("Wordsworth",false);
        answer8.put("Lamb",false);
        answer8.put("Shelley",false);
        questions.put("Who said ‘Keats was a Greek’?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gertrude",true);
        answer9.put("Beatrice",false);
        answer9.put("Margaret",false);
        answer9.put("Rosalind",false);
        questions.put("Which of the following is Hamlet’s mother?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Keats",true);
        answer11.put("Blake",false);
        answer11.put("Tennyson",false);
        answer11.put("Shelley",false);
        questions.put("For whom it is said: “sensuousness is a paramount bias of his genius”:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Maud",true);
        answer12.put("Ulysses",false);
        answer12.put("Break, Break, Break",false);
        answer12.put("Crossing the Bar",false);
        questions.put("Which of the following poems by Tennyson is a monodrama?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Southey",true);
        answer13.put("Tennyson",false);
        answer13.put("Byron",false);
        answer13.put("Wordsworth",false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 1813?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Wordsworth",true);
        answer14.put("Keats",false);
        answer14.put("Byron",false);
        answer14.put("Blake",false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Dickens",true);
        answer15.put("George Eliot",false);
        answer15.put("Hardy",false);
        answer15.put("None of the above",false);
        questions.put("Moral choice is everything in the works of:",answer15);

        return questions;
    }
    public static Map<String,Map<String,Boolean>> getCatDQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Maya Angelou",true);
        answer1.put("Robert Hass",false);
        answer1.put("Jessica Hagdorn",false);
        answer1.put("Micheal Palmer",false);
        questions.put("Which American writer published ‘A brave and startling truth’ in 1996",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Acrostic ",true);
        answer2.put("Haiku",false);
        answer2.put("Epic",false);
        answer2.put("Alliterative",false);
        questions.put("What is a poem called whose first letters of each line spell out a word?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Limerick",true);
        answer3.put("Quartet",false);
        answer3.put("Sextet",false);
        answer3.put("Palindrome",false);
        questions.put("What is a funny poem of five lines called?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Robert Greene",true);
        answer4.put("John Milton",false);
        answer4.put("Philip Sidney",false);
        answer4.put("Christopher Marlowe",false);
        questions.put("Who succeeded Lyly?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Hamlet",true);
        answer5.put("Cymbeline",false);
        answer5.put("Titus Andronicus",false);
        answer5.put("Pericles, Prince of Tyre",false);
        questions.put("Which famous Shakespeare play does the quote,”Neither a borrower nor a lender be” come from?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("In which century was Shakespeare born?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("A thief",true);
        answer7.put("A clerk",false);
        answer7.put("A teacher",false);
        answer7.put("A dentist",false);
        questions.put("Who is Mr. Tench in The Power and the Glory?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Coleridge",true);
        answer8.put("Wordsworth",false);
        answer8.put("Lamb",false);
        answer8.put("Shelley",false);
        questions.put("Who said ‘Keats was a Greek’?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gertrude",true);
        answer9.put("Beatrice",false);
        answer9.put("Margaret",false);
        answer9.put("Rosalind",false);
        questions.put("Which of the following is Hamlet’s mother?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Keats",true);
        answer11.put("Blake",false);
        answer11.put("Tennyson",false);
        answer11.put("Shelley",false);
        questions.put("For whom it is said: “sensuousness is a paramount bias of his genius”:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Maud",true);
        answer12.put("Ulysses",false);
        answer12.put("Break, Break, Break",false);
        answer12.put("Crossing the Bar",false);
        questions.put("Which of the following poems by Tennyson is a monodrama?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Southey",true);
        answer13.put("Tennyson",false);
        answer13.put("Byron",false);
        answer13.put("Wordsworth",false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 1813?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Wordsworth",true);
        answer14.put("Keats",false);
        answer14.put("Byron",false);
        answer14.put("Blake",false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Dickens",true);
        answer15.put("George Eliot",false);
        answer15.put("Hardy",false);
        answer15.put("None of the above",false);
        questions.put("Moral choice is everything in the works of:",answer15);

        return questions;
    }
    public static Map<String,Map<String,Boolean>> getRandomQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.cata))){
            originalQuestion = getCatAQuestions();
        }else if(subject.equals(context.getString(R.string.catb))){
            originalQuestion = getCatBQuestions();
        }else if(subject.equals(context.getString(R.string.catc))){
            originalQuestion = getCatCQuestions();
        }else{
            originalQuestion = getCatDQuestions();
        }
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
