package co.aikar.idb;

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
    String getTableAttributes();

}
