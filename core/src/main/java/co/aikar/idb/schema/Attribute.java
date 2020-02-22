package co.aikar.idb.schema;

public interface Attribute {

    /**
     * Generates a SQL ready column definition. To be used in CREATE TABLE statements.
     *
     * @return sql friendly column definition
     */
    String toDefinition();

}
