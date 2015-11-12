package usil.cpel.cpelprom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Coordinadores extends FragmentActivity implements FragmentLista.Callbacks {

    private boolean dosFragmentos;
    private ImageButton btnHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinadores);
        if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
            dosFragmentos = true;
        }
        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView)this.findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        btnHome = (ImageButton) this.findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {
            Bundle arguments = new Bundle();
            arguments.putString(FragmentDetalle.ARG_ID_ENTRADA_SELECIONADA, id);
            FragmentDetalle fragment = new FragmentDetalle();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, ActivityDetalle.class);
            detailIntent.putExtra(FragmentDetalle.ARG_ID_ENTRADA_SELECIONADA, id);
            startActivity(detailIntent);
        }
    }



}

