package com.example.sankalp.messmanagementapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Starters extends AppCompatActivity {
    static int rava_idli;
    static int puri_sabji;
    static int bread_butter;
    static int poha;
    static int veg_soup;
    static int noodles;
    static int tomato_soup;
    static int idli_vadaa;
    static int masala_dosa;
    static int halwa;
    static int breakfast_total;

    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);
        total_cal();
        orders_list_init();
    }

    public void rava_idli_inc(View view) {
        rava_idli = inc(rava_idli);
        TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
        tv.setText("" + rava_idli);
        total_cal();
    }

    public void rava_idli_dec(View view) {
        if (rava_idli >= 0) {
            rava_idli = dec(rava_idli);
            TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
            if (rava_idli > 0) tv.setText("" + rava_idli);
            else tv.setText("__");
            total_cal();
        }
    }

    public void puri_sabji_inc(View view) {
        puri_sabji = inc(puri_sabji);
        TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
        tv.setText("" + puri_sabji);
        total_cal();
    }

    public void puri_sabji_dec(View view) {
        if (puri_sabji >= 0) {
            puri_sabji = dec(puri_sabji);
            TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
            if (puri_sabji > 0) tv.setText("" + puri_sabji);
            else tv.setText("__");
            total_cal();
        }
    }

    public void bread_butter_inc(View view) {
        bread_butter = inc(bread_butter);
        TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
        tv.setText("" + bread_butter);
        total_cal();
    }

    public void bread_butter_dec(View view) {
        if (bread_butter >= 0) {
            bread_butter = dec(bread_butter);
            TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
            if (bread_butter > 0) tv.setText("" + bread_butter);
            else tv.setText("__");
            total_cal();
        }
    }
    public void poha_inc(View view) {
        poha = inc(poha);
        TextView tv = (TextView) findViewById(R.id.masala_papad_order);
        tv.setText("" + poha);
        total_cal();
    }

    public void poha_dec(View view) {
        if (poha >= 0) {
            poha = dec(poha);
            TextView tv = (TextView) findViewById(R.id.masala_papad_order);
            if (poha > 0) tv.setText("" + poha);
            else tv.setText("__");
            total_cal();
        }
    }
    public void veg_soup_inc(View view) {
        veg_soup = inc(veg_soup);
        TextView tv = (TextView) findViewById(R.id.veg_soup_order);
        tv.setText("" + veg_soup);
        total_cal();
    }

    public void veg_soup_dec(View view) {
        if (veg_soup >= 0) {
            veg_soup = dec(veg_soup);
            TextView tv = (TextView) findViewById(R.id.veg_soup_order);
            if (veg_soup > 0) tv.setText("" + veg_soup);
            else tv.setText("__");
            total_cal();

        }
    }
    public void noodles_inc(View view) {
        noodles = inc(noodles);
        TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
        tv.setText("" + noodles);
        total_cal();
    }

    public void noodles_dec(View view) {
        if (noodles >= 0) {
            noodles = dec(noodles);
            TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
            if (noodles > 0) tv.setText("" + noodles);
            else tv.setText("__");
            total_cal();

        }
    }
    public void tomato_soup_inc(View view) {
        tomato_soup = inc(tomato_soup);
        TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
        tv.setText("" + tomato_soup);
        total_cal();
    }

    public void tomato_soup_dec(View view) {
        if (tomato_soup >= 0) {
            tomato_soup = dec(tomato_soup);
            TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
            if (tomato_soup > 0) tv.setText("" + tomato_soup);
            else tv.setText("__");

            total_cal();
        }
    }
    public void idli_vadaa_inc(View view) {
        idli_vadaa = inc(idli_vadaa);
        TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
        tv.setText("" + idli_vadaa);

        total_cal();
    }

    public void idli_vadaa_dec(View view) {
        if (idli_vadaa >= 0) {
            idli_vadaa = dec(idli_vadaa);
            TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
            if (idli_vadaa > 0) tv.setText("" + idli_vadaa);
            else tv.setText("__");

            total_cal();
        }
    }
    public void masala_dosa_inc(View view) {
        masala_dosa = inc(masala_dosa);
        TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
        tv.setText("" + masala_dosa);

        total_cal();
    }

    public void masala_dosa_dec(View view) {
        if (masala_dosa >= 0) {
            masala_dosa = dec(masala_dosa);
            TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
            if (masala_dosa > 0) tv.setText("" + masala_dosa);
            else tv.setText("__");

            total_cal();
        }
    }
    public void halwa_inc(View view) {
        halwa = inc(halwa);
        TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
        tv.setText("" + halwa);

        total_cal();
    }

    public void halwa_dec(View view) {
        if (halwa >= 0) {
            halwa = dec(halwa);
            TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
            if (halwa > 0) tv.setText("" + halwa);
            else tv.setText("__");

            total_cal();
        }
    }





    public void total_cal()
    {
        breakfast_total=rava_idli*(50)+puri_sabji*(50)+bread_butter*(30)+poha*(30)+veg_soup*(30)+noodles*(50)+tomato_soup*(20)+idli_vadaa*(40)+masala_dosa*(40)+halwa*(45);
        finalize_order.all_total=Starters.breakfast_total+Veg.total_lunch+N_Veg.dinner_total+Dessert.dessert_total;

        if (finalize_order.all_total > 0) {
            TextView tv = (TextView) findViewById(R.id.starters_tot_id);
            tv.setText(""+"₹"+(finalize_order.all_total));
        }
        else
        {
            TextView tv = (TextView) findViewById(R.id.starters_tot_id);
            tv.setText("");

        }

        orders_list_init();
    }




    public void main_menu(View view){
        Intent goto_main_menu= new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }


    public int dec(int x) {
        if (x > 0) {
            x--;
            return x;
        } else return 0;
    }

    public int inc(int x) {
        x++;
        return (x);
    }

    public void orders_list_init(){
        if(rava_idli>0) {
            TextView tv = (TextView) findViewById(R.id.veg_crispy_order);
            tv.setText("" + rava_idli);
        }
        if(puri_sabji>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_crispy_order);
            tv.setText("" + puri_sabji);
        }

        if(bread_butter>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_chilly_order);
            tv.setText("" + bread_butter);
        }

        if(poha>0) {
            TextView tv = (TextView) findViewById(R.id.masala_papad_order);
            tv.setText("" + poha);
        }


        if(veg_soup>0) {
            TextView tv = (TextView) findViewById(R.id.veg_soup_order);
            tv.setText("" + veg_soup);
        }

        if(noodles>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_soup_order);
            tv.setText("" + noodles);
        }


        if(tomato_soup>0) {
            TextView tv = (TextView) findViewById(R.id.tomato_soup_order);
            tv.setText("" + tomato_soup);
        }

        if(idli_vadaa>0) {
            TextView tv = (TextView) findViewById(R.id.cheese_pakoda_order);
            tv.setText("" + idli_vadaa);
        }

        if(masala_dosa>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_pakoda_order);
            tv.setText("" + masala_dosa);
        }

        if(halwa>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_chilly_order);
            tv.setText("" + halwa);
        }

    }

    public void fin_ord(View view)
    {
        final Object o= this;
        if(finalize_order.all_total>0) {
            Intent fin = new Intent(this, finalize_order.class);
            startActivity(fin);
            overridePendingTransition(R.anim.fadin, R.anim.fadout);
        }
        else{
            if(finalize_order.next_ord_flag==1)
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Are you sure you don't want to place another order?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Intent nextact = new Intent((Starters) o, thankyou.class);
                                startActivity(nextact);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }

            else{
                Toast.makeText(getApplicationContext(),
                        "Please select your order", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
