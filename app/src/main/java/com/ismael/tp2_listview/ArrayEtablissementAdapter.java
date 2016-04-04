package com.ismael.tp2_listview;

import com.ismael.tp2_listview.Etablissement;
import com.ismael.tp2_listview.R;



        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.List;

public class ArrayEtablissementAdapter extends ArrayAdapter<Etablissement> {

    private LayoutInflater inflater;
    private List<Etablissement> Etablissements;

    //constructuer (id du layout qui compose la liste, tableau des données)
    public ArrayEtablissementAdapter(Context context, int textViewResourceId,
                                     List<Etablissement> Etablissements) {
        //mettre le layout qui contient la liste
        super(context, R.layout.activity_main, Etablissements);

        this.inflater = LayoutInflater.from(context);
        this. Etablissements= Etablissements;

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null)
        { holder = new ViewHolder();

            //charger le fichier xml item
            convertView = inflater.inflate(R.layout.item, null);

            holder.label = (TextView)convertView.findViewById(R.id.label);
            holder.desc = (TextView)convertView.findViewById(R.id.nom);
            holder.img=  (ImageView) convertView.findViewById(R.id.img);

            convertView.setTag(holder);
        } else { holder = (ViewHolder) convertView.getTag(); }

//stocker les donn�es dans une vue	
        holder.label.setText(Etablissements.get(position).getLabel());
        holder.desc.setText(Etablissements.get(position).getNom());
        holder.img.setImageResource(Etablissements.get(position).getImg());
        return convertView;
    }

    static class ViewHolder
    {
        public TextView label ;
        public TextView desc;
        public ImageView img;
    }

}