package EnumExamples;

import static EnumExamples.Planet.EARTH;

/**
 * Created by User on 10.02.2017.
 */
public class EnumExample {

public enum Company {
    EBAY(30,4), PAYPAL(10,5), GOOGLE(15,5), YAHOO(20,7), ATT(25,6);

    private int value;
    private int valuettt;

    private Company(int value, int value1) {
        this.value = value;
        this.valuettt = value1;

    }

    @Override public String toString() {
        //only capitalize the first letter
        String s = super.toString();
        return s.substring(0, 1) + s.substring(1).toLowerCase();//first letter don't change, other letters begining from 1 - lower case
    }

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

        case GOOGLE:
        case YAHOO:
            System.out.println("1st Web 2.0 Company.");
            break;

        default:
            System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
            break;
    }
}

    public static void main(String[] args) {
        EnumExample ebay = new EnumExample(Company.EBAY);
        ebay.companyDetails();
        EnumExample paypal = new EnumExample(Company.PAYPAL);
        paypal.companyDetails();
        EnumExample google = new EnumExample(Company.GOOGLE);
        google.companyDetails();
        EnumExample yahoo = new EnumExample(Company.YAHOO);
        yahoo.companyDetails();
        EnumExample att = new EnumExample(Company.ATT);
        att.companyDetails();

        for (Company cName : Company.values()) {
            System.out.println("Company Value: " + cName.value +  " fgdfg " + cName.valuettt + " - Company Name: " + cName.toString());
        }

        //errors
        Company name = Company.EBAY;
        //name = 1; //Compilation Error
        //Enum in Java are type-safe: Enum has there own name-space.
        // It means your enum will have a type for example “Company” in below example and
        // you can not assign any value other than specified in Enum Constants.







        //Planet

//            if (args.length != 1) {
//                System.err.println("Usage: java Planet <earth_weight>");
//                System.exit(-1);
//            }
            double earthWeight = Double.parseDouble("175");
            double mass = earthWeight/EARTH.surfaceGravity();
            for (Planet p : Planet.values())
                System.out.printf("Your weight on %s is %f%n",
                        p, p.surfaceWeight(mass));

        System.out.println(Integer.MAX_VALUE );
        String s = "GOOGLE";
        Company name1 = Company.valueOf(s);
        System.out.println(name1);
}



}

