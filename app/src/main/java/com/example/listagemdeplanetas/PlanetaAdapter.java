package com.example.listagemdeplanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlanetaAdapter extends ArrayAdapter<Planetas> {

    ImageView imageView;
    TextView textView;


    public PlanetaAdapter(@NonNull Context context, int resource, @NonNull List<Planetas> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planetas planetas = getItem(position);
        if(convertView != null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.planetas, parent, false);

        }

        imageView = convertView.findViewById(R.id.imageView);
        textView = convertView.findViewById(R.id.textViewNome);
        imageView.setImageResource(planetas.getFoto());
        textView.setText(planetas.getName());



        return convertView;
    }
}
