package com.salsabila.unggar.perencanaankuliah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.HorizontalStepsViewIndicator;
import com.baoyachi.stepview.bean.StepBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main Activity";

    private RelativeLayout btnMilestone, btnPerencanaan;

    HorizontalStepView horizontalStepView, horizontalStepView1;
    String dateStr, dateTime, sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, pkl, skripsi, lulus;
    TextView progress;
    int yearOnly;
    Date now, sem1D, sem2D, sem3D, sem4D, sem5D, sem6D, sem7D, sem8D, pklD, skripsiD, lulusD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateStr = getIntent().getExtras().getString("date");

        horizontalStepView = (HorizontalStepView) findViewById(R.id.horizontalStep);
        horizontalStepView1 = (HorizontalStepView) findViewById(R.id.horizontalStep1);
        progress = findViewById(R.id.progress);
        btnMilestone = findViewById(R.id.btnMilestone);
        btnPerencanaan = findViewById(R.id.btnPerencanaan);

        btnMilestone.setOnClickListener(this);
        btnPerencanaan.setOnClickListener(this);

        now = Calendar.getInstance().getTime();

        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
            Date date = dateFormat.parse(this.dateStr);

            SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM yyyy");
            String dateTime = dateFormat1.format(date);

            SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy");
            String year = dateFormat2.format(date);
            int yearOnly = Integer.parseInt(year);
            this.yearOnly = yearOnly;



            this.dateTime = dateTime;

        } catch (ParseException ex) {
            Log.v("Exception", ex.getLocalizedMessage());
        }

        //progress.setText(dateTime);

        String aug = "08";
        String jan = "01";

        int yearOnly1 = yearOnly+1;
        int yearOnly2 = yearOnly+2;
        int yearOnly3 = yearOnly+3;
        int yearOnly4 = yearOnly+4;

        sem1 = yearOnly + aug;
        sem2 = yearOnly1 + jan;
        sem3 = yearOnly1 + aug;
        sem4 = yearOnly2 + jan;
        sem5 = yearOnly2 + aug;
        sem6 = yearOnly3 + jan;
        sem7 = yearOnly3 + aug;
        sem8 = yearOnly4 + jan;
        pkl = yearOnly3 + "06";
        skripsi = yearOnly4 + jan;
        lulus = yearOnly4 + aug;

        Log.d(TAG, "Semester 1 " + sem1);

        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
            this.sem1D = dateFormat.parse(this.sem1);
            this.sem2D = dateFormat.parse(this.sem2);
            this.sem3D = dateFormat.parse(this.sem3);
            this.sem4D = dateFormat.parse(this.sem4);
            this.sem5D = dateFormat.parse(this.sem5);
            this.sem6D = dateFormat.parse(this.sem6);
            this.sem7D = dateFormat.parse(this.sem7);
            this.sem8D = dateFormat.parse(this.sem8);
            this.pklD = dateFormat.parse(this.pkl);
            this.skripsiD = dateFormat.parse(this.skripsi);
            this.lulusD = dateFormat.parse(this.lulus);

        } catch (ParseException ex) {
            Log.v("Exception", ex.getLocalizedMessage());
        }

        List<StepBean> sources = new ArrayList<>();

        if(now.compareTo(sem1D) > 0 && now.compareTo(sem2D) < 0){
            sources.add(new StepBean("Sem 1",0));
        }else if(now.compareTo(sem1D) > 0){
            sources.add(new StepBean("Sem 1",1));
        } else{
            sources.add(new StepBean("Sem 1",-1));
        }

        if(now.compareTo(sem2D) > 0 && now.compareTo(sem3D) < 0){
            sources.add(new StepBean("Sem 2",0));
        }else if(now.compareTo(sem2D) > 0){
            sources.add(new StepBean("Sem 2",1));
        } else{
            sources.add(new StepBean("Sem 2",-1));
        }

        if(now.compareTo(sem3D) > 0 && now.compareTo(sem4D) < 0){
            sources.add(new StepBean("Sem 3",0));
        }else if(now.compareTo(sem3D) > 0){
            sources.add(new StepBean("Sem 3",1));
        } else{
            sources.add(new StepBean("Sem 3",-1));
        }

        if(now.compareTo(sem4D) > 0 && now.compareTo(sem5D) < 0){
            sources.add(new StepBean("Sem 4",0));
        }else if(now.compareTo(sem4D) > 0){
            sources.add(new StepBean("Sem 4",1));
        } else{
            sources.add(new StepBean("Sem 4",-1));
        }

        if(now.compareTo(sem5D) > 0 && now.compareTo(sem6D) < 0){
            sources.add(new StepBean("Sem 5",0));
        }else if(now.compareTo(sem5D) > 0){
            sources.add(new StepBean("Sem 5",1));
        } else{
            sources.add(new StepBean("Sem 5",-1));
        }

        if(now.compareTo(sem6D) > 0 && now.compareTo(pklD) < 0){
            sources.add(new StepBean("Sem 6",0));
        }else if(now.compareTo(sem6D) > 0){
            sources.add(new StepBean("Sem 6",1));
        } else{
            sources.add(new StepBean("Sem 6",-1));
        }

        List<StepBean> sources1 = new ArrayList<>();

        if(now.compareTo(pklD) > 0 && now.compareTo(sem7D) < 0){
            sources1.add(new StepBean("PKL",0));
        }else if(now.compareTo(pklD) > 0){
            sources1.add(new StepBean("PKL",1));
        } else{
            sources1.add(new StepBean("PKL",-1));
        }

        if(now.compareTo(sem7D) > 0 && now.compareTo(sem8D) < 0){
            sources1.add(new StepBean("Sem 7",0));
        }else if(now.compareTo(sem7D) > 0){
            sources1.add(new StepBean("Sem 7",1));
        } else{
            sources1.add(new StepBean("Sem 7",-1));
        }

        if(now.compareTo(sem8D) > 0 && now.compareTo(lulusD) < 0){
            sources1.add(new StepBean("Sem 8",0));
        }else if(now.compareTo(sem8D) > 0){
            sources1.add(new StepBean("Sem 8",1));
        } else{
            sources1.add(new StepBean("Sem 8",-1));
        }

        if(now.compareTo(skripsiD) > 0 && now.compareTo(lulusD) < 0){
            sources1.add(new StepBean("Sem 8",0));
        }else if(now.compareTo(skripsiD) > 0){
            sources1.add(new StepBean("Skripsi",1));
        } else{
            sources1.add(new StepBean("Skripsi",-1));
        }

        if(now.compareTo(lulusD) > 0){
            sources1.add(new StepBean("Lulus",1));
        } else{
            sources1.add(new StepBean("Lulus",-1));
        }

        horizontalStepView.setStepViewTexts(sources)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))
                .setStepViewComplectedTextColor(Color.parseColor("#FFFF00"))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))
                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon));

        horizontalStepView1.setStepViewTexts(sources1)
                .setTextSize(12)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))
                .setStepViewComplectedTextColor(Color.parseColor("#FFFF00"))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))
                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon));


    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMilestone:
                login();
                break;
            case R.id.btnPerencanaan:
                Intent intent = new Intent(MainActivity.this, Perencanaan.class);
                startActivity(intent);
        }
    }

    private void login(){
        //sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, pkl, skripsi, lulus;
        Intent intent = new Intent(MainActivity.this, Milestone.class);
        intent.putExtra("sem1", sem1);
        intent.putExtra("sem2", sem2);
        intent.putExtra("sem3", sem3);
        intent.putExtra("sem4", sem4);
        intent.putExtra("sem5", sem5);
        intent.putExtra("sem6", sem6);
        intent.putExtra("sem7", sem7);
        intent.putExtra("sem8", sem8);
        intent.putExtra("pkl", pkl);
        intent.putExtra("skripsi", skripsi);
        intent.putExtra("lulus", lulus);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
