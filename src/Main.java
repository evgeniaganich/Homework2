public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var dog1 = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstWeight = 78.2;
        var secondWeight = 87.2;
        var totalWeight = firstWeight + secondWeight;
        System.out.println("Общий вес двух бойцов - " + totalWeight + " кг");
        var differenceOfWeights = secondWeight - firstWeight;
        System.out.println("Разница между весами бойцов - " + differenceOfWeights + "кг");
        var alsoDifferenceOfWeights = secondWeight % firstWeight;
        System.out.println("Разница между весами бойцов - " + alsoDifferenceOfWeights + "кг");
        var hoursOfWork = 640;
        var numberOfEmployees = hoursOfWork / 8;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек.");
        numberOfEmployees = numberOfEmployees + 94;
        var hoursOfWorkNow = numberOfEmployees * 8;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + hoursOfWorkNow + " часов работы может быть поделено между сотрудниками.");

    }
}