/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.Roles;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolesRecord extends TableRecordImpl<RolesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.ROLE_NAME</code>.
     */
    public void setRoleName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Roles.ROLES.ROLE_NAME;
    }

    @Override
    public Field<String> field2() {
        return Roles.ROLES.REMARKS;
    }

    @Override
    public String component1() {
        return getRoleName();
    }

    @Override
    public String component2() {
        return getRemarks();
    }

    @Override
    public String value1() {
        return getRoleName();
    }

    @Override
    public String value2() {
        return getRemarks();
    }

    @Override
    public RolesRecord value1(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public RolesRecord value2(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public RolesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RolesRecord
     */
    public RolesRecord() {
        super(Roles.ROLES);
    }

    /**
     * Create a detached, initialised RolesRecord
     */
    public RolesRecord(String roleName, String remarks) {
        super(Roles.ROLES);

        setRoleName(roleName);
        setRemarks(remarks);
    }
}
