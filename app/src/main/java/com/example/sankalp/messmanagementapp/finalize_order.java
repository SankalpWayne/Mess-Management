package com.example.sankalp.messmanagementapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class finalize_order extends AppCompatActivity {
    finalize_order a=this;
    public static Socket client;
    public static PrintWriter printwriter;
    public static BufferedReader bb;
    public static String messsage;
    public static String m1;
    static int old_all_total;
    static int all_total;

    String personal_preferances;
    Object oo;
    String fin_order_string="";
    public String S;
    static int next_ord_flag;
    static String order_string;
    static String old_ord_string="";

    @Override
    public void onBackPressed() {
        // do nothing.
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalize_order);
        show_Order();
        tot_v();
        oo=this;
    }
    public void show_Order() {
        if (Dessert.chocolate_ice_cream > 0) {
            fin_order_string = fin_order_string + "chocolate ice cream-" + String.valueOf(Dessert.chocolate_ice_cream) + ",";
        }
        if (Dessert.vanilla_ice_cream > 0) {
            fin_order_string = fin_order_string + "vannila ice cream-" + String.valueOf(Dessert.vanilla_ice_cream) + ",";
        }

        if (Dessert.strawberry_ice_cream > 0) {
            fin_order_string = fin_order_string + "strawberry ice cream-" + String.valueOf(Dessert.strawberry_ice_cream) + ",";
        }
        if (Dessert.falooda > 0) {
            fin_order_string = fin_order_string + "falooda-" + String.valueOf(Dessert.falooda) + ",";
        }
        if (Dessert.brownie_fudge > 0) {
            fin_order_string = fin_order_string + "brownie fudge-" + String.valueOf(Dessert.brownie_fudge) + ",";
        }
        if (Dessert.alpine_chocolate > 0) {
            fin_order_string = fin_order_string + "alpine chocolate-" + String.valueOf(Dessert.alpine_chocolate) + ",";
        }
        if (Dessert.devils_delight > 0) {
            fin_order_string = fin_order_string + "devils delite-" + String.valueOf(Dessert.devils_delight) + ",";
        }

        if (Dessert.black_forest > 0) {
            fin_order_string = fin_order_string + "black forest-" + String.valueOf(Dessert.black_forest) + ",";
        }
        if (Dessert.chocolate_lava > 0) {
            fin_order_string = fin_order_string + "chocolate lava-" + String.valueOf(Dessert.chocolate_lava) + ",";
        }

        if (Dessert.dutch_almond > 0) {
            fin_order_string = fin_order_string + "dutch almond-" + String.valueOf(Dessert.dutch_almond) + ",";
        }
        if (N_Veg.Roti > 0) {
            fin_order_string = fin_order_string + "Roti-" + String.valueOf(N_Veg.Roti) + ",";
        }
        if (N_Veg.Butter_Roti > 0) {
            fin_order_string = fin_order_string + "Butter Roti-" + String.valueOf(N_Veg.Butter_Roti) + ",";
        }
        if (N_Veg.Fried_Rice > 0) {
            fin_order_string = fin_order_string + "Fried Rice-" + String.valueOf(N_Veg.Fried_Rice) + ",";
        }
        if (N_Veg.chicken_gravy > 0) {
            fin_order_string = fin_order_string + "Chicken Gravy-" + String.valueOf(N_Veg.chicken_gravy) + ",";
        }
        if (N_Veg.sabji > 0) {
            fin_order_string = fin_order_string + "Sabji-" + String.valueOf(N_Veg.sabji) + ",";
        }
        if (N_Veg.fish_gravy > 0) {
            fin_order_string = fin_order_string + "Fish Gravy-" + String.valueOf(N_Veg.fish_gravy) + ",";
        }
        if (N_Veg.egg_gravy > 0) {
            fin_order_string = fin_order_string + "Egg Gravy-" + String.valueOf(N_Veg.egg_gravy) + ",";
        }

        if (N_Veg.CURD > 0) {
            fin_order_string = fin_order_string + "CURD-" + String.valueOf(N_Veg.CURD) + ",";
        }

        if (N_Veg.chicken_biryani> 0) {
            fin_order_string = fin_order_string + "Chicken Biryani-" + String.valueOf(N_Veg.chicken_biryani) + ",";
        }
        if (N_Veg.daal_makhani> 0) {
            fin_order_string = fin_order_string + "Daal Makhani-" + String.valueOf(N_Veg.daal_makhani) + ",";
        }

        if (Veg.roti > 0) {
            fin_order_string = fin_order_string + "roti-" + String.valueOf(Veg.roti) + ",";
        }
        if (Veg.butter_roti > 0) {
            fin_order_string = fin_order_string + "butter roti-" + String.valueOf(Veg.butter_roti) + ",";
        }
        if (Veg.sabji_1 > 0) {
            fin_order_string = fin_order_string + "Sabji_1-" + String.valueOf(Veg.sabji_1) + ",";
        }

        if (Veg.veg_pulao > 0) {
            fin_order_string = fin_order_string + "veg pulao-" + String.valueOf(Veg.veg_pulao) + ",";
        }
        if (Veg.sabji_2> 0) {
            fin_order_string = fin_order_string + "Sabji_2-" + String.valueOf(Veg.sabji_2) + ",";
        }
        if (Veg.curd> 0) {
            fin_order_string = fin_order_string + "curd-" + String.valueOf(Veg.curd) + ",";
        }

        if (Veg.veg_fried_rice> 0) {
            fin_order_string = fin_order_string + "veg fried rice-" + String.valueOf(Veg.veg_fried_rice) + ",";
        }
        if (Veg.sambar> 0) {
            fin_order_string = fin_order_string + "Sambar-" + String.valueOf(Veg.sambar) + ",";
        }
        if (Veg.veg_biryani> 0) {
            fin_order_string = fin_order_string + "veg briyani-" + String.valueOf(Veg.veg_biryani) + ",";
        }

        if (Veg.tadka_daal> 0) {
            fin_order_string = fin_order_string + "Tadka Daal-" + String.valueOf(Veg.tadka_daal) + ",";
        }
        if (Starters.rava_idli > 0) {
            fin_order_string = fin_order_string + "Rava Idli-" + String.valueOf(Starters.rava_idli) + ",";
        }
        if (Starters.puri_sabji > 0) {
            fin_order_string = fin_order_string + "Puri Sabji-" + String.valueOf(Starters.puri_sabji) + ",";
        }
        if (Starters.bread_butter > 0) {
            fin_order_string = fin_order_string + "Bread Butter-" + String.valueOf(Starters.bread_butter) + ",";
        }
        if (Starters.poha > 0) {
            fin_order_string = fin_order_string + "Poha-" + String.valueOf(Starters.poha) + ",";
        }
        if (Starters.veg_soup > 0) {
            fin_order_string = fin_order_string + "veg soup-" + String.valueOf(Starters.veg_soup) + ",";
        }
        if (Starters.noodles > 0) {
            fin_order_string = fin_order_string + "Noodles-" + String.valueOf(Starters.noodles) + ",";
        }
        if (Starters.tomato_soup > 0) {
            fin_order_string = fin_order_string + "tomato soup-" + String.valueOf(Starters.tomato_soup) + ",";
        }
        if (Starters.idli_vadaa > 0) {
            fin_order_string = fin_order_string + "Idli Vadaa-" + String.valueOf(Starters.idli_vadaa) + ",";
        }
        if (Starters.masala_dosa > 0) {
            fin_order_string = fin_order_string + "Masala Dosa-" + String.valueOf(Starters.masala_dosa) + ",";
        }
        if (Starters.halwa > 0) {
            fin_order_string = fin_order_string + "Halwa-" + String.valueOf(Starters.halwa) + ",";
        }
        String temp_order_view=fin_order_string+old_ord_string;
        TextView tv = (TextView) findViewById(R.id.order_final);
        tv.setText("" + temp_order_view);
    }

    public void main_menu(View view) {
        Intent goto_main_menu = new Intent(this, Order_Type.class);
        startActivity(goto_main_menu);
        overridePendingTransition(R.anim.fadin, R.anim.fadout);
    }

    public void tot_v(){
        all_total=all_total+old_all_total;
        TextView tv = (TextView) findViewById(R.id.tot_p);
        tv.setText("total price:" + "₹" +(finalize_order.all_total));
    }



    public class SendMessage extends AsyncTask<Void, Void, Void> {
        BufferedReader bb;
        Socket client;
        PrintWriter printwriter;


        @Override
        protected Void doInBackground(Void... params) {
            try {
                client = new Socket("192.168.1.105", 4444); // connect to the server
                printwriter = new PrintWriter(client.getOutputStream(), true);
                bb=new BufferedReader(new InputStreamReader(client.getInputStream()));
                printwriter.println(finalize_order.messsage); // write the message to output stream
                printwriter.flush();
                m1=bb.readLine();
                //System.out.println("dd:"+m1);
                //m1="hello";
                bb.close();
                client.close(); // closing the connection
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public void send_ord(View v){
        order_string=fin_order_string;

        EditText Ed= (EditText) findViewById(R.id.personalp);

        personal_preferances=Ed.getText().toString();

        final Object o = this;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to confirm this order?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        messsage = "Order:" + SlimpleTextClientActivity.tablex + "|" + fin_order_string + "|" + Integer.toString(all_total)+"|"+personal_preferances;
                        ; // get the text message on the text field
                        // messsage = "Order:" + SlimpleTextClientActivity.tablex + "|" + fin_order_string + "|" + Integer.toString(all_total);
                        SendMessage sendMessageTask = new SendMessage();
                        sendMessageTask.execute();
                        Intent nextact = new Intent((finalize_order) o, thankyou.class);
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
}
