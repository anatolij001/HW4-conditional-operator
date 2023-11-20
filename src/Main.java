public class Main {
    public static void main(String[] args) {
        //---   Задача № 1   ---
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний!\n");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать!\n");
        }
        //---   Задача № 2   ---
        int temperature = 12;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку!\n");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки!\n");
        }

        //---   Задача № 3   ---
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф\n");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно\n");
        }

        //---   Задача № 4   ---
        int age4 = 25;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад\n");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу\n");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет\n");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу\n");
        }
        //---   Задача № 5   ---
        int age5 = 15;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе\n");
        } else if (age5 >= 5 && age5 <= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого\n");
        } else {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого\n");
        }

        //---   Задача № 6   ---
        int quantityOfPassengers = 102;
        if (quantityOfPassengers < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места.\n");
        } else if (quantityOfPassengers < 102) {
            System.out.println("В вагоне есть только стоячие места.\n");
        } else {
            System.out.println("Вагон полностью забит.\n");
        }

        //---   Задача № 7   ---
        int one;
        int two;
        int three;
        one = 2;
        two = 81;
        three = 7;
        int max = one;
        if (max < two){
            max = two;
            if (max<three){
                max=three;
            }
        } else if (max<three) {
            max=three;
        }
        System.out.println("Максимальное число из "+ one+", "+two+", "+three+": "+max+"\n");
    }
}
