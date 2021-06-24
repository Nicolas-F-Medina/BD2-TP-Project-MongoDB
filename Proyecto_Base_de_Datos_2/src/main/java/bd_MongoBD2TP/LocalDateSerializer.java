package bd_MongoBD2TP;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class LocalDateSerializer extends StdSerializer<LocalDate> {
    
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd::MM::yy");

    public LocalDateSerializer() {
        this(LocalDate.class);
    }

    public LocalDateSerializer(Class<LocalDate> date) {
        super(date);
    }

    @Override
    public void serialize(LocalDate t, JsonGenerator jg, SerializerProvider sp) throws IOException {
        jg.writeString(formatter.format(t));
    }

}