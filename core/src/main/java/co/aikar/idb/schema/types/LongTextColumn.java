package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

public class LongTextColumn extends AbstractColumn<String> {

    public static LongTextColumn of(String name) {
        return new LongTextColumn(name);
    }

    public static LongTextColumn ofNullable(String name) {
        return new LongTextColumn(name, true, null);
    }

    public static LongTextColumn ofDefault(String name, String defaultValue) {
        return new LongTextColumn(name, false, defaultValue);
    }

    public LongTextColumn(String name) {
        super(name, "LONGTEXT");
    }

    public LongTextColumn(String name, boolean nullable, String defaultValue) {
        super(name, "LONGTEXT", nullable, defaultValue, null);
    }

    @Override
    public String get(Object object) {
        return (String) object;
    }

}
