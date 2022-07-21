package ru.mironov.javalessons.basics;

/**
 * Создадим еще класс
 */
public class SomeClass {

    /*
    у класса будет переменная/поле
    поле - ячейка в которой хранится объект (класс) или примитив, оно существует пока существует класс
    String в java - класс
    */
    String name;
    private String someString;

    //создадим переменнаю/поле с числом
    //int - примитив
    //примитивы - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    int someNumber = 0;

    //другой примитив
    private boolean someFlag = true;

    //обозначен, но не задан
    private double someDouble;

    //а это уже объект, это обертка над примитивом int
    private Integer someInt;

    //метод, который возвращает примитив типа boolean
    public boolean getSomeFlag(){
        return someFlag;
    }

    //void - метод, который ничего не возвращает
    public void changeFlag(){
        //это локальная переменная/поле, существет, пока метод не закончит выполнение
        //оно нигде не участвует, поэтому компилятор помечает его серым, но тут оно для примера
        long longNumber = 0L;
        if (someNumber == 0) someFlag = !someFlag;
    }

    /*
    Создадим конструктор. Функция, которая вызывается при создании класса,
     в которую можно положить параметры нужные для создания класса.
     */
    public SomeClass(String passedName) {
        //обращение к полям класса внутри самого класса делается через this
        this.name = passedName;
        //примтив всегда имеет значение, даже если оно не задано
        System.out.println(someDouble);

        //если объект не задан, то он null, нулевой
        //если к такому объекту обратиться не проверив, что он null, то будет ошибка с падением
        if (someInt != null){
            //в данном случае никогда не выполнится
            //у someInt можно вызвать методб а у someNumber нельзя
            someInt.toString();
        }
        else
        {
            someInt = 1;
        }
        //теперь можем вызвать метод
        //перевели Integer в String
        someString = someInt.toString();
        //можем приписать букву к цифре в строке приписать строкове представление экземпляра ru.mironov.basics.SomeClass
        //еще можно приписать число - примитив, java понмает, если складывем строку и примитив
        //а строку и объект сложить нельзя, его надо представить строкой через метод toString()
        someString = "a" + someString + 1 ;

    }


    //метод toString описывает то, как мы представляем класс в виде строки
    //аннотация override говорит, что мы пишем свою реализацю метода какого-то
    //метод toString является методом класса Object
    @Override
    public String toString() {
        return this.name;
    }

}

