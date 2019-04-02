package com.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn,btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnadd,btndiv,btnmin,btnmul,btncalc,btncl;
    private TextView txtone,txttwo;
    private final char ADDITION = '+';
    private final char MINUS = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    public void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(txtone.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1= val1 + val2;
                    break;

            }
            switch(ACTION){
                case MINUS:
                    val1= val1 - val2;
                    break;

            }
            switch(ACTION){
                case MULTIPLY:
                    val1= val1 * val2;
                    break;

            }
            switch(ACTION){
                case DIVIDE:
                    val1= val1 / val2;
                    break;

            }



        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       txtone.setText(txtone.getText().toString() + "0");
                                   }
        });
              btnone.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                txtone.setText(txtone.getText().toString() + "1");
                                            }
              });
                btntwo.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  txtone.setText(txtone.getText().toString() + "2");
                                              }
                });
                      btnthree.setOnClickListener(new View.OnClickListener() {
                                                      @Override
                                                      public void onClick(View v) {
                                                          txtone.setText(txtone.getText().toString() + "3");
                                                      }
                      });
                        btnfour.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           txtone.setText(txtone.getText().toString() + "4");
                                                       }
                        });
                              btnfive.setOnClickListener(new View.OnClickListener()

                            {
                                @Override
                                public void onClick (View v){
                                txtone.setText(txtone.getText().toString() + "5");
                            }
                            });
                                btnsix.setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View v) {
                                                                  txtone.setText(txtone.getText().toString() + "6");
                                                              }
                                });
                                      btnseven.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            txtone.setText(txtone.getText().toString()+"7");
                                        }
                                      });
                                        btneight.setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View v) {
                                                                            txtone.setText(txtone.getText().toString() + "8");
                                                                        }
                                        });
                                              btnnine.setOnClickListener(new View.OnClickListener() {
                                                                             @Override
                                                                             public void onClick(View v) {
                                                                                 txtone.setText(txtone.getText().toString() + "9");
                                                                             }
                                              });
                                                btnadd.setOnClickListener(new View.OnClickListener() {
                                                                              @Override
                                                                              public void onClick(View v) {
                                                                                  compute();
                                                                                  ACTION = ADDITION;
                                                                                  txttwo.setText(txtone.getText().toString() + "+");
                                                                                  txtone.setText(null);
                                                                              }
                                                });
                                                      btnmul.setOnClickListener(new View.OnClickListener()

                                                    {
                                                        @Override
                                                        public void onClick (View v){
                                                            compute();
                                                            ACTION = MINUS;
                                                            txttwo.setText(txtone.getText().toString() + "-");
                                                            txtone.setText(null);
                                                    }
                                                    });
                                                              btnmin.setOnClickListener(new View.OnClickListener() {
                                                                  @Override
                                                                  public void onClick(View v) {
                                                                      compute();
                                                                      ACTION = MULTIPLY;
                                                                      txttwo.setText(txtone.getText().toString() + "*");
                                                                      txtone.setText(null);
                                                                  }
                                                              });
                                                                      btndiv.setOnClickListener(new View.OnClickListener() {
                                                                          @Override
                                                                          public void onClick(View v) {
                                                                              compute();
                                                                              ACTION = DIVIDE;
                                                                              txttwo.setText(txtone.getText().toString() + "/");
                                                                              txtone.setText(null);
                                                                          }
                                                                      });
                                                                              btncalc.setOnClickListener(new View.OnClickListener() {
                                                                                  @Override
                                                                                  public void onClick(View v) {
                                                                                      txtone.setText(txtone.getText().toString() + "0");
                                                                                  }
                                                                              });


    }
    private void setupUIViews(){
        btn = findViewById(R.id.btn);
        btnone = findViewById(R.id.btnone);
        btntwo = findViewById(R.id.btntwo);
        btnthree = findViewById(R.id.btnthree);
        btnfour = findViewById(R.id.btnfour);
        btnfive = findViewById(R.id.btnfive);
        btnsix = findViewById(R.id.btnsix);
        btnseven = findViewById(R.id.btnseven);
        btneight = findViewById(R.id.btneight);
        btnnine = findViewById(R.id.btnnine);
        btnadd = findViewById(R.id.btnadd);
        btnmin = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btncalc = findViewById(R.id.btn);
        btncl = findViewById(R.id.btncl);
        txtone = findViewById(R.id.txtone);
        txttwo = findViewById(R.id.txttwo);






    }
}
