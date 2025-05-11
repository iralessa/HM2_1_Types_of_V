public class Main {
    public static void main(String[] args) {
        // Задача_1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("_____Задача №1_____");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        // Задача_2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("_____Задача №2_____");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача_3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("_____Задача №3_____");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("_____Задача №4_____");
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println("_____Задача №5_____");
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println("_____Задача №6_____");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух боксеров: " + totalWeight + " кг");

        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе между боксерами: " + weightDifference + " кг");

        System.out.println("_____Задача №7_____");
        var remainder = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления : " + remainder + " кг");

        System.out.println("_____Задача №8_____");
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        var additionalEmployees = 94;
        var newTotalEmployees = numberOfEmployees + additionalEmployees;
        var newTotalHours = newTotalEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}