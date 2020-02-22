package co.aikar.idb.schema;

public interface Column<T> extends Attribute {

    /**
     * Transforms an object from a SQL response into the defined Java type generically
     *
     * @param object from sql response
     * @return generic column type
     */
    T get(Object object);

    /**
     * Name of the column in the SQL representation
     *
     * @return name
     */
    String getName();

    /**
     * The name of the data type in the SQL language
     *
     * @return name of sql data type
     */
    String getSqlType();

    /**
     * Wether or not this column can be null on the SQL side
     *
     * @return true if can be null
     */
    boolean isNullable();

}
