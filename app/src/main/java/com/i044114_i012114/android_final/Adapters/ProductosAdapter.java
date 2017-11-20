package com.i044114_i012114.android_final.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i044114_i012114.android_final.Models.Product;
import com.i044114_i012114.android_final.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 19/11/2017.
 */

public class ProductosAdapter  extends RecyclerView.Adapter<ProductosAdapter.ViewHolder>{
    List<Product> contactList = new ArrayList<>();
    Context context;

    public ProductosAdapter(List<Product> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.textViewName.setText(contactList.get(position).getNamepro());
        holder.textViewDescription.setText(contactList.get(position).getDescription());
        holder.textViewCantidad.setText(contactList.get(position).getCantidad());
        Picasso.with(context).load(contactList.get(position).getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewDescription;
        TextView textViewCantidad;
        ImageView imageView;


        public ViewHolder(View item) {
            super(item);

            textViewName = (TextView) item.findViewById(R.id.id_tv_item_name);
            textViewDescription = (TextView) item.findViewById(R.id.id_tv_item_des);
            textViewCantidad = (TextView) item.findViewById(R.id.id_tv_item_can);
            imageView= (ImageView) item.findViewById(R.id.id_img_item_cardview);
        }

       /* @Override
        public void onClick(View view) {
            Context contextItem = view.getContext();

            Intent intent = new Intent(context, DeleteActivity.class);
            intent.putExtra("id", Integer.toString(contactList.get(getLayoutPosition()).getId()));
            intent.putExtra("nameprod", contactList.get(getLayoutPosition()).getNameprod());
            intent.putExtra("description", contactList.get(getLayoutPosition()).getDescription());
            intent.putExtra("cantidad", contactList.get(getLayoutPosition()).getCantidad());
            contextItem.startActivity(intent);


            //String valor = Integer.toString(albumModelList.get(getLayoutPosition()).getId());
            //Toast.makeText(contextItem, valor, Toast.LENGTH_SHORT).show();
        }*/
    }
}
