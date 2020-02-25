package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

public class BooleanColumn extends AbstractColumn<Boolean> {

    public static BooleanColumn of(String name) {
        return new BooleanColumn(name);
    }

    public static BooleanColumn ofDefault(String name, boolean defaultValue) {
        return new BooleanColumn(name, defaultValue);
    }

    private BooleanColumn(String name) {
        super(name, "BIT(1)");
    }

    private BooleanColumn(String name, boolean defaultValue) {
        super(name, "BIT(1)", false, String.valueOf(defaultValue), null);
    }

    @Override
    public Boolean get(Object object) {
        return (Boolean) object;
    }

}
