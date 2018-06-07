package com.example.nahim.pablo_alimentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nahim.pablo_alimentos.activities.Grupo1_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo2_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo3_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo4_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo5_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo6_Activity;
import com.example.nahim.pablo_alimentos.activities.Grupo7_Activity;
import com.example.nahim.pablo_alimentos.data.data_grupos_alimenticios;
import com.example.nahim.pablo_alimentos.model.Custom_Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView calorias;
    ArrayList<data_grupos_alimenticios> dataModels;
    ListView listView;
    private static Custom_Adapter adapter;
    Intent intent;
    public final int GRUPO1 = 0;
    public final int GRUPO2 = 1;
    public final int GRUPO3 = 2;
    public final int GRUPO4 = 3;
    public final int GRUPO5 = 4;
    public final int GRUPO6 = 5;
    public final int GRUPO7 = 6;
    int cal_grupo_1 = 0, cal_grupo_2 = 0, cal_grupo_3 = 0, cal_grupo_4 = 0, cal_grupo_5 = 0, cal_grupo_6 = 0, cal_grupo_7 = 0;
    int calortias_totales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializar vista
        initViews();
        agregar_datos_a_lista();

    }

    private void agregar_datos_a_lista() {
        dataModels = new ArrayList<>();

        dataModels.add(new data_grupos_alimenticios("LÁCTEOS", "Leche, mantequilla, yogur, queso, helados etc.", R.drawable.leche_y_derivados, 0));
        dataModels.add(new data_grupos_alimenticios("CARNES, HUEVOS Y PESCADOS", "Carnes, embutidos, huevos, pescados", R.drawable.carnes, 0));
        dataModels.add(new data_grupos_alimenticios("TUBÉRCULOS, LEGUMBRES Y FRUTOS SECOS", "Tubercúlos: patatas, los boniatos.\n Legumbres:  garbanzos, lentejas, habas y soja constituyen este grupo \n Frutos secos: almendras, avellanas, nueces, cacahuetes, castañas, pistachos y pipas de girasol. ", R.drawable.legumbres, 0));
        dataModels.add(new data_grupos_alimenticios("HORTALIZAS Y VERDURAS", "Son plantas cultivadas para ser consumidas crudas o elaboradas. Se caracterizan por contener fibra vegetal y por aportar pocas calorías", R.drawable.hortalizas, 0));
        dataModels.add(new data_grupos_alimenticios("FRUTAS", "Alimentos comestibles de naturaleza carnosa que se comen sin preparación y que provienen de plantas. ", R.drawable.frutas, 0));
        dataModels.add(new data_grupos_alimenticios("PAN, PASTA, AZÚCAR Y DULCES", "Cereale, pan, pasta, azucar y dulces", R.drawable.pan_cereales, 0));
        dataModels.add(new data_grupos_alimenticios("LOS ACEITES Y LAS GRASAS", "Las grasas pueden ser de origen animal o vegetal. La grasa animal es la que aporta su sabor especial a cada carne", R.drawable.grasas, 0));

        adapter = new Custom_Adapter(dataModels, getApplicationContext());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                data_grupos_alimenticios data_grupos_alimenticios = dataModels.get(position);

                switch (position) {
                    case GRUPO1:
                        Toast.makeText(MainActivity.this, "Grupo 1", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo1_Activity.class);
                        startActivityForResult(intent, GRUPO1);
                        break;

                    case GRUPO2:
                        Toast.makeText(MainActivity.this, "Grupo 2", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo2_Activity.class);
                        startActivityForResult(intent, GRUPO2);
                        break;

                    case GRUPO3:
                        Toast.makeText(MainActivity.this, "Grupo 3", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo3_Activity.class);
                        startActivityForResult(intent, GRUPO3);
                        break;

                    case GRUPO4:
                        Toast.makeText(MainActivity.this, "Grupo 4", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo4_Activity.class);
                        startActivityForResult(intent, GRUPO4);
                        break;

                    case GRUPO5:
                        Toast.makeText(MainActivity.this, "Grupo 5", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo5_Activity.class);
                        startActivityForResult(intent, GRUPO5);
                        break;

                    case GRUPO6:
                        Toast.makeText(MainActivity.this, "Grupo 6", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo6_Activity.class);
                        startActivityForResult(intent, GRUPO6);
                        break;

                    case GRUPO7:
                        Toast.makeText(MainActivity.this, "Grupo 7", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getApplicationContext(), Grupo7_Activity.class);
                        startActivityForResult(intent, GRUPO7);
                        break;
                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case GRUPO1:
                    dataModels.set(GRUPO1, (new data_grupos_alimenticios("LÁCTEOS", "Leche, mantequilla, yogur, queso, helados etc.", R.drawable.leche_y_derivados, data.getIntExtra("CALORIAS_TOTALES_LACTEOS", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_1 = data.getIntExtra("CALORIAS_TOTALES_LACTEOS", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO2:
                    dataModels.set(GRUPO2, (new data_grupos_alimenticios("CARNES, HUEVOS Y PESCADOS", "Carnes, embutidos, huevos, pescados", R.drawable.carnes, data.getIntExtra("CALORIAS_TOTALES_CARNES", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_2 = data.getIntExtra("CALORIAS_TOTALES_CARNES", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO3:
                    dataModels.set(GRUPO3, (new data_grupos_alimenticios("TUBÉRCULOS, LEGUMBRES Y FRUTOS SECOS", "Tubercúlos: patatas, los boniatos.\n Legumbres:  garbanzos, lentejas, habas y soja constituyen este grupo \n Frutos secos: almendras, avellanas, nueces, cacahuetes, castañas, pistachos y pipas de girasol. ", R.drawable.carnes, data.getIntExtra("CALORIAS_TOTALES_LEGUMBRES", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_3 = data.getIntExtra("CALORIAS_TOTALES_LEGUMBRES", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO4:
                    dataModels.set(GRUPO4, (new data_grupos_alimenticios("HORTALIZAS Y VERDURAS", "Son plantas cultivadas para ser consumidas crudas o elaboradas. Se caracterizan por contener fibra vegetal y por aportar pocas calorías", R.drawable.hortalizas, intent.getIntExtra("CALORIAS_TOTALES_VERDURAS", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_4 = data.getIntExtra("CALORIAS_TOTALES_VERDURAS", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO5:
                    dataModels.set(GRUPO5, (new data_grupos_alimenticios("FRUTAS", "Alimentos comestibles de naturaleza carnosa que se comen sin preparación y que provienen de plantas. ", R.drawable.frutas, intent.getIntExtra("CALORIAS_TOTALES_FRUTAS", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_5 = data.getIntExtra("CALORIAS_TOTALES_FRUTAS", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO6:
                    dataModels.set(GRUPO6, (new data_grupos_alimenticios("PAN, PASTA, AZÚCAR Y DULCES", "Cereale, pan, pasta, azucar y dulces", R.drawable.pan_cereales, intent.getIntExtra("CALORIAS_TOTALES_PAN", -1))));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_6 = data.getIntExtra("CALORIAS_TOTALES_PAN", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;
                case GRUPO7:
                    dataModels.set(GRUPO7, (new data_grupos_alimenticios("LOS ACEITES Y LAS GRASAS", "Las grasas pueden ser de origen animal o vegetal. La grasa animal es la que aporta su sabor especial a cada carne", R.drawable.grasas, 0)));
                    Toast.makeText(this, "Actualizando datos", Toast.LENGTH_SHORT).show();
                    cal_grupo_7 = data.getIntExtra("CALORIAS_TOTALES_ACEITES", -1);
                    calortias_totales = cal_grupo_1 + cal_grupo_2 + cal_grupo_3 + cal_grupo_4 + cal_grupo_5 + cal_grupo_6 + cal_grupo_7;
                    calorias.setText("CALORIAS TOTALES = " + calortias_totales);
                    break;

                default:
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void initViews() {
        // LIST VIEW
        listView = findViewById(R.id.list_view);
        calorias = findViewById(R.id.calorias_totales_result);

    }
}
