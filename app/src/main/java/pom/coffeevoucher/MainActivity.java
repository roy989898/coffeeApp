package pom.coffeevoucher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.bt_generate)
    Button btGenerate;
    @BindView(R.id.ed_serial_no)
    EditText edSerialNo;
    @BindView(R.id.ed_barcode)
    EditText edBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_generate)
    public void onClick() {

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(StaticIntAndString.INTENT_S_NUMBER_KEY, edSerialNo.getText().toString());
        intent.putExtra(StaticIntAndString.INTENT_QR_NUMBER_KEY, edBarcode.getText().toString());
        startActivity(intent);
    }
}
