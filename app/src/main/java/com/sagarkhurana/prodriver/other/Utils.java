package com.sagarkhurana.prodriver.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.sagarkhurana.prodriver.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm", Locale.getDefault());
        return sdf.format(new Date());
    }


    public static Map<String, Map<String, Boolean>> getCatAQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("opreşte şi cedează trecerea vehiculelor care vin din sens opus;", true);
        answer1.put("continuă să circule, deoarece gabaritul îi permite acest lucru;", false);
        answer1.put("opreşte şi acordă prioritate numai pietonilor;", false);
        answer1.put("staționează", false);
        questions.put("La întâlnirea indicatorului „Prioritate pentru circulaţia din sens invers”, motociclistul:", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("pe străzile cu sens unic;", true);
        answer2.put("în nicio situaţie;", false);
        answer2.put("pe şoselele cu bandă laterală consolidată;", false);
        answer2.put("în orice situaţie", false);
        questions.put("Unde vă este permisă staţionarea pe partea stângă în direcţia de mers?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("da, atât vehiculelor care circulă din sens opus, cât şi pietonilor aflaţi în traversare;", true);
        answer3.put("da, numai pietonilor aflaţi în traversarea străzii pe care urmează să intre;", false);
        answer3.put("da, dar numai vehiculelor care circulă din sens invers;", false);
        answer3.put("nu;", false);
        questions.put("Dacă semnalul verde este în funcţiune, motociclistul are obligaţia de a ceda trecerea la schimbarea direcţiei de mers spre stânga?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("în toate direcţiile;", true);
        answer4.put("pe direcţia înainte sau la dreapta;", false);
        answer4.put("numai pe direcţia înainte;", false);
        answer4.put("numai la dreapta", false);
        questions.put("Când semaforul arată culoarea verde, motociclistul poate să circule prin intersecţie:", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("la semnalul patrulelor şcolare de circulaţie la trecerile pentru pietoni din apropierea unităţilor şcolare;", true);
        answer5.put("la semnalul conducătorului grupurilor organizate;", false);
        answer5.put("când se apropie de o intersecţie sau când este semnalizat cu farurile de un alt participant la trafic;", false);
        answer5.put("în nicio situație", false);
        questions.put("Când este obligat conducătorul unei motociclete să oprească?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("pe partea laterală a epiglotei (Mărul lui Adam), în scobitura dintre trahee şi muşchii gâtului;", true);
        answer6.put("lângă ureche;", false);
        answer6.put("sub mandibulă;", false);
        answer6.put("la încheietură", false);
        questions.put("În cazul unui accidentat care nu respiră, pulsul este verificat:", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("prin folosirea atelelor;", true);
        answer7.put("prin bandajarea strânsă a locului fracturii;", false);
        answer7.put("prin folosirea pansamentului compresiv;", false);
        answer7.put("în acest caz nu se intervine.", false);
        questions.put("Imobilizarea membrului inferior fracturat al unei victime într-un accident de circulaţie se face:", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("vehiculelor care circulă pe drumul judeţean;", true);
        answer8.put("vehiculelor care circulă pe drumul comunal sau local;", false);
        answer8.put("vehiculelor care vin din dreapta;", false);
        answer8.put("vehiculelor care vin din stânga", false);
        questions.put("La intersecţia nedirijată dintre un drum judeţean şi unul comunal sau local, prioritatea de trecere se acordă:", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("să oprească imediat;", true);
        answer9.put("să reducă viteza;", false);
        answer9.put("să continue deplasarea;", false);
        answer9.put("să staționeze", false);
        questions.put("La semnalul poliţistului având braţul stâng întins orizontal, orientat cu faţa către motocicleta care se apropie, conducătorul acesteia trebuie:", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("să înmâneze documentele prevăzute de lege;", true);
        answer10.put("să prezinte documentele personale;", false);
        answer10.put("să prezinte certificatul de înmatriculare şi cartea de identitate a motocicletei;", false);
        answer10.put("nu are nicio obligație", false);
        questions.put("Ce obligaţii are conducătorul unei motociclete atunci când un poliţist îi solicită documentele pentru control?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("îndrumătorii de circulaţie ai Ministerului Apărării;", true);
        answer11.put("un conducător auto rămas în pană;", false);
        answer11.put("poliţiştii comunitari;", false);
        answer11.put("poliţiştii locali", false);
        questions.put("Aveţi obligaţia de a opri imediat motocicleta la semnalele adresate de:", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("interzice intrarea în intersecţie, dacă motocicleta poate fi oprită în condiţii de siguranţă;", true);
        answer12.put("permite schimbarea direcţiei de mers către dreapta;", false);
        answer12.put("permite intrarea în intersecţie, dacă urmează după lumina verde;", false);
        answer12.put("obligă oprirea motocicletei", false);
        questions.put("Semnalul galben al semaforului:", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("prin nările victimei;", true);
        answer13.put("prin gura închisă a victimei;", false);
        answer13.put("în acest caz nu se mai face respiraţie artificială;", false);
        answer13.put("se așteaptă ambulanța;", false);
        questions.put("Când gura unui rănit rămâne încleştată, respiraţia artificială se poate face:", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("tuturor vehiculelor cu care vă intersectaţi;", true);
        answer14.put("doar vehiculelor care vin din partea dreaptă", false);
        answer14.put("pietonilor de pe sensul opus de circulaţie;", false);
        answer14.put("autovehiculelor;", false);
        questions.put("La ieşirea din zonele rezidenţiale sau pietonale, sunteţi obligat să acordaţi prioritate:", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("semnalele şi indicaţiile poliţistului;", true);
        answer15.put("semnalizarea temporară, care modifică regimul normal de desfăşurare a circulaţiei;", false);
        answer15.put("semnalele luminoase;", false);
        answer15.put("culoarea semaforului", false);
        questions.put("Care dintre tipurile de semnalizare de mai jos vor fi respectate cu prioritate?", answer15);

        HashMap<String, Boolean> answer16 = new HashMap<>();
        answer16.put("pe oricare direcţie, dacă printr-un mijloc de semnalizare nu se dispune altfel;", true);
        answer16.put("numai pe direcţia înainte;", false);
        answer16.put("pe oricare direcţie, dacă vehiculul se află pe banda din mijloc;", false);
        answer16.put("numai la dreapta", false);
        questions.put("Semnalul verde al semaforului permite deplasarea:", answer16);

        HashMap<String, Boolean> answer17 = new HashMap<>();
        answer17.put("traversează prin locuri semnalizate cu indicatoare sau marcaje pentru trecerea pietonilor;", true);
        answer17.put("traversează pe la colţul intersecţiei;", false);
        answer17.put("traversează în grup;", false);
        answer17.put("traversează pe partea dreaptă a intersecţiei", false);
        questions.put("Motociclistul este obligat să acorde prioritate pietonilor care:", answer17);

        HashMap<String, Boolean> answer18 = new HashMap<>();
        answer18.put("nu;", true);
        answer18.put("da, pentru oprire în caz de urgenţă;", false);
        answer18.put("da, pentru întoarcere, în zona intersecţiilor;", false);
        answer18.put("da, în cazul în care nu este niciun autovehicul pe sensul opus ; ", false);
        questions.put("Este permisă pătrunderea pe racordurile dintre cele două părţi carosabile ale unei autostrăzi?", answer18);

        HashMap<String, Boolean> answer19 = new HashMap<>();
        answer19.put("pe banda din dreapta, de la cel puţin 50 m;", true);
        answer19.put("pe banda de lângă axul drumului, de la cel puţin 100 m;", false);
        answer19.put("pe oricare bandă, de la cel puţin 50 m;", false);
        answer19.put("pe oricare bandă, de la cel puţin 100 m;", false);
        questions.put("Pe care dintre benzi trebuie să se încadreze motociclistul şi de la ce distanţă faţă de intersecţie, pentru a schimba direcţia de mers spre dreapta, într-o localitate?", answer19);

        HashMap<String, Boolean> answer20 = new HashMap<>();
        answer20.put("atunci când semafoarele nu funcţionează ;", true);
        answer20.put("atunci când traficul este redus;", false);
        answer20.put("atunci când indicatoarele sunt instalate împreună cu semaforul pe acelaşi suport;", false);
        answer20.put("în orice caz;", false);
        questions.put("Semnificaţia indicatoarelor „Oprire” şi „Cedează trecerea”, instalate în intersecţiile semaforizate, trebuie respectată:", answer20);

        HashMap<String, Boolean> answer21 = new HashMap<>();
        answer21.put("Dickens", true);
        answer21.put("George Eliot", false);
        answer21.put("Hardy", false);
        answer21.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer21);

        HashMap<String, Boolean> answer22 = new HashMap<>();
        answer22.put("Dickens", true);
        answer22.put("George Eliot", false);
        answer22.put("Hardy", false);
        answer22.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer22);

        HashMap<String, Boolean> answer23 = new HashMap<>();
        answer23.put("Dickens", true);
        answer23.put("George Eliot", false);
        answer23.put("Hardy", false);
        answer23.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer23);

        HashMap<String, Boolean> answer24 = new HashMap<>();
        answer24.put("Dickens", true);
        answer24.put("George Eliot", false);
        answer24.put("Hardy", false);
        answer24.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer24);

        HashMap<String, Boolean> answer25 = new HashMap<>();
        answer25.put("Dickens", true);
        answer25.put("George Eliot", false);
        answer25.put("Hardy", false);
        answer25.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer25);

        HashMap<String, Boolean> answer26 = new HashMap<>();
        answer26.put("Dickens", true);
        answer26.put("George Eliot", false);
        answer26.put("Hardy", false);
        answer26.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer26);

        HashMap<String, Boolean> answer27 = new HashMap<>();
        answer27.put("Dickens", true);
        answer27.put("George Eliot", false);
        answer27.put("Hardy", false);
        answer27.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer27);

        HashMap<String, Boolean> answer28 = new HashMap<>();
        answer28.put("Southey", true);
        answer28.put("Tennyson", false);
        answer28.put("Byron", false);
        answer28.put("Wordsworth", false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 2823?", answer28);

        HashMap<String, Boolean> answer29 = new HashMap<>();
        answer29.put("Wordsworth", true);
        answer29.put("Keats", false);
        answer29.put("Byron", false);
        answer29.put("Blake", false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?", answer29);

        HashMap<String, Boolean> answer30 = new HashMap<>();
        answer30.put("Dickens", true);
        answer30.put("George Eliot", false);
        answer30.put("Hardy", false);
        answer30.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer30);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getCatBQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("pe drumurile cu trafic redus;", false);
        answer1.put("pe orice drum;", false);
        answer1.put("pe drumurile cu sens unic, dacă rămâne liberă cel puţin o bandă de circulaţie;", true);
        answer1.put("pe niciun drum", false);
        questions.put("Pe ce drumuri sunt permise oprirea şi staţionarea vehiculelor şi pe partea stângă, în sensul de mers?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("să opriţi în spatele acestuia şi să vă reluaţi deplasarea numai după ce uşile tramvaiului au fost închise;", true);
        answer2.put("să opriţi în dreptul ultimei uşi;", false);
        answer2.put("să continue deplasarea; opriţi la o distanţă de 25 m de tramvai;", false);
        answer2.put("să vă continuaţi deplasarea;", false);
        questions.put("Cum trebuie să procedaţi când ajungeţi în spatele unui tramvai oprit într-o staţie fără refugiu pentru pietoni?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("transportaţi rănitul la medic, fără să faceţi nimic altceva;", false);
        answer3.put("acoperiţi rana şi opriţi sângerarea, apoi transportaţi rănitul la medic sau la spital;", true);
        answer3.put("opriţi sângerarea prin coaserea plăgii;", false);
        answer3.put("nu se intervine în acest caz", false);
        questions.put("Cum se acordă primul ajutor în cazul plăgilor tăiate?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("ambele vehicule", false);
        answer4.put("vehiculul uşor;", false);
        answer4.put("vehiculul greu;", false);
        answer4.put("oricare vehicul;", true);
        questions.put("La întâlnirea unui vehicul greu cu unul uşor, pe un drum public îngust, pentru a face posibilă trecerea va manevra cu spatele:", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("ajută conducătorii auto să se orienteze pe timp de noapte;", false);
        answer5.put("nu permite încălcarea lui de către conducătorii de vehicule;", true);
        answer5.put("permite depăşirea vehiculelor;", false);
        answer5.put("permite depășirea", false);
        questions.put("Ce semnificaţie are marcajul longitudinal aplicat sub forma unei linii continue pe axul drumurilor publice?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("vă prezentaţi de urgenţă la cea mai apropiată unitate de poliţie;", false);
        answer6.put("anunţaţi imediat poliţia, nu modificaţi sau ştergeţi urmele accidentului şi rămâneţi pe loc;", true);
        answer6.put("deoarece vinovăţia nu vă aparţine, puteţi continua drumul dacă accidentul nu este grav;", false);
        answer6.put("nu aveți nicio obligaţiie legală", false);
        questions.put("Aţi accidentat un pieton care traversa strada neregulamentar. Ce obligaţii legale vă revin?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("o poziţie care să permită o bună respiraţie;", true);
        answer7.put("o poziţie comodă pentru transport;", false);
        answer7.put("o poziţie cât mai comodă;", false);
        answer7.put("o poziţie normală", false);
        questions.put("Până la transportarea victimei la spital, poziţia de aşteptare poate fi:", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("astfel încât să vedeţi şi să fiţi văzut, fără a-i stânjeni pe ceilalţi participanţi la trafic;", true);
        answer8.put("să vedeţi cât mai bine în faţă, indiferent dacă sunt deranjaţi ceilalţi participanţi la trafic cu care vă întersectaţi;", false);
        answer8.put("să asiguraţi, cel puţin, funcţionarea farului din partea dreaptă", false);
        answer8.put("stânga", false);
        questions.put("Cum trebuie să aveţi reglat sistemul de lumini pentru circulaţia pe timp de noapte?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("reduceţi viteza şi vă deplasaţi în spatele bicicletei, până când drumul vă oferă condiţii bune de vizibilitate pentru depăşire;", true);
        answer9.put("claxonaţi pentru a atrage atenţia biciclistului că îl depăşiţi;", false);
        answer9.put("vă continuaţi deplasarea, deoarece în această situaţie bicicletele pot fi depăşite;", false);
        answer9.put("opriți", false);
        questions.put("Cum veţi proceda într-o curbă lipsită de vizibilitate, dacă în faţa dvs. circulă o bicicletă?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("să măriţi viteza de deplasare a autovehiculului;", true);
        answer10.put("să ocoliţi obstacolul creat în carosabil, circulând în sens giratoriu;", false);
        answer10.put("să ocoliţi obstacolul indicat de acesta;", false);
        answer10.put("să opriți", false);
        questions.put("La semnalul dat de personalul autorizat din zona lucrărilor pe drumurile publice, prin rotirea vioaie a braţului, aveţi obligaţia:", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("să acorde prioritate de trecere ambulanţei;", true);
        answer11.put("să respecte semnificaţia culorii semaforului;", false);
        answer11.put("să reducă viteza şi să-şi continue drumul cu atenţie;", false);
        answer11.put("să oprească", false);
        questions.put("Într-o intersecţie, prezenţa unei ambulanţe ce se deplasează la o intervenţie obligă pe ceilalţi conducători:", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("apă oxigenata sau iod;", true);
        answer12.put("ser fiziologic;", false);
        answer12.put("apă potabilă;", false);
        answer12.put("spirt medicinal", false);
        questions.put("Dezinfecția plăgilor ce necesită a fi pansate se face cu:", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("cresterea consumului de combustibil;", true);
        answer13.put("reducerea consumului de combustibil;", false);
        answer13.put("scaderea puternica a gradului de confort;", false);
        answer13.put("nu are niciun efect", false);
        questions.put("Utilizarea sistemului de climatizare are ca efect:", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("pe banda de urgenta;", true);
        answer14.put("între banda din stânga si banda din mijloc;", false);
        answer14.put("între banda din dreapta si banda din mijloc;", false);
        answer14.put("pe banda din dreapta\n", false);
        questions.put("Pe o autostrada cu trei benzi, s-a blocat circulatia. Pe unde vor circula vehiculele de interventie?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("sa provocati in mers socuri autovehiculului.", true);
        answer15.put("sa efectuati mersul inapoi", false);
        answer15.put("sa depasiti alte autovehicule;", false);
        answer15.put("sa intoarceti", false);
        questions.put("Atunci cand transportati marfuri sau produse periculoase va este interzis:", answer15);

        HashMap<String, Boolean> answer16 = new HashMap<>();
        answer16.put("să acordaţi prioritate de trecere pietonilor aflaţi în traversare;", true);
        answer16.put("să reduceţi viteza şi să vă strecuraţi printre pietoni;\n", false);
        answer16.put("să acordaţi prioritate de trecere şi pietonilor care circulă pe celălalt sens de mers;", false);
        answer16.put("nicio variantă nu este corectă", false);
        questions.put("Ce obligaţii aveţi la trecerea pentru pietoni, pe sensul dvs. de mers?", answer16);

        HashMap<String, Boolean> answer17 = new HashMap<>();
        answer17.put("da, dacă linia discontinuă este cea mai apropiată de vehicul în direcţia de mers;", true);
        answer17.put("da, dacă marcajul nu este într-o curbă;", false);
        answer17.put("nu, chiar în cazul în care linia discontinuă este cea mai apropiată de vehicul;", false);
        answer17.put("nicio variantă nu este corectă", false);
        questions.put("Este permisă trecerea peste marcajul longitudinal format dintr-o linie continuă şi alta discontinuă?", answer17);

        HashMap<String, Boolean> answer18 = new HashMap<>();
        answer18.put("cu o viteză care să permită oprirea, pentru a acorda prioritate de trecere participanţilor la trafic care au acest drept;", true);
        answer18.put("limita maximă de viteză va fi respectată doar în cazul intersecţiilor dirijate;", false);
        answer18.put("limita maximă de viteză în localităţi va fi de 50 km/h, iar în afara localităţilor de 130 km/h;", false);
        answer18.put("nicio variantă nu este corectă", false);
        questions.put("Cu ce viteză se poate circula în apropierea unei intersecţii?", answer18);

        HashMap<String, Boolean> answer19 = new HashMap<>();
        answer19.put("nu acţionaţi frâna şi rotiţi volanul în sens invers derapării;", true);
        answer19.put("frânaţi la maximum;", false);
        answer19.put("opriţi motorul;", false);
        answer19.put("acceleraţi", false);
        questions.put("La frânare, vehiculul derapează. Cum reacţionaţi corect?", answer19);

        HashMap<String, Boolean> answer20 = new HashMap<>();
        answer20.put("în locul cu vizibilitate maximă, fără a depăşi indicatorul;", true);
        answer20.put("cât mai aproape de calea ferată, dar nu mai puţin de 5 m de aceasta;", false);
        answer20.put("la cel mult 5 m de calea ferată;", false);
        answer20.put("la cel mult 2 m de calea ferată;", false);
        questions.put("La întâlnirea indicatorului de avertizare în cruce, amplasat la trecerile la nivel cu calea ferată fără bariere, conducătorii de vehicule vor opri:", answer20);

        HashMap<String, Boolean> answer21 = new HashMap<>();
        answer21.put("rândul din stânga;", false);
        answer21.put("rândul din dreapta;", false);
        answer21.put("oricare dintre rânduri;", true);
        answer21.put("toate raspunsurile sunt corecte;", false);
        questions.put("La intersecţiile fără marcaje, conducătorii auto care vor să circule pe direcţia înainte vor ocupa:", answer21);

        HashMap<String, Boolean> answer22 = new HashMap<>();
        answer22.put("să respecte semnificaţia semnalului verde;", true);
        answer22.put("să respecte semnificaţia indicatorului;", false);
        answer22.put("să respecte semnificaţia semnalului verde, acordând prioritate de trecere vehiculelor care circulă pe drumul prioritar;", false);
        answer22.put("toate raspunsurile sunt corecte;", false);
        questions.put("Dacă într-o intersecţie conducătorul de vehicul întâlneşte semnalul verde al semaforului, precum şi indicatorul „Cedează trecerea”, el este obligat:", answer22);

        HashMap<String, Boolean> answer23 = new HashMap<>();
        answer23.put("să reducă viteza, fără a depăşi linia continuă pentru oprire;", false);
        answer23.put("să oprească autovehiculul în locul unde vizibilitatea este maximă, fără a depăşi indicatorul de prioritate în cruce;", false);
        answer23.put("să reducă viteza autovehiculului şi să traverseze cu atenţie, asigurându-se că din partea stângă sau din partea dreaptă nu se apropie un vehicul feroviar;", true);
        answer23.put("toate raspunsurile sunt corecte;", false);
        questions.put("Cum trebuie să procedeze conducătorul unui autovehicul la trecerea la nivel cu calea ferată, atunci când barierele sunt ridicate?", answer23);

        HashMap<String, Boolean> answer24 = new HashMap<>();
        answer24.put("numărul de înmatriculare sau de înregistrare este fals;", true);
        answer24.put("starea tehnică a pneurilor este necorespunzătoare;", false);
        answer24.put("conducătorul auto refuză să poarte centura de siguranţă;", false);
        answer24.put("toate raspunsurile sunt corecte;", false);
        questions.put("Un vehicul va fi imobilizat dacă:", answer24);

        HashMap<String, Boolean> answer25 = new HashMap<>();
        answer25.put("să fie cât mai concentrat, să ţină volanul strâns şi privirea îndreptată numai înainte şi să stea cât mai aproape de parbriz;", false);
        answer25.put("să stea cât mai confortabil pe scaun, cu capul rezemat de tetieră şi cu ambele mâini pe volan, în zona orelor 10:00-14:00;", true);
        answer25.put("cea mai corectă poziţie în timpul conducerii auto este aceea care previne apariţia somnului;", false);
        answer25.put("toate raspunsurile sunt corecte;", false);
        questions.put("Care este poziţia corectă a conducătorului auto în timpul conducerii?", answer25);

        HashMap<String, Boolean> answer26 = new HashMap<>();
        answer26.put("niciuna, indicatorul fiind de informare;", false);
        answer26.put("niciuna, întrucât indicatorul nu vi se adresează;", false);
        answer26.put("permite trecerea numai în direcţia indicată, oricare ar fi în acel moment semnalul în funcţiune al semaforului;", true);
        answer26.put("toate raspunsurile sunt corecte;", false);
        questions.put("Când semaforul este însoţit de lumina intermitentă de culoare verde, sub forma unei săgeţi pe fond negru către dreapta, aveţi următoarea obligaţie:", answer26);

        HashMap<String, Boolean> answer27 = new HashMap<>();
        answer27.put("autovehiculelor;", false);
        answer27.put("pietonilor de pe sensul opus de circulaţie;", false);
        answer27.put("tuturor vehiculelor cu care vă intersectaţi;", true);
        answer27.put("toate raspunsurile sunt corecte;", false);
        questions.put("La ieşirea din zonele rezidenţiale sau pietonale, sunteţi obligat să acordaţi prioritate:", answer27);

        HashMap<String, Boolean> answer28 = new HashMap<>();
        answer28.put("nu, în nicio situaţie;", false);
        answer28.put("da, dacă spaţiul lateral dintre vehicule permite acest lucru;", false);
        answer28.put("da, în cazul vehiculelor care urmează să vireze la stânga, iar spaţiul rămas permite depăşirea prin dreapta;", true);
        answer28.put("toate raspunsurile sunt gresite;", false);
        questions.put("Pot fi depăşite autovehiculele pe partea dreaptă?", answer28);

        HashMap<String, Boolean> answer29 = new HashMap<>();
        answer29.put("extragerea corpilor străini din plăgi;", false);
        answer29.put("spălarea corpilor străini cu apă curată;", false);
        answer29.put("corpii străini nu se extrag din plăgi, întrucât se pot produce complicaţii;", true);
        answer29.put("toate raspunsurile sunt gresite;", false);
        questions.put("La un accidentat cu corpi străini în interiorul plăgilor, procedura corectă este:", answer29);

        HashMap<String, Boolean> answer30 = new HashMap<>();
        answer30.put("prin alternarea stării de vigilenţă cu cea de relaxare la volan, îndeosebi pe sectoarele de drum în aliniament;", false);
        answer30.put("prin concentrarea permanentă doar asupra activităţilor pe care trebuie să le efectuaţi pentru conducerea autovehiculului în condiţii de siguranţă;", true);
        answer30.put("prin punerea în funcţiune a unor surse de muzică cu intensitate sonoră mare, pentru stimularea vigilenţei în conducere;", false);
        answer30.put("toate raspunsurile sunt corecte;", false);
        questions.put("Printre primele cauze ale accidentelor rutiere figurează şi neatenţia în conducere. Cum poate fi evitată aceasta?", answer30);


        return questions;
    }

    public static Map<String, Map<String, Boolean>> getCatCQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("ca funcţia respiratorie şi funcţia circulatorie să fie asigurate;", true);
        answer1.put("ca punctul sanitar către care vă îndreptaţi să nu fie la o distanţă mai mare de 50 km;", false);
        answer1.put("ca autovehiculul cu care va fi transportată victima să asigure confortul necesar;", false);
        answer1.put("nu aveti nicio obligatie", false);
        questions.put("Ce trebuie să aveţi în vedere înaintea transportării unei victime la spital?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("manevrarea volanului autoturismului tractat solicită un efort fizic mai mare, de aceea veţi efectua tractarea cu atenţie;", true);
        answer2.put("nu aveţi voie să-l remorcaţi în această situaţie;", false);
        answer2.put("blocaţi direcţia;", false);
        answer2.put("nicio varianta nu e corecta", false);
        questions.put("Intenţionaţi să remorcaţi un autoturism cu servodirecţie rămas în pană de motor. Ce trebuie să aveţi în vedere?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("pe partea laterală a epiglotei (Mărul lui Adam), în scobitura dintre trahee şi muşchii gâtului;", true);
        answer3.put("lângă ureche;", false);
        answer3.put("sub mandibulă;", false);
        answer3.put("la inceheitura mainii", false);
        questions.put("În cazul unui accidentat care nu respiră, pulsul este verificat:", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("cu atenţie, menţinându-se în acelaşi plan capul, gâtul şi toracele;", true);
        answer4.put("de umeri şi de picioare de către două persoane;", false);
        answer4.put("mai întâi de cap, apoi de torace şi picioare;", false);
        answer4.put("de maini", false);
        questions.put("O persoană grav rănită, victima unui accident de circulaţie, va fi ridicată:", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("articulaţiile mecanismului de direcţie sunt negresate;", true);
        answer5.put("circumferinţa roţilor directoare este prea mică;", false);
        answer5.put("lubrifiantul articulaţiilor este prea fluid;", false);
        answer5.put("cureaua de distributie", false);
        questions.put("Care dintre următoarele cauze provoacă revenirea greoaie a roţilor directoare pe direcţia de mers înainte?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("bateria de acumulatori, generatorul de curent, conductori şi relee cu diferite roluri;", true);
        answer6.put("conductori electrici, conectori, întrerupătoare şi relee de comandă;", false);
        answer6.put("transformatorul, distribuitorul de tensiune şi consumatorii electrici;", false);
        answer6.put("motor, pistoane, bateria de acumulatori", false);
        questions.put("Instalaţia de alimentare cu energie electrică este alcătuită din:", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("prin aplicarea compreselor sterile şi a pansamentelor compresive;", true);
        answer7.put("prin aplicarea unui garou de cauciuc;", false);
        answer7.put("prin orice mijloace;", false);
        answer7.put("nicio varianta nu este corecta", false);
        questions.put("Cum se opresc hemoragiile la trunchi şi cap?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("da, atunci când conducătorii celorlalte vehicule ar fi obligaţi astfel să treacă peste marcajul respectiv;", true);
        answer8.put("nu;", false);
        answer8.put("legal, nu este prevăzut;", false);
        answer8.put("da, in orice caz", false);
        questions.put("Este interzisă staţionarea în dreptul marcajului longitudinal continuu, aplicat între sensurile de circulaţie?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("presiune prea joasă în roata stângă din faţă;", true);
        answer9.put("pneuri uzate;", false);
        answer9.put("presiune prea joasă în roata dreaptă din faţă;", false);
        answer9.put("presiune prea joasă în roata stângă din spate;", false);
        questions.put("În timpul mersului, remarcaţi că autovehiculul dvs. trage spre stânga. Care ar putea fi cauza?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("persoana nu trebuie mişcată până la sosirea ambulanţei;", true);
        answer10.put("orizontal, cu faţa în sus;", false);
        answer10.put("în poziţie şezândă;", false);
        answer10.put("în poziţie şezândă verticală", false);
        questions.put("Cum trebuie aşezată într-un mijloc de transport o persoană rănită, care prezintă leziuni ale coloanei vertebrale?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("să vă conformaţi semnificaţiei semnalelor acestora;", true);
        answer11.put("să reduceţi viteza, să vă asiguraţi, iar, dacă trenul nu este în mişcare, puteţi să continuaţi traversarea căii ferate cu atenţie;", false);
        answer11.put("nicio obligaţie, deoarece agenţii căilor ferate dirijează garniturile de tren;", false);
        answer11.put("să opriţi;", false);
        questions.put("Ce obligaţii aveţi la semnalele agenţilor căilor ferate, plasaţi la trecerea la nivel cu o cale ferată?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("cuprinzând osul fracturat şi cele două articulaţii, respectiv cea superioară şi inferioară;", true);
        answer12.put("cuprinzând osul fracturat şi articulaţia superioară;", false);
        answer12.put("în dreptul osului fracturat;", false);
        answer12.put("nicio varianta nu este corecta", false);
        questions.put("Imobilizarea unui braţ fracturat se face:", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("50 km/h;", true);
        answer13.put("40 km/h;", false);
        answer13.put("60 km/h;", false);
        answer13.put("30 km/h;", false);
        questions.put("Autovehiculele din categoria C pot circula în localităţi cu o viteză maximă de:", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("21 de ani;", true);
        answer14.put("18 de ani;", false);
        answer14.put("24 de ani;", false);
        answer14.put("25 de ani;", false);
        questions.put("Care este varsta minima pentru obtinerea permisului de conducere pentru categoriile C si CE?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("nu;", true);
        answer15.put("da, fara nicio restrictie;", false);
        answer15.put("da, cu aprobarea politiei rutiere.", false);
        answer15.put("da, doar daca aveti un indicator care va indica acest lucru", false);
        questions.put("Ai posibilitatea de a efectua transportul de marfuri cu autovehicule si remorci care circula in baza autorizatiei pentru probe?", answer15);

        HashMap<String, Boolean> answer16 = new HashMap<>();
        answer16.put("anual;", true);
        answer16.put("din 2 in 2 ani;", false);
        answer16.put("din 3 in 3 ani;", false);
        answer16.put("o data la 6 luni.", false);
        questions.put("Care este frecventa inspectiilor tehnice periodice, pentru autocamioanele cu o masa totala maxima autorizata mai mare de 3500 kg?", answer16);

        HashMap<String, Boolean> answer17 = new HashMap<>();
        answer17.put("simetric in raport cu axa longitudinala a autocamionului;", true);
        answer17.put("in partea din spate a cabinei conducatorului auto;", false);
        answer17.put("simetric in raport cu axa transversala a autocamionului;", false);
        answer17.put("nu este permis;", false);
        questions.put("Cum trebuie sa fie asezata o incarcatura compusa din marfuri de acelasi fel?", answer17);

        HashMap<String, Boolean> answer18 = new HashMap<>();
        answer18.put("50 km/h;", true);
        answer18.put("40 km/h;", false);
        answer18.put("60 km/h;", false);
        answer18.put("30 km/h;", false);
        questions.put("Autovehiculele din categoria C pot circula în localităţi cu o viteză maximă de:", answer18);

        HashMap<String, Boolean> answer19 = new HashMap<>();
        answer19.put("chingilor, lanturilor, calelor si a cablurilor;", true);
        answer19.put("paletilor;", false);
        answer19.put("rolcontainerelor;", false);
        answer19.put("nu se poate realiza;", false);
        questions.put("Limitarea deplasarilor marfurilor care pot determina instabilitatea autocamionului se poate realiza prin folosirea:", answer19);

        HashMap<String, Boolean> answer20 = new HashMap<>();
        answer20.put("pe banda de urgenta;", true);
        answer20.put("între banda din stânga si banda din mijloc;", false);
        answer20.put("între banda din dreapta si banda din mijloc;", false);
        answer20.put("pe banda din dreapta", false);
        questions.put("Pe o autostrada cu trei benzi, s-a blocat circulatia. Pe unde vor circula vehiculele de interventie?", answer20);

        HashMap<String, Boolean> answer21 = new HashMap<>();
        answer21.put("Dickens", true);
        answer21.put("George Eliot", false);
        answer21.put("Hardy", false);
        answer21.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer21);

        HashMap<String, Boolean> answer22 = new HashMap<>();
        answer22.put("Dickens", true);
        answer22.put("George Eliot", false);
        answer22.put("Hardy", false);
        answer22.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer22);

        HashMap<String, Boolean> answer23 = new HashMap<>();
        answer23.put("Dickens", true);
        answer23.put("George Eliot", false);
        answer23.put("Hardy", false);
        answer23.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer23);

        HashMap<String, Boolean> answer24 = new HashMap<>();
        answer24.put("Dickens", true);
        answer24.put("George Eliot", false);
        answer24.put("Hardy", false);
        answer24.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer24);

        HashMap<String, Boolean> answer25 = new HashMap<>();
        answer25.put("Dickens", true);
        answer25.put("George Eliot", false);
        answer25.put("Hardy", false);
        answer25.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer25);

        HashMap<String, Boolean> answer26 = new HashMap<>();
        answer26.put("Dickens", true);
        answer26.put("George Eliot", false);
        answer26.put("Hardy", false);
        answer26.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer26);

        HashMap<String, Boolean> answer27 = new HashMap<>();
        answer27.put("Dickens", true);
        answer27.put("George Eliot", false);
        answer27.put("Hardy", false);
        answer27.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer27);

        HashMap<String, Boolean> answer28 = new HashMap<>();
        answer28.put("Southey", true);
        answer28.put("Tennyson", false);
        answer28.put("Byron", false);
        answer28.put("Wordsworth", false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 2823?", answer28);

        HashMap<String, Boolean> answer29 = new HashMap<>();
        answer29.put("Wordsworth", true);
        answer29.put("Keats", false);
        answer29.put("Byron", false);
        answer29.put("Blake", false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?", answer29);

        HashMap<String, Boolean> answer30 = new HashMap<>();
        answer30.put("Dickens", true);
        answer30.put("George Eliot", false);
        answer30.put("Hardy", false);
        answer30.put("None of the above", false);
        questions.put("Moral choice is everything in the works of:", answer30);


        return questions;
    }

    public static Map<String, Map<String, Boolean>> getCatDQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("defectarea pompei de înaltă presiune;", true);
        answer1.put("jocul mare din articulaţii;", false);
        answer1.put("presiunea mare în pneurile roţilor directoare;", false);
        answer1.put("presiunea mică în pneuri", false);
        questions.put("Care dintre următoarele cauze provoacă manevrarea anevoioasă a volanului, în cazul unui sistem de direcţie cu servomecanism hidraulic?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("fiecare cilindru al motorului, în poarta supapei de admisie;", true);
        answer2.put("interiorul difuzorului carburatorului;", false);
        answer2.put("filtrul de benzină situat înaintea carburatorului;", false);
        answer2.put("rezervor", false);
        questions.put("Injecţia de benzină multipunct se realizează în:", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("dacă spaţiul permite, poate depăşi tramvaiele prin partea dreaptă;", true);
        answer3.put("să păstreze în mers cel puţin 10 m faţă de ultimul vagon al tramvaiului;", false);
        answer3.put("să atenţioneze conducătorul tramvaiului, prin semnale sonore, pentru ca acesta să reducă viteza;", false);
        answer3.put("să oprească", false);
        questions.put("Cum trebuie să procedeze conducătorul unui autobuz, atunci când se apropie de tramvaie aflate în mers?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("lumini de altă culoare şi intensitate decât cele omologate;", true);
        answer4.put("dispozitive de detectare a aparatelor radar;", false);
        answer4.put("lumini de poziţie;", false);
        answer4.put("dispozitive sonore", false);
        questions.put("Ce este interzis să se monteze la autovehicul?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("pătrunderea aerului în instalaţia hidraulică;", true);
        answer5.put("gresajul defectuos al articulaţiilor;", false);
        answer5.put("geometria roţilor dereglată;", false);
        answer5.put("Pericles, Prince of Tyre", false);
        questions.put("Care dintre cauzele enumerate mai jos provoacă la viraj şocuri în volanul unui sistem de direcţie cu servomecanism hidraulic?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("da, atunci când conducătorii celorlalte vehicule ar fi obligaţi astfel să treacă peste marcajul respectiv;", true);
        answer6.put("nu;", false);
        answer6.put("legal, nu este prevăzut;", false);
        answer6.put("nicio varianta nu este corecta", false);
        questions.put("Este interzisă staţionarea în dreptul marcajului longitudinal continuu, aplicat între sensurile de circulaţie?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("numai banda din partea dreaptă, în sensul de mers;", true);
        answer7.put("banda de lângă axul autostrăzii;", false);
        answer7.put("oricare bandă liberă;", false);
        answer7.put("banda din mijloc;", false);
        questions.put("Ce bandă de circulaţie trebuie să folosiţi, atunci când conduceţi un autobuz pe autostradă?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("21 ani împliniţi;", true);
        answer8.put("18 ani împliniţi;", false);
        answer8.put("25 ani împliniţi;", false);
        answer8.put("24 ani împliniţi;", false);
        questions.put("Conducătorii de tramvaie sau de vehicule, care efectuează transport public de persoane, trebuie să aibă vârsta minimă de:", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("depăşire;", true);
        answer9.put("ocolire;", false);
        answer9.put("situaţie de urgenţă;", false);
        answer9.put("oprire", false);
        questions.put("Manevra de evitare, prin schimbarea direcţiei de mers, a unui obstacol aflat pe sensul dvs. de circulaţie, urmată de revenirea pe acelaşi sens, constituie:", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("100 km/h pe autostradă, 80 km/h pe drumurile expres sau naţionale europene şi 70 km/h pe celelalte categorii de drumuri;", true);
        answer10.put("80 km/h pe autostrăzi şi 70 km/h pe celelalte categorii de drumuri;", false);
        answer10.put("100 km/h atât pe autostrăzi, cât şi pe celelalte categorii de drumuri;", false);
        answer10.put("90 km/h pe autostrăzi şi 70 km/h pe celelalte categorii de drumuri;", false);
        questions.put("Precizaţi care este viteza maximă admisă în afara localităţilor, pentru un ansamblu de autovehicule format dintr-un autobuz şi o remorcă:", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("să reduceţi din timp viteza, evitând bruscarea comenzilor;", true);
        answer11.put("să folosiţi frâna de ajutor pentru a evita derapajul;", false);
        answer11.put("să circulaţi cât mai aproape de axul drumului, pentru a evita lovirea acostamentului;", false);
        answer11.put("toate variantele sunt corecte", false);
        questions.put("Ce măsuri se recomandă atunci când urmează să străbateţi o porţiune de drum public acoperită cu piatră cubică?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("reducerea consumului de combustibil, datorită vitezei constante;", true);
        answer12.put("creşterea consumului de combustibil, datorită unei viteze mai mici;", false);
        answer12.put("acest sistem nu are efecte asupra consumului de combustibil;", false);
        answer12.put("nicio varianta nu este corecta", false);
        questions.put("Utilizarea pe autostradă a limitatorului de viteză pentru autovehiculele dotate cu acest sistem are ca efect:", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("maximum 2 ore;", true);
        answer13.put("minim 2 ore;", false);
        answer13.put("maximum 24 de ore;", false);
        answer13.put("maximum 3 ore;", false);
        questions.put("Un garou, aplicat unei persoane rănite într-un accident de circulaţie, poate fi menţinut pentru a nu afecta ţesuturile:", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("blocării termostatului în poziţia „deschis”;", true);
        answer14.put("folosirii unui lichid antigel recomandat pentru temperaturi sub - 30 grade C;", false);
        answer14.put("blocării termostatului în poziţia „închis”;", false);
        answer14.put("frana de ajutor este ridicată", false);
        questions.put("Răcirea exagerată a motorului în timpul funcţionării se poate datora:", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("în rezervor;", true);
        answer15.put("în pompa de injecţie;", false);
        answer15.put("în pompa de alimentare;", false);
        answer15.put("în interiorul difuzorului carburatorului;", false);
        questions.put("Surplusul de motorină de la injectoare este refulat:", answer15);

        HashMap<String, Boolean> answer16 = new HashMap<>();
        answer16.put("apariţia unei spume de culoare gălbuie pe joja de nivel a uleiului;", true);
        answer16.put("funcţionarea neregulată a motorului;", false);
        answer16.put("diminuarea nivelului apei în radiator;", false);
        answer16.put("toate variantele sunt corecte", false);
        questions.put("Pătrunderea lichidului de răcire în baia de ulei a motorului este indicată de:", answer16);

        HashMap<String, Boolean> answer17 = new HashMap<>();
        answer17.put("în locurile unde s-ar împiedica observarea unui indicator sau a unui semnal luminos;", true);
        answer17.put("pe drumurile cu o lăţime mai mică de 6 m;", false);
        answer17.put("pe drumurile cu un singur sens de circulaţie;", false);
        answer17.put("pe drumurile judetene", false);
        questions.put("Oprirea voluntară a unui autobuz este interzisă:", answer17);

        HashMap<String, Boolean> answer18 = new HashMap<>();
        answer18.put("arborele cu came;", true);
        answer18.put("arborele cotit;", false);
        answer18.put("carburatorul;", false);
        answer18.put("planetara", false);
        questions.put("Care dintre următoarele piese fac parte din mecanismul de distribuţie?", answer18);

        HashMap<String, Boolean> answer19 = new HashMap<>();
        answer19.put("80 km/h;", true);
        answer19.put("90 km/h;", false);
        answer19.put("100 km/h;", false);
        answer19.put("70 km/h;", false);
        questions.put("Viteza maximă admisă pe drumurile naţionale, altele decât cele europene E, pentru autovehiculele din categoria D şi subcategoria D1, este de:", answer19);

        HashMap<String, Boolean> answer20 = new HashMap<>();
        answer20.put("colectorul de admisie;", true);
        answer20.put("interiorul camerei de nivel constant a carburatorului;", false);
        answer20.put("poarta supapelor de evacuare;", false);
        answer20.put("nicio varianta nu este corecta", false);
        questions.put("Injecţia de benzină monopunct se realizează în:", answer20);

        HashMap<String, Boolean> answer21 = new HashMap<>();
        answer21.put("să nu mărească viteza;", true);
        answer21.put("să pună în funcţiune luminile indicatoare de direcţie intermitente;", false);
        answer21.put("să se angajeze cât mai aproape de marginea din stanga al axul drumului;", false);
        answer21.put("sa opreasca", false);
        questions.put("Ce trebuie să facă conducătorul unui autobuz, atunci când sesizează că urmează să fie depăşit?", answer21);

        HashMap<String, Boolean> answer22 = new HashMap<>();
        answer22.put("la o distanţă mai mică de 25 m înainte şi după indicatorul staţiei pentru mijloacele de transport public de persoane;", true);
        answer22.put("pe partea carosabilă a drumurilor naţionale;", false);
        answer22.put("pe partea carosabilă a drumurilor judeţene;", false);
        answer22.put("la mai puţin de 50 m de cel mai apropiat colţ al intersecţiei;", false);
        questions.put("În care dintre situaţiile de mai jos este interzisă oprirea autobuzelor pe drumurile publice?", answer22);

        HashMap<String, Boolean> answer23 = new HashMap<>();
        answer23.put("la trecerea la nivel cu calea ferată;", true);
        answer23.put("când este depăşit de un alt autovehicul;", false);
        answer23.put("pe poduri", false);
        answer23.put("pe sectoarele de drum îngustat;", false);
        questions.put("În care dintre următoarele situaţii conducătorul unui autobuz are obligaţia de a reduce viteza?", answer23);

        HashMap<String, Boolean> answer24 = new HashMap<>();
        answer24.put("supapele de admisie defecte;", true);
        answer24.put("garnitura de chiulasă ruptă între doi cilindri;", false);
        answer24.put("supapele de evacuare defecte;", false);
        answer24.put("joja de ulei", false);
        questions.put("Exploziile cadenţate în carburator sunt cauzate de:", answer24);

        HashMap<String, Boolean> answer25 = new HashMap<>();
        answer25.put("90 km/h;", true);
        answer25.put("70 km/h;", false);
        answer25.put("80 km/h;", false);
        answer25.put("100 km/h;", false);
        questions.put("Care este limita maximă de viteză în afara localităţilor, pentru categoria D şi subcategoria D1, pe drumurile naţionale europene E?", answer25);

        HashMap<String, Boolean> answer26 = new HashMap<>();
        answer26.put("raportul dintre volumul cilindrului şi volumul camerei de ardere;", true);
        answer26.put("raportul dintre volumul camerei de ardere şi volumul cilindrului;", false);
        answer26.put("raportul dintre volumul tuturor cilindrilor şi volumul pistoanelor;", false);
        answer26.put("raportul dintre volumul camerei de ardere şi volumul pistoanelor;", false);
        questions.put("Prin „raport de compresie” se înţelege:", answer26);

        HashMap<String, Boolean> answer27 = new HashMap<>();
        answer27.put("pe marginea exterioară;", true);
        answer27.put("pe marginea interioară;", false);
        answer27.put("pe toată lăţimea;", false);
        answer27.put("pe mijloc", false);
        questions.put("Unghiul de cădere prea mare la o roată duce la uzura uniformă a pneurilor:", answer27);

        HashMap<String, Boolean> answer28 = new HashMap<>();
        answer28.put("da, dacă se aprind luminile de poziţie sau de staţionare;", true);
        answer28.put("nu, întrucât în toate cazurile se interzice pe timpul nopţii staţionarea pe partea carosabilă;", false);
        answer28.put("da, dacă în afara luminilor de poziţie, prezenţa autobuzului este semnalizată şi cu ajutorul triunghiurilor reflectorizante;", false);
        answer28.put("da, in orice caz", false);
        questions.put("Este permisă staţionarea autobuzelor pe timpul nopţii pe partea carosabilă a unui drum comunal neiluminat??", answer28);

        HashMap<String, Boolean> answer29 = new HashMap<>();
        answer29.put("să nu se agraveze leziunile;", true);
        answer29.put("ca operaţiunea să se desfăşoare rapid şi fără să provoace alte traumatisme;", false);
        answer29.put("să nu se îndepărteze indiciile care ar putea ajuta la explicarea modului în care s-a produs accidentul;", false);
        answer29.put("nicio varianta nu este corecta", false);
        questions.put("Ce trebuie să aveţi în vedere la scoaterea persoanelor accidentate din autovehicul?Ce trebuie să aveţi în vedere la scoaterea persoanelor accidentate din autovehicul?", answer29);

        HashMap<String, Boolean> answer30 = new HashMap<>();
        answer30.put("galeria de admisie;", true);
        answer30.put("galeria de evacuare;", false);
        answer30.put("toba de eşapament;", false);
        answer30.put("motor", false);
        questions.put("Amestecul carburant foarte sărac provoacă rateuri în:", answer30);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getRandomQuestions(Context context, String subject, long SIZE) {
        Map<String, Map<String, Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.cata))) {
            originalQuestion = getCatAQuestions();
        } else if (subject.equals(context.getString(R.string.catb))) {
            originalQuestion = getCatBQuestions();
        } else if (subject.equals(context.getString(R.string.catc))) {
            originalQuestion = getCatCQuestions();
        } else {
            originalQuestion = getCatDQuestions();
        }
        int originalSize = originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<>(originalQuestion.keySet());

        while (questionsMap.size() <= SIZE) {
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)) {
                questionsMap.put(question, originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
