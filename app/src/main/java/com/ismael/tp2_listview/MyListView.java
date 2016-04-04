package com.ismael.tp2_listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyListView extends ListActivity {


    private ArrayAdapter<Etablissement> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_my_list_view);
    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        List<Etablissement> etablissements = new ArrayList<Etablissement>();
        etablissements.clear();
        etablissements.add(new Etablissement("ENSIAS", "Ecole nationale Superieure D'informatique et d'Analyse des Systemes", R.drawable.ensias));
        etablissements.add(new Etablissement("EMI", "Ecole Mohammedia d'ingenieur", R.drawable.emi));
        etablissements.add(new Etablissement("ENIM", "Ecole Nationale d'ingenieurs de mines", R.drawable.enim));
        etablissements.add(new Etablissement("EHTP", "Ecole Hassania des Travaux Publiques", R.drawable.ehtp));
        etablissements.add(new Etablissement("INPT", "Institut Nationale des Postes et de Telecommunication", R.drawable.inpt));
        etablissements.add(new Etablissement("ENSATE", "Ecole Nationale des Sciences appliquees de Tetouan", R.drawable.ensate));


        adapter = new ArrayEtablissementAdapter(this, R.layout.item, etablissements);

        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Etablissement item = (Etablissement) getListAdapter().getItem(position);
        Toast.makeText(this, item.getLabel()+" selected", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu m = menu.addSubMenu(0,100,0,"Autres options");
        m.add(0,1,0,"About").setChecked(true);
        m.add(0, 2, 0, "Ajouter un etablissement");
        m.add(0, 3, 0, "Supprimer un etablissement");

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();break;
            case 2:
                Toast.makeText(this, "Ajouter un etablissement", Toast.LENGTH_SHORT).show();break;
            case 3:
                Toast.makeText(this, "Supprimer un etablissement", Toast.LENGTH_SHORT).show();break;
        }
        return super.onOptionsItemSelected(item);
    }
}
