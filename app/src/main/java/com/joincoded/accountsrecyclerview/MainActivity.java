package com.joincoded.accountsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CurrenciesAdapter currenciesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Currency("KWD", "KU Dinar", 1.0));
        currencyList.add(new Currency("EUR", "Euro", 0.85));
        currencyList.add(new Currency("RS", "RIYAL ", 3.75));
        currencyList.add(new Currency("EGP", "Egypt", 3.52));
        currencyList.add(new Currency("OMR", "Omani Rial", 2.6));
        currencyList.add(new Currency("QAR", "Qatar Rial", 0.27));
        currencyList.add(new Currency("RUB", "Russian Ruble", 0.011));
        currencyList.add(new Currency("QAR", "Qatar Rial", 0.27));
        currencyList.add(new Currency("RSD", "Serbian Dinar", 0.093));
        currencyList.add(new Currency("LKR", "Sri lanka", 0.003));





        currenciesAdapter = new CurrenciesAdapter(currencyList);
        recyclerView.setAdapter(currenciesAdapter);


    }


}