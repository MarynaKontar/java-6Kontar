package module9;

/**
 * Created by User on 01.04.2017.
 */
@FunctionalInterface
public interface Converter <F, T> {
    T convert(F from);
}
