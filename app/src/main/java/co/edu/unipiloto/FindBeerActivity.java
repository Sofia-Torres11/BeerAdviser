package co.edu.unipiloto;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {

        Spinner beerSpinner = findViewById(R.id.beer_spinner);
        String beerType = String.valueOf(beerSpinner.getSelectedItem());

        TextView brands = findViewById(R.id.brands);
        brands.setText("Selected: " + beerType);
    }
}