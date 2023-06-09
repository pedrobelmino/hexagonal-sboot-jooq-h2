/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.InDoubt;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InDoubtRecord extends TableRecordImpl<InDoubtRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION_NAME</code>.
     */
    public void setTransactionName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION_NAME</code>.
     */
    public String getTransactionName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION_STATE</code>.
     */
    public void setTransactionState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION_STATE</code>.
     */
    public String getTransactionState() {
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
        return InDoubt.IN_DOUBT.TRANSACTION_NAME;
    }

    @Override
    public Field<String> field2() {
        return InDoubt.IN_DOUBT.TRANSACTION_STATE;
    }

    @Override
    public String component1() {
        return getTransactionName();
    }

    @Override
    public String component2() {
        return getTransactionState();
    }

    @Override
    public String value1() {
        return getTransactionName();
    }

    @Override
    public String value2() {
        return getTransactionState();
    }

    @Override
    public InDoubtRecord value1(String value) {
        setTransactionName(value);
        return this;
    }

    @Override
    public InDoubtRecord value2(String value) {
        setTransactionState(value);
        return this;
    }

    @Override
    public InDoubtRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InDoubtRecord
     */
    public InDoubtRecord() {
        super(InDoubt.IN_DOUBT);
    }

    /**
     * Create a detached, initialised InDoubtRecord
     */
    public InDoubtRecord(String transactionName, String transactionState) {
        super(InDoubt.IN_DOUBT);

        setTransactionName(transactionName);
        setTransactionState(transactionState);
    }
}
