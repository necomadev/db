package co.aikar.idb;

import co.aikar.idb.schema.Attribute;
import co.aikar.idb.schema.types.DateTimeColumn;
import co.aikar.idb.schema.Key;

public enum TestDefinition implements Table {
    TEST("test", TestColumns.ABC, Key.primary(TestColumns.ABC));

    private final String name;
    private final Attribute[] attributes;

    TestDefinition(String name, Attribute... attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Attribute[] getAttributes() {
        return attributes;
    }

    public static class TestColumns {
        public static final DateTimeColumn ABC = DateTimeColumn.of("abc");
    }
}
