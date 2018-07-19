package com.example.sankalp.messmanagementapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Veg extends AppCompatActivity {

    static int roti;
    static int butter_roti;
    static int sabji_1;
    static int veg_pulao;
    static int sabji_2;
    static int curd;
    static int veg_fried_rice;
    static int sambar;
    static int veg_biryani;
    static int tadka_daal;
    static int total_lunch;
    static String order_veg;

    @Override
    public void onBackPressed() {
        // do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg);
        total_cal();
        orders_list_init();
    }
    public void roti_inc(View view){
        roti=inc(roti);
        TextView tv = (TextView) findViewById(R.id.roti_order);
        tv.setText("" + roti);
        total_cal();
    }
    public void roti_dec(View view) {
        if (roti>= 0) {
            roti= dec(roti);
            TextView tv = (TextView) findViewById(R.id.roti_order);
            if(roti>0) tv.setText("" + roti);
            else tv.setText("__");
            total_cal();
        }
    }


    public void butter_roti_inc(View view){
        butter_roti=inc(butter_roti);
        TextView tv = (TextView) findViewById(R.id.butter_roti_order);
        tv.setText("" + butter_roti);
        total_cal();
    }
    public void butter_roti_dec(View view) {
        if (butter_roti>= 0) {
            butter_roti= dec(butter_roti);
            TextView tv = (TextView) findViewById(R.id.butter_roti_order);
            if(butter_roti>0) tv.setText("" + butter_roti);
            else tv.setText("__");

            total_cal();
        }
    }


    public void sabji_1_inc(View view){
        sabji_1=inc(sabji_1);
        TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
        tv.setText("" + sabji_1);
        total_cal();
    }
    public void sabji_1_dec(View view) {
        if (sabji_1>= 0) {
            sabji_1= dec(sabji_1);
            TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
            if(sabji_1>0) tv.setText("" + sabji_1);
            else tv.setText("__");

            total_cal();
        }
    }

    public void veg_pulao_inc(View view){
        veg_pulao=inc(veg_pulao);
        TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
        tv.setText("" + veg_pulao);
        total_cal();
    }
    public void veg_pulao_dec(View view) {
        if (veg_pulao>= 0) {
            veg_pulao= dec(veg_pulao);
            TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
            if(veg_pulao>0) tv.setText("" + veg_pulao);
            else tv.setText("__");

            total_cal();
        }
    }

    public void sabji_2_inc(View view){
        sabji_2=inc(sabji_2);
        TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
        tv.setText("" + sabji_2);

        total_cal();
    }
    public void sabji_2_dec(View view) {
        if (sabji_2>= 0) {
            sabji_2= dec(sabji_2);
            TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
            if(sabji_2>0) tv.setText("" + sabji_2);
            else tv.setText("__");

            total_cal();
        }
    }

    public void curd_inc(View view){
        curd=inc(curd);
        TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
        tv.setText("" + curd);

        total_cal();
    }
    public void curd_dec(View view) {
        if (curd>= 0) {
            curd= dec(curd);
            TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
            if(curd>0) tv.setText("" + curd);
            else tv.setText("__");

            total_cal();
        }
    }


    public void veg_fried_rice_inc(View view){
        veg_fried_rice=inc(veg_fried_rice);
        TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
        tv.setText("" + veg_fried_rice);
        total_cal();
    }
    public void veg_fried_rice_dec(View view) {
        if (veg_fried_rice>= 0) {
            veg_fried_rice= dec(veg_fried_rice);
            TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
            if(veg_fried_rice>0) tv.setText("" + veg_fried_rice);
            else tv.setText("__");

            total_cal();
        }
    }


    public void sambar_inc(View view){
        sambar=inc(sambar);
        TextView tv = (TextView) findViewById(R.id.veg_burger_order);
        tv.setText("" + sambar);

        total_cal();
    }
    public void sambar_dec(View view) {
        if (sambar>= 0) {
            sambar= dec(sambar);
            TextView tv = (TextView) findViewById(R.id.veg_burger_order);
            if(sambar>0) tv.setText("" + sambar);
            else tv.setText("__");

            total_cal();
        }
    }


    public void veg_biryani_inc(View view){
        veg_biryani=inc(veg_biryani);
        TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
        tv.setText("" + veg_biryani);

        total_cal();
    }
    public void veg_biryani_dec(View view) {
        if (veg_biryani>= 0) {
            veg_biryani= dec(veg_biryani);
            TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
            if(veg_biryani>0) tv.setText("" + veg_biryani);
            else tv.setText("__");

            total_cal();
        }
    }



    public void tadka_daal_inc(View view){
        tadka_daal=inc(tadka_daal);
        TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
        tv.setText("" + tadka_daal);

        total_cal();
    }
    public void tadka_daal_dec(View view) {
        if (tadka_daal>= 0) {
            tadka_daal= dec(tadka_daal);
            TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
            if(tadka_daal>0) tv.setText("" + tadka_daal);
            else tv.setText("__");

            total_cal();
        }
    }




    public void total_cal(){
        total_lunch=roti*(15)+butter_roti*(20)+sabji_1*(80)+veg_pulao*(50)+sabji_2*(100)+curd*(20)+veg_fried_rice*(40)+sambar*(20)+veg_biryani*(50)+tadka_daal*(25);
        finalize_order.all_total=Starters.breakfast_total+Veg.total_lunch+N_Veg.dinner_total+Dessert.dessert_total;

        if (finalize_order.all_total > 0) {
            TextView tv = (TextView) findViewById(R.id.veg_total_id);
            tv.setText(""+"₹"+ (finalize_order.all_total));
        }
        else{
            TextView tv = (TextView) findViewById(R.id.veg_total_id);
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
        if(roti>0) {
            TextView tv = (TextView) findViewById(R.id.roti_order);
            tv.setText("" + roti);
        }
        if(butter_roti>0) {
            TextView tv = (TextView) findViewById(R.id.butter_roti_order);
            tv.setText("" + butter_roti);
        }

        if(sabji_1>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_tikka_order);
            tv.setText("" + sabji_1);
        }
        if(veg_pulao>0) {
            TextView tv = (TextView) findViewById(R.id.veg_pulao_order);
            tv.setText("" + veg_pulao);
        }
        if(sabji_2>0) {
            TextView tv = (TextView) findViewById(R.id.mutter_paneer_order);
            tv.setText("" + sabji_2);
        }
        if(curd>0) {
            TextView tv = (TextView) findViewById(R.id.veg_noodles_order);
            tv.setText("" + curd);
        }
        if(veg_fried_rice>0) {
            TextView tv = (TextView) findViewById(R.id.veg_fried_rice_order);
            tv.setText("" + veg_fried_rice);
        }
        if(sambar>0) {
            TextView tv = (TextView) findViewById(R.id.veg_burger_order);
            tv.setText("" + sambar);
        }

        if(veg_biryani>0) {
            TextView tv = (TextView) findViewById(R.id.veg_biryani_order);
            tv.setText("" + veg_biryani);
        }
        if(tadka_daal>0) {
            TextView tv = (TextView) findViewById(R.id.paneer_kofta_order);
            tv.setText("" + tadka_daal);
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

                                Intent nextact = new Intent((Veg) o, thankyou.class);
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
