package module5.homeWork5.homeWork5;

/**
 * Java#6
 * Module 5 Task 5
 * Create DAO interface and its implementation. Methods print operation name and object which was used.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 *
 * @author Kontar Maryna
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] createDB();

//TODO почему функция save не void? Или надо может это надо  для того, чтобы возвращать null, если закончился массив БД
    //(мы же не должны  были в задании пока расширять массив БД?)

}
