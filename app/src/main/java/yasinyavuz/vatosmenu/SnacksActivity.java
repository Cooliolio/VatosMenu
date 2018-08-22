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

public class SnacksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



}
