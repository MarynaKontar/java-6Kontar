package module6.task4;

/**
 * Java#6
 * Module 6 Task 4 (new)
 * Create interface Citizen with method sayHello ().
 *
 * @author Kontar Maryna
 */
public interface Citizen {

   enum CitizenType {ENGLISHMAN, CHINESE, RUSSIAN, ITALIAN} //TODO 4. В задании не біло сказано написать enum. Сделала для удобства. Логично же его делать именно здесь, в интерфейсе?

   void sayHello();
}













//
//    ENGLISHMAN(0), CHINESE(1), RUSSIAN(2), ITALIAN(3);
//
//private final int nationalityId;
//
//        CitizenType(int nationalityId){
//        this.nationalityId = nationalityId;
//        }
//
//public int getNationalityId() {
//        return nationalityId;
//        }