package com.t_robop.spinnert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner mSpinner1;
    Spinner Sphokkai;//北海道0
    Spinner Sptohoku;//東北1
    Spinner Spkanto;//関東2
    Spinner Spchubu;//中部3
    Spinner Spkansai;//関西4
    Spinner Spchugoku;//中国5
    Spinner Spshikoku;//四国6
    Spinner Spkyuushu;//九州7

    int spHantei=0;//地方判定
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

                    spHantei=0;

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
                    spHantei=1;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Sptohoku.setVisibility(View.VISIBLE);   //東北表示

                }else if(selected.equals("関東")){

                    spHantei=2;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spkanto.setVisibility(View.VISIBLE);  //関東表示

                }else if(selected.equals("中部")){

                    spHantei=3;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spchubu.setVisibility(View.VISIBLE);  //中部表示

                }else if(selected.equals("関西")){

                    spHantei=4;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spkansai.setVisibility(View.VISIBLE);  //関西表示

                }else if(selected.equals("中国")){

                    spHantei=5;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spshikoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spchugoku.setVisibility(View.VISIBLE);  //中国表示

                }else if(selected.equals("四国")){

                    spHantei=6;

                    Sphokkai.setVisibility(View.GONE);  //非表示
                    Sptohoku.setVisibility(View.GONE);  //非表示
                    Spkanto.setVisibility(View.GONE);  //非表示
                    Spchubu.setVisibility(View.GONE);  //非表示
                    Spkansai.setVisibility(View.GONE);  //非表示
                    Spchugoku.setVisibility(View.GONE);  //非表示
                    Spkyuushu.setVisibility(View.GONE);  //非表示

                    Spshikoku.setVisibility(View.VISIBLE);  //四国表示

                }else if(selected.equals("九州")){

                    spHantei=7;

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

    public void OKbutton(View v){

        switch (spHantei){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }

    }
}




