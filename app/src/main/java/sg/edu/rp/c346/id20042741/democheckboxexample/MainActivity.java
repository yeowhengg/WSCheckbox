package sg.edu.rp.c346.id20042741.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CheckBox cbEnabled;
        Button btnCheck;
        TextView tvShow;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.cbid);
        btnCheck = findViewById(R.id.btnid);
        tvShow = findViewById(R.id.tvid);
    }
}