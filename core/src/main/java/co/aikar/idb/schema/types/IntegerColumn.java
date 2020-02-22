package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.math.BigDecimal;

public class IntegerColumn extends AbstractColumn<Integer> {

    private final boolean autoIncrement;

    public static IntegerColumn of(String name, boolean autoIncrement) {
        return new IntegerColumn(name, autoIncrement);
    }

    public static IntegerColumn of(String name) {
        return of(name, false);
    }

    public static IntegerColumn ofNullable(String name) {
        return new IntegerColumn(name, true, null, null);
    }

    public static IntegerColumn ofDefault(String name, int defaultValue) {
        return new IntegerColumn(name, false, String.valueOf(defaultValue), null);
    }

    public static IntegerColumn ofGenerated(String name, String generatedAs) {
        return new IntegerColumn(name, true, null, generatedAs);
    }

    private IntegerColumn(String name, boolean autoIncrement) {
        super(name, "INTEGER");
        this.autoIncrement = autoIncrement;
    }

    private IntegerColumn(String name, boolean nullable, String defaultValue, String generatedAs) {
        super(name, "INTEGER", nullable, defaultValue, generatedAs);
        this.autoIncrement = false;
    }

    @Override
    public Integer get(Object object) {
        if (object instanceof BigDecimal) {
            return ((BigDecimal) object).intValue();
        }
        return (Integer) object;
    }

    @Override
    public String toDefinition() {
        String def = super.toDefinition();
        if (autoIncrement) {
            def = def + " AUTO_INCREMENT";
        }
        return def;
    }

}
