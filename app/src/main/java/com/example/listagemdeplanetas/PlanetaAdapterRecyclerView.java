package com.example.listagemdeplanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetaAdapterRecyclerView extends RecyclerView.Adapter<PlanetaAdapterRecyclerView.PlanetaViewHolder> {

    private Context context;
    private List<Planetas> listaPlanetas;

    public PlanetaAdapterRecyclerView(Context context, List<Planetas>listaPlanetas){
        this.context = context;
        this.listaPlanetas = listaPlanetas;
    }

    @NonNull
    @Override
    public PlanetaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.planetas, parent, false);

        return new PlanetaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetaViewHolder holder, int position) {
        Planetas planeta = listaPlanetas.get(position);
        holder.imageView.setImageResource(planeta.getFoto());
        holder.textView.setText(planeta.getName());

    }

    @Override
    public int getItemCount() {
        return listaPlanetas.size();
    }

    public class PlanetaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public PlanetaViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textViewNome);
        }
    }
}
