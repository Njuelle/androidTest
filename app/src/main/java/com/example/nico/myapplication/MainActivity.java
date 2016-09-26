package com.example.nico.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText("Salut");

        /*Map test = testMap();
        for (Object key : test.keySet()) {
            Log.e("key : " + key, "value : " + test.get(key).toString());
        }*/

        Intervalle i1 = new Intervalle(0, 10);
        Intervalle i2 = new Intervalle(5, 25);
        Log.e("i1 : ", i1.toString());
        Log.e("i2 : ", i2.toString());
        Log.e("i1 intersection(i2) : ", i1.intersection(i2).toString());
        if (i1.union(i2) != null) {
            Log.e("i1 union(i2) : ", i1.union(i2).toString());
        } else {
            Log.e("i1 union(i2) : ", "null");
        }



    }

    private Map testMap() {
        Map <String, String> map = new HashMap();
        map.put("test1", "first test" );
        map.put("test2", "second test" );
        return map;
    }
}
