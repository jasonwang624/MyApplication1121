package com.example.user.myapplication1121;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    MyAdapter adapter;
    String fruits[] = {"蘋果", "西瓜", "楊桃", "鳳梨", "蘋果1", "西瓜1", "楊桃1", "鳳梨1", "蘋果2", "西瓜2", "楊桃2", "鳳梨2", "蘋果3", "西瓜3", "楊桃3", "鳳梨3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter(MainActivity.this, fruits);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Show!");
        menu.add(0,1,1,"next");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 0)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < fruits.length; i++) {
                if (adapter.chks[i]) {
                    sb.append(fruits[i] + ",");
                }
            }
            Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == 1) {
            Intent it = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(it);
        }

        return super.onOptionsItemSelected(item);
    }


}
