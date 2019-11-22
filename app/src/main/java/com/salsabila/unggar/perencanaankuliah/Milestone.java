package com.salsabila.unggar.perencanaankuliah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.baoyachi.stepview.VerticalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Milestone extends AppCompatActivity {

    VerticalStepView verticalStepView;
    String sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8, pkl, skripsi, lulus,
            sem1N, sem2N, sem3N, sem4N, sem5N, sem6N, sem7N, sem8N, pklN, skripsiN, lulusN;
    Date now, sem1D, sem2D, sem3D, sem4D, sem5D, sem6D, sem7D, sem8D, pklD, skripsiD, lulusD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestone);

        sem1 = getIntent().getExtras().getString("sem1");
        sem2 = getIntent().getExtras().getString("sem2");
        sem3 = getIntent().getExtras().getString("sem3");
        sem4 = getIntent().getExtras().getString("sem4");
        sem5 = getIntent().getExtras().getString("sem5");
        sem6 = getIntent().getExtras().getString("sem6");
        sem7 = getIntent().getExtras().getString("sem7");
        sem8 = getIntent().getExtras().getString("sem8");
        pkl = getIntent().getExtras().getString("pkl");
        skripsi = getIntent().getExtras().getString("skripsi");
        lulus = getIntent().getExtras().getString("lulus");

        now = Calendar.getInstance().getTime();

        verticalStepView = (VerticalStepView)findViewById(R.id.verticalStep);

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

            SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMM yyyy");
            this.sem1N = dateFormat1.format(this.sem1D);
            this.sem2N = dateFormat1.format(this.sem2D);
            this.sem3N = dateFormat1.format(this.sem3D);
            this.sem4N = dateFormat1.format(this.sem4D);
            this.sem5N = dateFormat1.format(this.sem5D);
            this.sem6N = dateFormat1.format(this.sem6D);
            this.sem7N = dateFormat1.format(this.sem7D);
            this.sem8N = dateFormat1.format(this.sem8D);
            this.pklN = dateFormat1.format(this.pklD);
            this.skripsiN = dateFormat1.format(this.skripsiD);
            this.lulusN = dateFormat1.format(this.lulusD);

        } catch (ParseException ex) {
            Log.v("Exception", ex.getLocalizedMessage());
        }

        List<String> sources = new ArrayList<>();
        sources.add("Semester 1 ("+sem1N+")");
        sources.add("Semester 2 ("+sem2N+")");
        sources.add("Semester 3 ("+sem3N+")");
        sources.add("Semester 4 ("+sem4N+")");
        sources.add("Semester 5 ("+sem5N+")");
        sources.add("Semester 6 ("+sem6N+")");
        sources.add("Praktek Kerja Lapangan ("+pklN+")");
        sources.add("Semester 7 ("+sem7N+")");
        sources.add("Semester 8 ("+sem8N+")");
        sources.add("Skripsi ("+skripsiN+")");
        sources.add("Lulus ("+lulusN+")");


        if(now.compareTo(sem1D) > 0 && now.compareTo(sem2D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 11);
        }else if(now.compareTo(sem2D) > 0 && now.compareTo(sem3D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 10);
        }else if(now.compareTo(sem3D) > 0 && now.compareTo(sem4D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 9);
        }else if(now.compareTo(sem4D) > 0 && now.compareTo(sem5D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 8);
        }else if(now.compareTo(sem5D) > 0 && now.compareTo(sem6D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 7);
        }else if(now.compareTo(sem6D) > 0 && now.compareTo(pklD) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 6);
        }else if(now.compareTo(pklD) > 0 && now.compareTo(sem7D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 5);
        }else if(now.compareTo(sem7D) > 0 && now.compareTo(sem8D) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 4);
        }else if(now.compareTo(sem8D) > 0 && now.compareTo(lulusD) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 2);
        }else if(now.compareTo(skripsiD) > 0 && now.compareTo(lulusD) < 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size() - 2);
        }else if(now.compareTo(lulusD) > 0){
            verticalStepView.setStepsViewIndicatorComplectingPosition(sources.size());
        }

        verticalStepView.reverseDraw(false)
                .setStepViewTexts(sources)
                .setLinePaddingProportion(0.85f)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))
                .setStepViewComplectedTextColor(Color.parseColor("#FFFF00"))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))
                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon));

    }
}
