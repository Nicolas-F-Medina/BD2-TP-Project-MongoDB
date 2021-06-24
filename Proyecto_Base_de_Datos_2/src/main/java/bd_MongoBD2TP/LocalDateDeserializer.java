package bd_MongoBD2TP;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd::MM::yy");

    public LocalDateDeserializer() {
        this(LocalDate.class);
    }

    public LocalDateDeserializer(Class<LocalDate> date) {
        super(date);
    }

    @Override
    public LocalDate deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        return LocalDate.parse(jp.getValueAsString(), formatter);
    }

}
