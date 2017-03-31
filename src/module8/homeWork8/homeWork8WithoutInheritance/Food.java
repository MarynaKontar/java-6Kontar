package module8.homeWork8.homeWork8WithoutInheritance;

/**
 * Java#6
 * Module 8 Task 2
 * Создайте класс food со следующими полями:
 * id (уникальный идентификатор товара)
 * name (наименование товара)
 * country (страна производитель)
 * expiration (срок годности в днях)
 * Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и
 * генерироваться с помощью IdGenerator при создании товара.
 * Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.
 * @author Kontar Maryna
 */
public class Food {

    private final long id;
    private String name;
    private Country country;
    private int expiration;

    public Food ( String name, Country country, int expiration ) {
        id = IdGenerator.idGenerate ();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public long getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Country getCountry () {
        return country;
    }

    public void setCountry ( Country country ) {
        this.country = country;
    }

    public int getExpiration () {
        return expiration;
    }

    public void setExpiration ( int expiration ) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        Food food = (Food) o;

        return getId ( ) == food.getId ( );
    }

    @Override
    public int hashCode () {
        return (int) (getId ( ) ^ (getId ( ) >>> 32));
    }

    @Override
    public String toString () {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                "}";
    }
}
