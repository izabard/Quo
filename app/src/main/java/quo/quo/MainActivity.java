package quo.quo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       //Listener de los clicks ImageButtoms
       addListenerOnButtomEducation();
       addListenerOnButtomHealth();
      // addListenerOnButtomVivienda();
      // addListenerOnButtomSports();
       addListenerOnButtomDefending();
    }

   public void addListenerOnButtomEducation(){

        ImageButton imageButtom = (ImageButton) findViewById(R.id.img_education);
        {
            imageButtom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            EducationActivity.class);
                    startActivity(intent);

                }
            });


        }
    }

    public void addListenerOnButtomHealth(){
        ImageButton imageButton = (ImageButton) findViewById(R.id.img_health);
        {
            imageButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Intent intent = new Intent(
                            getApplicationContext(),
                            HealthActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

   /* public void addListenerOnButtomVivienda(){
        ImageButton imageButton = (ImageButton) findViewById(R.id.img_vivienda);
        {
            imageButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Intent intent = new Intent(
                            getApplicationContext(),
                            ViviendaActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    public void addListenerOnButtomSports(){
        ImageButton imageButton = (ImageButton) findViewById(R.id.img_sports);
        {
            imageButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            SportsActivity.class);
                    startActivity(intent);
                }
            });

        }


    }*/


    public void addListenerOnButtomDefending(){
        ImageButton imageButton = (ImageButton) findViewById(R.id.img_defending);
        {
            imageButton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            DefendingActivity.class);
                    startActivity(intent);
                }
            });
        }
    }




}
