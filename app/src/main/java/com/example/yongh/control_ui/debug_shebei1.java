package com.example.yongh.control_ui;

import android.content.Intent;
import android.media.Image;
import android.media.MediaMetadata;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class debug_shebei1 extends AppCompatActivity {
    //页面空间成员
    private ImageButton mHoutuiShebei1_1;
    private ImageButton mQianjinShebei1_1;
    private EditText mBiaojiSpace;
    private EditText mGuitoubiaojiSpace;
    private EditText mModuanbuchang;
    private EditText mGuitouDistance;
    private EditText mDayingShebeijuli;
    private EditText mStandardLength;

    private Button mForwardTest;
    private Button mBackwardTest;
    private Button mWaikTest;

    private EditText mForwardCompensationPos;
    private EditText mForwardCompensationNeg;
    private EditText mBackwardCompensationPos;
    private EditText mBackwardCompensationNeg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_shebei1);

        //后退
        mHoutuiShebei1_1 = (ImageButton)findViewById(R.id.imageButton_houtui_shebei1);
        mHoutuiShebei1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //前进
        mQianjinShebei1_1 = (ImageButton)findViewById(R.id.imageButtom_qianjin_shebei1);
        mQianjinShebei1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(debug_shebei1.this,debug_shebei1_2.class);
                startActivity(intent);
            }
        });

        mBiaojiSpace = (EditText) findViewById(R.id.biaoji_space_edit);
        mGuitoubiaojiSpace = (EditText)findViewById(R.id.guitoubiaoji_space_edit);
        mModuanbuchang = (EditText)findViewById(R.id.moduanbuchang_edit);
        mGuitouDistance = (EditText)findViewById(R.id.guitou_distance_edit);
        mDayingShebeijuli = (EditText)findViewById(R.id.dayin_shebeijuli_edit);
        mStandardLength = (EditText)findViewById(R.id.standa_length_edit);

        mForwardTest = (Button)findViewById(R.id.forward_test);
        mBackwardTest = (Button)findViewById(R.id.walk_test);
        mWaikTest = (Button)findViewById(R.id.walk_test);

        mForwardCompensationPos = (EditText)findViewById(R.id.forward_compensation_pos);
        mForwardCompensationNeg = (EditText)findViewById(R.id.forward_compensation_neg);
        mBackwardCompensationPos = (EditText)findViewById(R.id.backward_compensation_pos);
        mBackwardCompensationNeg = (EditText)findViewById(R.id.backward_compensation_neg);

        //标记间距
        mBiaojiSpace.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_SEND){
                    int temp = Integer.parseInt(mBiaojiSpace.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });
        //轨头标记距离
        mGuitoubiaojiSpace.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mGuitoubiaojiSpace.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //末端补偿
        mModuanbuchang.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mModuanbuchang.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //轨头距离
        mGuitouDistance.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mGuitouDistance.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //打印部设备距离
        mDayingShebeijuli.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mDayingShebeijuli.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //基准长度
        mStandardLength.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mStandardLength.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //前进测试
        mForwardTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送

            }
        });
        //后退测试
        mBackwardTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送

            }
        });
        //行走测试
        mWaikTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在这里发送

            }
        });
        //前进补偿+
        mForwardCompensationPos.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mForwardCompensationPos.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });
        //前进补偿-
        mForwardCompensationNeg.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mForwardCompensationNeg.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });

        //后退补偿+
        mBackwardCompensationPos.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mBackwardCompensationPos.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });
        //后退补偿-
        mBackwardCompensationNeg.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    int temp = Integer.parseInt(mBackwardCompensationNeg.getText().toString());
                    //在这里发送

                }
                return false;
            }
        });
    }
}
