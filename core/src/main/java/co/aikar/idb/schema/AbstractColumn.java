package co.aikar.idb.schema;

public abstract class AbstractColumn<T> implements Column<T> {

    private final String name;
    private final String sqlType;
    private final boolean nullable;
    private final String defaultValue;
    private final String generatedAs;

    public AbstractColumn(String name, String sqlType, boolean nullable, String defaultValue, String generatedAs) {
        this.name = name;
        this.sqlType = sqlType;
        this.nullable = nullable;
        this.defaultValue = defaultValue;
        this.generatedAs = generatedAs;
    }

    public AbstractColumn(String name, String sqlType) {
        this(name, sqlType, false, null, null);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSqlType() {
        return sqlType;
    }

    @Override
    public boolean isNullable() {
        return nullable;
    }

    @Override
    public String toDefinition() {
        StringBuilder definitionBuilder = new StringBuilder();
        definitionBuilder.append(getName())
                .append(" ")
                .append(getSqlType());
        if (!isNullable()) {
            definitionBuilder.append(" NOT NULL");
        }

        if (defaultValue != null) {
            definitionBuilder.append(" DEFAULT ").append(defaultValue);
        }

        if (generatedAs != null) {
            definitionBuilder.append(" GENERATED ALWAYS AS (").append(generatedAs).append(") PERSISTENT");
        }

        return definitionBuilder.toString();
    }
}
