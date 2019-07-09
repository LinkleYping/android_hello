package helloworld.ep.com.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv1, mTv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv1 = (TextView) findViewById(R.id.tv_1);
        mTv1.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv1.getPaint().setAntiAlias(true);

        mTv2 = (TextView) findViewById(R.id.tv_2);
        mTv2.setText(Html.fromHtml("<u>hello,world</u>"));
    }
}
