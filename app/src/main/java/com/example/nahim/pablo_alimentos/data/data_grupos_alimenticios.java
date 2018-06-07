package com.example.nahim.pablo_alimentos.data;

public class data_grupos_alimenticios {
    String nombre_grupo;
    String descripcion_grupo_alimenticio;
    int id_imagen;
    int calorias_totales;

    public data_grupos_alimenticios(String nombre_grupo, String descripcion_grupo_alimenticio, int id_imagen, int calorias_totales) {
        this.nombre_grupo = nombre_grupo;
        this.descripcion_grupo_alimenticio = descripcion_grupo_alimenticio;
        this.id_imagen = id_imagen;
        this.calorias_totales = calorias_totales;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public String getDescripcion_grupo_alimenticio() {
        return descripcion_grupo_alimenticio;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public int getCalorias_totales() {
        return calorias_totales;
    }
}
