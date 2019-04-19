package org.kasapbasi.week201911005;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void dlgGetir(View V){
    AlertDialog.Builder al= new AlertDialog.Builder(this);

    al.setPositiveButton("ÇIK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        finish();
        onDestroy();
        }
    });

al.setNegativeButton("ÇIKMA", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(getApplicationContext(),"Welcome Back",Toast.LENGTH_LONG).show();
    }
});


al.setMessage(" ÇIKMAK İSTEDİĞİNİZE EMİN MİSİNİZ?");
AlertDialog alrt= al.create();
alrt.show();
}

}
