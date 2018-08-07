package net.buammar.jam3ya;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addUser();
        getUsers();
    }

    private void addUser() {
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent(this, AddUserActivity.class);
                Intent intent = new Intent(getApplicationContext(), AddUserActivity.class);
                startActivity(intent);
                // The user can't go back again finish();
            }
        });

    }

    private void getUsers() {
        String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
        ListView listView = findViewById(R.id.usersListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, countryList);
        listView.setAdapter(arrayAdapter);
    }

}
