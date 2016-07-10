package com.mohamedisoukrane.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] ids = {
                R.id.popular_movies,
                R.id.stock_hawk,
                R.id.build_it_bigger,
                R.id.go_ubiquitous,
                R.id.make_your_app_material,
                R.id.capstone
        };
        for(int id : ids) {
            Button btn = (Button) findViewById(id);
            btn.setOnClickListener(this);
        }
    }

    /** Called when the user touches the button */
    public void showToast(View view) {
        if (toast != null) {
            toast.cancel();
        }
        Button button = (Button) view;
        String toastStr = "This button will launch my " + button.getText() + " app!";
        toast = Toast.makeText(this, toastStr, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onClick(View view) {
        showToast(view);
    }
}
