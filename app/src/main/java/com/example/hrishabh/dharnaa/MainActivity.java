package com.example.rj.dharnaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,signup;
    SQLdatabase db;
    private static final int TL= Toast.LENGTH_SHORT;
    private static final String TAG="LifeCycle";
    private static String message="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb= new SQLite_Database(this);
        message = "onCreate called";
        Log.d("tag","onCreate");
        Toast.makeText(this, message, TL).show();
        Log.i(TAG, message);

        login=(Button) findViewById(R.id.Login);
        signup=(Button) findViewById(R.id.Signup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
            }
        });
       // db = new SQLdatabase(this);
    }

    @Override
    protected void onStart(){
        super.onStart();
        message="onStart called";
        Log.d("tag","onStart");}

    @Override
    protected void onResume(){
        super.onResume();
        message="onResume called";
        Log.d("tag","onResume");}

    @Override
    protected void onPause(){
        super.onPause();
        message="onPause called";
        Log.d("tag","onPause");}


    @Override
    protected void onRestart(){
        super.onRestart();
        message="onRestart called";
        Log.d("tag","onRestart");}


    @Override
    protected void onStop(){
        super.onStop();
        message="onStop called";
        Log.d("tag","onStop");}


    @Override
    protected void onDestroy(){
        super.onDestroy();
        message="onDestroy called";
        Log.d("tag","onDestroy");}

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        message="onSaveInstance called";
        message+="Bundle mapping ="+outState.size();
        Toast.makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
    @Override
    protected void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        message="onRestoreInstanceState called";
        message+="Bundle mapping ="+ inState.size();
        Toast.makeText(this,message,TL).show();
        Log.i(TAG,message);
    }
}

