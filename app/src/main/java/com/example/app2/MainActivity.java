package com.example.app2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
        btn = findViewById(R.id.boton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setText("Hola");
            }
        });
        if(savedInstanceState != null){
            btn.setText(savedInstanceState.getString("Nombre_boton"));
        }
    }
    @Override
    protected  void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Toast.makeText(this, "OnRestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Nombre_boton", btn.getText().toString());
    }
}
