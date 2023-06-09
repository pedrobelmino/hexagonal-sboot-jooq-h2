/*
 * This file is generated by jOOQ.
 */
package br.com.pedrobelmino.springbootjooq.database.information_schema.tables;


import br.com.pedrobelmino.springbootjooq.database.information_schema.InformationSchema;
import br.com.pedrobelmino.springbootjooq.database.information_schema.tables.records.ParametersRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<ParametersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.PARAMETERS</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParametersRecord> getRecordType() {
        return ParametersRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public final TableField<ParametersRecord, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public final TableField<ParametersRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_MODE</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_MODE = createField(DSL.name("PARAMETER_MODE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.IS_RESULT</code>.
     */
    public final TableField<ParametersRecord, String> IS_RESULT = createField(DSL.name("IS_RESULT"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.AS_LOCATOR</code>.
     */
    public final TableField<ParametersRecord, String> AS_LOCATOR = createField(DSL.name("AS_LOCATOR"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_NAME</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_NAME = createField(DSL.name("PARAMETER_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.DATA_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<ParametersRecord, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("CHARACTER_SET_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("CHARACTER_SET_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<ParametersRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_CATALOG</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_CATALOG = createField(DSL.name("COLLATION_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_SCHEMA</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_SCHEMA = createField(DSL.name("COLLATION_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_NAME</code>.
     */
    public final TableField<ParametersRecord, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public final TableField<ParametersRecord, Integer> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public final TableField<ParametersRecord, Integer> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> INTERVAL_TYPE = createField(DSL.name("INTERVAL_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_PRECISION</code>.
     */
    public final TableField<ParametersRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("INTERVAL_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.MAXIMUM_CARDINALITY</code>.
     */
    public final TableField<ParametersRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("MAXIMUM_CARDINALITY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public final TableField<ParametersRecord, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<ParametersRecord, Integer> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<ParametersRecord, Integer> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_DEFAULT</code>.
     */
    public final TableField<ParametersRecord, String> PARAMETER_DEFAULT = createField(DSL.name("PARAMETER_DEFAULT"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_TYPE</code>.
     */
    public final TableField<ParametersRecord, String> GEOMETRY_TYPE = createField(DSL.name("GEOMETRY_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_SRID</code>.
     */
    public final TableField<ParametersRecord, Integer> GEOMETRY_SRID = createField(DSL.name("GEOMETRY_SRID"), SQLDataType.INTEGER, this, "");

    private Parameters(Name alias, Table<ParametersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<ParametersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.PARAMETERS</code> table
     * reference
     */
    public Parameters(String alias) {
        this(DSL.name(alias), PARAMETERS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.PARAMETERS</code> table
     * reference
     */
    public Parameters(Name alias) {
        this(alias, PARAMETERS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.PARAMETERS</code> table reference
     */
    public Parameters() {
        this(DSL.name("PARAMETERS"), null);
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, ParametersRecord> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Parameters as(String alias) {
        return new Parameters(DSL.name(alias), this);
    }

    @Override
    public Parameters as(Name alias) {
        return new Parameters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(String name) {
        return new Parameters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parameters rename(Name name) {
        return new Parameters(name, null);
    }
}
