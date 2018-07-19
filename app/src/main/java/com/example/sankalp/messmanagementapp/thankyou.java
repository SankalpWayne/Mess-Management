package com.example.sankalp.messmanagementapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thankyou extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
    }

    public void main_menu(View view)
    {
        finalize_order.next_ord_flag=1;
        finalize_order.old_ord_string=finalize_order.order_string+finalize_order.old_ord_string;
        finalize_order.old_all_total=finalize_order.all_total;

        N_Veg.Roti=0;
        N_Veg.Butter_Roti=0;
        N_Veg.Fried_Rice=0;
        N_Veg.sabji=0;
        N_Veg.chicken_gravy=0;
        N_Veg.fish_gravy=0;
        N_Veg.egg_gravy=0;
        N_Veg.CURD=0;
        N_Veg.chicken_biryani=0;
        N_Veg.daal_makhani=0;
        N_Veg.dinner_total=0;

        Starters.rava_idli=0;
        Starters.puri_sabji=0;
        Starters.bread_butter=0;
        Starters.poha=0;
        Starters.noodles=0;
        Starters.veg_soup=0;
        Starters.masala_dosa=0;
        Starters.tomato_soup=0;
        Starters.idli_vadaa=0;
        Starters.halwa=0;
        Starters.breakfast_total=0;

        Veg.roti=0;
        Veg.butter_roti=0;
        Veg.sabji_1=0;
        Veg.veg_pulao=0;
        Veg.sabji_2=0;
        Veg.curd=0;
        Veg.veg_fried_rice=0;
        Veg.sambar=0;
        Veg.veg_biryani=0;
        Veg.tadka_daal=0;
        Veg.total_lunch=0;

        Dessert.chocolate_ice_cream=0;
        Dessert.vanilla_ice_cream=0;
        Dessert.strawberry_ice_cream=0;
        Dessert.falooda=0;
        Dessert.brownie_fudge=0;
        Dessert.alpine_chocolate=0;
        Dessert.devils_delight=0;
        Dessert.black_forest=0;
        Dessert.chocolate_lava=0;
        Dessert.dutch_almond=0;
        Dessert.dessert_total=0;


        Intent menu= new Intent(this,Order_Type.class);
        startActivity(menu);

    }



}
