package co.aikar.idb;

import co.aikar.idb.schema.Attribute;

import java.util.StringJoiner;

public interface Table {

    /**
     * MySQL table identifier
     *
     * @return table identifier
     */
    String getName();

    /**
     * This String consists of all table attributes needed to execute a <code>CREATE TABLE</code>
     * The sole purpose is to use this at application start to ensure all tables
     *
     * @return table attributes with types
     */
    default String getTableAttributes() {
        StringJoiner joiner = new StringJoiner(",");
        for (Attribute attribute : getAttributes()) {
            joiner.add(attribute.toDefinition());
        }
        return joiner.toString();
    }

    /**
     * Column definition of this table
     *
     * @return column definitions
     */
    Attribute[] getAttributes();

}
