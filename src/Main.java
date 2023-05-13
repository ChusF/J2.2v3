class Main {
    public static void main(String[] args) {

        int first = 2000; // сумма на счету
        int summa = 1900; // сумма пополнения
        int condition = 100;

        if (summa >= 1000) {
            int bonus = (summa / condition);
            System.out.println("Начисленно бонусов:");
            System.out.println(summa / condition);
            System.out.println("Сумма на счету:");
            System.out.println(first + bonus + summa);
        } else {
            System.out.println("Сумма на счету:");
            System.out.println(first + summa);
        }
    }
}

