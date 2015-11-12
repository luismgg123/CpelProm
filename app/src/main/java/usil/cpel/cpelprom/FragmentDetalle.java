package usil.cpel.cpelprom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by HP-LM on 04/11/2015.
 */
public class FragmentDetalle extends Fragment {
    public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";
    private ListaContenido.Lista_entrada mItem;
    private ImageButton btnHome;
    public FragmentDetalle() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {
            //Cargamos el contenido de la entrada con cierto ID seleccionado en la lista. Se recomiendo usar un Loader para cargar el contenido
            mItem = ListaContenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_detalle, container, false);

        //Mostramos el contenido al usuario
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.textView_superior)).setText(mItem.textoEncima);
            ((TextView) rootView.findViewById(R.id.textView_inferior)).setText(mItem.textoDebajo);
            ((TextView) rootView.findViewById(R.id.txtcorreo)).setText(mItem.txtcorreo);
            ((TextView) rootView.findViewById(R.id.txtanexo)).setText(mItem.txtanexo);



        }

        btnHome = (ImageButton)rootView.findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return rootView;
    }
}