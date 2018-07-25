package com.blogbasbas.fortraining.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blogbasbas.fortraining.R;
import com.blogbasbas.fortraining.helpers.MyFunction;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 25/07/2018.
 */

public class RegisterActivity extends MyFunction {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.etNama)
    EditText etNama;
    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etRePassword)
    EditText etRePassword;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    @BindView(R.id.btnChange)
    Button btnChange;
    @BindView(R.id.rlLayout)
    RelativeLayout rlLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }



    @OnClick({R.id.btnRegister, R.id.btnChange})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnRegister:
                break;
            case R.id.btnChange:
                break;
        }
    }
}
