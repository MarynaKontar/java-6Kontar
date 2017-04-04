package module9.homeWork9;

/**
 * Java#6
 * Module 9 Task 1
 *
 * @author Kontar Maryna
 */

public class Order  {

    private static long counter;
    private final long id = counter++;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order ( int price, Currency currency, String itemName, String shopIdentificator, User user ) {
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId () {
        return id;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }

    public Currency getCurrency () { return currency; }

    public void setCurrency ( Currency currency ) {
        this.currency = currency;
    }

    public String getItemName () {
        return itemName;
    }

    public void setItemName ( String itemName ) {
        this.itemName = itemName;
    }

    public String getShopIdentificator () {
        return shopIdentificator;
    }

    public void setShopIdentificator ( String shopIdentificator ) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }


    /**
     * orders are equal when equals all Orders fields except id
     * @param o
     * @return
     */
    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        Order order = (Order) o;

        if (getPrice ( ) != order.getPrice ( )) return false;
        if (getCurrency ( ) != order.getCurrency ( )) return false;
        if (getItemName ( ) != null ? !getItemName ( ).equals ( order.getItemName ( ) ) : order.getItemName ( ) != null)
            return false;
        if (getShopIdentificator ( ) != null ? !getShopIdentificator ( ).equals ( order.getShopIdentificator ( ) ) : order.getShopIdentificator ( ) != null)
            return false;
        return getUser ( ) != null ? getUser ( ).equals ( order.getUser ( ) ) : order.getUser ( ) == null;
    }

    @Override
    public int hashCode () {
        int result = getPrice ( );
        result = 31 * result + (getCurrency ( ) != null ? getCurrency ( ).hashCode ( ) : 0);
        result = 31 * result + (getItemName ( ) != null ? getItemName ( ).hashCode ( ) : 0);
        result = 31 * result + (getShopIdentificator ( ) != null ? getShopIdentificator ( ).hashCode ( ) : 0);
        result = 31 * result + (getUser ( ) != null ? getUser ( ).hashCode ( ) : 0);
        return result;
    }

    @Override
    public String toString () {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user.getLastName ( ) + ", " + user.getCity ( ) +
                '}' + "\n";
    }
}




