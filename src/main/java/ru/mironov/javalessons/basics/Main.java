package ru.mironov.javalessons.basics; //пакет, где лежит класс

/**
 *Класс (class)- абстракция, представление какого-то объекта, его тип.
 *В классах описываем функционал и свойства объекта
 *Назовем класс ru.mironov.basics.Main
 *модификатор доступа - public (виден всем)
 * Любой класс является наследником Object, то есть получает от него все его методы
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
 *
 * правила наименования
 * https://www.javatpoint.com/java-naming-conventions
 *
 */
public class Main {

    /**
     *Создадим метод main, метод публичный
     * метод статичный (static) - единственный для всех классов
     * передаются в метод параметры строковые - String[] args
     * такой метод можно запустить, рядом с его названием появляется иконка запуска
     */
    public static void main(String[] args) {
        SomeClass someClassInstance = new SomeClass("some class 1");

        System.out.println("some number " + someClassInstance.someNumber);

        //если число из экземпляра someClassInstance класса типа ru.mironov.basics.SomeClass мы можем получить,
        //то флаг someFlag для нас закрыт
        //но мы можем сделать метод getSomeFlag() и вернуть флаг
        System.out.println("some flag -" + someClassInstance.getSomeFlag());

        //так мы можем запретить изменять флаг, но разрешить его получать
        //а менять флаг будем только по своему условию через метод changeFlag()
        someClassInstance.changeFlag();
        System.out.println("some flag is changed to " + someClassInstance.getSomeFlag());

        someClassInstance.someNumber = 1;
        System.out.println("some flag is not changed -" + someClassInstance.getSomeFlag());
        //чтобы посмотреть реализацию метода changeFlag(), наведи на него мышь(можно курсор кнопками/стрелками),
        // нажми Ctrl+B или Ctrl+Правая кнопка мыши

    }


}
