package co.aikar.idb.schema.types;

import co.aikar.idb.schema.AbstractColumn;

public class BooleanColumn extends AbstractColumn<Boolean> {

    public static BooleanColumn of(String name) {
        return new BooleanColumn(name);
    }

    private BooleanColumn(String name) {
        super(name, "BIT(1)");
    }

    @Override
    public Boolean get(Object object) {
        return (Boolean) object;
    }

}
