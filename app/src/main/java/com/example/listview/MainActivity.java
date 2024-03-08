package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String[] color = {"Red","Green","Black","Red","Green","Black","Red","Green","Black","Red","Green","Black",};
    ArrayList<User> users = new ArrayList<>();
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        users.add(new User("Namal",15));
        users.add(new User("Namal",95));
        users.add(new User("Namal",25));
        users.add(new User("Namal",86));
        users.add(new User("Namal",174));
        users.add(new User("Namal",2));
        users.add(new User("Namal",89));

        listView = findViewById(R.id.listView);
        adapter=new UserAdapter(this,R.layout.user_row_item,users);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
    }
}