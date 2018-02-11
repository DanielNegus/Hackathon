package com.example.thedan.fishonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.*;
import android.widget.TextView;
import com.webianks.library.scroll_choice.ScrollChoice;
import android.widget.Button;

public class GameActivity1 extends AppCompatActivity {
    List<String> data = new ArrayList<>();
    TextView textView;
    ScrollChoice scrollChoice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        initViews();
        loadData();
        scrollChoice.addItems(data, 1);


        /*
        List<String> speciesArray = new ArrayList<String>();

        speciesArray.add("item1");
        speciesArray.add("item2");
        for (int x=0; x <= 3; x++){
            speciesArray.add("item"+x);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, speciesArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);
        */
        Button confirmButton = (Button) findViewById(R.id.button2);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameActivity1.this, Thankyou.class));
            }
        });
    }
    private void loadData(){
        data.add("Rock Bass");
        data.add("Large-Mouth Bass");
        data.add("Small-mouth Bass");
        data.add("Striped Bass");
        data.add("Catfish");
        data.add("Sunfish");
    }
    private void initViews(){
        scrollChoice = (ScrollChoice)findViewById(R.id.scroll_choice);
    }
}
