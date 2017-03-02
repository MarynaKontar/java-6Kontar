package module5.homeWork5.neVernoe;

import java.time.LocalDate;

/**
 * Java#6
 * Module 5 Task 1, 2
 * Class Room should contain fields
 * long id
 * int price
 * int persons
 * Date dateAvailableFrom
 * String hotelName
 * String cityName
 * Generate getters and setters. And create constructor with all fields.
 * Override equals and hashCode methods. Rooms are equal when price,
 * persons and cityName are equal.
 *
 * @author Kontar Maryna
 */

public class Room {

    private long id;
    private int price;
    private int persons;
    private LocalDate dateAvailableFrom;
    private String hotelName;
    private String cityName;


    public Room(long id, int price, int persons, LocalDate dateAvailableFrom,
                String hotelName, String cityName) {

        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public LocalDate getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(LocalDate dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName != null ? cityName.equals(room.cityName) : room.cityName == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }
}

//Проверьте объект на null, а также проверьте, чтобы объекты были одного типа.
// Не делайте проверку с помощью instanceof так как такая проверка будет
// возвращать true для подклассов и будет работать правильно только в случае если
// ваш класс объявлен как immutable.
// Вместо этого можно использовать getClass();

