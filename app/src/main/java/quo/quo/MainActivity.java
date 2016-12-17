package quo.quo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       addListenerOnButtom();
    }

   public void addListenerOnButtom(){

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




}
