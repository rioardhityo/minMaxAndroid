package edu.edo.torabentoapps.Controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import edu.edo.torabentoapps.R;

public class MinMaxCalculation extends AppCompatActivity {

    EditText safetye1,safetye2,safetye3,mine1,mine2,mine3,maxe1,maxe2;
    Button btnSafety,btnMin,btnMax,chooseP;
    Boolean here=false;
    TextView txtSafe,txtMin,txtMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_max_calculation);

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        safetye1 = (EditText)findViewById(R.id.safetyE1);
        safetye2 = (EditText)findViewById(R.id.safetyE2);
        safetye3 = (EditText)findViewById(R.id.safetyE3);
        btnSafety = (Button)findViewById(R.id.safetyBtn);

        mine1 = (EditText)findViewById(R.id.minE1);
        mine2 = (EditText)findViewById(R.id.minE2);
        mine3 = (EditText)findViewById(R.id.minE3);
        btnMin = (Button)findViewById(R.id.minBtn1);

        maxe1 = (EditText)findViewById(R.id.maxE1);
        maxe2 = (EditText)findViewById(R.id.maxE2);
        btnMax = (Button)findViewById(R.id.maxBtn1);

        txtSafe = (TextView)findViewById(R.id.txtSafe);
        txtMin = (TextView)findViewById(R.id.txtMin);
        txtMax = (TextView)findViewById(R.id.txtMax);

        txtSafe.setText(String.valueOf(mSettings.getFloat("safetyStockVar",-1)));
        txtMin.setText(String.valueOf(mSettings.getFloat("minStockVar",-1)));
        txtMax.setText(String.valueOf(mSettings.getFloat("maxStockVar",-1)));

        chooseP = (Button)findViewById(R.id.btnChooseProduct);

        chooseP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"pilih product",Toast.LENGTH_SHORT).show();
            }
        });

        btnSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                safetyVoid();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minVoid();
            }
        });

        btnMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maxVoid();
            }
        });
    }

    public void safetyVoid(){

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        int pemakaianMaksimum = Integer.parseInt(safetye1.getText().toString());
        int Tinput = Integer.parseInt(safetye2.getText().toString());
        int Cinput = Integer.parseInt(safetye3.getText().toString());
        float safetyStock = (pemakaianMaksimum-Tinput)*Cinput/30;

        editor.putFloat("safetyStockVar",safetyStock);
        editor.commit();
        txtSafe.setText(String.valueOf(mSettings.getFloat("safetyStockVar",-1)));

    }

    public void minVoid(){

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        int Tinput = Integer.parseInt(mine1.getText().toString());
        int Cinput = Integer.parseInt(mine2.getText().toString());
        int Rinput = Integer.parseInt(mine3.getText().toString());

        float minimumStock = ((Tinput*Cinput)+Rinput)/30;
        editor.putFloat("minStockVar",minimumStock);
        editor.commit();
        txtMin.setText(String.valueOf(mSettings.getFloat("minStockVar",-1)));
    }

    public void maxVoid(){

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        int Tinput = Integer.parseInt(maxe1.getText().toString());
        int Cinput = Integer.parseInt(maxe2.getText().toString());
        float maximumStock = 2*(Tinput*Cinput)/30;

        editor.putFloat("maxStockVar",maximumStock);
        editor.commit();
        txtMax.setText(String.valueOf(mSettings.getFloat("maxStockVar",-1)));

    }
}
