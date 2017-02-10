/**
 * Created by User on 10.02.2017.
 */
public class EnumExample {

public enum Company {
    EBAY, PAYPAL, GOOGLE, YAHOO, ATT
}
Company cName;
public EnumExample(Company cName){
    this.cName = cName;
}
public void companyDetails(){
    switch (cName){
        case EBAY:
            System.out.println("Biggest Market Place in the World.");
            break;

        case PAYPAL:
            System.out.println("Simplest way to manage Money.");
    break;
    }
}
}

