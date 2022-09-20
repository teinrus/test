import java.util.Scanner;

public class Main {
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }

    }

    public static int taxUsn(int earnings) {

        return earnings * 6 / 100;


    }


    public static void main(String[] args) {

        int temp;
        int earnings = 0;
        int spendings = 0;


        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Выберите необходимую операцию");
            System.out.println("1:Добавить новый доход");
            System.out.println("2:Добавить новый расход");
            System.out.println("3: Показать систему налогообложения");

            String mode = scan.nextLine();

            if ("end".equals(mode)) {

                System.out.println("Вы закончили подсчет");
                break;
            } else {

                switch (mode) {

                    case "1":
                        System.out.println("Введите сумму дохода");
                        temp = scan.nextInt();
                        earnings += temp;
                        System.out.println(earnings);
                        break;
                    case "2":
                        System.out.println("Введите сумму расходов");
                        temp = scan.nextInt();
                        spendings += temp;
                        System.out.println(spendings);
                        break;
                    case "3":
                        if (taxEarningsMinusSpendings(earnings, spendings) - taxUsn(earnings) > 0) {
                            if (taxEarningsMinusSpendings(earnings, spendings) < taxUsn(earnings)) {
                                System.out.println("Ваша система налогообложения УСН доходы минус расходы: 15% ");
                                System.out.println("Налог составит " + taxEarningsMinusSpendings(earnings, spendings));
                                System.out.println("Налог составит по другой системе " + taxUsn(earnings));
                                System.out.println("Ваша экономия " + (taxUsn(earnings) - taxEarningsMinusSpendings(earnings, spendings)));
                            } else {
                                System.out.println("Ваша система налогообложения УСН доходы 6% ");
                                System.out.println("Налог составит " + taxUsn(earnings));
                                System.out.println("Налог составит по другой системе " + taxEarningsMinusSpendings(earnings, spendings));
                                System.out.println("Ваша экономия " + (taxEarningsMinusSpendings(earnings, spendings) - taxUsn(earnings)));
                            }
                        } else {
                            System.out.println("Ваш налог отрицательный попробуйте еще раз ");
                        }
                        break;
                    default:
                        System.out.println("Такой операции нет:");
                        break;
                }
            }
        }

    }


}
