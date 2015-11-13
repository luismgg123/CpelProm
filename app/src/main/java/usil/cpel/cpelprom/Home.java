package usil.cpel.cpelprom;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnProm, btnCoo, btnFac, btnNos, btnCpel;
    private Boolean vir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        setContentView(R.layout.activity_home);

        btnProm= (ImageButton)findViewById(R.id.btnProm);
        btnProm.setOnClickListener(this);
        btnCoo=(ImageButton) findViewById(R.id.btnCoo);
        btnCoo.setOnClickListener(this);
        btnFac=(ImageButton) findViewById(R.id.btnFac);
        btnFac.setOnClickListener(this);
        btnNos=(ImageButton) findViewById(R.id.btnNos);
        btnNos.setOnClickListener(this);
        btnCpel=(ImageButton) findViewById(R.id.btnCpel);
        btnCpel.setOnClickListener(this);

        // >:v
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCoo:
                Intent i=new Intent(Home.this,Coordinadores.class);
                startActivity(i);

                break;
            case R.id.btnProm:
                AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
                newDialog.setTitle("Qué modalidad desea?");
                newDialog.setPositiveButton("E-Learning", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        vir=true;
                        Intent i=new Intent(Home.this,Promedios.class);
                        i.putExtra("virtual",vir);
                        startActivity(i);

                    }
                });
                newDialog.setNegativeButton("Presencial", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        vir=false;
                        Intent i=new Intent(Home.this,Promedios.class);
                        i.putExtra("virtual",vir);
                        startActivity(i);

                    }
                });
                newDialog.show();

                break;
            case R.id.btnFac:
                Uri webpage = Uri.parse("https://m.facebook.com/usil.cpel/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
                finish();
                break;
            case R.id.btnNos:
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Acerca de");
                alertDialog.setMessage("Diseñado y desarrollado por NHB." +"\n" +"Contacto: luismgg123@hotmail.com" );
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();

                break;
            case R.id.btnCpel:
                Uri webp = Uri.parse("http://www.usil.edu.pe/cpel/");
                Intent webI = new Intent(Intent.ACTION_VIEW, webp);
                startActivity(webI);
                finish();
                break;

        }
    }
}
