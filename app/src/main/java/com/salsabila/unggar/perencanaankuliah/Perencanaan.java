package com.salsabila.unggar.perencanaankuliah;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Perencanaan extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private static final String TAG = "Perencanaan";

    TextView perencanaanSms;
    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10,
            spinner11, spinner12, spinner13, spinner14, spinner15, spinner16, spinner17, spinner18, spinner19, spinner20,
            spinner21, spinner22, spinner23, spinner24, spinner25, spinner26, spinner27, spinner28, spinner29, spinner30,
            spinner31, spinner32, spinner33, spinner34, spinner35, spinner36, spinner37, spinner38, spinner39, spinner40,
            spinner41, spinner42, spinner43, spinner44, spinner45, spinner46, spinner47;
    int spinVal1, spinVal2, spinVal3, spinVal4, spinVal5, spinVal6, spinVal7, spinVal8, spinVal9, spinVal10,
            spinVal11, spinVal12, spinVal13, spinVal14, spinVal15, spinVal16, spinVal17, spinVal18, spinVal19, spinVal20,
            spinVal21, spinVal22, spinVal23, spinVal24, spinVal25, spinVal26, spinVal27, spinVal28, spinVal29, spinVal30,
            spinVal31, spinVal32, spinVal33, spinVal34, spinVal35, spinVal36, spinVal37, spinVal38, spinVal39, spinVal40,
            spinVal41, spinVal42, spinVal43, spinVal44, spinVal45, spinVal46, spinVal47;
    private RelativeLayout simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perencanaan);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);
        spinner5 = findViewById(R.id.spinner5);
        spinner6 = findViewById(R.id.spinner6);
        spinner7 = findViewById(R.id.spinner7);
        spinner8 = findViewById(R.id.spinner8);
        spinner9 = findViewById(R.id.spinner9);
        spinner10 = findViewById(R.id.spinner10);
        spinner11 = findViewById(R.id.spinner11);
        spinner12 = findViewById(R.id.spinner12);
        spinner13 = findViewById(R.id.spinner13);
        spinner14 = findViewById(R.id.spinner14);
        spinner15 = findViewById(R.id.spinner15);
        spinner16 = findViewById(R.id.spinner16);
        spinner17 = findViewById(R.id.spinner17);
        spinner18 = findViewById(R.id.spinner18);
        spinner19 = findViewById(R.id.spinner19);
        spinner20 = findViewById(R.id.spinner20);
        spinner21 = findViewById(R.id.spinner21);
        spinner22 = findViewById(R.id.spinner22);
        spinner23 = findViewById(R.id.spinner23);
        spinner24 = findViewById(R.id.spinner24);
        spinner25 = findViewById(R.id.spinner25);
        spinner26 = findViewById(R.id.spinner26);
        spinner27 = findViewById(R.id.spinner27);
        spinner28 = findViewById(R.id.spinner28);
        spinner29 = findViewById(R.id.spinner29);
        spinner30 = findViewById(R.id.spinner30);
        spinner31 = findViewById(R.id.spinner31);
        spinner32 = findViewById(R.id.spinner32);
        spinner33 = findViewById(R.id.spinner33);
        spinner34 = findViewById(R.id.spinner34);
        spinner35 = findViewById(R.id.spinner35);
        spinner36 = findViewById(R.id.spinner36);
        spinner37 = findViewById(R.id.spinner37);
        spinner38 = findViewById(R.id.spinner38);
        spinner39 = findViewById(R.id.spinner39);
        spinner40 = findViewById(R.id.spinner40);
        spinner41 = findViewById(R.id.spinner41);
        spinner42 = findViewById(R.id.spinner42);
        spinner43 = findViewById(R.id.spinner43);
        spinner44 = findViewById(R.id.spinner44);
        spinner45 = findViewById(R.id.spinner45);
        spinner46 = findViewById(R.id.spinner46);
        spinner47 = findViewById(R.id.spinner47);

        perencanaanSms = findViewById(R.id.perencanaanSms);
        simpan = findViewById(R.id.btnSimpanPerencanaan);

        simpan.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.wajibGanjil, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.wajibGenap, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.pilihanGanjil, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.pilihanGenap, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Semester 1
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        spinner1.setSelection(spinVal1);

        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
        spinner2.setSelection(spinVal2);

        spinner3.setAdapter(adapter);
        spinner3.setOnItemSelectedListener(this);
        spinner3.setSelection(spinVal3);

        spinner4.setAdapter(adapter);
        spinner4.setOnItemSelectedListener(this);
        spinner4.setSelection(spinVal4);

        spinner5.setAdapter(adapter);
        spinner5.setOnItemSelectedListener(this);
        spinner5.setSelection(spinVal5);

        spinner6.setAdapter(adapter);
        spinner6.setOnItemSelectedListener(this);
        spinner6.setSelection(spinVal6);

        //Semester 2
        spinner7.setAdapter(adapter1);
        spinner7.setOnItemSelectedListener(this);
        spinner7.setSelection(spinVal7);

        spinner8.setAdapter(adapter1);
        spinner8.setOnItemSelectedListener(this);
        spinner8.setSelection(spinVal8);

        spinner9.setAdapter(adapter1);
        spinner9.setOnItemSelectedListener(this);
        spinner9.setSelection(spinVal9);

        spinner10.setAdapter(adapter1);
        spinner10.setOnItemSelectedListener(this);
        spinner10.setSelection(spinVal10);

        spinner11.setAdapter(adapter1);
        spinner11.setOnItemSelectedListener(this);
        spinner11.setSelection(spinVal11);

        spinner12.setAdapter(adapter1);
        spinner12.setOnItemSelectedListener(this);
        spinner12.setSelection(spinVal12);

        //Semester 3
        spinner13.setAdapter(adapter);
        spinner13.setOnItemSelectedListener(this);
        spinner13.setSelection(spinVal13);

        spinner14.setAdapter(adapter);
        spinner14.setOnItemSelectedListener(this);
        spinner14.setSelection(spinVal14);

        spinner15.setAdapter(adapter);
        spinner15.setOnItemSelectedListener(this);
        spinner15.setSelection(spinVal15);

        spinner16.setAdapter(adapter);
        spinner16.setOnItemSelectedListener(this);
        spinner16.setSelection(spinVal16);

        spinner17.setAdapter(adapter);
        spinner17.setOnItemSelectedListener(this);
        spinner17.setSelection(spinVal17);

        spinner18.setAdapter(adapter);
        spinner18.setOnItemSelectedListener(this);
        spinner18.setSelection(spinVal18);

        //Semester 4
        spinner19.setAdapter(adapter1);
        spinner19.setOnItemSelectedListener(this);
        spinner19.setSelection(spinVal19);

        spinner20.setAdapter(adapter1);
        spinner20.setOnItemSelectedListener(this);
        spinner20.setSelection(spinVal20);

        spinner21.setAdapter(adapter1);
        spinner21.setOnItemSelectedListener(this);
        spinner21.setSelection(spinVal21);

        spinner22.setAdapter(adapter1);
        spinner22.setOnItemSelectedListener(this);
        spinner22.setSelection(spinVal22);

        spinner23.setAdapter(adapter1);
        spinner23.setOnItemSelectedListener(this);
        spinner23.setSelection(spinVal23);

        spinner24.setAdapter(adapter1);
        spinner24.setOnItemSelectedListener(this);
        spinner24.setSelection(spinVal24);

        //Semester 5
        spinner25.setAdapter(adapter);
        spinner25.setOnItemSelectedListener(this);
        spinner25.setSelection(spinVal25);

        spinner26.setAdapter(adapter);
        spinner26.setOnItemSelectedListener(this);
        spinner26.setSelection(spinVal26);

        spinner27.setAdapter(adapter);
        spinner27.setOnItemSelectedListener(this);
        spinner27.setSelection(spinVal27);

        spinner28.setAdapter(adapter);
        spinner28.setOnItemSelectedListener(this);
        spinner28.setSelection(spinVal28);

        spinner29.setAdapter(adapter);
        spinner29.setOnItemSelectedListener(this);
        spinner29.setSelection(spinVal29);

        spinner30.setAdapter(adapter2);
        spinner30.setOnItemSelectedListener(this);
        spinner30.setSelection(spinVal30);

        spinner31.setAdapter(adapter2);
        spinner31.setOnItemSelectedListener(this);
        spinner31.setSelection(spinVal31);

        //Semester 6
        spinner32.setAdapter(adapter1);
        spinner32.setOnItemSelectedListener(this);
        spinner32.setSelection(spinVal32);

        spinner33.setAdapter(adapter1);
        spinner33.setOnItemSelectedListener(this);
        spinner33.setSelection(spinVal33);

        spinner34.setAdapter(adapter1);
        spinner34.setOnItemSelectedListener(this);
        spinner34.setSelection(spinVal34);

        spinner35.setAdapter(adapter1);
        spinner35.setOnItemSelectedListener(this);
        spinner35.setSelection(spinVal35);

        spinner36.setAdapter(adapter1);
        spinner36.setOnItemSelectedListener(this);
        spinner36.setSelection(spinVal36);

        spinner37.setAdapter(adapter3);
        spinner37.setOnItemSelectedListener(this);
        spinner37.setSelection(spinVal37);

        spinner38.setAdapter(adapter3);
        spinner38.setOnItemSelectedListener(this);
        spinner38.setSelection(spinVal38);

        //Semester 7
        spinner39.setAdapter(adapter);
        spinner39.setOnItemSelectedListener(this);
        spinner39.setSelection(spinVal39);

        spinner40.setAdapter(adapter);
        spinner40.setOnItemSelectedListener(this);
        spinner40.setSelection(spinVal40);

        spinner41.setAdapter(adapter);
        spinner41.setOnItemSelectedListener(this);
        spinner41.setSelection(spinVal41);

        spinner42.setAdapter(adapter2);
        spinner42.setOnItemSelectedListener(this);
        spinner42.setSelection(spinVal42);

        spinner43.setAdapter(adapter2);
        spinner43.setOnItemSelectedListener(this);
        spinner43.setSelection(spinVal43);

        spinner44.setAdapter(adapter2);
        spinner44.setOnItemSelectedListener(this);
        spinner44.setSelection(spinVal44);

        //Semester 8
        spinner45.setAdapter(adapter1);
        spinner45.setOnItemSelectedListener(this);
        spinner45.setSelection(spinVal45);

        spinner46.setAdapter(adapter3);
        spinner46.setOnItemSelectedListener(this);
        spinner46.setSelection(spinVal46);

        spinner47.setAdapter(adapter3);
        spinner47.setOnItemSelectedListener(this);
        spinner47.setSelection(spinVal47);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //int cout = adapterView.getSelectedItemPosition();
        //String test = ""+test1;
        //String text = ""+cout;
        //perencanaanSms.setText(""+this.spinVal1);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSimpanPerencanaan:
                long test1 = spinner1.getSelectedItemId();
                long test2 = spinner2.getSelectedItemId();
                long test3 = spinner3.getSelectedItemId();
                long test4 = spinner4.getSelectedItemId();
                long test5 = spinner5.getSelectedItemId();
                long test6 = spinner6.getSelectedItemId();
                long test7 = spinner7.getSelectedItemId();
                long test8 = spinner8.getSelectedItemId();
                long test9 = spinner9.getSelectedItemId();
                long test10 = spinner10.getSelectedItemId();
                long test11 = spinner11.getSelectedItemId();
                long test12 = spinner12.getSelectedItemId();
                long test13 = spinner13.getSelectedItemId();
                long test14 = spinner14.getSelectedItemId();
                long test15 = spinner15.getSelectedItemId();
                long test16 = spinner16.getSelectedItemId();
                long test17 = spinner17.getSelectedItemId();
                long test18 = spinner18.getSelectedItemId();
                long test19 = spinner19.getSelectedItemId();
                long test20 = spinner20.getSelectedItemId();
                long test21 = spinner21.getSelectedItemId();
                long test22 = spinner22.getSelectedItemId();
                long test23 = spinner23.getSelectedItemId();
                long test24 = spinner24.getSelectedItemId();
                long test25 = spinner25.getSelectedItemId();
                long test26 = spinner26.getSelectedItemId();
                long test27 = spinner27.getSelectedItemId();
                long test28 = spinner28.getSelectedItemId();
                long test29 = spinner29.getSelectedItemId();
                long test30 = spinner30.getSelectedItemId();
                long test31 = spinner31.getSelectedItemId();
                long test32 = spinner32.getSelectedItemId();
                long test33 = spinner33.getSelectedItemId();
                long test34 = spinner34.getSelectedItemId();
                long test35 = spinner35.getSelectedItemId();
                long test36 = spinner36.getSelectedItemId();
                long test37 = spinner37.getSelectedItemId();
                long test38 = spinner38.getSelectedItemId();
                long test39 = spinner39.getSelectedItemId();
                long test40 = spinner40.getSelectedItemId();
                long test41 = spinner41.getSelectedItemId();
                long test42 = spinner42.getSelectedItemId();
                long test43 = spinner43.getSelectedItemId();
                long test44 = spinner44.getSelectedItemId();
                long test45 = spinner45.getSelectedItemId();
                long test46 = spinner46.getSelectedItemId();
                long test47 = spinner47.getSelectedItemId();

                this.spinVal1 = Math.toIntExact(test1);
                this.spinVal2 = Math.toIntExact(test2);
                this.spinVal3 = Math.toIntExact(test3);
                this.spinVal4 = Math.toIntExact(test4);
                this.spinVal5 = Math.toIntExact(test5);
                this.spinVal6 = Math.toIntExact(test6);
                this.spinVal7 = Math.toIntExact(test7);
                this.spinVal8 = Math.toIntExact(test8);
                this.spinVal9 = Math.toIntExact(test9);
                this.spinVal10 = Math.toIntExact(test10);
                this.spinVal11 = Math.toIntExact(test11);
                this.spinVal12 = Math.toIntExact(test12);
                this.spinVal13 = Math.toIntExact(test13);
                this.spinVal14 = Math.toIntExact(test14);
                this.spinVal15 = Math.toIntExact(test15);
                this.spinVal16 = Math.toIntExact(test16);
                this.spinVal17 = Math.toIntExact(test17);
                this.spinVal18 = Math.toIntExact(test18);
                this.spinVal19 = Math.toIntExact(test19);
                this.spinVal20 = Math.toIntExact(test20);
                this.spinVal21 = Math.toIntExact(test21);
                this.spinVal22 = Math.toIntExact(test22);
                this.spinVal23 = Math.toIntExact(test23);
                this.spinVal24 = Math.toIntExact(test24);
                this.spinVal25 = Math.toIntExact(test25);
                this.spinVal26 = Math.toIntExact(test26);
                this.spinVal27 = Math.toIntExact(test27);
                this.spinVal28 = Math.toIntExact(test28);
                this.spinVal29 = Math.toIntExact(test29);
                this.spinVal30 = Math.toIntExact(test30);
                this.spinVal31 = Math.toIntExact(test31);
                this.spinVal32 = Math.toIntExact(test32);
                this.spinVal33 = Math.toIntExact(test33);
                this.spinVal34 = Math.toIntExact(test34);
                this.spinVal35 = Math.toIntExact(test35);
                this.spinVal36 = Math.toIntExact(test36);
                this.spinVal37 = Math.toIntExact(test37);
                this.spinVal38 = Math.toIntExact(test38);
                this.spinVal39 = Math.toIntExact(test39);
                this.spinVal40 = Math.toIntExact(test40);
                this.spinVal41 = Math.toIntExact(test41);
                this.spinVal42 = Math.toIntExact(test42);
                this.spinVal43 = Math.toIntExact(test43);
                this.spinVal44 = Math.toIntExact(test44);
                this.spinVal45 = Math.toIntExact(test45);
                this.spinVal46 = Math.toIntExact(test46);
                this.spinVal47 = Math.toIntExact(test47);

                Log.d(TAG, "Spinner 1 tersimpan dengan id: " + this.spinVal1);
                Log.d(TAG, "Spinner 2 tersimpan dengan id: " + this.spinVal2);
                Toast.makeText(getApplicationContext(), "Tersimpan", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
