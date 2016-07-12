package com.t_robop.spinnert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner mSpinner1;
    Spinner mSpinner2;//sp2
    Spinner mSpinner3;//
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSpinner1 = (Spinner) findViewById(R.id.spinner);
        mSpinner2 = (Spinner) findViewById(R.id.spinner2);
        mSpinner3 = (Spinner) findViewById(R.id.spinner3);

        mSpinner2.setVisibility(View.GONE);



    //    if(selected.equals("東北")){
      //      mSpinner2.setVisibility(View.VISIBLE);

       // }else{
       //     Log.d("test","test");
       // }

        mSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Spinner spinner = (Spinner) parent;
                // 選択されたアイテムを取得します
                //  String item = (String) spinner.getSelectedItem();
                // Toast.makeText(SpinnerSampleActivity.this, item, Toast.LENGTH_LONG).show();
                selected = (String) mSpinner1.getSelectedItem();
                if (selected.equals("東北")) {
                    mSpinner2.setVisibility(View.VISIBLE);

                } else {
                    Log.d("test", "test");
                  
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });
    }
}




