package usil.cpel.cpelprom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.text.DecimalFormat;

public class Promedios extends Activity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{

    private EditText edtP1, edtP2, edtP3, edtT1, edtT2, edtT3, edtEF, edtSacar;
    private ImageButton btnCalProm, btnCalFin;
    private TextView txtEP, txtPP, txtPT, txtProm, txtNF, txtdesc,txtepp, txtppp, txtptp, txtefp;
    private ImageButton btnRegresar;
    private RadioButton rbAprobar, rbSacar;
    private RadioGroup rg;
    DecimalFormat df= new DecimalFormat("0.00");
    DecimalFormat df2= new DecimalFormat("0");
    private double ep, ef, x, epp, ppp, ptp, efp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_promedios);

        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        txtdesc = (TextView) findViewById(R.id.txtdesc);
        txtepp = (TextView) findViewById(R.id.txtepp);
        txtppp = (TextView) findViewById(R.id.txtppp);
        txtptp = (TextView) findViewById(R.id.txtptp);
        txtefp = (TextView) findViewById(R.id.txtefp);
        epp=0.55;
        ppp=0.6364;
        ptp=0.3636;
        efp=0.45;
        edtP1 = (EditText) findViewById(R.id.edtP1);
        edtP2 = (EditText) findViewById(R.id.edtP2);
        edtP3 = (EditText) findViewById(R.id.edtP3);
        edtT1 = (EditText) findViewById(R.id.edtT1);
        edtT2 = (EditText) findViewById(R.id.edtT2);
        edtT3 = (EditText) findViewById(R.id.edtT3);
        edtEF = (EditText) findViewById(R.id.edtEF);
        edtSacar = (EditText) findViewById(R.id.edtSacar);
        txtEP = (TextView) findViewById(R.id.txtEP);
        txtPP = (TextView) findViewById(R.id.txtPP);
        txtPT = (TextView) findViewById(R.id.txtPT);
        txtProm = (TextView) findViewById(R.id.txtProm);
        txtNF = (TextView) findViewById(R.id.txtNF);
        btnCalProm = (ImageButton) findViewById(R.id.btnCalProm);
        btnCalProm.setOnClickListener(this);
        btnCalFin = (ImageButton) findViewById(R.id.btnCalFin);
        btnCalFin.setOnClickListener(this);
        btnRegresar = (ImageButton)findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this);
        rbAprobar = (RadioButton) findViewById(R.id.rbAprobar);
        rbSacar = (RadioButton) findViewById(R.id.rbSacar);
        rg = (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this);
        ef=0;
        ep=0;
        x=10.5;
        Bundle extra = this.getIntent().getExtras();
        Boolean virtual = extra.getBoolean("virtual");
        if (virtual == true){
            epp=0.4;
            ppp=0.5;
            ptp=0.5;
            efp=0.6;
            txtdesc.setText("Promedio para los cursos dictados en modalidad E-Learning");
            txtepp.setText("40%");
            txtppp.setText("50%");
            txtptp.setText("50%");
            txtefp.setText("60%");

        }
    }



    public void calcular(){
        double p1 = Double.parseDouble(edtP1.getText().toString());
        double p2 = Double.parseDouble(edtP2.getText().toString());
        double p3 = Double.parseDouble(edtP3.getText().toString());
        double m=200;
        if(m>p1){
            m=p1;
        }
        if(m>p2){
            m=p2;
        }
        if(m>p3){
            m=p3;
        }

        double pp = (p1+p2+p3-m)/2;
        txtPP.setText(String.valueOf(df.format(pp)));
        double t1 = Double.parseDouble(edtT1.getText().toString());
        double t2 = Double.parseDouble(edtT2.getText().toString());
        double t3 = Double.parseDouble(edtT3.getText().toString());
        double pt = (t1+t2+t3)/3;
        txtPT.setText(String.valueOf(df.format(pt)));
        ep= (pp*ppp+pt*ptp);
        txtEP.setText(String.valueOf(df2.format(Math.round(ep))));

    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkId) {
        if(checkId==R.id.rbAprobar){
            findViewById(R.id.edtSacar).setVisibility(View.INVISIBLE);
            x=10.5;


        }else if(checkId==R.id.rbSacar){
            findViewById(R.id.edtSacar).setVisibility(View.VISIBLE);


        }

    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnRegresar:
                finish();
                break;
            case R.id.btnCalProm:
                try {
                    calcular();

                    ef= Double.parseDouble(edtEF.getText().toString());

                    double prom = Double.parseDouble(df2.format(Math.round(ep)))*epp+ef*efp;
                    txtProm.setText(String.valueOf(df2.format(Math.round(prom))));
                } catch (Exception e){
                    Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.btnCalFin:
                try {

                    double nf;
                    if(findViewById(R.id.edtSacar).isShown()){
                        calcular();
                        x= Double.parseDouble(edtSacar.getText().toString());
                        nf = (x - (Double.parseDouble(df2.format(Math.round(ep)))* epp)) /efp;
                        txtNF.setText(String.valueOf(df.format(nf)));
                    }else {
                        calcular();
                        nf = (x - (Double.parseDouble(df2.format(Math.round(ep)))* epp)) / efp;
                        txtNF.setText(String.valueOf(df.format(nf)));
                    }
                } catch (Exception e){
                    Toast.makeText(this,"Complete todos los campos, sin necesidad del Examen Final", Toast.LENGTH_LONG).show();
                }
                break;


        }

    }


}
