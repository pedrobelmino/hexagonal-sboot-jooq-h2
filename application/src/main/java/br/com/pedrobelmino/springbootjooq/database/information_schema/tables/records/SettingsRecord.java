/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records;


import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.Settings;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SettingsRecord extends TableRecordImpl<SettingsRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.SETTINGS.SETTING_NAME</code>.
     */
    public void setSettingName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SETTINGS.SETTING_NAME</code>.
     */
    public String getSettingName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SETTINGS.SETTING_VALUE</code>.
     */
    public void setSettingValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SETTINGS.SETTING_VALUE</code>.
     */
    public String getSettingValue() {
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
        return Settings.SETTINGS.SETTING_NAME;
    }

    @Override
    public Field<String> field2() {
        return Settings.SETTINGS.SETTING_VALUE;
    }

    @Override
    public String component1() {
        return getSettingName();
    }

    @Override
    public String component2() {
        return getSettingValue();
    }

    @Override
    public String value1() {
        return getSettingName();
    }

    @Override
    public String value2() {
        return getSettingValue();
    }

    @Override
    public SettingsRecord value1(String value) {
        setSettingName(value);
        return this;
    }

    @Override
    public SettingsRecord value2(String value) {
        setSettingValue(value);
        return this;
    }

    @Override
    public SettingsRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SettingsRecord
     */
    public SettingsRecord() {
        super(Settings.SETTINGS);
    }

    /**
     * Create a detached, initialised SettingsRecord
     */
    public SettingsRecord(String settingName, String settingValue) {
        super(Settings.SETTINGS);

        setSettingName(settingName);
        setSettingValue(settingValue);
    }
}
