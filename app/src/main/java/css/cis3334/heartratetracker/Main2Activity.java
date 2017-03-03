package css.cis3334.heartratetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvHR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvHR = (TextView) findViewById(R.id.textViewHR);


        Intent Intent = new Intent();
        Intent.getExtras().getSerializable("key");
        tvHR.setText("You selected: " + Intent);
    }

}
