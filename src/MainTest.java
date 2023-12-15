import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main test = new Main();

    @org.junit.jupiter.api.Test
    void date() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String lungo = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        String medio = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM));
        String corto = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));

        assertEquals("venerdì 1 marzo 2002, 13:00", lungo);
        assertEquals("1 mar 2002, 13:00:00", medio);
        assertEquals("01/03/02, 13:00", corto);
    }
}