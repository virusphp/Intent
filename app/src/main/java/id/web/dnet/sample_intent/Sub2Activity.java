package id.web.dnet.sample_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity {

    public static String KEY_DATA = "data";
    private String recivedData = null;
    private TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        txtData = (TextView) findViewById(R.id.txt_data);
        recivedData = getIntent().getStringExtra(KEY_DATA);
        txtData.setText(recivedData);
    }
}
