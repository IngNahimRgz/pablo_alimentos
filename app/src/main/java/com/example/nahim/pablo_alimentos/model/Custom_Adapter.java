package com.example.nahim.pablo_alimentos.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nahim.pablo_alimentos.R;
import com.example.nahim.pablo_alimentos.data.data_grupos_alimenticios;

import java.util.ArrayList;

public class Custom_Adapter extends ArrayAdapter<data_grupos_alimenticios> implements View.OnClickListener {

    private ArrayList<data_grupos_alimenticios> dataSet;
    private Context context;

    //View lookup cache
    private static class ViewHolder {
        ImageView imageView;
        TextView nombre;
        TextView descripcion;
        TextView calorias;

    }

    public Custom_Adapter(ArrayList<data_grupos_alimenticios> data, Context context) {
        super(context, R.layout.row_item, data);

        this.dataSet = data;
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        Object object = getItem(position);
        data_grupos_alimenticios dataModel = (data_grupos_alimenticios) object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        data_grupos_alimenticios dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.nombre = (TextView) convertView.findViewById(R.id.txtVw_nombre_grupo);
            viewHolder.descripcion = (TextView) convertView.findViewById(R.id.txtVw_descripcion);
            viewHolder.calorias = (TextView) convertView.findViewById(R.id.txtVw_calorias_totales);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView_grupo);

            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        viewHolder.nombre.setText(dataModel.getNombre_grupo());
        viewHolder.descripcion.setText(dataModel.getDescripcion_grupo_alimenticio());
        viewHolder.calorias.setText(""+dataModel.getCalorias_totales()+" Kcal");
        viewHolder.imageView.setImageResource(dataModel.getId_imagen());
        // viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }
}
