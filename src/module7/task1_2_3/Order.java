package module7.task1_2_3;

/**
 * Java#6
 * Module 7 Task 1
 *
 * @author Kontar Maryna
 */

import java.math.BigDecimal;
import java.util.Comparator;

public class Order implements Comparable <Order> {

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

    public Currency getCurrency () {
        return currency;
    }

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
     * compare by price
     * @param o
     * @return
     */
    @Override
    public int compareTo ( Order o ) {return ((Integer) price).compareTo ( o.price );}
        //TODO 1. price - примитив int, а compareTo работает только с объектами, поэтому надо делать autoboxing (Integer) price)?
        //TODO 2.Если мы хотим сортировать объекты классов, которые создаем сами (в дз - это объекты класса Order), то должны
        // имплементировать в этом классе интерфейс Comparable (без этого Collections.sort не доступно) и, соответственно,
        // переопределить метод compareTo для объектов нашего класса таким образом, как мы предпочитаем потом сортировать объекты.
        // А если хотим один раз по одному сортировать, другой - по другому, то создаем класс ((не в Order, а отдельно, п.ч.
        // если мы будем эти методы внутри order писать, то это нарушения принципа Single Responsibility)),
        // который имплементирует интерфейс Comparator (переопределяем метод compare).
        // Т.е. сколько видов сортировок (не natural или reverseOrder) нам нужно
        // СТОЛЬКО И ДОПОЛНИТЕЛЬНЫХ КЛАССОВ,ИМПЛЕМЕНТИРУЮЩИХ ИНТЕРФЕЙС КОМПАРАТОР надо создавать? Не обязательно, только,
        // если такая сортировка будет использоваться еще. А если один раз - то анонимный класс


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
        // TODO 3. в чем все таки разница, писать название поля или  getПоле в методах (например toString ())?
        // Ведь поля и так все private. Есть случаи, когда это имеет значение? Можно все-таки как-то "дотянуться" до поля класса,
        // (если оно private но в методах класса вызывается напрямую а,не через getПоле) и напортачить что-нибудь?
    }
}




