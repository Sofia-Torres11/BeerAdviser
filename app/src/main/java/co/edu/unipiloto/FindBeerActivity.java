package co.edu.unipiloto;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
        Spinner spinner = findViewById(R.id.spinner_zonas);
        TextView textView = findViewById(R.id.text_estaciones);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.zonas,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String resultado = "";

                if(position == 0){
                    resultado = "Caribe:\n- Terpel Barranquilla\n- Primax Cartagena\n- Texaco Santa Marta";
                }
                else if(position == 1){
                    resultado = "Andina:\n- Terpel Bogotá\n- Primax Medellín\n- Biomax Tunja";
                }
                else if(position == 2){
                    resultado = "Pacífica:\n- Terpel Cali\n- Primax Buenaventura";
                }
                else if(position == 3){
                    resultado = "Orinoquia:\n- Terpel Villavicencio\n- Biomax Yopal";
                }
                else if(position == 4){
                    resultado = "Amazonia:\n- Terpel Leticia";
                }

                textView.setText(resultado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClickFindBeer(View view) {

        Spinner beerSpinner = findViewById(R.id.beer_spinner);
        String beerType = String.valueOf(beerSpinner.getSelectedItem());

        TextView brands = findViewById(R.id.brands);
        brands.setText("Selected: " + beerType);
    }
}