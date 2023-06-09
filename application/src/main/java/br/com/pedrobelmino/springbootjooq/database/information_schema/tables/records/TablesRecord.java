/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.Tables;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesRecord extends TableRecordImpl<TablesRecord> implements Record11<String, String, String, String, String, String, String, String, Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public void setTableType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public String getTableType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public void setIsInsertableInto(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public String getIsInsertableInto() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public void setCommitAction(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public String getCommitAction() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
     */
    public void setStorageType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
     */
    public String getStorageType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
     */
    public void setLastModification(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
     */
    public Long getLastModification() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
     */
    public void setTableClass(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
     */
    public String getTableClass() {
        return (String) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
     */
    public void setRowCountEstimate(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
     */
    public Long getRowCountEstimate() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, String, Long, String, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, String, String, String, Long, String, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Tables.TABLES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Tables.TABLES.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Tables.TABLES.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return Tables.TABLES.TABLE_TYPE;
    }

    @Override
    public Field<String> field5() {
        return Tables.TABLES.IS_INSERTABLE_INTO;
    }

    @Override
    public Field<String> field6() {
        return Tables.TABLES.COMMIT_ACTION;
    }

    @Override
    public Field<String> field7() {
        return Tables.TABLES.STORAGE_TYPE;
    }

    @Override
    public Field<String> field8() {
        return Tables.TABLES.REMARKS;
    }

    @Override
    public Field<Long> field9() {
        return Tables.TABLES.LAST_MODIFICATION;
    }

    @Override
    public Field<String> field10() {
        return Tables.TABLES.TABLE_CLASS;
    }

    @Override
    public Field<Long> field11() {
        return Tables.TABLES.ROW_COUNT_ESTIMATE;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getTableType();
    }

    @Override
    public String component5() {
        return getIsInsertableInto();
    }

    @Override
    public String component6() {
        return getCommitAction();
    }

    @Override
    public String component7() {
        return getStorageType();
    }

    @Override
    public String component8() {
        return getRemarks();
    }

    @Override
    public Long component9() {
        return getLastModification();
    }

    @Override
    public String component10() {
        return getTableClass();
    }

    @Override
    public Long component11() {
        return getRowCountEstimate();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getTableType();
    }

    @Override
    public String value5() {
        return getIsInsertableInto();
    }

    @Override
    public String value6() {
        return getCommitAction();
    }

    @Override
    public String value7() {
        return getStorageType();
    }

    @Override
    public String value8() {
        return getRemarks();
    }

    @Override
    public Long value9() {
        return getLastModification();
    }

    @Override
    public String value10() {
        return getTableClass();
    }

    @Override
    public Long value11() {
        return getRowCountEstimate();
    }

    @Override
    public TablesRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public TablesRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TablesRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TablesRecord value4(String value) {
        setTableType(value);
        return this;
    }

    @Override
    public TablesRecord value5(String value) {
        setIsInsertableInto(value);
        return this;
    }

    @Override
    public TablesRecord value6(String value) {
        setCommitAction(value);
        return this;
    }

    @Override
    public TablesRecord value7(String value) {
        setStorageType(value);
        return this;
    }

    @Override
    public TablesRecord value8(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public TablesRecord value9(Long value) {
        setLastModification(value);
        return this;
    }

    @Override
    public TablesRecord value10(String value) {
        setTableClass(value);
        return this;
    }

    @Override
    public TablesRecord value11(Long value) {
        setRowCountEstimate(value);
        return this;
    }

    @Override
    public TablesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Long value9, String value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablesRecord
     */
    public TablesRecord() {
        super(Tables.TABLES);
    }

    /**
     * Create a detached, initialised TablesRecord
     */
    public TablesRecord(String tableCatalog, String tableSchema, String tableName, String tableType, String isInsertableInto, String commitAction, String storageType, String remarks, Long lastModification, String tableClass, Long rowCountEstimate) {
        super(Tables.TABLES);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setTableType(tableType);
        setIsInsertableInto(isInsertableInto);
        setCommitAction(commitAction);
        setStorageType(storageType);
        setRemarks(remarks);
        setLastModification(lastModification);
        setTableClass(tableClass);
        setRowCountEstimate(rowCountEstimate);
    }
}
