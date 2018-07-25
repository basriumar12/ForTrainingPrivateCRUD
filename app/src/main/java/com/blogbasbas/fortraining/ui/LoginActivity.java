package com.blogbasbas.fortraining.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blogbasbas.fortraining.R;
import com.blogbasbas.fortraining.helpers.MyFunction;
import com.blogbasbas.fortraining.helpers.MyValidation;
import com.blogbasbas.fortraining.helpers.SharedPrefManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 25/07/2018.
 */

public class LoginActivity extends MyFunction {


    //inisialisasi id di layout activity login
    //TAG
    private final static String TAG = LoginActivity.class.getSimpleName();

    @BindView(R.id.etPassword)
    EditText etPassword;
    ProgressDialog loading;
    @BindView(R.id.etUsername)
    EditText etUsername;
    Context mContext;
    String username, password;
    SharedPrefManager sharedPrefManager;
    MyValidation myValidation;
    @BindView(R.id.tvPass)
    TextView tvPass;
    @BindView(R.id.tvVersion)
    TextView tvVersion;
    View parentView;
    @BindView(R.id.rlLayout)
    RelativeLayout rlLayout;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnRegister)
    Button btnRegister;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }



        // genearate id button utk klik pakai butter knife
    @OnClick({R.id.tvPass, R.id.btnLogin, R.id.btnRegister})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //lupas password
            case R.id.tvPass:
                break;
                //untuk login
            case R.id.btnLogin:
                break;

                //untuk register
            case R.id.btnRegister:
                break;
        }
    }
}
