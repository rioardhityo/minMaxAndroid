package edu.edo.torabentoapps.Controller;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
                AlertDialog.Builder builder = new AlertDialog.Builder(MinMaxCalculation.this);
                builder.setTitle("Select Product : ");
                final String[] listItems = {"Chicken Katsu", "Ebifurai", "Egg Chicken Roll", "Ekado", "Beef Teriyaki", "Kano Roll", "Shrimp Roll","Spicy Chicken"};

                builder.setItems(listItems, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            if (listItems[which].equals("Chicken Katsu")){
                                Toast.makeText(getApplicationContext(),"This is Chicken Katsu",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("ChickenKatsu",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minChickenKatsu",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxChickenKatsu",-1)));
                            }else if (listItems[which].equals("Ebifurai")){
                                Toast.makeText(getApplicationContext(),"This is Ebifurai",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("ebifurai",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minebifurai",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxebifurai",-1)));
                            }else if (listItems[which].equals("Egg Chicken Roll")){
                                Toast.makeText(getApplicationContext(),"This is Egg Chicken Roll",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("eggcr",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("mineggcr",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxeggcr",-1)));
                            }else if (listItems[which].equals("Ekado")){
                                Toast.makeText(getApplicationContext(),"This is Ekado",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("ekado",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minekado",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxekado",-1)));
                            }else if (listItems[which].equals("Beef Teriyaki")){
                                Toast.makeText(getApplicationContext(),"This is Beef Teriyaki",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("teriyaki",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minteriyaki",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxteriyaki",-1)));
                            }else if (listItems[which].equals("Kano Roll")){
                                Toast.makeText(getApplicationContext(),"This is Kano Roll",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("kanoroll",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minkanoroll",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxkanoroll",-1)));
                            }else if (listItems[which].equals("Shrimp Roll")){
                                Toast.makeText(getApplicationContext(),"This is Shrimp Roll",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("shrimproll",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minshrimproll",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxshrimproll",-1)));
                            }else if (listItems[which].equals("Spicy Chicken")){
                                Toast.makeText(getApplicationContext(),"This is SpicyChicken",Toast.LENGTH_SHORT).show();
                                chooseP.setText(listItems[which]);
                                editor.putString("produk",listItems[which]);
                                editor.commit();
                                txtSafe.setText(String.valueOf(mSettings.getFloat("spicychicken",-1)));
                                txtMin.setText(String.valueOf(mSettings.getFloat("minspicychicken",-1)));
                                txtMax.setText(String.valueOf(mSettings.getFloat("maxspicychicken",-1)));
                            }
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
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

        if (mSettings.getString("produk","").equals("Chicken Katsu")){
            editor.putFloat("ChickenKatsu",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("ChickenKatsu",-1)));
        }else if (mSettings.getString("produk","").equals("Ebifurai")){
            editor.putFloat("ebifurai",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("ebifurai",-1)));
        }else if (mSettings.getString("produk","").equalsIgnoreCase("Egg Chicken Roll")){
            editor.putFloat("eggcr",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("eggcr",-1)));
        }else if (mSettings.getString("produk","").equals("Ekado")){
            editor.putFloat("ekado",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("ekado",-1)));
        }else if (mSettings.getString("produk","").equals("Beef Teriyaki")){
            editor.putFloat("teriyaki",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("teriyaki",-1)));
        }else if (mSettings.getString("produk","").equals("Kano Roll")){
            editor.putFloat("kanoroll",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("kanoroll",-1)));
        }else if (mSettings.getString("produk","").equals("Shrimp Roll")){
            editor.putFloat("shrimproll",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("shrimproll",-1)));
        }else if (mSettings.getString("produk","").equals("Spicy Chicken")){
            editor.putFloat("spicychicken",safetyStock);
            editor.commit();
            txtSafe.setText(String.valueOf(mSettings.getFloat("spicychicken",-1)));
        }

    }

    public void minVoid(){

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        int Tinput = Integer.parseInt(mine1.getText().toString());
        int Cinput = Integer.parseInt(mine2.getText().toString());
        int Rinput = Integer.parseInt(mine3.getText().toString());
        float minimumStock = ((Tinput*Cinput)+Rinput)/30;

        if (mSettings.getString("produk","").equals("Chicken Katsu")){
            editor.putFloat("minChickenKatsu",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minChickenKatsu",-1)));
        }else if (mSettings.getString("produk","").equals("Ebifurai")){
            editor.putFloat("minebifurai",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minebifurai",-1)));
        }else if (mSettings.getString("produk","").equalsIgnoreCase("Egg Chicken Roll")){
            editor.putFloat("mineggcr",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("mineggcr",-1)));
        }else if (mSettings.getString("produk","").equals("Ekado")){
            editor.putFloat("minekado",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minekado",-1)));
        }else if (mSettings.getString("produk","").equals("Beef Teriyaki")){
            editor.putFloat("minteriyaki",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minteriyaki",-1)));
        }else if (mSettings.getString("produk","").equals("Kano Roll")){
            editor.putFloat("minkanoroll",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minkanoroll",-1)));
        }else if (mSettings.getString("produk","").equals("Shrimp Roll")){
            editor.putFloat("minshrimproll",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minshrimproll",-1)));
        }else if (mSettings.getString("produk","").equals("Spicy Chicken")){
            editor.putFloat("minspicychicken",minimumStock);
            editor.commit();
            txtMin.setText(String.valueOf(mSettings.getFloat("minspicychicken",-1)));
        }
    }

    public void maxVoid(){

        final SharedPreferences mSettings = getSharedPreferences("minmax", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = mSettings.edit();

        int Tinput = Integer.parseInt(maxe1.getText().toString());
        int Cinput = Integer.parseInt(maxe2.getText().toString());
        float maximumStock = 2*(Tinput*Cinput)/30;

        if (mSettings.getString("produk","").equals("Chicken Katsu")){
            editor.putFloat("maxChickenKatsu",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxChickenKatsu",-1)));
        }else if (mSettings.getString("produk","").equals("Ebifurai")){
            editor.putFloat("maxebifurai",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxebifurai",-1)));
        }else if (mSettings.getString("produk","").equalsIgnoreCase("Egg Chicken Roll")){
            editor.putFloat("maxeggcr",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxeggcr",-1)));
        }else if (mSettings.getString("produk","").equals("Ekado")){
            editor.putFloat("maxekado",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxekado",-1)));
        }else if (mSettings.getString("produk","").equals("Beef Teriyaki")){
            editor.putFloat("maxteriyaki",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxteriyaki",-1)));
        }else if (mSettings.getString("produk","").equals("Kano Roll")){
            editor.putFloat("maxkanoroll",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxkanoroll",-1)));
        }else if (mSettings.getString("produk","").equals("Shrimp Roll")){
            editor.putFloat("maxshrimproll",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxshrimproll",-1)));
        }else if (mSettings.getString("produk","").equals("Spicy Chicken")){
            editor.putFloat("maxspicychicken",maximumStock);
            editor.commit();
            txtMax.setText(String.valueOf(mSettings.getFloat("maxspicychicken",-1)));
        }

    }
}
