package usil.cpel.cpelprom;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by HP-LM on 04/11/2015.
 */
public class ActivityDetalle extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        // Comprobamos que previamente no hayamos entrado en esta actividad (por ejemplo, al rotar el dispositivo). Si es así se añade el fragmento al contenedor
        if (savedInstanceState == null) {
            // Crea el fragmento del detalle de la entrada y lo añade a la actividad
            Bundle arguments = new Bundle();
            arguments.putString(FragmentDetalle.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(FragmentDetalle.ARG_ID_ENTRADA_SELECIONADA));
            FragmentDetalle fragment = new FragmentDetalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.framelayout_contenedor_detalle, fragment).commit();
        }
    }
}
