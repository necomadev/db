package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

import java.math.BigDecimal;

public class DoubleColumn extends AbstractColumn<Double> {

    public static DoubleColumn of(String name) {
        return new DoubleColumn(name);
    }

    public static DoubleColumn ofNullable(String name) {
        return new DoubleColumn(name, true, null, null);
    }

    public static DoubleColumn ofDefault(String name, int defaultValue) {
        return new DoubleColumn(name, false, String.valueOf(defaultValue), null);
    }

    public static DoubleColumn ofGenerated(String name, String generatedAs) {
        return new DoubleColumn(name, true, null, generatedAs);
    }

    private DoubleColumn(String name) {
        super(name, "DOUBLE");
    }

    public DoubleColumn(String name,boolean nullable, String defaultValue, String generatedAs) {
        super(name, "DOUBLE", nullable, defaultValue, generatedAs);
    }

    @Override
    public Double get(Object object) {
        if (object instanceof BigDecimal) {
            return ((BigDecimal) object).doubleValue();
        }
        return (Double) object;
    }

}
