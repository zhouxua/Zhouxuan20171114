package com.bwie.zhouxuan;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.bwie.zhouxuan.view.Fragmenter1;
import com.bwie.zhouxuan.view.Fragmenter2;
import com.bwie.zhouxuan.view.Fragmenter3;
import com.bwie.zhouxuan.view.Fragmenter4;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    RadioButton btn1;
    @BindView(R.id.btn2)
    RadioButton btn2;
    @BindView(R.id.btn3)
    RadioButton btn3;
    @BindView(R.id.btn4)
    RadioButton btn4;
    FragmentManager fm;
    Fragmenter1 fragmenter1;
    Fragmenter2 fragmenter2 ;
    Fragmenter3 fragmenter3;
    Fragmenter4 fragmenter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
         fragmenter1 = new Fragmenter1();
         fragmenter2 = new Fragmenter2();
         fragmenter3 = new Fragmenter3();
         fragmenter4 = new Fragmenter4();
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.content,fragmenter1).commit();
//        btn1.isChecked(true);
    }
    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                fm.beginTransaction().replace(R.id.content,fragmenter1).commit();
                break;
            case R.id.btn2:
                fm.beginTransaction().replace(R.id.content,fragmenter2).commit();
                break;
            case R.id.btn3:
                fm.beginTransaction().replace(R.id.content,fragmenter3).commit();
                break;
            case R.id.btn4:
                fm.beginTransaction().replace(R.id.content,fragmenter4).commit();
                break;
        }
    }
}
