package com.example.dialecttranslate.ui.home;

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
import com.victor.loading.newton.NewtonCradleLoading;
import com.wang.avi.AVLoadingIndicatorView;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    EditText mEditTxt;
    Button btnTranslate;
    TextView txtResult;
    AVLoadingIndicatorView avi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
       /* homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });*/

       mEditTxt = root.findViewById(R.id.editWord);
       txtResult = root.findViewById(R.id.txtResult);
       btnTranslate = root.findViewById(R.id.btnTranslate);
       avi = root.findViewById(R.id.avi);
/*
        NewtonCradleLoading newtonCradleLoading; newtonCradleLoading = (NewtonCradleLoading)root.findViewById(R.id.newton_cradle_loading); newtonCradleLoading.start(); newtonCradleLoading.setLoadingColor(R.color.colorPrimary);
        newtonCradleLoading.start();*/
       mEditTxt.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {

           }

           @Override
           public void afterTextChanged(Editable s) {
               txtResult.setText("");
           }
       });

       btnTranslate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              avi.show();

               final Handler handler = new Handler();
               handler.postDelayed(new Runnable() {
                   @Override
                   public void run() {

                       if (mEditTxt.getText().toString().equals("Saan ka") ||mEditTxt.getText().toString().equals("saan ka") || mEditTxt.getText().toString().equals("San ka") ||mEditTxt.getText().toString().equals("san ka") ){
                           txtResult.setText("Iner ka");
                       }
                       else if (mEditTxt.getText().toString().equals("Halika na") ||mEditTxt.getText().toString().equals("halika na") ){
                           txtResult.setText("Galala");
                       }

                       else if (mEditTxt.getText().toString().equals("Bilisan mo") ||mEditTxt.getText().toString().equals("bilisan mo") ){
                           txtResult.setText("Apuram");
                       }

                       else if (mEditTxt.getText().toString().equals("Marami") ||mEditTxt.getText().toString().equals("marami") ){
                           txtResult.setText("Dakel");
                       }

                       else if (mEditTxt.getText().toString().equals("Malamig") ||mEditTxt.getText().toString().equals("malamig") ){
                           txtResult.setText("Ambitel");
                       }
                       else if (mEditTxt.getText().toString().equals("Ang lamig lamig") ||mEditTxt.getText().toString().equals("ang lamig lamig") ){
                           txtResult.setText("Ambitelbitel");
                       }


                       else if (mEditTxt.getText().toString().equals("Mabango") ||mEditTxt.getText().toString().equals("mabango") ){
                           txtResult.setText("Ambalbalingit");
                       }

                       else if (mEditTxt.getText().toString().equals("Baliw") ||mEditTxt.getText().toString().equals("baliw") ){
                           txtResult.setText("Atapis");
                       }

                       else if (mEditTxt.getText().toString().equals("Kawawa") ||mEditTxt.getText().toString().equals("kawawa") ){
                           txtResult.setText("Kalamor");
                       }

                       else if (mEditTxt.getText().toString().equals("Lolo") ||mEditTxt.getText().toString().equals("lolo") || mEditTxt.getText().toString().equals("lalaki") || mEditTxt.getText().toString().equals("Lalaki") || mEditTxt.getText().toString().equals("lalake") || mEditTxt.getText().toString().equals("Lalake") ){
                           txtResult.setText("Laki");
                       }
                       else if (mEditTxt.getText().toString().equals("Lola") ||mEditTxt.getText().toString().equals("lola") ){
                           txtResult.setText("Bae");
                       }

                       else if (mEditTxt.getText().toString().equals("Pagkain") ||mEditTxt.getText().toString().equals("pagkain") ||mEditTxt.getText().toString().equals("Ulam") ||mEditTxt.getText().toString().equals("ulam") ){
                           txtResult.setText("Sira");
                       }

                       else if (mEditTxt.getText().toString().equals("Kapatid") ||mEditTxt.getText().toString().equals("kapatid") ){
                           txtResult.setText("Agi");
                       }

                       else if (mEditTxt.getText().toString().equals("Matangkad") ||mEditTxt.getText().toString().equals("matangkad") ){
                           txtResult.setText("Atagey");
                       }

                       else if (mEditTxt.getText().toString().equals("Pandak") ||mEditTxt.getText().toString().equals("pandak") ||mEditTxt.getText().toString().equals("maliit") ||mEditTxt.getText().toString().equals("Maliit") ){
                           txtResult.setText("Melag");
                       }
                       else if (mEditTxt.getText().toString().equals("Kumpare") ||mEditTxt.getText().toString().equals("kumpare") ){
                           txtResult.setText("Kumpare");
                       }
                       else if (mEditTxt.getText().toString().equals("Ante") ||mEditTxt.getText().toString().equals("ante") ){
                           txtResult.setText("Ante");
                       }
                       else if (mEditTxt.getText().toString().equals("Uncle") ||mEditTxt.getText().toString().equals("uncle") ){
                           txtResult.setText("Uncle");
                       }
                       else if (mEditTxt.getText().toString().equals("Sakit") ||mEditTxt.getText().toString().equals("sakit") ){
                           txtResult.setText("Inagem");
                       }

                       else if (mEditTxt.getText().toString().equals("Nagkasakit") ||mEditTxt.getText().toString().equals("nagkasakit") ){
                           txtResult.setText("Naninagem");
                       }




                       else {
                           txtResult.setText("Walang nahanap na baybayin");
                       }

                       avi.hide();

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