package yasinyavuz.vatosmenu;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView shishapage = (ImageView) findViewById(R.id.shishasbtn);
        shishapage.setOnClickListener(this);

        ImageView drankenpage = (ImageView) findViewById(R.id.drankbtn);
        drankenpage.setOnClickListener(this);

        ImageView snackspage = (ImageView) findViewById(R.id.snacksbtn);
        snackspage.setOnClickListener(this);

        ImageView dessertspage = (ImageView) findViewById(R.id.dessertbtn);
        dessertspage.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shishasbtn:
                Intent intentShisha = new Intent(this, ShishaActivity.class);
                startActivity(intentShisha);
                break;

            case R.id.drankbtn:
                Intent intentDranken = new Intent(this, DrankActivity.class);
                startActivity(intentDranken);
                break;

            case R.id.snacksbtn:
                Intent intentSnacks = new Intent(this, SnacksActivity.class);
                startActivity(intentSnacks);
                break;

            case R.id.dessertbtn:
                Intent intentDesserts = new Intent(this, DessertsActivity.class);
                startActivity(intentDesserts);
                break;
        }
    }


}
