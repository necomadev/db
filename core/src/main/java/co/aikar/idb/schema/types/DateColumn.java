package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.sql.Date;
import java.time.LocalDate;

public class DateColumn extends AbstractColumn<LocalDate> {

    public static DateColumn of(String name) {
        return new DateColumn(name);
    }

    private DateColumn(String name) {
        super(name, "DATE");
    }

    @Override
    public LocalDate get(Object object) {
        if (object instanceof Date) {
            return ((Date) object).toLocalDate();
        }
        return null;
    }
}
