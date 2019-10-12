package com.wina.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnpm;
    TextView txtnama;
    TextView txtalamat;
    TextView txtprodi;
    EditText editnpm;
    EditText editnama;
    EditText editalamat;
    EditText editprodi;
    Button btnsave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnpm =(TextView) findViewById(R.id.txtnpm);
        txtnama =(TextView) findViewById(R.id.txtnama);
        txtalamat =(TextView) findViewById(R.id.txtalamat);
        txtprodi =(TextView) findViewById(R.id.txtprodi);
        editnpm =(EditText) findViewById(R.id.editnpms);
        editnama =(EditText) findViewById(R.id.editnamas);
        editalamat =(EditText) findViewById(R.id.editalamats);
        editprodi = (EditText) findViewById(R.id.editprodis);
        btnsave = (Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = editnpm.getText().toString();
                String strnama = editnama.getText().toString();
                String stralamat = editalamat.getText().toString();
                String strprodi = editprodi.getText().toString();

                txtnpm.setText(strnpm);
                txtnama.setText(strnama);
                txtalamat.setText(stralamat);
                txtprodi.setText(strprodi);
            }
        });
    }
}
