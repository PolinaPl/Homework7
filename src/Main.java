public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int accum = 15000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + accum;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
        }

        System.out.println();
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
        for (int finish = 10; finish > 0; finish--) {
            System.out.print(finish + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        float birth = (float) 17 / 1000;
        float death = (float) 8 / 1000;
        for (int i = 1; i < 11; i++) {
            population = (int) (population + (population * birth) - (population * death));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задача 4");
        float deposit = 15000;
        int general = 12_000_000;
        double procent = 0.07;
        int monthAccum = 1;
        while (deposit <= general) {
            deposit += deposit * procent;
            System.out.println("Месяц " + monthAccum + ", сумма накоплений равна " + deposit + " рублей.");
            monthAccum++;
        }

        System.out.println();
        System.out.println("Задача 5");
        float deposit0 = 15000;
        int general0 = 12_000_000;
        double procent0 = 0.07;
        int monthAccum0 = 1;
        while (deposit0 <= general0) {
            deposit0 += deposit0 * procent0;
            if (monthAccum0 % 6 == 0) {
                System.out.println("Месяц " + monthAccum0 + ", сумма накоплений равна " + deposit0 +
                        " рублей.");
            }
            monthAccum0++;
        }


        System.out.println();
        System.out.println("Задача 6");
        float deposit1 = 15000;
        double procent1 = 0.07;
        int god = 9;
        for (int monthAccum1 = 1; monthAccum1 <= god * 12; monthAccum1++) {
            deposit1 += deposit1 * procent1;
            if (monthAccum1 % 6 == 0) {
                System.out.println("Месяц " + monthAccum1 + ", сумма накоплений равна " + deposit1
                        + " рублей.");
            }
        }
        System.out.println();
        System.out.println("Задача 7");
        int friday = 1;
        int allDays = 31;
        while (friday <= allDays) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
            friday += 7;
        }

        System.out.println();
        System.out.println("Задача 8");
        int nowYear = 2023;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        for (int year = startYear; year <= finishYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


    }
}