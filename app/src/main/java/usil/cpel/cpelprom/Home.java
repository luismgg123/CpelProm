package usil.cpel.cpelprom;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.ColorDrawable;
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
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff354a6a));
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

                break;
            case R.id.btnNos:
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Acerca de");
                alertDialog.setMessage("Diseñado y desarrollado por NHB Developers" + "\n" + "Contacto: www.facebook.com/NHB-Developers");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Visítanos",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Uri facebook = Uri.parse("https://www.facebook.com/NHB-Developers-432692060259074");
                                Intent face = new Intent(Intent.ACTION_VIEW, facebook);
                                startActivity(face);
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();

                break;
            case R.id.btnCpel:
                Uri webp = Uri.parse("http://www.usil.edu.pe/cpel/");
                Intent webI = new Intent(Intent.ACTION_VIEW, webp);
                startActivity(webI);

                break;

        }
    }
}
