import com.sun.nio.sctp.PeerAddressChangeNotification;
import javax.crypto.spec.PSource;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static String ism;
    public static int age;
    private static int jon = 10;
    private static int dengi = 1;
    private static int dengii = 20;
    private static List<String> Hamyon = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(TEXT_RED + "!!!Gta olamiga hush kelib siz!!!");
        System.out.println(TEXT_YELLOW + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@/                          #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@                               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@          @@@@@@@@@@@#            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@           @@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@,         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@           @@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@             Rock⭐Star         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@                               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@          @@@@@@@@@@@@          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@          @@@@@@@@@@@@@          @@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@          @@@@@@@@@@@@@@         .@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@&          @@@@@@@@@@@@@@         (@@@@@  &@  @@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@          @@@@@@@@@@@@@@*         *@@@@  @@@  @@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@(          @@@@@@@@@@@@@@@          @@  #@@@@( @@@@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%           @@@@@@@            @@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  #@@@@@@@@@@@@@@@@@@   /@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  @@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@, #@@@@@& &@@@@@. @@@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@*   @@&  .@@@  @@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  .@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@\n" + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        int kirish = getInt(TEXT_GREEN, "1.Kirish🚪\n2.Ro'yxatdan otish📝");
        if (kirish < 3) {
            switch (kirish) {
                case 1:
                    kirish();
                    break;
                case 2:
                    royxatdan_otish();
                    break;
            }

        } else {
            System.out.println("Xato son kiritildi❌");
        }

    }


    public static void kirish() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bizda hozircha shu versiya");

        int kirish1 = getInt(TEXT_GREEN, "1.San anderas\n2.Gta 5");
        if (kirish1 < 5) {
            switch (kirish1) {
                case 1:
                    sananderas();
                    break;
                case 2:
                    gta5();
                    break;
            }

        } else {
            System.out.println("Xato son kiritildi❌");
            sananderas();
        }

    }

    private static void gta5() {
        Scanner in = new Scanner(System.in);
        System.out.println(Prodokt.gta5);
        System.out.println("Xozir bu serverda gta 5 ishga tushgani yo'q❌");
        System.out.println(TEXT_GREEN + "😊😮‍💨Lekn Tushkunlika Tushmang Siz Gta haqida ma'lumotlar olib keyishingiz Mumkin😁😮‍💨");
        System.out.println("Boshlaymizmi?\n1.Ha\n2.Keyinroq");
        int e = getInt(TEXT_YELLOW, "Boshlaymizmi?\n1.Ha\n2.Keyinroq");
        if (e == 1) {
            kettu();
        } else {
            System.out.println("Hato son kirittingizku😥");
            gta5();
        }


    }

    private static void kettu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Endi GTA 5 ,PS5 va Xbox Series X|S uchun mavjud");


        int oq = getInt(TEXT_YELLOW, "Ko'ngilochar blokbasterlar, Grand Theft Auto V va GTA Online bilan tanishing✅⬇️--1--");
        if (oq == 1) {
            System.out.println("Welcome to Los Santos");
            System.out.println("Yosh ko'cha ovchisi, nafaqadagi bank qaroqchisi va qo'rqinchli psixopat jinoyat olami,\nAQSh hukumati va ko'ngilochar sanoatining eng qo'rqinchli va aqldan ozgan elementlari bilan aralashib qolganda, \nular bir qator xavfli o'g'irliklarni bartaraf etishlari kerak. \nhech kimga ishonmaydigan shafqatsiz shaharda omon qolish uchun - eng kamida bir-biriga.");
            System.out.println("Mavjud o'yinchilar GTAV Story Mode va GTA Online belgilar va progressiyani bir martalik migratsiya bilan PlayStation 5 va Xbox Series X|S ga o'tkazishlari mumkin.");
            int n = in.nextInt();
            System.out.println(TEXT_RED + "Exclusive New Content" + TEXT_RED);
            System.out.println(TEXT_GREEN + "Los Santos avtomobil yig'ilishida Haoning maxsus ishlariga kiring, unda elita yangi yangilanishlar va eksklyuziv modifikatsiyalar mavjud. Keyin ushbu yuqori samarali transport vositalarini HSW poygalariga, yangi vaqt sinovlariga va boshqalarga olib boring.");
            int keyingi = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
            System.out.println(TEXT_RED + "New Career Builder");
            System.out.println(TEXT_GREEN + "GTA Online-ni savdo vositalari bilan boshlang. \nTo'rtta biznesdan birini - Biker, Executive, Tungi klub egasi yoki Gunrunner - tezda tanlang va korxonangizni ishga tushirish uchun mulklar, \navtomashinalar va qurollardan tanlang.");
            int keyingi1 = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
            System.out.println(TEXT_RED + "Yangi menyu dizayni");
            System.out.println(TEXT_GREEN + "GTA Online taklif qiladigan barcha narsalarga, \njumladan, eng so'nggi va eng mashhur yangilanishlarga darhol asosiy menyudan kiring.");
            int keyingi2 = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
            System.out.println(TEXT_RED + "Ajoyib Vizuallar");
            System.out.println(TEXT_GREEN + "4K gacha ruxsat, soniyasiga 60 kadr, \nHDR opsiyalari, nurlarni kuzatish, yaxshilangan tekstura sifati va boshqalarni o‘z ichiga olgan yangi grafik rejimlari bilan yaxshilangan aniqlik va unumdorlik darajalari.");
            int keyingi3 = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
            System.out.println(TEXT_RED + "Tezroq yuklash");
            System.out.println(TEXT_GREEN + "Los-Santos va Bleyn okrugi dunyosi har qachongidan ham tezroq yuklanganligi sababli harakatga tezroq kirish.");
            int keyingi4 = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
            System.out.println(TEXT_RED + "Immersiv boshqaruvlar");
            System.out.println(TEXT_GREEN + "Haptic Feedback va PlayStation 5 DualSense simsiz kontrolleridagi Adaptiv Triggerlar orqali dinamik qarshilik bilan yangi darajadagi sezgirlikni his eting, \nob-havo effektlari, qo'pol yo'l sirtlari va boshqa ko'p narsalar.");
            int keyingi5 = getInt(TEXT_RESET, "Keyingiga o'tidh uchun hohlagan raqamni bosing");
        }
        System.out.println(TEXT_GREEN + "TO'LIQ MALUMOT UCHUN--->" + "https://www.rockstargames.com/gta-v");
        System.out.println("Agar malumotlar sizga yoqqan bo'lsa men siz uchun hursandman😊");
        sananderas();
    }


    private static void sananderas() {
        System.out.println(TEXT_BLUE + "Salom SI-JEY" + TEXT_BLUE);
        System.out.println(TEXT_WHITE + "Men Big-smout:men seni missiyalaring bilan tanishtirib chiqaman");
        int missiya = getInt(TEXT_YELLOW, "1.Ballaslarga hujum qilish🔫\n2.Kichik missiyalar\n3.Market🏠\n4.Hamyon⭐\n5.Orqaga🔙");
        if (missiya <= 5) {


        } else {
            System.out.println("Notori raqam");
            sananderas();
        }
        switch (missiya) {
            case 1:
                ballas();
                break;
            case 2:
                kichikmissiyalar();
                break;
            case 3:
                missiyalar();
                break;
            case 4:
                hamyon();
                break;
            case 5:
                kirish();
                break;
        }

    }

    private static void hamyon() {
        for (String s : Hamyon) {
            System.out.println(s);
        }

        System.out.println("Xozirda sizda shu mulk bor");
        System.out.println(dengi + "$ <-Hisobingizda dollar bor " + TEXT_RED + "Bu pullar avarge missollar uchun");
        System.out.println(dengii + "$ <-Hisobingizda dollar bor " + TEXT_RED + "Bu pullar hard misollar uchun");
        int ss = getInt(TEXT_CYAN, "1.Sananderas\n");
        if (ss == 1) {
            sananderas();
        }
    }


    private static void kichikmissiyalar() {
        System.out.println("KICHIK MISSIYALAR");
        int kichikmissiya = getInt(TEXT_BLUE, "1.Matimatik amallar bilan pul topish📝\n2.Dasturlash usuli orqali pul topish💻\n3.Orqaga.🔙");
        if (kichikmissiya < 3) {
            switch (kichikmissiya) {
                case 1:
                    matematikamalllar();
                    break;
                case 2:
                    dasturlash();
                    break;

            }
        } else {
            sananderas();
        }

    }


    private static void dasturlash() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sening boshlangich puling 20 $ boshlanadi");
        System.out.println("Bu yerda dasturlashdagi savollar bilan pul topish mumkin va to'gri javob uchun 100$");
        System.out.println("Keyingi misolga o'tish uchun 1");
        int keyingideeendi = in.nextInt();
        System.out.println("1.Dasturlash tili 2 katta guruhga bo'linadi.Ular qaysi");
        int d = getInt(TEXT_WHITE, "1.Back and va Front end\n2.Quyi va Yuqori\n3.Klaviyatura va code");
        if (d == 2) {
            System.out.println("To'g'ri javob✅.");
            System.out.println("Va sening puling " + (dengii + 100) + "$");
            keyingi1();
        } else {
            System.out.println("Xato javob❌");
            System.out.println("Va sening puling" + (dengii - 50) + "$");
            int keyingi1 = getInt(TEXT_BLUE, "1.Keyingi->\n2.Orqaga🔙");
            if (keyingi1 == 1) {
                keyingi1();
            } else {
                sananderas();
            }
        }

    }

    private static void keyingi1() {
        System.out.println("Kompyuter kodlarni qanday tushunadi ?");
        int keyingi2 = getInt(TEXT_WHITE, "1.Odamlardek\n2.Hariflarda\n3.nol birlardan ");
        if (keyingi2 == 3) {
            System.out.println("To'g'ri javob✅.");
            System.out.println("Va sening puling " + (dengii + 100) + "$");
            int keyingi1 = getInt(TEXT_BLUE, "1.Keyingi->\n2.Orqaga🔙");
            if (keyingi1 == 1) {
                keyingi2();
            } else {
                sananderas();
            }
        } else {
            System.out.println("Xato javob❌");
            System.out.println("Va sening puling" + (dengii - 50) + "$");
            int keyingi1 = getInt(TEXT_BLUE, "1.Keyingi->\n2.Orqaga🔙");
            if (keyingi1 == 1) {
                keyingi2();
            } else {
                sananderas();
            }
        }
    }

    private static void keyingi2() {
        System.out.println("int massivi qanday belgilarni oz ichiga qo'shadi ?");
        int keyingi2 = getInt(TEXT_WHITE, "1.Harflarni(a,b,c)\n2.Sonlarni (1,2,3)\n3.Belgilarni(#,$,@)");
        if (keyingi2 == 2) {
            System.out.println(TEXT_GREEN + "To'gri javob✅");
            System.out.println("Va sening puling " + (dengii + 100) + "$");
            int keyingi1 = getInt(TEXT_BLUE, "1.Keyingi->\n2.Orqaga🔙");
            if (keyingi1 == 1) {
                System.out.println("Bizda Xozircha shular");
                sananderas();
            }
        } else {
            System.out.println("Xato javob❌");
            System.out.println("Va sening puling" + (dengii - 50) + "$");
            int keyingi1 = getInt(TEXT_BLUE, "1.Keyingi->\n2.Orqaga🔙");
            if (keyingi1 == 1) {
                System.out.println("Bizda xozircha shular!\f");
            } else {
                sananderas();
            }
        }
        sananderas();


    }


    private static void matematikamalllar() {
        System.out.println();
        int matem = getInt(TEXT_YELLOW, "Matematik almmallni tanlang\n1 +\n2 -\n3 *\n4 /\n5 Orqaga🔙");
        if (matem < 6) {
            switch (matem) {
                case 1:
                    misolplus();
                    break;
                case 2:
                    misolminus();
                    break;
                case 3:
                    misolkopaytiru();
                    break;
                case 4:
                    misolbolu();
                    break;
                case 5:
                    sananderas();
                    break;
            }
        } else {
            System.out.println(TEXT_RED + "Xato son kiritildi❌");
            sananderas();
        }
    }


    private static void misolbolu() {
        System.out.println(TEXT_RED + "Buyerdagi misollar 'HARD' ");
        System.out.println(TEXT_RED + "Elsatma Sening hisobinda 1$ bor");
        System.out.println(TEXT_BLACK + "Notogri misol uchun 20$ ayiriladi");
        System.out.println(TEXT_RED + "Har bir togri misolga 50$ dan");
        for (; true; ) {
            Random a = new Random();
            int ran = a.nextInt(10, 20);
            int ran1 = a.nextInt(1, 5);
            int y = ran / ran1;
            System.out.println(ran + " / " + ran1 + " = " + " ? ");
            System.out.println("21 Orqaga⬅️");
            Scanner scan = new Scanner(System.in);
            int scaan = scan.nextInt();
            if (scaan == 21) {
                sananderas();
                return;
            }
            if (y == scaan) {
                dengi++;
                System.out.println(TEXT_GREEN + "To'g'ri✅\n" + "seni puling:" + dengi + "$" + TEXT_RESET);

            } else {
                dengi--;
                System.out.println(TEXT_RED + "Notogri yechim❌ " + "seni puling:" + dengi + "$" + TEXT_RESET);
            }
        }
    }

    private static void misolkopaytiru() {
        System.out.println(TEXT_RED + "Elsatma Sening hisobinda 1$ bor");
        System.out.println(TEXT_RED + "Har bir togri misolga 1$ dan");
        for (; true; ) {
            Random a = new Random();
            int ran = a.nextInt(0, 10);
            int ran1 = a.nextInt(0, 10);
            int y = ran * ran1;
            System.out.println(ran + " * " + ran1 + " = " + " ? ");
            System.out.println("21 Orqaga⬅️");
            Scanner scan = new Scanner(System.in);
            int scaan = scan.nextInt();
            if (scaan == 21) {
                sananderas();
                return;
            }
            if (y == scaan) {
                dengi++;
                System.out.println(TEXT_GREEN + "To'g'ri✅\n" + "seni puling:" + dengi + "$" + TEXT_RESET);

            } else {
                dengi--;
                System.out.println(TEXT_RED + "Notogri yechim❌ " + "seni puling:" + dengi + "$" + TEXT_RESET);
            }
        }
    }

    private static void misolminus() {
        System.out.println(TEXT_RED + "Elsatma Sening hisobinda 1$ bor");
        System.out.println(TEXT_RED + "Har bir togri misolga 1$ dan");
        for (; true; ) {
            Random a = new Random();
            int ran = a.nextInt(10, 20);
            int ran1 = a.nextInt(1, 10);
            int y = ran - ran1;
            System.out.println(ran + " - " + ran1 + " = " + " ? ");
            System.out.println("21 Orqaga⬅️");
            Scanner scan = new Scanner(System.in);
            int scaan = scan.nextInt();
            if (scaan == 21) {
                sananderas();
                return;
            }
            if (y == scaan) {
                dengi++;
                System.out.println(TEXT_GREEN + "To'g'ri✅\n" + "seni puling:" + dengi + "$" + TEXT_RESET);
                System.out.println(dengi);
            } else {
                dengi--;
                System.out.println(TEXT_RED + "Notogri yechim❌ " + "seni puling:" + dengi + "$" + TEXT_RESET);
            }
        }
    }

    private static void misolplus() {
        System.out.println(TEXT_RED + "Elsatma Sening hisobinda 1$ bor");
        System.out.println(TEXT_RED + "Har bir misolga 1$ dan");
        for (; true; ) {
            Random a = new Random();
            int ran = a.nextInt(0, 10);
            int ran1 = a.nextInt(0, 10);
            int y = ran + ran1;
            System.out.println(ran + " + " + ran1 + " = " + " ? ");
            System.out.println("21 Orqaga⬅️");
            Scanner scan = new Scanner(System.in);
            int scaan = scan.nextInt();
            if (scaan == 21) {
                sananderas();
                return;
            }
            if (y == scaan) {
                dengi++;
                System.out.println(TEXT_GREEN + "Togri✅\n" + "seni puling:" + dengi + "$" + TEXT_RESET);
                System.out.println(dengi);
            } else {
                dengi--;
                System.out.println(TEXT_RED + "Notogri yechim❌" + "seni puling:" + dengi + "$" + TEXT_RESET);
            }
        }
    }

    private static void missiyalar() {
        int kichikmissiya = getInt(TEXT_BLUE, "1.Mashina sotib olish\uD83D\uDE97.\n2.Qurol ko'zdan kechirish🔫\n3.Hotel savdosi🏠\n4.Orqaga🔙");
        if (kichikmissiya < 5)
            switch (kichikmissiya) {
                case 1:
                    masinasavdosi();
                    break;
                case 2:
                    qurolsavdosi();
                    break;
                case 3:
                    hotel();
                    break;
                case 4:
                    sananderas();
                    break;
            }
    }

    private static void hotel() {
        System.out.println("Hotel Savdosiga hush kelibsiz");
        int hotel = getInt(TEXT_BLUE, "1.Vip💎\n2.Standart🪄\n3.Avarage🏠\n4.Orqaga");
        if (hotel < 5) {
            switch (hotel) {
                case 1:
                    vip();

                    break;
                case 2:
                    standart();
                    break;
                case 3:
                    avarge();
                    break;
                case 4:
                    kichikmissiyalar();
                    break;

            }


        }


    }

    private static void avarge() {
        System.out.println("Avarge home🏠");
        System.out.println(TEXT_RED + "ESLATMA BIZ AVARGGE UYLARNI KOPP SAVDOGA QOYMAGANLIGIMIZ SABAB BU UY YAGONA 1-dona QOLGAN");
        int avarge = getInt(TEXT_PURPLE, "Kirish uchun 1.\n2.Orqaga");
        if (avarge == 1) {
            System.out.println(TEXT_RED + "1-uy->1xona 1 sotuk chiqmaydi");

            System.out.println(Prodokt.tualet);
            System.out.println("Narxi - 15$");
            int sotib = getInt(TEXT_PURPLE, "Sotib olish uchun 1\n2.Orqaga");
            if (sotib < 2) {
                int green = getInt(TEXT_BLUE, "$ kiriting");
                System.out.println("UY sizniki 3 kundan keyin kelib yashashingiz mumkun");
                Hamyon.add(Prodokt.tualet);
            } else if (sotib == 2) {
                hotel();
            }
        }
    }

    private static void standart() {
        System.out.println(TEXT_GREEN + "Standart🪄->bu uylar siz uchun");
        int standart = getInt(TEXT_BLUE, "Standat dasturini yoqish uchun 1 bosing");
        System.out.println("Murojat uchun 90-829-20-09");
        if (standart < 2) {
            System.out.println("Standartga hush kelibsiz");
            System.out.println("Standart uylar 1->");
            System.out.println(Prodokt.x);
            System.out.println("Bu uy toglar ostida dam dehan manoni bildiradi->narxi 130.000$");
            int tog = getInt(TEXT_PURPLE, "Sotib olish uchun 1\n2.Orqaga");
            switch (tog) {
                case 1:
                    if (tog < 2) {
                        int green = getInt(TEXT_BLUE, "$ kiriting");
                        System.out.println("UY sizniki 3 kundan keyin kelib yashashingiz mumkun");
                        System.out.println("Murojat uchun 90-829-20-09");
                        Hamyon.add(Prodokt.x);
                        hotel();

                    } else {
                        System.out.println("Summada hatolik bor❌");
                        hotel();
                    }
                    break;
                case 2:
                    hotel();
                    break;
            }
        }
        System.out.println("Uy 2->Grout stired narxi 69000");
        System.out.println(Prodokt.e);
        int sotib = getInt(TEXT_CYAN, "Sotib olish uchun 1\n2.Orqaga");
        if (sotib < 2) {
            int sss = getInt(TEXT_RED, "$ kiriting");
            if (sss < 70000) {
                System.out.println("Uy sizniki Kelib yashashingiz mumkin!");
                System.out.println("Murojat uchun 90-829-20-09");
                Hamyon.add(Prodokt.e);
                hotel();
            }
        }
    }

    private static void vip() {
        System.out.println(TEXT_RED + "Vip💎:Bu uylar narxiga yarasha hashamatli bo'gani uchun 'VIP' dasturini sotib olishingiz mimkin: ");
        int vipp = getInt(TEXT_BLUE, "'VIP'dasturini yoqish uchun 1 bosing");
        if (vipp < 2) {
            int vip = getInt(TEXT_BLUE, "'💎VIP💎'dasturini yoqish uchun yetarli summasini kiriting");
            System.out.println("💎💎💎Vip dasturiga qabul bo'ldingizgiz💎💎💎");
        }
        System.out.println("Uylarni ko'zdan kechirib chiqishingiz mumkin!!!");
        System.out.println("  \\_/       .:'    .:'    .:'\n" + "-=(_)=-  /\\||   /\\||   /\\||\n" + "  / \\   //\\\\|  //\\\\|  //\\\\|\n" + "       //  \\\\ //  \\\\ //  \\\\\n" + "      //    \\^/    \\^/    \\\\\n" + "      |[]  []|[]  []|[]  []|\n" + "     &|  ||  %  ||  |  ||  |%\n" + "  &%&--==--&%-==--%&\"\"\"\"\"%&%\"\"\"\"");
        int hote = getInt(TEXT_BLUE, "1.80$ \nSotib olish uchun 1 ni bosing");
        if (hote == 1 || hote > 80) {
            int lass = getInt(TEXT_BLUE, "$ kiriting");
            System.out.println("UY sizniki 3 kundan keyin kelib yashashingiz mumkun");
            hotel();
        }
        int hotell = getInt(TEXT_BLUE, "1.Keyingi uy\n2.Orqaga🔙");
        if (hotell < 3) {
            switch (hotell) {
                case 1:
                    System.out.println("              )\n" + "             (      _[]_         (\n" + "     __[]___[]___[]/____\\_[]_    )\n" + "    /______________|[][]|____\\  (\n" + "    |[][]|[][]|[][]|[][]|[][]|__[]_\n" + "    |  /\\|/\\  |  /\\|  /\\|/\\  |_____\\\n" + "    |[]|||||[]|[]|||[]|||||[]|[_]|||\n" + "  ===================================\n" + "  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + "=========================================");
                    int hotelll = getInt(TEXT_BLUE, "1.Street 88->bu uy 8 hona 4 sotuk narxi->98$" + "\nSotib olish uchun 1 bosing");
                    if (hotell == 1 || hotelll > 98) {
                        int lass = getInt(TEXT_BLUE, "$ kiriting");
                        System.out.println("UY sizniki 3 kundan keyin kelib yashashingiz mumkun");
                    }

                    break;
                case 2:
                    hotel();
                    break;
            }

        }
    }

    private static void qurolsavdosi() {
        System.out.println("███████████████████████████\n" + "███████▀▀▀░░░░░░░▀▀▀███████\n" + "████▀░░░░░░░░░░░░░░░░░▀████\n" + "███│░░░░░░░░░░░░░░░░░░░│███\n" + "██▌│░░░░░░░░░░░░░░░░░░░│▐██\n" + "██░└┐░░░░░░░░░░░░░░░░░┌┘░██\n" + "██░░└┐░░░░░░░░░░░░░░░┌┘░░██\n" + "██░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░██\n" + "██▌░│██████▌░░░▐██████│░▐██\n" + "███░│▐███▀▀░░▄░░▀▀███▌│░███\n" + "██▀─┘░░░░░░░▐█▌░░░░░░░└─▀██\n" + "██▄░░░▄▄▄▓░░▀█▀░░▓▄▄▄░░░▄██\n" + "████▄─┘██▌░░░░░░░▐██└─▄████\n" + "█████░░▐█─┬┬┬┬┬┬┬─█▌░░█████\n" + "████▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐████\n" + "█████▄░░░└┴┴┴┴┴┴┴┘░░░▄█████\n" + "███████▄░░░░░░░░░░░▄███████\n" + "██████████▄▄▄▄▄▄▄██████████\n" + "███████████████████████████");
        System.out.println("Welcome dark.net.😈");
        System.out.println("Bu sayt no rasmiy❌");
        int javob = getInt(TEXT_RED, "1.Keyingi➡️\n2.Orqaga🔙");
        if (javob < 3) {
            switch (javob) {
                case 1:
                    shogun();
                    break;
                case 2:
                    kichikmissiyalar();
                    break;
            }

        }

    }

    private static void shogun() {

        System.out.println("ESLATMA!!! QUROL SOTIB OLIB BO'LMAYDI ");
        System.out.println("1-Qurol 500$");
        int gun = getInt(TEXT_BLACK, "                           ______\n" + "        |\\_______________ (_____\\\\______________\n" + "HH======#H###############H#######################\n" + "        ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" + "                          ))    \\#H\\       `\"Y###\n" + "dew                       \"      }#H)" + TEXT_RED + "\n1.Keyingisi➡️\n2.Orqaga🔙");
        if (gun != 1 || gun == 2) {
            kichikmissiyalar();

        }

        System.out.println("Keyingisi 2-> 45$");
        int gunn = getInt(TEXT_BLACK, " +--^----------,--------,-----,--------^-,\n" + " | |||||||||   `--------'     |          O\n" + " `+---------------------------^----------|\n" + "   `\\_,---------,---------,--------------'\n" + "     / XXXXXX /'/|       /'\n" + "    / XXXXXX /  `\\    /'\n" + "   / XXXXXX /`-------'\n" + "  / XXXXXX /\n" + " / XXXXXX /\n" + "(________(                \n" + " `------'" + TEXT_RED + "\n1.Keyingi➡️\n2.Orqaga🔙");
        if (gunn != 1 || gun == 2) {
            kichikmissiyalar();
        }

        System.out.println("3-qurol->120$");
        System.out.println(" ,______________________________________       \n" + "|_________________,----------._ [____]  \"\"-,__  __....-----=====\n" + "               (_(||||||||||||)___________/   \"\"                |\n" + "                  `----------' Krogg98[ ))\"-,                   |\n" + "                                       \"\"    `,  _,--....___    |\n" + "                                               `/           \"\"\"\"");
        int uzb = getInt(TEXT_RED, "BU dark.net agar qurollarni saqlab olgan bolsan osha qurol seni qotiling bo'lishi mumkin bolakar" + "Hayoting kerak bolsa 1 ni bos");
        if (uzb < 2) {
            sananderas();
        }
    }

    private static void masinasavdosi() {
        System.out.println("Wolcome car business");
        int gtr = getInt(TEXT_BLUE, "Mashina versiyasini tanla:\n1.Sport car\n2.Classic car\n3.Orqaga🔙");

        switch (gtr) {
            case 1:
                sportcar();
                break;
            case 2:
                classic();
                break;
            case 3:
                missiyalar();
                break;
        }
    }

    private static void classic() {
        System.out.println("Qani tanla");
        int clasic = getInt(TEXT_BLUE, "1.Mersades-Benz G-klass\n2.Mersadens-bens w140\n3.Rols-royse\n4.Orqaga🔙");
        if (clasic < 4) {
            switch (clasic) {
                case 1:
                    System.out.println(Prodokt.gelik);
                    System.out.println("Gelik->prosta o'ta go'zal narxiga arziydi");
                    System.out.println("Oxirgi Versiyasini Narxi->150 $");
                    int gelik = getInt(TEXT_CYAN, "1.Sotib olish uchun \nOrqaga🔙");
                    switch (gelik) {
                        case 1:
                            if (gelik < 2) {
                                int lass = getInt(TEXT_BLUE, "$$$ Kiriting");
                                if (lass > 150) {
                                    System.out.println("Hozir kelib olib ketishingiz mumkin");
                                    System.out.println("Sotuv uchun rahmat");
                                    Hamyon.add(Prodokt.gelik);
                                    sananderas();
                                } else if (lass < 150) {
                                    System.out.println("Summada Hatolik Bor❌");
                                    classic();
                                }

                            } else {
                                System.out.println("1 haftadan son olib ketishingiz mumkin");
                                System.out.println("Sotuv uchun rahmat");
                                Hamyon.add(Prodokt.gelik);
                                sananderas();
                            }
                            break;
                        case 2:
                            masinasavdosi();
                            break;

                    }
                    break;
                case 2:
                    System.out.println(Prodokt.w140);
                    System.out.println("Mersadens-bens W140->bu mashina uzbekistan da katta bollarni mashinasi ekanligini bilarmidingiz\n Bu mashina motori V12 nomi bilan mashxur.");
                    System.out.println("Oxirgi modelini narxi ->130$");
                    int mers = getInt(TEXT_CYAN, "Sotib olish uchun$ 1.\n2.Orqaga🔙");
                    switch (mers) {
                        case 1:
                            if (mers == 1) {
                                int clas = getInt(TEXT_BLUE, "$$$ kiriting");
                                if (clas > 130) {
                                    System.out.println("Hozir kelib olib ketishingiz mumkin");
                                    System.out.println("Sotuv uchun rahmat");
                                    Hamyon.add(Prodokt.w140);
                                    sananderas();
                                } else if (clas < 130) {
                                    System.out.println("Summada Hatolik Bor❌");
                                    classic();
                                }

                            } else {
                                System.out.println("1 kundan so'ng olib ketishingiz mumkin");
                                System.out.println("Sotuv uchun rahmat");
                                Hamyon.add(Prodokt.w140);
                                sananderas();
                            }
                            break;
                        case 2:
                            masinasavdosi();
                            break;
                    }
                    break;
                case 3:
                    System.out.println(Prodokt.rolsroys);
                    System.out.println("Rolse-royse->Bu mashina 8 oy odamlar qo'l bilan teriladigan yagona mashina \n'narxi ham oshanga yarasha' bu mashina 1998-yilda terila boshladi va buni naxri qimmatga tushdi 200 dollar");
                    int rols = getInt(TEXT_CYAN, "Sotib olish uchun 1");
                    switch (rols) {
                        case 1:
                            if (rols == 1) {
                                int clas = getInt(TEXT_BLUE, "$$$ kiriting");
                                if (clas > 200) {
                                    System.out.println("Hozir kelib olib ketishingiz mumkin");
                                    System.out.println("Sotuv uchun rahmat");
                                    Hamyon.add(Prodokt.rolsroys);
                                    dengi--;
                                    sananderas();
                                } else if (clas < 200) {
                                    System.out.println("Summada Hatolik Bor❌");
                                    classic();
                                }

                            } else {
                                System.out.println("1 kundan song olib ketishingiz mumkin");
                                System.out.println("Sotuv uchun rahmat");
                                Hamyon.add(Prodokt.w140);
                                dengi--;
                                sananderas();
                            }
                            break;
                        case 2:
                            masinasavdosi();
                            break;
                    }
            }
        }
    }


    public static void sportcar() {
        System.out.println(TEXT_YELLOW + "Wolcome to the sport car salon");
        int supr = getInt(TEXT_BLUE, "1.Supra\n2.Gtr\n3.Bugatti");
        if (supr > 4) {
            System.out.println("Qayta urinib kor!");
        }
        switch (supr) {
            case 1:

                System.out.println(Prodokt.supra);
                System.out.println("Supra-> mk4:Supraning dastlabki to‘rt avlodi 1978-yildan 2002-yilgacha ishlab chiqarilgan.\n" + "Dvigatel hajmi 2997 sm\n" + "SUPRA 6.00 sekunda 387 km tezlik bilan genis rekordiga kirdi |^0^| ");
                System.out.println("Supra sayti sizga rasm uchun " + "https://www.toyota.com/grsupra/");
                System.out.println("Boshlangich narxi->110$");
                int supra = getInt(TEXT_BLUE, "1.Sotib olish\n2.Orqaga");
                if (supra < 2) {
                    int supraa = getInt(TEXT_BLUE, "$$$ kiriting");
                    if (supraa > 110) {
                        System.out.println("Hozir kelib olib ketishingiz mumkin");
                        Hamyon.add(Prodokt.supra);
                        sananderas();
                    } else if (supra < 110) {
                        System.out.println("Summada Hatolik Bor❌");
                        sportcar();
                    } else {
                    }
                    System.out.println("1 kundn so'ng olib ketishingiz mumkin");
                    System.out.println("Sotuv uchun rahat");
                    Hamyon.add(Prodokt.supra);
                }

                break;
            case 2:
                System.out.println(Prodokt.gtr);
                System.out.println("GTR->Yangilangan Nissan GTR 35, dvigatel yakunlandi hozirgi kunda Suprani raqobatdoshiga aylandi");
                System.out.println("Divigitel hajmi  95,5 mm." + "VR38DETT dvigateli Nissan GT-R-ga 2007 yildan beri o'rnatilgan" + TEXT_RED + "Toliq malumot uchun https://bugulma-lada.ru/");
                System.out.println(TEXT_RED + "Narxi-> 100$");
                int gtr = getInt(TEXT_BLUE, "1.Sotib olish $\n2.Orqaga🔙");
                if (gtr < 2) {
                    int gtrr = getInt(TEXT_BLUE, "$$$ kiriting");
                    if (gtrr > 100) System.out.println("Hozir kelib olib krtishingiz mukin");
                    System.out.println("Sotuv uchun rahmat😊");
                    Hamyon.add(Prodokt.gtr);
                } else {
                    System.out.println("1 Kundan song  olishingiz mumkun");
                    System.out.println("Sotuv uchun rahmat");
                    Hamyon.add(Prodokt.gtr);
                }
                break;
            case 3:
                System.out.println(Prodokt.bugatti);
                System.out.println("Bugatti chiron->Bugatti Chiron — Bugatti giperkari (Volkswagen AG tarkibiga kiruvchi), 2016-yilda ommaga rasman taqdim etilgan.\nModel 1928-yildan 1958-yilgacha brend uchun kurashgan poygachi Lui-Aleksand Xiron[1] nomlangan.");
                System.out.println("Giperkarning asosiy narxi 1,9 million funt sterlingga yetadi,Yevropa Ittifoqida 2016-yilda Bugatti Chiron narxi 2,5 million yevrodan boshlangan.\n" + "Toʻliq benzin (100 litr) 420 km/soat tezlikda 9 daqiqa yurish uchun kifoya qiladi[");
                System.out.println("Asl narxi->Chiron’ning yangi versiyasini 3,9 mln dollar qiymatida taqdim etdi");
                System.out.println("Narxi-> 4,0 milliyon dollar");
                int bugatti = getInt(TEXT_BLUE, "1.Sotib olish $\n2.Orqaga🔙");
                if (bugatti < 2) {
                    int bugattii = getInt(TEXT_BLUE, "$$$ kiriting");
                    if (bugattii > 450) {
                        System.out.println("Horiz kelib olib ketishingiz mumkin");
                        System.out.println("Sotuvingiz uchun rahmat😊 ");
                        Hamyon.add(Prodokt.bugatti);
                    } else if (bugattii < 450) {
                        System.out.println("Summada Hatolik Bor❌");
                    }
                } else {
                    System.out.println("1 kundan so'ng olib keyishingiz mumkin");
                    System.out.println("Sotuvingiz uchun rahmat");
                    Hamyon.add(Prodokt.bugatti);
                }
                break;


        }

    }


    private static void ballas() {
        System.out.println("Sen juda mard ekansan bolakay!!!");
        System.out.println("Ballaslar bilan bo'lib o'tadigan janga rozimisan?");
        int jang = getInt(TEXT_RED, "1.Roziman\n2.Orqaga");
        if (jang == 2) {
            sananderas();
        }
        switch (jang) {
            case 1:
                jang();
                break;
            case 2:
                kichikmissiyalar();
                break;
        }


    }

    private static void jang() {
        System.out.println("Elsatma Sening joning 10 % dan boshlanadi");
        for (; true; ) {
            Random a = new Random();
            int ran = a.nextInt(0, 10);
            int ran1 = a.nextInt(0, 10);
            int y = ran + ran1;
            System.out.println(ran + " + " + ran1 + " = " + " ? ");
            System.out.println("21 Orqaga⬅️");
            Scanner scan = new Scanner(System.in);
            int scaan = scan.nextInt();
            if (scaan == 21) {
                sananderas();
                return;
            }
            if (y == scaan) {

                System.out.println(TEXT_GREEN + "togri\n" + "seni joning:" + jon + "%" + TEXT_RESET);

            } else {
                jon--;
                System.out.println(TEXT_RED + "Notogri yechim" + "seni joning:" + jon + "%" + TEXT_RESET);
                if (jon == 0) {
                    System.out.println(TEXT_RED + "Ehh Biz Bu Safar Pand Berdik🥲😥");
                    sananderas();
                }
            }
        }
    }


    public static void royxatdan_otish() {
        ism = getText(TEXT_GREEN, "Isming nima ?");
        age = getInt(TEXT_GREEN, "Yoshingni kirit yigitcha: ");
        System.out.println(TEXT_WHITE + "Bizning ro'yxatdan o'tding birodar");
        System.out.println(TEXT_RED + "VA biz sen bilan hali ko'rishamiz yigicha");
        kirish();
    }


    private static int getInt(String color, String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(color + text + TEXT_RESET);
        return sc.nextInt();
    }

    private static String getText(String color, String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(color + text + TEXT_RESET);
        return sc.nextLine();


    }

    public static void hurmatqilila(String a) {
        String ab = "QIGAN MEHNATIMMI HURMAT QIGANHOLDA CHPE CHALIB QOYARSILA";
        System.out.println(ab);
    }

}