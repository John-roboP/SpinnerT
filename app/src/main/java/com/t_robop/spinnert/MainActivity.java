package com.t_robop.spinnert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner mSpinner1;
    Spinner Sphokkai;//北海道
    Spinner Sptohoku;//東北
    Spinner Spkanto;//関東
    Spinner Spchubu;//中部
    Spinner Spkansai;//関西
    Spinner Spchugoku;//中国
    Spinner Spshikoku;//四国
    Spinner Spkyuushu;//九州


    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSpinner1 = (Spinner) findViewById(R.id.spinner);
        Sphokkai = (Spinner) findViewById(R.id.spinner2);
        Sptohoku = (Spinner) findViewById(R.id.spinner3);
        Spkanto = (Spinner) findViewById(R.id.spinner4);
        Spchubu = (Spinner) findViewById(R.id.spinner5);
        Spkansai = (Spinner) findViewById(R.id.spinner6);
        Spchugoku = (Spinner) findViewById(R.id.spinner7);
        Spshikoku = (Spinner) findViewById(R.id.spinner8);
        Spkyuushu = (Spinner) findViewById(R.id.spinner9);

        Sphokkai.setVisibility(View.GONE);  //非表示
        Sptohoku.setVisibility(View.GONE);  //非表示
        Spkanto.setVisibility(View.GONE);  //非表示
        Spchubu.setVisibility(View.GONE);  //非表示
        Spkansai.setVisibility(View.GONE);  //非表示
        Spchugoku.setVisibility(View.GONE);  //非表示
        Spshikoku.setVisibility(View.GONE);  //非表示
        Spkyuushu.setVisibility(View.GONE);  //非表示



    //    if(selected.equals("東北")){
      //      Sphokkai.setVisibility(View.VISIBLE);

       // }else{
       //     Log.d("test","test");
       // }

        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                selected = (String) mSpinner1.getSelectedItem();
                if (selected.equals("北海道")) {
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示

                    Sphokkai.setVisibility(View.VISIBLE);   //北海道表示

                } else if(selected.equals("東北")){
                    Log.d("test", "test");
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Sptohoku.setVisibility(View.VISIBLE);   //東北表示

                }else if(selected.equals("関東")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spkanto.setVisibility(View.VISIBLE);  //関東表示

                }else if(selected.equals("中部")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spchubu.setVisibility(View.VISIBLE);  //中部表示

                }else if(selected.equals("関西")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spkansai.setVisibility(View.VISIBLE);  //関西表示

                }else if(selected.equals("中国")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spchugoku.setVisibility(View.VISIBLE);  //中国表示

                }else if(selected.equals("四国")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spshikoku.setVisibility(View.VISIBLE);  //四国表示

                }else if(selected.equals("九州")){
                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示

                    Spkyuushu.setVisibility(View.VISIBLE);  //九州表示

                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });
    }
}




