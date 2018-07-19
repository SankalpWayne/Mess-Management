package com.example.sankalp.messmanagementapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class N_Veg extends AppCompatActivity {
    static int Roti;
    static int Butter_Roti;
    static int Fried_Rice;
    static int sabji;
    static int chicken_gravy;
    static int fish_gravy;
    static int egg_gravy;
    static int CURD;
    static int chicken_biryani;
    static int daal_makhani;
    static int dinner_total;
    @Override
    public void onBackPressed() {
        // do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n__veg);
        total_cal();
        orders_list_init();
    }
    public void Butter_Roti_inc(View view){
        Butter_Roti=inc(Butter_Roti);
        TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
        tv.setText("" + Butter_Roti);
        total_cal();
    }
    public void Butter_Roti_dec(View view) {
        if (Butter_Roti >= 0) {
            Butter_Roti= dec(Butter_Roti);
            TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
            if(Butter_Roti>0) tv.setText("" + Butter_Roti);
            else tv.setText("__");
            total_cal();

        }
    }

    public void Roti_inc(View view){
        Roti=inc(Roti);
        TextView tv = (TextView) findViewById(R.id.chickburger_order);
        tv.setText("" + Roti);
        total_cal();
    }
    public void Roti_dec(View view) {
        if (Roti >= 0) {
            Roti = dec(Roti);
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            if(Roti>0) tv.setText("" + Roti);
            else tv.setText("__");
            total_cal();
        }
    }


    public void Fried_Rice_inc(View view){
        Fried_Rice=inc(Fried_Rice);
        TextView tv = (TextView) findViewById(R.id.chicken_tikka_order);
        tv.setText("" + Fried_Rice);
        total_cal();
    }
    public void Fried_Rice_dec(View view) {
        if (Fried_Rice>= 0) {
            Fried_Rice = dec(Fried_Rice);
            TextView tv = (TextView) findViewById(R.id.chicken_tikka_order);
            if(Fried_Rice>0) tv.setText("" + Fried_Rice);
            else tv.setText("__");
            total_cal();
        }
    }

    public void sabji_inc(View view){
        sabji=inc(sabji);
        TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
        tv.setText("" + sabji);
        total_cal();
    }
    public void sabji_dec(View view) {
        if (sabji>= 0) {
            sabji= dec(sabji);
            TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
            if(sabji>0) tv.setText("" + sabji);
            else tv.setText("__");
            total_cal();
        }
    }

    public void chicken_gravy_inc(View view){
        chicken_gravy=inc(chicken_gravy);
        TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
        tv.setText("" + chicken_gravy);
        total_cal();
    }
    public void chicken_gravy_dec(View view) {
        if (chicken_gravy>= 0) {
            chicken_gravy= dec(chicken_gravy);
            TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
            if(chicken_gravy>0) tv.setText("" + chicken_gravy);
            else tv.setText("__");
            total_cal();
        }
    }



    public void fish_gravy_inc(View view){
        fish_gravy=inc(fish_gravy);
        TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
        tv.setText("" + fish_gravy);
        total_cal();
    }
    public void fish_fravy_dec(View view) {
        if (fish_gravy>= 0) {
            fish_gravy= dec(fish_gravy);
            TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
            if(fish_gravy>0) tv.setText("" + fish_gravy);
            else tv.setText("__");
            total_cal();
        }
    }

    public void egg_gravy_inc(View view){
        egg_gravy=inc(egg_gravy);
        TextView tv = (TextView) findViewById(R.id.kolhapuri_chicken_order);
        tv.setText("" + egg_gravy);
        total_cal();
    }
    public void egg_gravy_dec(View view) {
        if (egg_gravy>= 0) {
            egg_gravy= dec(egg_gravy);
            TextView tv = (TextView) findViewById(R.id.kolhapuri_chicken_order);
            if(egg_gravy>0) tv.setText("" + egg_gravy);
            else tv.setText("__");
            total_cal();
        }
    }



    public void CURD_inc(View view){
        CURD=inc(CURD);
        TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
        tv.setText("" + CURD);
        total_cal();
    }
    public void CURD_dec(View view) {
        if (CURD>= 0) {
            CURD= dec(CURD);
            TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
            if(CURD>0) tv.setText("" + CURD);
            else tv.setText("__");
            total_cal();
        }
    }



    public void chicken_biryani_inc(View view){
        chicken_biryani=inc(chicken_biryani);
        TextView tv = (TextView) findViewById(R.id.chicken_lollipop_order);
        tv.setText("" + chicken_biryani);
        total_cal();
    }
    public void chicken_biryani_dec(View view) {
        if (chicken_biryani>= 0) {
            chicken_biryani= dec(chicken_biryani);
            TextView tv = (TextView) findViewById(R.id.chicken_lollipop_order);
            if(chicken_biryani>0) tv.setText("" + chicken_biryani);
            else tv.setText("__");
            total_cal();
        }
    }

    public void daal_makhani_inc(View view){
        daal_makhani=inc(daal_makhani);
        TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
        tv.setText("" + daal_makhani);
        total_cal();
    }
    public void daal_makhani_dec(View view) {
        if (daal_makhani>= 0) {
            daal_makhani= dec(daal_makhani);
            TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
            if(daal_makhani>0) tv.setText("" + daal_makhani);
            else tv.setText("__");
            total_cal();
        }
    }



    public void total_cal() {
        dinner_total = Roti * (15) + Butter_Roti * (20) + Fried_Rice * (40) + sabji * (85) + chicken_gravy * (120) + fish_gravy * (100) + egg_gravy * (80) + CURD * (20) + chicken_biryani * (110) + daal_makhani * (30);
        finalize_order.all_total = Starters.breakfast_total + Veg.total_lunch + N_Veg.dinner_total + Dessert.dessert_total;
        if (finalize_order.all_total > 0) {
            TextView tv = (TextView) findViewById(R.id.n_veg_tot_id);
            tv.setText("" + "₹" + (finalize_order.all_total));
        }

        else{
            TextView tv = (TextView) findViewById(R.id.n_veg_tot_id);
            tv.setText("");

        }
    }





    public void main_menu(View view){
        Intent goto_main_menu= new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }

    public int dec(int x) {
        if (x > 0) {
            x--;
            return x;
        }
        else return 0;
    }


    public int inc(int x)
    {
        x++;
        return (x);
    }

    public void orders_list_init(){

        if(Roti>0) {
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            tv.setText("" + Roti);
        }

        if(Butter_Roti>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_BBQ_pizza_order);
            tv.setText("" + Butter_Roti);
        }
        if(Fried_Rice>0) {
            TextView tv = (TextView) findViewById(R.id.chickburger_order);
            tv.setText("" + Fried_Rice);
        }
        if(sabji>0) {
            TextView tv = (TextView) findViewById(R.id.fried_fish_rice_order);
            tv.setText("" + sabji);
        }


        if(chicken_gravy>0) {
            TextView tv = (TextView) findViewById(R.id.kolhapuri_chicken_order);
            tv.setText("" + chicken_gravy);
        }
        if(fish_gravy>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_noodles_order);
            tv.setText("" + fish_gravy);
        }

        if(egg_gravy>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_fried_rice_order);
            tv.setText("" + egg_gravy);
        }
        if(CURD>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_lollipop_order);
            tv.setText("" + CURD);
        }


        if(chicken_biryani>0) {
            TextView tv = (TextView) findViewById(R.id.chicken_biryani_order);
            tv.setText("" + chicken_biryani);
        }

        if(daal_makhani>0) {
            TextView tv = (TextView) findViewById(R.id.mutton_biryani_order);
            tv.setText("" + daal_makhani);
        }
    }

    public void fin_ord(View view)
    {
        final Object o=this;
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

                                Intent nextact = new Intent((N_Veg) o, thankyou.class);
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
