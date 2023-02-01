public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 4");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 30;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

    }
    public static void task2(){
        System.out.println("Задача 2");
        float airTemperature = -32f;
        if(airTemperature>=5){
            System.out.println("На улице "+airTemperature+" градусов, можно идти без шапки");
        }else { System.out.println("На улице "+airTemperature+" градусов, нужно надеть шапку");}
    }
    public static void task3(){
        System.out.println("Задача 3");
        float speed = 45f;
        if (speed>=60){
            System.out.println("Если скорость "+speed+" км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+" км/ч, то можно ехать спокойно");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int age = 45;
        boolean mustGoToKindergarden = age >= 2 && age <= 6;
        boolean mustGoToSchool = age >= 7 && age <= 18;
        boolean mustGoToUniversity = age >= 18 && age <=24;
        if (mustGoToKindergarden){
            System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в детский сад");
        } else {
            if (mustGoToSchool){
            System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в школу");}
             else
        {
        if (mustGoToUniversity){
            System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить в университет");}
        else {
            System.out.println("Если возраст человека равен "+age+" ,то ему нужно ходить на работу");}
        }}
    }
    public static void task5(){
        System.out.println("Задача 5");
        int age = 20;
        if (age < 5){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на атракционе");
        } else {
            if (age >= 5 && age <= 14){
                System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на атракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на атракционе");
            }
        }

    }
    public static void task6(){
        System.out.println("Задача 6");
        int seatPlace = 60;
        int standingPlace = 102 - seatPlace;
        int numberOfPassenger = 59;
        if (numberOfPassenger < (seatPlace - 1)){
            System.out.println("Есть сидячие места");
        }else {
            if (numberOfPassenger == ( seatPlace -1)){
                System.out.println("Есть одно сидячее место");
            }else {
                if (numberOfPassenger > seatPlace && numberOfPassenger < (standingPlace - 1)){
                    System.out.println("Есть стоячие места");
                } else {
                    if (numberOfPassenger == (standingPlace - 1)){
                        System.out.println("Есть одно стоячее место");
                    }else {
                        System.out.println("Вагон полностью занят");
                    }
                }
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one = 3;
        int two = 5;
        int three = 20;
        if (one > two){
            if (one > three){
                System.out.println("Число "+one+" самое большое");
            }else {
                System.out.println("Число "+three+" самое большое");
            }}
            if (two > three){
                    System.out.println("Число "+two+" самое большое");
                } else {
                System.out.println("Число "+three+" самое большое");
            }
        }
    }
