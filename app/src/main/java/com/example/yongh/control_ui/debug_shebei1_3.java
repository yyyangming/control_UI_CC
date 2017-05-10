package com.example.yongh.control_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class debug_shebei1_3 extends AppCompatActivity {

    private ImageButton mHoutui_shebei_3;
    private Button mPublishTypeAManual;
    private Button mPublishTypeBManual;

    private Button mWalkForwardManual;
    private Button mWalkBackwardManual;

    private Button mDiqiPentouManual;
    private Button mWalkClutchManual;

    private Button mPublishTypeACharPentouManual;
    private Button mPublishTypeBCharPentouManual;

    private Button mBottomPentouClean;
    private Button mCharPentouClean;
    private Button mGuitouRedPentouManual;
    private Button mPublishBeltClean;
    private Button mGuitouLabelStart;
    private Button mGuitouWhitePentouClean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_shebei1_3);

        mHoutui_shebei_3 = (ImageButton)findViewById(R.id.imageButton_houtui_shebei1_3);
        mHoutui_shebei_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mPublishTypeAManual = (Button)findViewById(R.id.publish_Type_A_manual);
        mPublishTypeBManual = (Button)findViewById(R.id.publish_Type_B_manual);

        mWalkForwardManual = (Button)findViewById(R.id.walk_forward_manual);
        mWalkBackwardManual = (Button)findViewById(R.id.walk_backward_manual);

        mDiqiPentouManual = (Button)findViewById(R.id.diqi_pentou_manual);
        mWalkClutchManual = (Button)findViewById(R.id.walk_clutch_manual);

        mPublishTypeACharPentouManual = (Button)findViewById(R.id.publish_Type_A_char_pentou_manual);
        mPublishTypeBCharPentouManual = (Button)findViewById(R.id.publish_Type_B_char_pentou_manual);

        mBottomPentouClean = (Button)findViewById(R.id.bottom_pentou_clean);
        mCharPentouClean = (Button)findViewById(R.id.char_pentou_clean);
        mGuitouRedPentouManual = (Button)findViewById(R.id.guitou_red_pentou_maunal);
        mPublishBeltClean = (Button)findViewById(R.id.publish_belt_clean);
        mGuitouLabelStart = (Button)findViewById(R.id.guitou_label_start);
        mGuitouWhitePentouClean = (Button)findViewById(R.id.guitou_white_pentou_clean);

        //印刷单元Type_A手动
        mPublishTypeAManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送

            }
        });

        //印刷单元Type_B手动
        mPublishTypeBManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //行走单元前进手动
        mWalkForwardManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //行走单元后退手动
        mWalkBackwardManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //底漆喷头手动
        mDiqiPentouManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //行走单元离合器手动
        mWalkClutchManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //印刷单元Type_A字符喷头手动
        mPublishTypeACharPentouManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //印刷单元Type_B字符喷头手动
        mPublishTypeBCharPentouManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送
            }
        });

        //底漆喷头清洗
        mBottomPentouClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //字符喷头清洗
        mCharPentouClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //轨头红喷头手动
        mGuitouRedPentouManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //印刷单元皮带清洗
        mPublishBeltClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //轨头标记开始
        mGuitouLabelStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //轨头白喷头清洗
        mGuitouWhitePentouClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }


}
