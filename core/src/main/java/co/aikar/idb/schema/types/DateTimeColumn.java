package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

public class DateTimeColumn extends AbstractColumn<Instant> {

    public static DateTimeColumn of(String name) {
        return new DateTimeColumn(name);
    }

    private DateTimeColumn(String name) {
        super(name, "DATETIME");
    }

    @Override
    public Instant get(Object object) {
        if (object instanceof Timestamp) {
            return ((Timestamp) object).toInstant();
        }
        return null;
    }

}
