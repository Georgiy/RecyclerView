package bignerdranch.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<BankInfo> bank;

    public DataAdapter(ArrayList<BankInfo> android) {
        this.bank = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.bank_name.setText(bank.get(i).getTitle());
        viewHolder.bank_location.setText(bank.get(i).getAddr());
        viewHolder.bank_opens.setText(bank.get(i).getSchedule());

    }

    @Override
    public int getItemCount() {
        return bank.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView bank_name, bank_location, bank_opens;
        public ViewHolder(View view) {
            super(view);

            bank_name = (TextView)view.findViewById(R.id.bank_title);
            bank_location = (TextView)view.findViewById(R.id.bank_location);
            bank_opens = (TextView)view.findViewById(R.id.bank_openings);

        }
    }

}
