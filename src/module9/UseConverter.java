package module9;

/**
 * Created by User on 01.04.2017.
 */
public class UseConverter {
    static int OuterNumber;// мы можем записывать значения в экземплярные поля класса и статические переменные внутри лямбда-выражений.
    public static void main ( String[] args ) {
        Converter<String, Integer> converter = Integer::valueOf;//from -> Integer.valueOf ( from );
        Integer converted = converter.convert ( "456" );
        System.out.println(converted);    // 456

        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> { OuterNumber = 6;
        return String.valueOf(from + num + OuterNumber);};

        stringConverter.convert(2);

    }
}
