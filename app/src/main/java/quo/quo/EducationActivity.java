package quo.quo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        RecyclerView rv = (RecyclerView) findViewById(R.id.lista);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        /*Aqui van todos los titulos de las estadisticas */
        List<Header> headers = Arrays.asList(new Header("Hello World", "hello world"),
                new Header("Hello World","hello world, again"));
        Adapter adapter = new Adapter(headers);
        rv.setAdapter(adapter);
    }
}
