package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.time.Instant;
import java.util.Date;

public class DateColumn extends AbstractColumn<Instant> {

    public static DateColumn of(String name) {
        return new DateColumn(name);
    }

    private DateColumn(String name) {
        super(name, "DATE");
    }

    @Override
    public Instant get(Object object) {
        if (object instanceof Date) {
            return ((Date) object).toInstant();
        }
        return null;
    }
}
