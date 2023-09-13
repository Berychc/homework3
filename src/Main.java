public class Main {
    public static void main(String[] args) {
        // Домашнее задание - Переменные 2

        byte firstNumber = 6;
        short secondNumber = 659;
        int thirdNumber = 13500;
        long fourthNumber = 666777888;
        System.out.println("Значение переменной byte с типом Целочисленные равно "+firstNumber);
        System.out.println("Значение переменной shor с типом Целочисленные равно "+secondNumber);
        System.out.println("Значение переменной int с типом Целочисленные равно "+thirdNumber);
        System.out.println("Значение переменной long с типом Целочисленные равно "+fourthNumber);

        float fifthNumber = 3.14f;
        double sixth = 66.6789;
        System.out.println("Значение переменной float с типом Плавающей точкой равно "+fifthNumber);
        System.out.println("Значение переменной double с типом Плавающей точкой равно "+sixth);


        double skyPro = 27.12;
        long skyRim = 987678965549L;
        float skyBmw = 2.786f;
        short skyPark = 569;
        short skyWindow = -159;
        int skyOblivion = 27897;
        byte skyDark = 67;


        short firstClass = 23;
        short secondClass = 27;
        short thirdClass = 30;
        short sceetsPaper = 480;

        int totalStudents = firstClass + secondClass + thirdClass;
        System.out.println("На каждого ученика рассчитано "+ sceetsPaper / totalStudents +" листов бумаги");


        byte bottles = 8;
        int firstTime = bottles * 20;
        int secondTime = bottles * 1440;
        int thirdTime = bottles * 4320;
        int fourthTime = bottles * 43800;
        System.out.println("За 20 минут машина произвела "+firstTime+" штук бутылок");
        System.out.println("За сутки машина произвела "+secondTime+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+thirdTime+" штук бутылок");
        System.out.println("За 1 мемяц машина произвела "+fourthTime+" штук бутылок");


        byte cansPaint = 120;
        byte oneClass = 6;
        int totalClass = cansPaint / oneClass;
        int whitePaint = totalClass * 2;
        int brownPaint = totalClass * 4;
        System.out.println("В школе, где "+totalClass+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");


//        Бананы — 5 штук (1 банан — 80 грамм).
//        Молоко — 200 мл (100 мл = 105 грамм).
//        Мороженое-пломбир — 2 брикета по 100 грамм.
//        Яйца сырые – 4 яйца (1 яйцо — 70 грамм)

        byte oneBanana = 80;
        byte portionMilk = 105;
        byte briquetteIcecream = 100;
        byte oneEgg = 70;
        int totalWeight = oneBanana * 5 + portionMilk * 2 + briquetteIcecream * 2 + oneEgg * 4;
        float gramsKilogram = totalWeight / 1000f;
        System.out.println(gramsKilogram);


        int kilogtammGramm = 7 * 1000;
        int fitstMethod = kilogtammGramm / 250;
        int secondMethod = kilogtammGramm / 500;
        System.out.println("За "+fitstMethod+" дней спортсмен сбросить 7 кг, если в день будет скидывать по 250 грамм");
        System.out.println("За "+secondMethod+" дней спортсмен сбросить 7 кг, если в день будет скидывать по 500 грамм");


//        Маша получает 67 760 рублей в месяц.
//        Денис получает 83 690 рублей в месяц.
//        Кристина получает 76 230 рублей в месяц.

        int firstEmployee = 67760;
        int secondEmployee = 83690;
        int thirdEmployee = 76230;
        int tenPercent1 = firstEmployee + 6776;
        int tenPercent2 = secondEmployee + 8369;
        int tenPercent3 = thirdEmployee + 7623;

        int yearIncom1 = firstEmployee * 12;
        int yearIncom2 = secondEmployee * 12;
        int yearIncom3 = thirdEmployee * 12;
        int percentIncom1 = tenPercent1 * 12;
        int percentIncom2 = tenPercent2 * 12;
        int percentIncom3 = tenPercent3 * 12;

        int differenceYear1 = percentIncom1 - yearIncom1;
        int differenceYear2 = percentIncom2 - yearIncom2;
        int differenceYear3 = percentIncom3 - yearIncom3;

        System.out.println("Маша теперь получает "+tenPercent1+" рублей. Годовой доход вырос на "+differenceYear1+" рублей");
        System.out.println("Денис теперь получает "+tenPercent2+" рублей. Годовой доход вырос на "+differenceYear2+" рублей");
        System.out.println("Кристина теперь получает "+tenPercent3+" рублей. Годовой доход вырос на "+differenceYear3+" рублей");

    }
}