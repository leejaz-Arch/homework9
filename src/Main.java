//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

         int firstFriday = 3;
         for (int date = 1; date <= 31; date++) {
             if (date >= firstFriday && (date - firstFriday) %  7 == 0) {
                 System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
             }
         }

        System.out.println("Задание №2");


        final int TOTAL_DISTANCE = 42_195;
        final int STEP = 500;

        System.out.println("=== Версия 1: do-while ===");
        versionDoWhile(TOTAL_DISTANCE, STEP);

        System.out.println("\n=== Версия 2: for ===");
        versionFor(TOTAL_DISTANCE, STEP);
    }

    // ========== ВЕРСИЯ 1: do-while ==========
    private static void versionDoWhile(int total, int step) {
        int distance = 0;

        int messageCount = 0;

        do {
            int remaining = total - distance;

            if (remaining < 0) {
                remaining = 0;
            }

            System.out.println("Держитесь! Осталось " + remaining + " метров");
            messageCount++;

            distance += step;

        } while (distance <= total);

        System.out.println("Выведено сообщений (do-while): " + messageCount);
    }

    // ========== ВЕРСИЯ 2: for ==========
    private static void versionFor(int total, int step) {
        int messageCount = 0;

        for (int distance = 0; distance <= total; distance += step) {
            int remaining = total - distance;
            if (remaining < 0) {
                remaining = 0;
            }
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            messageCount++;
        }

        System.out.println("Выведено сообщений (for): " + messageCount);

        System.out.println("Задание №3");

        int budget1 = 1000;
        int day1 = 0;
        int remaining1 = budget1;

        while (remaining1 > 0) {
            day1++;
            if (day1 % 5 == 0) {
                continue;
            }
            remaining1 -= 100;
        }
        System.out.println("На " + budget1 + " ₽ можно оставить авто на " + day1 + " дн.");


        int budget = 1000;
        int remaining = budget;
        int day;
        for (day = 1; ; day++) {
            if (day % 5 == 0) {
                continue;
            }
            remaining -= 100;
            if (remaining <= 0) {
                break;
            }
        }
        System.out.println("На " + budget + " ₽ можно оставить авто на " + day + " дн.");

        System.out.println("Задание №4");

        final double TARGET = 12_000_000;
        final double MONTHLY_CONTRIBUTION = 15_000;
        final double INTEREST_RATE = 0.07;

        int month = 0;
        double total1 = 0;

        while (true) {
            month++;

            total1 += MONTHLY_CONTRIBUTION;

            if (month % 6 == 0) {
                double interest = total1 * INTEREST_RATE;
                total1 += interest;
                System.out.printf("Месяц %d: +15 000 ₽ + проценты %.0f ₽ = %.2f ₽\n",
                        month, interest, total1);
            } else {
                System.out.printf("Месяц %d: +15 000 ₽ = %.2f ₽\n", month, total1);
            }

            if (total1 >= TARGET) {
                System.out.println("\n🎯 Цель достигнута через " + month + " месяцев!");
                System.out.printf("Итоговая сумма: %.2f ₽\n", total1);
                break;
            }
        }

        System.out.println("Задание №5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        System.out.println("=== Умная зарядка ===\n");
        System.out.println("Начальный заряд: " + charge + "%\n");

        while (charge < 100 && overheats <= 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.println("⚠️ Минута " + minute + ": Перегрев #" + overheats +
                        "! Пауза на 2 минуты...");


                minute += 2;


                if (overheats > 3) {
                    System.out.println("\n🛑 Превышен лимит перегревов!");
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }

                continue;
            }

            charge += 2;
            System.out.println("Минута " + minute + ": Заряд " + charge + "%");
        }

        // Итоговое сообщение
        System.out.println("\n✅ Время зарядки составило " + minute + " минут");


    }
}