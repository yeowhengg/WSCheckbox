package sg.edu.rp.c346.id20042741.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

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

        btnCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double discount = cbEnabled.isChecked()? 0.2 : 0;
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                Log.i("MyActivity", "Inside onClick()");

                if (cbEnabled.isChecked()) {
                    tvShow.setText(String.format("The discount is %s. You need to pay $%.2f",cbEnabled.isChecked() ? "given":"not given",calcPay(100,discount)));
                }else{
                    tvShow.setText(String.format("The discount is %s. You need to pay $%.2f",cbEnabled.isChecked() ? "given":"not given",calcPay(100,discount)));

                }
            }
        });


    }

    private double calcPay(double price, double discount){
        double pay = (1 - discount) * price;
        return pay;
    }
}