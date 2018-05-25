package teboullecom.lorenter.parcparis;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[] { "Parc de Bercy", "Parc Montsouris", "Jardin du Luxembourg",
                "Parc Monceau", "Jardin des Tuileries", "Parc des Buttes-Chaumont",
                "Jardin des Plantes", "Parc Floral", "Bois de Vincennes","Champs de Mars", "Bois de Boulogne" };

        MonAdaptateurDeListe adaptateur = new MonAdaptateurDeListe(this, values);
        setListAdapter(adaptateur);

        setTitle("Les jardins de Paris");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_one:
                Intent cliqueBouton = new Intent(this, MainActivity.class);
                startActivity(cliqueBouton);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(this, "Position : " + position, Toast.LENGTH_LONG).show();
    }
}
