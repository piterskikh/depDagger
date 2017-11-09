package com.example.exubit.dep;

import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.chat.ChatText;
import com.example.common.CommonText;
import com.example.geoservice.GeoText;

import javax.inject.Inject;

public class MainActivity extends MvpAppCompatActivity implements TestInterface {

    @InjectPresenter
    Presenter presenter;

    @Inject
    CommonText commonText;

    @Inject
    GeoText geoText;

    @Inject
    ChatText chatText;

    @Inject
    AppText appText;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.plainText);
        App.getAppComponent().inject(this);

        String textFromCommon = commonText.getText();
        String textFromGeo = geoText.getText();
        String textFromChat = chatText.getText();
        String textFromApp = appText.getText();



        textView.append(textFromCommon);
        textView.append("\n");
        textView.append("\n");
        textView.append(textFromGeo);
        textView.append("\n");
        textView.append("\n");
        textView.append(textFromChat);
        textView.append("\n");
        textView.append("\n");
        textView.append(textFromApp);

        presenter.setTextOnActivity();
    }

    @Override
    public void setTextAct(String str) {

        textView.append("\n");
        textView.append("\n");
        textView.append(str);

    }
}
