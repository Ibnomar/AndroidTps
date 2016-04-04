package com.ismael.tp2_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    Button button_connexion;
    EditText editText_login ;
    EditText editText_password;
    TextView textView_bienvenue ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button_connexion = (Button)findViewById(R.id.button_connexion);
        editText_login = (EditText) findViewById(R.id.editText_login);
        editText_password = (EditText)findViewById(R.id.editText_password);
        textView_bienvenue = (TextView)findViewById(R.id.textView_bienvenue);
        button_connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                Intent intent1 = new Intent(MainActivity.this,MyListView.class);
                String logi=editText_login.getText().toString();
                String pass=editText_password.getText().toString();
                LoginBDD bd = new LoginBDD(getBaseContext());
                if(logi.toString().contentEquals("ismael")&&pass.toString().contentEquals("0705")){
                    startActivity(intent1);
                }else{
                    String lol = "Login ou Mot de passe incorrect";
                    Toast.makeText(MainActivity.this, lol, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
