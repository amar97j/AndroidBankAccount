package com.joincoded.accountsrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CurrenciesAdapter extends RecyclerView.Adapter<CurrenciesAdapter.CurrencyViewHolder> {

    private List<Currency> currenciesList;

    public CurrenciesAdapter(List<Currency> currencyList) {
        this.currenciesList = currencyList;
    }


    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency, parent, false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        Currency currentCurrency = currenciesList.get(position);
        holder.bind(currentCurrency);

    }

    @Override
    public int getItemCount() {
        return currenciesList.size();
    }

//    public void setCurrenciesList(List<Currency> dummyData) {
//    }

    public class CurrencyViewHolder extends RecyclerView.ViewHolder {
        private TextView currencyCodeTextView;
        private TextView currencyNameTextView;
        private TextView exchangeRateTextView;






        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyCodeTextView = itemView.findViewById(R.id.currencyCodeTextView);
            currencyNameTextView = itemView.findViewById(R.id.currencyNameTextView);
            exchangeRateTextView = itemView.findViewById(R.id.exchangeRateTextView);
        }

        public void bind(Currency currency) {
            currencyCodeTextView.setText(currency.getCurrencyCode());
            currencyNameTextView.setText(currency.getCurrencyName());
            exchangeRateTextView.setText(String.valueOf(currency.getExchangeRate()));


        }
    }
}