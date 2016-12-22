package pom.coffeevoucher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.ll_s_no)
    LinearLayout llSNo;
    @BindView(R.id.iv_qr)
    ImageView ivQr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        bindView(getIntent());


    }

    private void bindView(Intent intent) {


    }
}
