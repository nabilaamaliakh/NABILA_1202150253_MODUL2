package com.example.nabila.nabila_1202150253_modul2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NABILA on 17/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> tvmenu, tvharga;
    private ArrayList<Integer> gambar;

    public RecyclerViewAdapter(ArrayList<String> inputMenu, ArrayList<String> dataHarga, ArrayList<Integer> gambarMenu) {
        tvmenu = inputMenu;
        tvharga = dataHarga;
        gambar = gambarMenu;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvMenu;
        public TextView tvHarga;
        public ImageView menu;
        private RelativeLayout itemList;

        private Context context;

        public ViewHolder(View view) {
            super(view);

            context = itemView.getContext();
            tvMenu = (TextView) view.findViewById(R.id.tv_title);
            tvHarga = (TextView) view.findViewById(R.id.tv_subtitle);
            menu = (ImageView) view.findViewById(R.id.gambar);
            itemList = view.findViewById(R.id.list);

            itemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    String komposisi = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Nasi, Ayam suir, Cumi, Rempah-rempah, Kerupuk";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Mie, Bakso, Sayur, Wortel, Sosis";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Mie, Telur, Daging, Cabe, Sayur";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Daging, Kuah kacang, Cabe, Rempah-rempah, Bawang goreng";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Nasi, Telur, Daging, Rempah-rempah, Saus";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Mie, Telur, Daging asap, Cabe";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 6:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Ice cream, Waffer, Pudding, Bubble pearl";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 7:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Ice cream, Waffer, Lemon cheese, Pudding";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                        case 8:
                            intent.putExtra("menu", tvmenu.get(getAdapterPosition()));
                            intent.putExtra("harga", tvharga.get(getAdapterPosition()));
                            intent.putExtra("gambar", gambar.get(getAdapterPosition()));
                            komposisi = "Pisang, Ice cream, Susu, Bubuk green tea";
                            intent.putExtra("komposisi", komposisi);
                            context.startActivity(intent);
                            break;

                    }
                }
            });
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position){
        final String menu = tvmenu.get(position);
        final String harga = tvharga.get(position);
        final Integer a = gambar.get(position);
        holder.tvMenu.setText(menu);
        holder.tvHarga.setText(harga);
        holder.menu.setImageResource(a);
    }
    @Override
    public int getItemCount(){
        return tvmenu.size();
    }
}

