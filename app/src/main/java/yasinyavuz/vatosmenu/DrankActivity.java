package yasinyavuz.vatosmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import yasinyavuz.vatosmenu.dranken.EnergieActivity;
import yasinyavuz.vatosmenu.dranken.FrisdrankActivity;
import yasinyavuz.vatosmenu.dranken.SpecialsActivity;
import yasinyavuz.vatosmenu.dranken.WarmeDrankenActivity;

/**
 * Created by Cooliolio on 15/08/2018.
 */

public class DrankActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drank);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView frisdrankenpage = (ImageView) findViewById(R.id.frisdrankenbtn);
        frisdrankenpage.setOnClickListener(this);

        ImageView warmedrankenpage = (ImageView) findViewById(R.id.warmdrankbtn);
        warmedrankenpage.setOnClickListener(this);

        ImageView energiepage = (ImageView) findViewById(R.id.energiebtn);
        energiepage.setOnClickListener(this);

        ImageView specialspage = (ImageView) findViewById(R.id.specialsbtn);
        specialspage.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frisdrankenbtn:
                Intent intentFrisdrank = new Intent(this, FrisdrankActivity.class);
                startActivity(intentFrisdrank);
                break;

            case R.id.warmdrankbtn:
                Intent intentWarmedrank = new Intent(this, WarmeDrankenActivity.class);
                startActivity(intentWarmedrank);
                break;

            case R.id.energiebtn:
                Intent intentEnergiedrank = new Intent(this, EnergieActivity.class);
                startActivity(intentEnergiedrank);
                break;

            case R.id.specialsbtn:
                Intent intentSpecials = new Intent(this, SpecialsActivity.class);
                startActivity(intentSpecials);
                break;
        }
    }
}
