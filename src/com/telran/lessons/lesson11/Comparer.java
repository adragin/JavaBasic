package com.telran.lessons.lesson11;

public class Comparer {
    public static void main(String[] args) {
        Dog dog1 = new Dog(10);
        Dog dog2 = new Dog(20);
        dog1.getAge();

        compareDogs(dog1, null);

    }

    public static int compareDogs(Dog dog1, Dog dog2) {
        // вернуть -1 если первая собака младше
        // 1 если первая собака старше
        // 0 если собаки равны
        // -2 если одна из собак null
        if (dog1 == null || dog2 == null){
            return -2;
        }
        if (dog1.getAge() < dog2.getAge()){
            return -1;
        } else if (dog1.getAge() > dog2.getAge()){
            return 1;
        }
        return 0;
    }
}
