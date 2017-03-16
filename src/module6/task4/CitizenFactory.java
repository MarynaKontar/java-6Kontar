package module6.task4;

import static module6.task4.Citizen.CitizenType.ENGLISHMAN;

/**
 * Java#6
 * Module 6 Task 4 (new)
 * Create a class-factory CitizenFactory, which statically generates сitizens of different countries.
 * Use the following nested sub-classes:
 * - Englishman
 * - Chinese
 * - Russian
 * - Italian
 * Each of the sub-class implements the interface Citizen. sayHello () method has to display "Hello" phrase
 * in different languages. Make sure that the nested classes are not available outside the class-factory.
 *
 * @author Kontar Maryna
 */
public class CitizenFactory {

    private static int citizenAmount; //просто для себя создавала

   private CitizenFactory() { } //TODO 1. Надо или нет делать доступ к методу-фабрике(createCitizen(...)) через єкземпляр класса
// (конструктор сделать public или не переопределять пустой конструктор) или делать доступ к методу через сам класс (CitizenFactory.createCitizen(...))
//  Какой из вариантов к каким нежелательным последствиям может привести?
    //Ответ: Сделать приватный констуктор к фабрике.


    public static int getCitizenAmount() {
        return citizenAmount;
    }

    public static Citizen createCitizen(Citizen.CitizenType citizenType){
        switch (citizenType) {
            case ENGLISHMAN:
                citizenAmount++;
                return new Englishman();
            case CHINESE:
                citizenAmount++;
                return new Chinese();
            case RUSSIAN:
                citizenAmount++;
                return new Russian();
            case ITALIAN:
                citizenAmount++;
                return new Italian();
                default:                                    //TODO 3. Это же можно и не писать, т.к. других вариантов в CitizenType нет
                    citizenAmount++;
                    return new Englishman();
        }
    }

    private static class Englishman implements Citizen{     //TODO 2. " Удостоверьтесь, что вложенные классы недоступны вне класса-фабрики."
                                                            //ведь достаточно сделать класс просто private?
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    private static class Chinese implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("嗨!");//嗨
        }
    }

    private static class Russian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Привет!");
        }
    }

    private static class Italian implements Citizen{
        @Override
        public void sayHello() {
            System.out.println("Ciao!");
        }
    }

}
