public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var TotalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров" + TotalWeight + "кг!");
        var WeightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров" + WeightDifference + "кг!");
        var WeightDifference1 = boxer2 % boxer1;
        System.out.println("Разница в весе боксеров через остаток от деления" + WeightDifference1 + "кг! ");
        var TimeWork = 640;
        System.out.println(TimeWork);
        var StaffWork = 8;
        System.out.println(StaffWork);
        var Staff = TimeWork / StaffWork;
        System.out.println("Всего работников в компании" + Staff + "человек!");
        var Staff2 = Staff + 94;
        System.out.println(Staff2);
        var TimeStaff = TimeWork / Staff2;
        System.out.println(TimeStaff);
        System.out.println("Если в компании работает"+ Staff2+ "человек, то всего" + TimeStaff + " часов работы может быть поделено между сотрудниками");

    }



}