package com.salsabila.unggar.perencanaankuliah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nama, angkatan;
    private TextView before;
    private RelativeLayout btnSimpan;
    String dateStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        nama = findViewById(R.id.inNama);
        angkatan = findViewById(R.id.inAngkatan);
        before = findViewById(R.id.before);
        btnSimpan = findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(this);

        /*Date c = Calendar.getInstance().getTime();

        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        String formattedDate = df.format(c);
        before.setText(formattedDate);*/
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimpan:
                simpan();
                break;
        }
    }

    private void simpan(){

        if(inputValidated()) {

            final String nama1 = nama.getText().toString(),
                    angkatan1 = angkatan.getText().toString(),
                    bulan = "08";

            String strDate = angkatan1 + bulan;
            this.dateStr = strDate;

            Intent intent = new Intent(FirstActivity.this, MainActivity.class);
            intent.putExtra("date", dateStr);
            startActivity(intent);
            finish();

            /*try {
                String strDate = angkatan1 + bulan;
                //String dummy = "2015"+bulan;
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
                Date date = dateFormat.parse(strDate);
                this.date = date;

                /*SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMM");
                Date date1 = dateFormat2.parse(dummy);*/

                /*SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM yyyy");
                String dateTime = dateFormat1.format(date);
                before.setText(dateTime);*/

                /*if(date.compareTo(date1) > 0){
                    before.setText("Kamu Lebih Muda");
                }
                else if(date.compareTo(date1) < 0){
                    before.setText("Kamu Lebih Tua");
                }*/

            /*} catch (ParseException ex) {
                Log.v("Exception", ex.getLocalizedMessage());
            }*/

        }
    }

    private boolean inputValidated(){
        boolean res = true;
        if (nama.getText().toString().isEmpty()){
            res = false;
            nama.setError("This is required");
        }if (angkatan.getText().toString().isEmpty()){
            res = false;
            angkatan.setError("This is required");
        }if (angkatan.getText().toString().length() != 4){
            res = false;
            angkatan.setError("Format date: yyyy");
        }
        return res;
    }
}
