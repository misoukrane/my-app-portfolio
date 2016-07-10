package com.mohamedisoukrane.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Button button = (Button) view;
        String toastStr = "This button will launch my " + button.getText() + " app!";
        Log.e("MY_TAG", "we are not here");
        Toast.makeText(this, toastStr, Toast.LENGTH_SHORT).show();
    }
}
