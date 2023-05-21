/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.Schemata;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemataRecord extends TableRecordImpl<SchemataRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
     */
    public void setSchemaName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
     */
    public void setSchemaOwner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
     */
    public String getSchemaOwner() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG</code>.
     */
    public void setDefaultCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG</code>.
     */
    public String getDefaultCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA</code>.
     */
    public void setDefaultCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA</code>.
     */
    public String getDefaultCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public void setDefaultCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public String getDefaultCharacterSetName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.SQL_PATH</code>.
     */
    public void setSqlPath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.SQL_PATH</code>.
     */
    public String getSqlPath() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public void setDefaultCollationName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public String getDefaultCollationName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Schemata.SCHEMATA.CATALOG_NAME;
    }

    @Override
    public Field<String> field2() {
        return Schemata.SCHEMATA.SCHEMA_NAME;
    }

    @Override
    public Field<String> field3() {
        return Schemata.SCHEMATA.SCHEMA_OWNER;
    }

    @Override
    public Field<String> field4() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field7() {
        return Schemata.SCHEMATA.SQL_PATH;
    }

    @Override
    public Field<String> field8() {
        return Schemata.SCHEMATA.DEFAULT_COLLATION_NAME;
    }

    @Override
    public Field<String> field9() {
        return Schemata.SCHEMATA.REMARKS;
    }

    @Override
    public String component1() {
        return getCatalogName();
    }

    @Override
    public String component2() {
        return getSchemaName();
    }

    @Override
    public String component3() {
        return getSchemaOwner();
    }

    @Override
    public String component4() {
        return getDefaultCharacterSetCatalog();
    }

    @Override
    public String component5() {
        return getDefaultCharacterSetSchema();
    }

    @Override
    public String component6() {
        return getDefaultCharacterSetName();
    }

    @Override
    public String component7() {
        return getSqlPath();
    }

    @Override
    public String component8() {
        return getDefaultCollationName();
    }

    @Override
    public String component9() {
        return getRemarks();
    }

    @Override
    public String value1() {
        return getCatalogName();
    }

    @Override
    public String value2() {
        return getSchemaName();
    }

    @Override
    public String value3() {
        return getSchemaOwner();
    }

    @Override
    public String value4() {
        return getDefaultCharacterSetCatalog();
    }

    @Override
    public String value5() {
        return getDefaultCharacterSetSchema();
    }

    @Override
    public String value6() {
        return getDefaultCharacterSetName();
    }

    @Override
    public String value7() {
        return getSqlPath();
    }

    @Override
    public String value8() {
        return getDefaultCollationName();
    }

    @Override
    public String value9() {
        return getRemarks();
    }

    @Override
    public SchemataRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    @Override
    public SchemataRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    public SchemataRecord value3(String value) {
        setSchemaOwner(value);
        return this;
    }

    @Override
    public SchemataRecord value4(String value) {
        setDefaultCharacterSetCatalog(value);
        return this;
    }

    @Override
    public SchemataRecord value5(String value) {
        setDefaultCharacterSetSchema(value);
        return this;
    }

    @Override
    public SchemataRecord value6(String value) {
        setDefaultCharacterSetName(value);
        return this;
    }

    @Override
    public SchemataRecord value7(String value) {
        setSqlPath(value);
        return this;
    }

    @Override
    public SchemataRecord value8(String value) {
        setDefaultCollationName(value);
        return this;
    }

    @Override
    public SchemataRecord value9(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public SchemataRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemataRecord
     */
    public SchemataRecord() {
        super(Schemata.SCHEMATA);
    }

    /**
     * Create a detached, initialised SchemataRecord
     */
    public SchemataRecord(String catalogName, String schemaName, String schemaOwner, String defaultCharacterSetCatalog, String defaultCharacterSetSchema, String defaultCharacterSetName, String sqlPath, String defaultCollationName, String remarks) {
        super(Schemata.SCHEMATA);

        setCatalogName(catalogName);
        setSchemaName(schemaName);
        setSchemaOwner(schemaOwner);
        setDefaultCharacterSetCatalog(defaultCharacterSetCatalog);
        setDefaultCharacterSetSchema(defaultCharacterSetSchema);
        setDefaultCharacterSetName(defaultCharacterSetName);
        setSqlPath(sqlPath);
        setDefaultCollationName(defaultCollationName);
        setRemarks(remarks);
    }
}