package com.example.practicatema5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    EditText txtHoriz, txtVert, txtToast;
    RadioGroup radioGroupHoriz, radioGroupVert;
    int radioGroupHorizGravity;
    int radioGroupVertGravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        setTitle("Configurar Toast");
    }

        public void Mostrar(View view) {
            txtToast = (EditText) findViewById(R.id.txtToast);
            txtHoriz = (EditText) findViewById(R.id.txtHoriz);
            txtVert = (EditText) findViewById(R.id.txtVert);
            radioGroupHoriz = (RadioGroup) findViewById(R.id.radioGroupHoriz);
            int index = radioGroupHoriz.indexOfChild(findViewById(radioGroupHoriz.getCheckedRadioButtonId()));
            RadioButton r = (RadioButton) radioGroupHoriz.getChildAt(index);
            String selectedtext1 = r.getText().toString();
            radioGroupVert = (RadioGroup) findViewById(R.id.radioGroupVert);
            index = radioGroupVert.indexOfChild(findViewById(radioGroupVert.getCheckedRadioButtonId()));
            r = (RadioButton) radioGroupVert.getChildAt(index);
            String selectedtext2 = r.getText().toString();

            if(selectedtext1.equals("Izquierda"))
            {
                radioGroupHorizGravity = 3;
            }
            else if(selectedtext1.equals("Derecha"))
            {
                radioGroupHorizGravity = 5;
            }
            else
            {
                radioGroupHorizGravity = 1;
            }

            if(selectedtext2.equals("Arriba"))
            {
                radioGroupVertGravity = 48;
            }
            else if(selectedtext2.equals("Centro"))
            {
                radioGroupVertGravity = 16;
            }
            else
            {
                radioGroupVertGravity = 80;
            }


            Toast toast = Toast.makeText(this, txtToast.getText(), Toast.LENGTH_LONG);
            toast.setGravity(radioGroupVertGravity|radioGroupHorizGravity,(Integer.parseInt(txtHoriz.getText().toString())), (Integer.parseInt(txtVert.getText().toString())));
            toast.show();


    }
}
