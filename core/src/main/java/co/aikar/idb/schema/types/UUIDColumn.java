package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.util.UUID;

public class UUIDColumn extends AbstractColumn<UUID> {

    public static UUIDColumn of(String name) {
        return new UUIDColumn(name);
    }

    public static UUIDColumn ofNullable(String name) {
        return new UUIDColumn(name, true, null);
    }

    public static UUIDColumn ofDefault(String name, String defaultValue) {
        return new UUIDColumn(name, false, defaultValue);
    }

    public UUIDColumn(String name) {
        super(name, "VARCHAR(" + 36 + ")");
    }

    public UUIDColumn(String name, boolean nullable, String defaultValue) {
        super(name, "VARCHAR(" + 36 + ")", nullable, defaultValue, null);
    }

    @Override
    public UUID get(Object object) {
        return object instanceof String ? UUID.fromString((String) object) : null;
    }
}
