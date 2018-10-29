package com.example.sherrinford.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static java.util.logging.Logger.global;

public class activity2 extends AppCompatActivity {
    int k=10;
    int []credits=new int[10];
    int total_credits=0;
    ImageView arrow;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_activity2);
        Bundle bundle = getIntent().getExtras();
        arrow = (ImageView) findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity2.this ,MainActivity.class);
                startActivity(intent);
            }
        });

        String Year = bundle.getString("Year");
        String Branch= bundle.getString("Branch");
        TextView txtView = (TextView) findViewById(R.id.year_txt);
        txtView.setText(Year);
        TextView txtView2 = (TextView) findViewById(R.id.branch_txt);
        txtView2.setText(Branch);
        int yr_index = bundle.getInt("yr_index");
        int index=bundle.getInt("index");
        int sem_index=bundle.getInt("sem_index");
        Log.d("SEm INDEX", String.valueOf(sem_index));
        Log.d("Pressed",index + "  "+yr_index);
        if(yr_index==-1){
            Toast Error_toast = Toast.makeText(getApplicationContext(),"Invalid Year Type",Toast.LENGTH_SHORT);
            Error_toast.show();
            Intent inte= new Intent(activity2.this,MainActivity.class);
            startActivity(inte);
        }

        else if(index==-1){
            Toast Error_toast = Toast.makeText(getApplicationContext(),"Invalid Stream",Toast.LENGTH_SHORT);
            Error_toast.show();
            Intent inte= new Intent(activity2.this,MainActivity.class);
            startActivity(inte);
        }
        else if(sem_index==-1){
            Toast Error_toast = Toast.makeText(getApplicationContext(),"Invalid Semester Name",Toast.LENGTH_SHORT);
            Error_toast.show();
            Intent inte= new Intent(activity2.this,MainActivity.class);
            startActivity(inte);
        }
        if(yr_index==1) {
            if (sem_index == 1) {
                if (index == 1 || index == 3 || index == 6) {
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Engineering Mathematics");
                    credits[0]=4;
                    total_credits+=4;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Engineering Chemistry");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Enginnering Graphics");
                    credits[2]=3;
                    total_credits+=3;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("B.COMP AND IT/BECE");
                    credits[3]=4;
                    total_credits+=4;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("Engineering Mechanics");
                    credits[4]=3;
                    total_credits+=3;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("LAB-Engineering Chemistry");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("LAB-Engineering Graphics");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("LAB-B.Comp and IT / BECE");
                    credits[7]=1;
                    total_credits+=1;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("LAB-Engineering Mechanics");
                    credits[8]=1;
                    total_credits+=1;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setText("LAB-Workshop-I");
                    credits[9]=1;
                    total_credits+=1;
                    k=10;
                }
                else if (index == 2 || index == 4 || index == 5){
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Engineering Mathematics-I");
                    credits[0]=4;
                    total_credits+=4;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Engineering Physics");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Communication Skills");
                    credits[2]=4;
                    total_credits+=4;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("Engineering Exploration");
                    credits[3]=3;
                    total_credits+=3;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("BCE /CME/BEE");
                    credits[4]=4;
                    total_credits+=4;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("LAB-Engineering Physics");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("LAB-Communication Skills");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("LAB-BCE/CME/BEE");
                    credits[7]=1;
                    total_credits+=1;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("LAB-Workshop-I");
                    credits[8]=1;
                    total_credits+=1;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setVisibility(View.INVISIBLE);
                    Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                    sp22.setVisibility(View.INVISIBLE);
                    k=9;

                }
            }
            else if(sem_index==2){
                if (index == 1 || index == 3 || index == 6) {
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Engineering Mathematics-I");
                    credits[0]=4;
                    total_credits+=4;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Engineering Physics");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Communication Skills");
                    credits[2]=4;
                    total_credits+=4;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("Engineering Exploration");
                    credits[3]=3;
                    total_credits+=3;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("BCE /CME/BEE");
                    credits[4]=4;
                    total_credits+=4;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("LAB-Engineering Physics");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("LAB-Communication Skills");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("LAB-BCE/CME/BEE");
                    credits[7]=1;
                    total_credits+=1;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("LAB-Workshop-I");
                    credits[8]=1;
                    total_credits+=1;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setVisibility(View.INVISIBLE);
                    Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                    sp22.setVisibility(View.INVISIBLE);
                    k=9;
                }
                else if (index == 2 || index == 4 || index == 5){
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Engineering Mathematics");
                    credits[0]=4;
                    total_credits+=4;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Engineering Chemistry");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Enginnering Graphics");
                    credits[2]=3;
                    total_credits+=3;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("B.COMP AND IT/BECE");
                    credits[3]=4;
                    total_credits+=4;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("Engineering Mechanics");
                    credits[4]=3;
                    total_credits+=3;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("LAB-Engineering Chemistry");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("LAB-Engineering Graphics");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("LAB-B.Comp and IT / BECE");
                    credits[7]=1;
                    total_credits+=1;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("LAB-Engineering Mechanics");
                    credits[8]=1;
                    total_credits+=1;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setText("LAB-Workshop-I");
                    credits[9]=1;
                    total_credits+=1;
                    k=10;
                }
            }
        }
        else if(yr_index==2) {
            switch (index) {
                case 1:
                        if(sem_index==1) {
                            TextView txtView13 = (TextView) findViewById(R.id.Course1);
                            txtView13.setText("Database Management System");
                            credits[0]=4;
                            total_credits+=4;
                            TextView txtView14 = (TextView) findViewById(R.id.Course2);
                            txtView14.setText("Object Oriented Programming");
                            credits[1]=3;
                            total_credits+=3;
                            TextView txtView15 = (TextView) findViewById(R.id.Course3);
                            txtView15.setText("Enginnering Mathmetics - III");
                            credits[2]=4;
                            total_credits+=4;
                            TextView txtView16 = (TextView) findViewById(R.id.Course4);
                            txtView16.setText("Engineering Science (DMS)");
                            credits[3]=3;
                            total_credits+=3;
                            TextView txtView17 = (TextView) findViewById(R.id.Course5);
                            txtView17.setText("Lab-Database Management System");
                            credits[4]=1;
                            total_credits+=1;
                            TextView txtView18 = (TextView) findViewById(R.id.Course6);
                            txtView18.setText("Lab-Object Oriented Programming");
                            credits[5]=1;
                            total_credits+=1;
                            TextView txtView19 = (TextView) findViewById(R.id.Course7);
                            txtView19.setText("Lab-Web Technology");
                            credits[6]=1;
                            total_credits+=1;
                            TextView txtView20 = (TextView) findViewById(R.id.Course8);
                            txtView20.setText("Lab-Adv C & C++");
                            credits[7]=1;
                            total_credits+=1;
                            TextView txtView21 = (TextView) findViewById(R.id.Course9);
                            txtView21.setText("Environment Studies ");
                            credits[8]=4;
                            total_credits+=4;
                            TextView txtView22 = (TextView) findViewById(R.id.Course10);
                            txtView22.setText("Psycology");
                            credits[9]=2;
                            total_credits+=2;
                            k=10;
                        }
                        else{
                            TextView txtView13 = (TextView) findViewById(R.id.Course1);
                            txtView13.setText("Data Structure");
                            credits[0]=4;
                            total_credits+=4;
                            TextView txtView14 = (TextView) findViewById(R.id.Course2);
                            txtView14.setText("Computer Organization");
                            credits[1]=4;
                            total_credits+=4;
                            TextView txtView15 = (TextView) findViewById(R.id.Course3);
                            txtView15.setText("Microprocessor & Interfacing");
                            credits[2]=4;
                            total_credits+=4;
                            TextView txtView16 = (TextView) findViewById(R.id.Course4);
                            txtView16.setText("Engineering Science(OSST)");
                            credits[3]=2;
                            total_credits+=2;
                            TextView txtView17 = (TextView) findViewById(R.id.Course5);
                            txtView17.setText("Open Elective-I");
                            credits[4]=3;
                            total_credits+=3;
                            TextView txtView18 = (TextView) findViewById(R.id.Course6);
                            txtView18.setText("Lab-Adv Web Technology");
                            credits[5]=1;
                            total_credits+=1;
                            TextView txtView19 = (TextView) findViewById(R.id.Course7);
                            txtView19.setText("Lab-Data Structure");
                            credits[6]=1;
                            total_credits+=1;
                            TextView txtView20 = (TextView) findViewById(R.id.Course8);
                            txtView20.setText("Lab-Microprocessor & Interfacing");
                            credits[7]=1;
                            total_credits+=1;
                            TextView txtView21 = (TextView) findViewById(R.id.Course9);
                            txtView21.setText("Lab Java Programming");
                            credits[8]=4;
                            total_credits+=4;
                            TextView txtView22 = (TextView) findViewById(R.id.Course10);
                            txtView22.setVisibility(View.INVISIBLE);
                            Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                            sp22.setVisibility(View.INVISIBLE);
                            k=9;

                        }
                        break;
                case 2:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Solid Mechanics");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Fluid Mechanics");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Enginnering Mathmetics - III");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Surveying-I");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Lab-Solid Mechanics");
                        credits[4]=1;
                        total_credits+=1;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Fluid Mechanics");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Surveying-I");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Environment Studies ");
                        credits[7]=4;
                        total_credits+=4;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Psycology");
                        credits[8]=2;
                        total_credits+=2;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Civil Engineering Materials");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Structural Analysis");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Building  Planning and Design");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Surveying-II");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Open Elective-I");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Civil Engineering Materials");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Building Planning and Design");
                        credits[6]=2;
                        total_credits+=2;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Surveying-II");
                        credits[7]=2;
                        total_credits+=2;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-Open Elective-I");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;

                    }
                    break;
                case 3:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Computer Graphics");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Data Structues");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Enginnering Mathmetics - III");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Digital Electronis and Microprocessor");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Software Development Lab- I");
                        credits[4]=2;
                        total_credits+=2;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("LAB-Computer Graphics");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("LAB-Data Structues");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("LAB-Digital Electronis and Microprocessor");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Environment Studies ");
                        credits[8]=4;
                        total_credits+=4;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Psycology");
                        credits[9]=2;
                        total_credits+=2;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Professional Ethics and Cyber Laws ");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Object Oriented Programming ");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Discrete Mathematics  & Structure ");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Database Management System ");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Data Communication Networking ");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Basics of Data Structure");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Basics of Cyber Security");
                        credits[6]=3;
                        total_credits+=3;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab: Object Oriented Programming ");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab: Database Management System ");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab: Software Development Lab-II ");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;

                    }
                    break;
                case 4:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Engg Thermodynamics");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Machine Drawing");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Enginnering Mathmetics - III");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Manufacturing Process");
                        credits[3]=2;
                        total_credits+=2;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective-I");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Open Elective");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Engg Thermodynamics");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Machine Drawing");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Environment Studies ");
                        credits[8]=4;
                        total_credits+=4;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab-Workshop III");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Electrical Machines");
                        credits[0]=2;
                        total_credits+=2;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Mechanisms of Machines");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Applied Thermodynamics");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Strength Of Materials");
                        credits[3]=2;
                        total_credits+=2;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective-II");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Electrical Machines");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Mechanisms of Machines");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab -Applied Thermodynamics");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab -Strength Of Materials");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab-CAME I");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;

                    }
                    break;
                case 5:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Electromagnetic Field");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Network Analysis");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Enginnering Mathmetics - III");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Analog Electronics");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Computer Programming");
                        credits[4]=2;
                        total_credits+=2;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab -Network Analysis");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Analog Electronics");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Computer Programming");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Environment Studies ");
                        credits[8]=4;
                        total_credits+=4;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Psycology");
                        credits[9]=2;
                        total_credits+=2;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Electrical Machines-I");
                        credits[0]=2;
                        total_credits+=2;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Electrical Measurement and Intrumentation");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Power System I");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Linear Integrated Circuits and Applications");
                        credits[3]=2;
                        total_credits+=2;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Lab-Electrical Machines I");
                        credits[4]=1;
                        total_credits+=1;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Electrical Measurement and Intrumentation");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Linear Integrated Circuits and Applications");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Addition Subject form HSS list");
                        credits[7]=3;
                        total_credits+=3;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Addition Subject from ES Course");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;

                    }
                    break;
                case 6:
                    if(sem_index==1) {
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Any one of ET2001/ ET2002");
                    credits[0]=2;
                    total_credits+=2;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Electronics Devices & Circuits");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Enginnering Mathmetics - III");
                    credits[2]=4;
                    total_credits+=4;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("Digital Electronics");
                    credits[3]=3;
                    total_credits+=3;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("Signals & Systems");
                    credits[4]=3;
                    total_credits+=3;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("Lab-Electronics  Devices  & Circuits");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("Lab-Digital Electronics");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("Lab-Signals & Systems");
                    credits[7]=1;
                    total_credits+=1;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("Environment Studies ");
                    credits[8]=4;
                    total_credits+=4;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setText("Psycology");
                    credits[9]=2;
                    total_credits+=2;
                    k=10;
                }
                else{
                    TextView txtView13 = (TextView) findViewById(R.id.Course1);
                    txtView13.setText("Electrical Machines-I");
                    credits[0]=2;
                    total_credits+=2;
                    TextView txtView14 = (TextView) findViewById(R.id.Course2);
                    txtView14.setText("Electrical Measurement and Intrumentation");
                    credits[1]=3;
                    total_credits+=3;
                    TextView txtView15 = (TextView) findViewById(R.id.Course3);
                    txtView15.setText("Power System I");
                    credits[2]=3;
                    total_credits+=3;
                    TextView txtView16 = (TextView) findViewById(R.id.Course4);
                    txtView16.setText("Linear Integrated Circuits and Applications");
                    credits[3]=2;
                    total_credits+=2;
                    TextView txtView17 = (TextView) findViewById(R.id.Course5);
                    txtView17.setText("Lab-Electrical Machines I");
                    credits[4]=1;
                    total_credits+=1;
                    TextView txtView18 = (TextView) findViewById(R.id.Course6);
                    txtView18.setText("Lab-Electrical Measurement and Intrumentation");
                    credits[5]=1;
                    total_credits+=1;
                    TextView txtView19 = (TextView) findViewById(R.id.Course7);
                    txtView19.setText("Lab-Linear Integrated Circuits and Applications");
                    credits[6]=1;
                    total_credits+=1;
                    TextView txtView20 = (TextView) findViewById(R.id.Course8);
                    txtView20.setText("Addition Subject form HSS list");
                    credits[7]=3;
                    total_credits+=3;
                    TextView txtView21 = (TextView) findViewById(R.id.Course9);
                    txtView21.setText("Addition Subject from ES Course");
                    credits[8]=1;
                    total_credits+=1;
                    TextView txtView22 = (TextView) findViewById(R.id.Course10);
                    txtView22.setVisibility(View.INVISIBLE);
                    Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                    sp22.setVisibility(View.INVISIBLE);
                    k=9;

                }
                    break;
            }
        }
        else if(yr_index==3) {
            switch (index) {
                case 1:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Design & Analysis of Algorithm");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Operating System");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Theory of Computation");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Software Engineering");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Data Mining & Warehousing");
                        credits[4]=4;
                        total_credits+=4;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab Design & Analysis of Algorithm");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab Operating System");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab Data Mining & Warehousing");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Mini Project");
                        credits[8]=2;
                        total_credits+=2;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Computer Network");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("System Programming & Compiler Construction");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Data Science");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Advanced Algorithm");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Open Elective-I");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab Advanced Development Tool");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab Computer Network");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab Advanced Algorithm ");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab Data Science");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Seminar");
                        credits[8]=1;
                        total_credits+=1;
                        k=10;
                    }
                    break;
                case 2:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Engineering Economics");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Design Of Steel Structures");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Transportation Engineering");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Envoimental Engineering");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Geotechnical And Foundation Engineering");
                        credits[4]=4;
                        total_credits+=4;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab Transportation Engineering");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab Envoimental Engineering");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab Geotechnical And Foundation Engineering");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Open Elective-II(Disaster Management)");
                        credits[8]=3;
                        total_credits+=3;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Constitution Of India and Ethics");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Design Of RCC Structures");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Water Resources Engineering");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Engineering Geology");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Lab Water Resources Engineering");
                        credits[4]=1;
                        total_credits+=1;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab Engineering Geology");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab Structural Design And Drawing");
                        credits[6]=2;
                        total_credits+=2;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Open Elective III");
                        credits[7]=3;
                        total_credits+=3;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Seminar");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    break;
                case 3:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Computer Algorithms");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Computers Networks");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Software Engineering And Testing");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Operating System");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective-I ");
                        credits[4]=5;
                        total_credits+=5;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Computer Algorithm ");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("LAB-Computer Networks");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("LAB-Software Engineering And Testing");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-Opertaing System");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab:Open Source-I");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Bussiness Intelligence");
                        credits[0]=2;
                        total_credits+=2;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Theory Of Computation");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Advanced Database Management System ");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Mobile Computing");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("PROFESSIONAL ELECTIVE –II ");
                        credits[4]=4;
                        total_credits+=4;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("OPEN ELECTIVE");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Advanced Database Management System ");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Mobile Computing");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21=(TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-PROFESSIONAL ELECTIVE –II");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    break;
                case 4:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Applied Mathematics");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Design Of Machine Elements-I");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Engineering Metallurgy");
                        credits[2]=2;
                        total_credits+=2;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Fluid Mechanics And Hydraulics Machines");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective I");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Design Of Machine I");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("LAB-Engineering Metallurgy");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("LAB-Fluid Mechanics And Hydraulics Machines");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-CAME II");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Industrial Organisation And Management");
                        credits[9]=3;
                        total_credits+=3;
                        k=10;
                    }
                    else{
                        /*TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Bussiness Intelligence");
                        credits[0]=2;
                        total_credits+=2;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Theory Of Computation");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Advanced Database Management System ");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Mobile Computing");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("PROFESSIONAL ELECTIVE –II ");
                        credits[4]=4;
                        total_credits+=4;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("OPEN ELECTIVE");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Advanced Database Management System ");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Mobile Computing");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21=(TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-PROFESSIONAL ELECTIVE –II");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                        */
                        Intent intent2=new Intent(activity2.this,activity4.class);
                        startActivity(intent2);
                    }
                    break;
                case 5:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Electrical Machines-II");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Digital Electronics");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Renewable Energy Technology");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Power System II");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Control Systems");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Any Course From HSS list");
                        credits[5]=2;
                        total_credits+=2;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("LAB-Electrical Machines-II");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("LAB-Digital Electronics");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-Power System II");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab-Control Systems");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Open Elective I");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Swithgear And Protection");
                        credits[1]=3;
                        total_credits+=3;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Microprocessor and Microcontroller");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Power Electronics");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Advanced Control Systems");
                        credits[4]=4;
                        total_credits+=4;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Advanced Power System");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Swithgear And Protection");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Microprocessor and Microcontroller");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21=(TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-Power Electronics");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                case 6:
                    if(sem_index==1) {
                        /*
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Digital Communication");
                        credits[0]=3;
                        total_credits+=3;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Microprocessor & Microcontroller");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Electronics Design Technology");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Control System");
                        credits[3]=3;
                        total_credits+=3;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Open Elective");
                        credits[5]=3;
                        total_credits+=3;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Digital Communication");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Microprocessor & Microcontroller");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab-Electronics Design Technology");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Lab-Control System");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                        */
                        Intent intent2=new Intent(activity2.this,activity4.class);
                        startActivity(intent2);
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Digital Signal Processing");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Computer Architecture and Organization");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Embedded Systems");
                        credits[2]=3;
                        total_credits+=3;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Electromagnetic Engineering");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Professional Elective");
                        credits[4]=3;
                        total_credits+=3;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab- Digital Signal Processing");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab- Computer Architecture");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Embedded Systems");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21=(TextView) findViewById(R.id.Course9);
                        txtView21.setText("Lab- Professional Elective");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("e-skill workshop");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                    }
            }
        }
        else if(yr_index==4) {
            switch (index) {
                case 1:
                    if(sem_index==1) {
                        TextView txtView3 = (TextView) findViewById(R.id.Course1);
                        txtView3.setText(Branch);
                        TextView txtView4 = (TextView) findViewById(R.id.Course2);
                        txtView4.setText(Branch);
                        TextView txtView5 = (TextView) findViewById(R.id.Course3);
                        txtView5.setText(Branch);
                        TextView txtView6 = (TextView) findViewById(R.id.Course4);
                        txtView6.setText(Branch);
                        TextView txtView7 = (TextView) findViewById(R.id.Course5);
                        txtView7.setText(Branch);
                        break;
                    }
                    else{

                    }
                case 2:
                    TextView txtView8 = (TextView) findViewById(R.id.Course1);
                    txtView2.setText(Branch);
                    TextView txtView9 = (TextView) findViewById(R.id.Course2);
                    txtView2.setText(Branch);
                    TextView txtView10 = (TextView) findViewById(R.id.Course3);
                    txtView2.setText(Branch);
                    TextView txtView11 = (TextView) findViewById(R.id.Course4);
                    txtView2.setText(Branch);
                    TextView txtView12 = (TextView) findViewById(R.id.Course5);
                    txtView2.setText(Branch);
                    break;
                case 3:
                    if(sem_index==1) {
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Mobile Computing ");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Information Retrieval");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Data Mining ");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Elective –III ");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Lab-Android Programming ");
                        credits[4]=1;
                        total_credits+=1;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Information Retrieval ");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Data Mining");
                        credits[6]=1;
                        total_credits+=1;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Advanced Programming Lab ");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Elective –III");
                        credits[8]=1;
                        total_credits+=1;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setText("Seminar");
                        credits[9]=1;
                        total_credits+=1;
                        k=10;
                    }
                    else{
                        TextView txtView13 = (TextView) findViewById(R.id.Course1);
                        txtView13.setText("Cryptography and Network Security ");
                        credits[0]=4;
                        total_credits+=4;
                        TextView txtView14 = (TextView) findViewById(R.id.Course2);
                        txtView14.setText("Cloud Computing ");
                        credits[1]=4;
                        total_credits+=4;
                        TextView txtView15 = (TextView) findViewById(R.id.Course3);
                        txtView15.setText("Multimedia Processing");
                        credits[2]=4;
                        total_credits+=4;
                        TextView txtView16 = (TextView) findViewById(R.id.Course4);
                        txtView16.setText("Elective –IV");
                        credits[3]=4;
                        total_credits+=4;
                        TextView txtView17 = (TextView) findViewById(R.id.Course5);
                        txtView17.setText("Lab-Cryptography and Network Security ");
                        credits[4]=1;
                        total_credits+=1;
                        TextView txtView18 = (TextView) findViewById(R.id.Course6);
                        txtView18.setText("Lab-Cloud Computing");
                        credits[5]=1;
                        total_credits+=1;
                        TextView txtView19 = (TextView) findViewById(R.id.Course7);
                        txtView19.setText("Lab-Multimedia Processing ");
                        credits[6]=2;
                        total_credits+=2;
                        TextView txtView20 = (TextView) findViewById(R.id.Course8);
                        txtView20.setText("Lab-Elective –II ");
                        credits[7]=1;
                        total_credits+=1;
                        TextView txtView21 = (TextView) findViewById(R.id.Course9);
                        txtView21.setText("Project II ");
                        credits[8]=3;
                        total_credits+=3;
                        TextView txtView22 = (TextView) findViewById(R.id.Course10);
                        txtView22.setVisibility(View.INVISIBLE);
                        Spinner sp22=(Spinner) findViewById(R.id.spinner10);
                        sp22.setVisibility(View.INVISIBLE);
                        k=9;
                    }
                    break;
                case 4:
                    TextView txtViewA = (TextView) findViewById(R.id.Course1);
                    txtViewA.setText(Branch);
                    TextView txtViewB = (TextView) findViewById(R.id.Course2);
                    txtViewB.setText(Branch);
                    TextView txtViewC = (TextView) findViewById(R.id.Course3);
                    txtViewC.setText(Branch);
                    TextView txtViewD = (TextView) findViewById(R.id.Course4);
                    txtViewD.setText(Branch);
                    TextView txtViewE = (TextView) findViewById(R.id.Course5);
                    txtViewE.setText(Branch);
                    break;
                case 5:
                    TextView txtView23 = (TextView) findViewById(R.id.Course1);
                    txtView2.setText(Branch);
                    TextView txtView24 = (TextView) findViewById(R.id.Course2);
                    txtView2.setText(Branch);
                    TextView txtView25 = (TextView) findViewById(R.id.Course3);
                    txtView2.setText(Branch);
                    TextView txtView26 = (TextView) findViewById(R.id.Course4);
                    txtView2.setText(Branch);
                    TextView txtView27 = (TextView) findViewById(R.id.Course5);
                    txtView2.setText(Branch);
                    break;
                case 6:
                    TextView txtView28 = (TextView) findViewById(R.id.Course1);
                    txtView2.setText(Branch);
                    TextView txtView29 = (TextView) findViewById(R.id.Course2);
                    txtView2.setText(Branch);
                    TextView txtView30 = (TextView) findViewById(R.id.Course3);
                    txtView2.setText(Branch);
                    TextView txtView31 = (TextView) findViewById(R.id.Course4);
                    txtView2.setText(Branch);
                    TextView txtView32 = (TextView) findViewById(R.id.Course5);
                    txtView2.setText(Branch);
                    break;
            }
        }

        go = (Button) findViewById(R.id.Calc);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTON Was Pressed","1");
                Spinner spinner1 =(Spinner) findViewById(R.id.spinner1);
                Spinner spinner2 =(Spinner) findViewById(R.id.spinner2);
                Spinner spinner3 =(Spinner) findViewById(R.id.spinner3);
                Spinner spinner4 =(Spinner) findViewById(R.id.spinner4);
                Spinner spinner5 =(Spinner) findViewById(R.id.spinner5);
                Spinner spinner6 =(Spinner) findViewById(R.id.spinner6);
                Spinner spinner7 =(Spinner) findViewById(R.id.spinner7);
                Spinner spinner8 =(Spinner) findViewById(R.id.spinner8);
                Spinner spinner9 =(Spinner) findViewById(R.id.spinner9);
                Spinner spinner10 = (Spinner) findViewById(R.id.spinner10);
                String []text=new String[10];
                text[0] = spinner1.getSelectedItem().toString();
                text[1] = spinner2.getSelectedItem().toString();
                text[2]= spinner3.getSelectedItem().toString();
                text[3]= spinner4.getSelectedItem().toString();
                text[4]= spinner5.getSelectedItem().toString();
                text[5]= spinner6.getSelectedItem().toString();
                text[6]= spinner7.getSelectedItem().toString();
                text[7]= spinner8.getSelectedItem().toString();
                text[8]= spinner9.getSelectedItem().toString();
                if(k==10) {
                    text[9] = spinner10.getSelectedItem().toString();
                }
                int []score = new int[k];
                int sum=0;
                for(int i=0;i<k;i++){
                    if(text[i].equals("A++")){
                        score[i]=10;
                    }
                    else if(text[i].equals("A+")){
                        score[i]=9;
                    }
                    else if(text[i].equals("A")){
                        score[i]=8;
                    }
                    else if(text[i].equals("B+")){
                        score[i]=7;
                    }
                    else if(text[i].equals("B")){
                        score[i]=6;
                    }
                    else if(text[i].equals("C+")){
                        score[i]=5;
                    }
                    else if(text[i].equals("C")){
                        score[i]=4;
                    }
                    else{
                        score[i]=0;
                    }
                    sum+=(score[i]*credits[i]);
                }
                float result_score=sum;
                Log.d("result::",sum +"  "+total_credits);
                result_score=result_score/(float)total_credits;
                Log.d("Resulting answer", String.valueOf(result_score));
                Intent intent1= new Intent(activity2.this , activity3.class);
                intent1.putExtra("Total",result_score);
                startActivity(intent1);
            }
        });
    }
}
