package com.i044114_i012114.android_final;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.i044114_i012114.android_final.Adapters.ProductosAdapter;
import com.i044114_i012114.android_final.Helper.SqliteHelper;
import com.i044114_i012114.android_final.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductosActivity extends AppCompatActivity {

    RecyclerView recyclerViewContacts;
    ProductosAdapter productosAdapter;
    List<Product> productList = new ArrayList<>();
    SqliteHelper sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        recyclerViewContacts = (RecyclerView) findViewById(R.id.id_rv_contacts);
        sqliteHelper = new SqliteHelper(this, "db_products", null, 7);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewContacts.setLayoutManager(linearLayoutManager);

        listContacts();
    }
    public void listContacts(){
        SQLiteDatabase db = sqliteHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select id,namepro,description,cantidad,url from products order by id desc", null);

        while (cursor.moveToNext()){
            Product product = new Product();
            product.setId(cursor.getInt(0));
            product.setNamepro(cursor.getString(1));
            product.setDescription(cursor.getString(2));
            product.setCantidad(cursor.getString(3));
            product.setUrl(cursor.getString(4));
            productList.add(product);
        }

        cursor.close();

        if (productList.size() != 0){
            processData();
        }else{
            Toast.makeText(this, "Lista vacia", Toast.LENGTH_SHORT).show();
        }
    }

    public void processData(){
        productosAdapter = new ProductosAdapter(productList, getApplicationContext());
        recyclerViewContacts.setAdapter(productosAdapter);
    }

}
