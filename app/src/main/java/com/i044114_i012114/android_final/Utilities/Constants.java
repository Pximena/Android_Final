package com.i044114_i012114.android_final.Utilities;

/**
 * Created by ACER on 19/11/2017.
 */

public class Constants {
    public static final String TABLA_NAME_PRODUCTS = "products";
    public static final String TABLA_FIELD_ID = "id";
    public static final String TABLA_FIELD_NAME_PRODUCT = "namepro";
    public static final String TABLA_FIELD_DESCRIPTION = "description";
    public static final String TABLA_FIELD_CANTIDAD = "cantidad";
    public static final String TABLA_FIELD_URL = "url";
    public static final String CREATE_TABLE_PRODUCTS =
            "CREATE TABLE "+ TABLA_NAME_PRODUCTS+" ("+
                    TABLA_FIELD_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    TABLA_FIELD_NAME_PRODUCT+" TEXT, "+
                    TABLA_FIELD_DESCRIPTION+" TEXT, "+
                    TABLA_FIELD_CANTIDAD+" TEXT, "+
                    TABLA_FIELD_URL+" TEXT)";
}
