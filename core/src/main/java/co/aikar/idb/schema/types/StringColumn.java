package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

public class StringColumn extends AbstractColumn<String> {

    public static StringColumn of(String name, int length) {
        return new StringColumn(name, length);
    }

    public static StringColumn ofNullable(String name, int length) {
        return new StringColumn(name, length, true, null);
    }

    public static StringColumn ofDefault(String name, int length, String defaultValue) {
        return new StringColumn(name, length, false, defaultValue);
    }

    public StringColumn(String name, int length) {
        super(name, "VARCHAR(" + length + ")");
    }

    public StringColumn(String name, int length, boolean nullable, String defaultValue) {
        super(name, "VARCHAR(" + length + ")", nullable, defaultValue, null);
    }

    @Override
    public String get(Object object) {
        return (String) object;
    }
}
