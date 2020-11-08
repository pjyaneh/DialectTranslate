package com.example.dialecttranslate.ui.dashboard;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dialecttranslate.R;
import com.wang.avi.AVLoadingIndicatorView;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    EditText mEditTxt2;
    Button btnTranslate2;
    TextView txtResult2;
    AVLoadingIndicatorView avi2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        mEditTxt2 = root.findViewById(R.id.editWord2);
        txtResult2 = root.findViewById(R.id.txtResult2);
        btnTranslate2 = root.findViewById(R.id.btnTranslate2);
        avi2 = root.findViewById(R.id.avi2);
/*
        NewtonCradleLoading newtonCradleLoading; newtonCradleLoading = (NewtonCradleLoading)root.findViewById(R.id.newton_cradle_loading); newtonCradleLoading.start(); newtonCradleLoading.setLoadingColor(R.color.colorPrimary);
        newtonCradleLoading.start();*/
        mEditTxt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                txtResult2.setText("");
            }
        });

        btnTranslate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avi2.show();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        if (mEditTxt2.getText().toString().equals("Iner ka") ||mEditTxt2.getText().toString().equals("iner ka") ){
                            txtResult2.setText("Saan ka");
                        }
                        else if (mEditTxt2.getText().toString().equals("Galala") ||mEditTxt2.getText().toString().equals("galala") ){
                            txtResult2.setText("Halika na");
                        }

                        else if (mEditTxt2.getText().toString().equals("Apuram") ||mEditTxt2.getText().toString().equals("apuram") ){
                            txtResult2.setText("Bilisan mo");
                        }

                        else if (mEditTxt2.getText().toString().equals("Dakel") ||mEditTxt2.getText().toString().equals("dakel") ){
                            txtResult2.setText("Marami");
                        }

                        else if (mEditTxt2.getText().toString().equals("Ambitel") ||mEditTxt2.getText().toString().equals("ambitel") ){
                            txtResult2.setText("Malamig");
                        }
                        else if (mEditTxt2.getText().toString().equals("Ang lamig lamig") ||mEditTxt2.getText().toString().equals("ang lamig lamig") ){
                            txtResult2.setText("Ambitelbitel");
                        }


                        else if (mEditTxt2.getText().toString().equals("Ambalbalingit") ||mEditTxt2.getText().toString().equals("ambalbalingit") ){
                            txtResult2.setText("Mabango");
                        }

                        else if (mEditTxt2.getText().toString().equals("Atapis") ||mEditTxt2.getText().toString().equals("atapis") ){
                            txtResult2.setText("Baliw");
                        }

                        else if (mEditTxt2.getText().toString().equals("Kalamor") ||mEditTxt2.getText().toString().equals("kalamor") ){
                            txtResult2.setText("Kawawa");
                        }

                        else if (mEditTxt2.getText().toString().equals("Laki") ||mEditTxt2.getText().toString().equals("laki") ){
                            txtResult2.setText("Lalaki");
                        }
                        else if (mEditTxt2.getText().toString().equals("Bae") ||mEditTxt2.getText().toString().equals("bae") ){
                            txtResult2.setText("Lola");
                        }

                        else if (mEditTxt2.getText().toString().equals("Sira") ||mEditTxt2.getText().toString().equals("sira") ){
                            txtResult2.setText("Ulam");
                        }

                        else if (mEditTxt2.getText().toString().equals("Agi") ||mEditTxt2.getText().toString().equals("agi") ){
                            txtResult2.setText("kapatid");
                        }

                        else if (mEditTxt2.getText().toString().equals("Atagey") ||mEditTxt2.getText().toString().equals("atagey") ){
                            txtResult2.setText("Matangkad");
                        }

                        else if (mEditTxt2.getText().toString().equals("Melag") ||mEditTxt2.getText().toString().equals("melag") ){
                            txtResult2.setText("Maliit");
                        }
                        else if (mEditTxt2.getText().toString().equals("Kumpare") ||mEditTxt2.getText().toString().equals("kumpare") ){
                            txtResult2.setText("Kumpare");
                        }
                        else if (mEditTxt2.getText().toString().equals("Ante") ||mEditTxt2.getText().toString().equals("ante") ){
                            txtResult2.setText("Ante");
                        }
                        else if (mEditTxt2.getText().toString().equals("Uncle") ||mEditTxt2.getText().toString().equals("uncle") ){
                            txtResult2.setText("Uncle");
                        }
                        else if (mEditTxt2.getText().toString().equals("Inagem") ||mEditTxt2.getText().toString().equals("inagem") ){
                            txtResult2.setText("Sakit");
                        }

                        else if (mEditTxt2.getText().toString().equals("Naninagem") ||mEditTxt2.getText().toString().equals("naninagem") ){
                            txtResult2.setText("Nagkasakit");
                        }




                        else {
                            txtResult2.setText("Walang nahanap na baybayin");
                        }

                        avi2.hide();

                        //Do something after 100ms
                    }
                }, 3000);
            }
           /*void startAnim(){
               avi.show();
               // or avi.smoothToShow();
           }

           void stopAnim(){
               avi.hide();
               // or avi.smoothToHide();
           }*/
        });

        return root;
    }
}