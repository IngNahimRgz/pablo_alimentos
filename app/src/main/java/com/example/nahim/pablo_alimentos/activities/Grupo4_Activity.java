package com.example.nahim.pablo_alimentos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nahim.pablo_alimentos.R;

public class Grupo4_Activity extends AppCompatActivity {

    CheckBox checkBox_1, checkBox_2, checkBox_3, checkBox_4, checkBox_5,checkBox_6;
    TextView textView_1, textView_2, textView_3, textView_4, textView_5, textView_6;
    EditText editText_1, editText_2, editText_3, editText_4, editText_5, editText_6;
    TextView textView_resultado_1, textView_resultado_2, textView_resultado_3, textView_resultado_4, textView_resultado_5, textView_resultado_6;
    Button buton_OK;
    int calorias_totales =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo4);

        initViews();
        make_editable_false();
        setOnCheckedkListeners();
        setOnFocusChangeListeners();
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        buton_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calorias_totales = (Integer.parseInt(textView_resultado_1.getText().toString())) +
                        (Integer.parseInt(textView_resultado_2.getText().toString())) +
                        (Integer.parseInt(textView_resultado_3.getText().toString())) +
                        (Integer.parseInt(textView_resultado_4.getText().toString()));

                // Toast.makeText(Grupo1_Activity.this, ""+ calorias_totales, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.putExtra("CALORIAS_TOTALES_VERDURAS", calorias_totales);
                setResult(RESULT_OK, intent);
                finish();

            }
        });
    }

    private void setOnFocusChangeListeners() {
        editText_1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_1.getText().toString().length() != 0){
                        textView_resultado_1.setText(""+(Integer.parseInt(textView_1.getText().toString())
                                *(Integer.parseInt(editText_1.getText().toString()))));
                    }
                }
            }
        });
        editText_2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_2.getText().toString().length() != 0){
                        textView_resultado_2.setText(""+(Integer.parseInt(textView_2.getText().toString())
                                *(Integer.parseInt(editText_2.getText().toString()))));
                    }
                }
            }
        });
        editText_3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_3.getText().toString().length() != 0){
                        textView_resultado_3.setText(""+(Integer.parseInt(textView_3.getText().toString())
                                *(Integer.parseInt(editText_3.getText().toString()))));
                    }
                }
            }
        });
        editText_4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_4.getText().toString().length() != 0){
                        textView_resultado_4.setText(""+(Integer.parseInt(textView_4.getText().toString())
                                *(Integer.parseInt(editText_4.getText().toString()))));
                    }
                }
            }
        });
        editText_5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_5.getText().toString().length() != 0){
                        textView_resultado_5.setText(""+(Integer.parseInt(textView_5.getText().toString())
                                *(Integer.parseInt(editText_5.getText().toString()))));
                    }
                }
            }
        });
        editText_6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    if (editText_6.getText().toString().length() != 0){
                        textView_resultado_6.setText(""+(Integer.parseInt(textView_6.getText().toString())
                                *(Integer.parseInt(editText_6.getText().toString()))));
                    }
                }
            }
        });
    }

    private void setOnCheckedkListeners() {
        checkBox_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_1.setEnabled(true);
                } else {
                    editText_1.setEnabled(false);
                }
            }
        });

        checkBox_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_2.setEnabled(true);
                } else {
                    editText_2.setEnabled(false);
                }
            }
        });

        checkBox_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_3.setEnabled(true);
                } else {
                    editText_3.setEnabled(false);
                }
            }
        });

        checkBox_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_4.setEnabled(true);
                } else {
                    editText_4.setEnabled(false);
                }
            }
        });
        checkBox_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_5.setEnabled(true);
                } else {
                    editText_5.setEnabled(false);
                }
            }
        });
        checkBox_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText_6.setEnabled(true);
                } else {
                    editText_6.setEnabled(false);
                }
            }
        });
    }

    private void make_editable_false() {
        editText_1.setEnabled(false);
        editText_2.setEnabled(false);
        editText_3.setEnabled(false);
        editText_4.setEnabled(false);
        editText_5.setEnabled(false);
        editText_6.setEnabled(false);
    }

    private void initViews() {
        checkBox_1 = findViewById(R.id.checkbox_4_1);
        checkBox_2 = findViewById(R.id.checkbox_4_2);
        checkBox_3 = findViewById(R.id.checkbox_4_3);
        checkBox_4 = findViewById(R.id.checkbox_4_4);
        checkBox_5 = findViewById(R.id.checkbox_4_5);
        checkBox_6 = findViewById(R.id.checkbox_4_6);

        textView_1 = findViewById(R.id.kcal_gramo_4_1);
        textView_2 = findViewById(R.id.kcal_gramo_4_2);
        textView_3 = findViewById(R.id.kcal_gramo_4_3);
        textView_4 = findViewById(R.id.kcal_gramo_4_4);
        textView_5 = findViewById(R.id.kcal_gramo_4_5);
        textView_6 = findViewById(R.id.kcal_gramo_4_6);

        editText_1 = findViewById(R.id.edtTxt_4_1);
        editText_2 = findViewById(R.id.edtTxt_4_2);
        editText_3 = findViewById(R.id.edtTxt_4_3);
        editText_4 = findViewById(R.id.edtTxt_4_4);
        editText_5 = findViewById(R.id.edtTxt_4_4);
        editText_6 = findViewById(R.id.edtTxt_4_4);

        textView_resultado_1 = findViewById(R.id.resultado_verduras_1);
        textView_resultado_2 = findViewById(R.id.resultado_verduras_2);
        textView_resultado_3 = findViewById(R.id.resultado_verduras_3);
        textView_resultado_4 = findViewById(R.id.resultado_verduras_4);
        textView_resultado_5 = findViewById(R.id.resultado_verduras_4);
        textView_resultado_6 = findViewById(R.id.resultado_verduras_4);

        buton_OK = findViewById(R.id.btn_verduras_ok);


    }



}
