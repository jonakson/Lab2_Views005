package com.example.jcalzado.lab2_views005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] countries = { "Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay" };
    private String[] population = { "40.000.000", "17.000.000", "6.500.000", "10.000.000", "30.000.000", "14.000.000", "183.000.000", "44.000.000", "29.000.000", "3.500.000" };
    private TextView outPopulation;
    private ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outPopulation = (TextView) findViewById(R.id.outPopulation);
        countriesList = (ListView) findViewById(R.id.countriesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, countries);
        countriesList.setAdapter(adapter);

        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                outPopulation.setText("Población "+ countriesList.getItemAtPosition(i) + ": "+ population[i] + " habitantes.");
            }
        });
    }
}
