/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.Rights;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RightsRecord extends TableRecordImpl<RightsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEETYPE</code>.
     */
    public void setGranteetype(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEETYPE</code>.
     */
    public String getGranteetype() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEDROLE</code>.
     */
    public void setGrantedrole(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEDROLE</code>.
     */
    public String getGrantedrole() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.RIGHTS</code>.
     */
    public void setRights(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.RIGHTS</code>.
     */
    public String getRights() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Rights.RIGHTS.GRANTEE;
    }

    @Override
    public Field<String> field2() {
        return Rights.RIGHTS.GRANTEETYPE;
    }

    @Override
    public Field<String> field3() {
        return Rights.RIGHTS.GRANTEDROLE;
    }

    @Override
    public Field<String> field4() {
        return Rights.RIGHTS.RIGHTS_;
    }

    @Override
    public Field<String> field5() {
        return Rights.RIGHTS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return Rights.RIGHTS.TABLE_NAME;
    }

    @Override
    public String component1() {
        return getGrantee();
    }

    @Override
    public String component2() {
        return getGranteetype();
    }

    @Override
    public String component3() {
        return getGrantedrole();
    }

    @Override
    public String component4() {
        return getRights();
    }

    @Override
    public String component5() {
        return getTableSchema();
    }

    @Override
    public String component6() {
        return getTableName();
    }

    @Override
    public String value1() {
        return getGrantee();
    }

    @Override
    public String value2() {
        return getGranteetype();
    }

    @Override
    public String value3() {
        return getGrantedrole();
    }

    @Override
    public String value4() {
        return getRights();
    }

    @Override
    public String value5() {
        return getTableSchema();
    }

    @Override
    public String value6() {
        return getTableName();
    }

    @Override
    public RightsRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public RightsRecord value2(String value) {
        setGranteetype(value);
        return this;
    }

    @Override
    public RightsRecord value3(String value) {
        setGrantedrole(value);
        return this;
    }

    @Override
    public RightsRecord value4(String value) {
        setRights(value);
        return this;
    }

    @Override
    public RightsRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public RightsRecord value6(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public RightsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RightsRecord
     */
    public RightsRecord() {
        super(Rights.RIGHTS);
    }

    /**
     * Create a detached, initialised RightsRecord
     */
    public RightsRecord(String grantee, String granteetype, String grantedrole, String rights, String tableSchema, String tableName) {
        super(Rights.RIGHTS);

        setGrantee(grantee);
        setGranteetype(granteetype);
        setGrantedrole(grantedrole);
        setRights(rights);
        setTableSchema(tableSchema);
        setTableName(tableName);
    }
}
