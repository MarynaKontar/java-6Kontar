package module4.online;

import java.io.IOException;

/**
 * Created by User on 14.02.2017.
 */
public class BlackboardWriter implements Writer, java.io.Closeable {
    @Override
    public void write(String str) {
        System.out.println("Write into BB:" + str);
    }

    @Override
    public void close() throws IOException {
        
    }
}
