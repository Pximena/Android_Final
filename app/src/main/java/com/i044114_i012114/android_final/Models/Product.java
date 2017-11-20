package com.i044114_i012114.android_final.Models;

/**
 * Created by ACER on 19/11/2017.
 */

public class Product {
    public Integer id;
    public String namepro;
    private String description;
    private String cantidad;
    private String url;
    private String[] arreglo;

    public String ArregloImages(){
        arreglo= new String[15];
        arreglo[0]= "http://3.bp.blogspot.com/-Gffbq6aKPoU/VWHeovCOkhI/AAAAAAAAAFk/O4Qax3ZjSzc/s1600/acetaminofen%2B%25281%2529.jpg";
        arreglo[1]= "http://www.resumenlatinoamericano.org/wp-content/uploads/2015/05/IBUPROFENO.jpg";
        arreglo[2]= "https://www.farmalisto.com.co/94653-thickbox_default/comprar-amoxicilina-500-mg-caja-x-50-capsulas-rx2-precio-7702605100309.jpg";
        arreglo[3]= "http://neopharmgroup.com/wp-content/uploads/2012/12/advil.jpg";
        arreglo[4]= "http://tecnoquimicasfarma.com.ec/portals/9/Images/antiinfecciosos/AmpicilinaE.jpg";
        arreglo[5]= "https://www.farmalisto.com.co/94954-thickbox_default/comprar-bisolvon-jarabe-caja-con-frasco-x-120-ml-precio-7703381000777.jpg";
        arreglo[6]= "https://www.farmalisto.com.co/87159-thickbox_default/diclofenaco-50-mg-7706569000118.jpg";
        arreglo[7]= "https://www.farmalisto.com.co/95213-large_default/comprar-dolex-forte-500-65-mg-caja-con-48-tabletas-precio-7707172686126.jpg";
        arreglo[8]= "https://www.farmalisto.com.co/93098-large_default/comprar-dristan-triple-accion-nf-caja-con-48-tabletas-precio-7702132008796.jpg";
        arreglo[9]= "http://tecnoquimicasfarma.com.ec/portals/0/Images/cardiovascular/losartan.jpg";
        arreglo[10]= "http://super80.com.co/store/archivosdelusuario/fotografias/productos/full/antimareos_mareol-72tab-cx24dp_1393332590996..jpg";
        arreglo[11]= "http://paraquesirven.com/wp-content/uploads/2016/07/meloxicam-300x271.jpg";
        arreglo[12]= "http://www.disnagen.com/catalogo/imagenes/thumbnails/METOCARBAMOL_750_MG_TABLETAS_600x600.jpg";
        arreglo[13]= "http://www.qualipharm.info/sites/default/files/PENIBENZA.jpg";
        arreglo[14]= "http://www.swissfarminternational.com/assets/Uploads/_resampled/resizedimage406275-RANITIDINA2.jpg";
        int  ran = (int) (Math.random()*9);
        return arreglo[ran];

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamepro() {
        return namepro;
    }

    public void setNamepro(String namepro) {
        this.namepro = namepro;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
