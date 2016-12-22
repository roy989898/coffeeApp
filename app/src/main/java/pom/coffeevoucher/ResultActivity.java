package pom.coffeevoucher;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import net.glxn.qrgen.android.QRCode;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @BindView(R.id.ll_s_no)
    LinearLayout llSNo;
    @BindView(R.id.iv_qr)
    ImageView ivQr;
    @BindView(R.id.tv_s_number)
    TextView tvSNumber;
    @BindView(R.id.activity_result)
    RelativeLayout activityResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        bindView(getIntent());


    }

    private void bindView(Intent intent) {
        String qrNumber = intent.getStringExtra(StaticIntAndString.INTENT_QR_NUMBER_KEY);
        String sNumber = intent.getStringExtra(StaticIntAndString.INTENT_S_NUMBER_KEY);
        tvSNumber.setText(sNumber);
        Bitmap qrBitmap = QRCode.from(qrNumber).bitmap();
        ivQr.setImageBitmap(qrBitmap);


    }


    public static Bitmap convertViewToBitmap(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        Bitmap bitmap = view.getDrawingCache();
        return bitmap;
    }
}
