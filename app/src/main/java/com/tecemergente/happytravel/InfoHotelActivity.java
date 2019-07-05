package com.tecemergente.happytravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoHotelActivity extends AppCompatActivity {
    private int qt_quarto_1;
    private int qt_quarto_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hotel);

        qt_quarto_1 = 0;
        qt_quarto_2 = 0;

        //altera o texto da barra de título
        setTitle(R.string.hotel1_name);
    }

    public void addButton(View v){

        TextView qt1 = findViewById(R.id.qt_textView_1);
        TextView qt2 = findViewById(R.id.qt_textView_2);

        // Checa qual Button foi pressionado
        switch (v.getId()){
            case R.id.add_button_1:
                qt_quarto_1++;
                qt1.setText("" + qt_quarto_1);
                break;
            case R.id.add_button_2:
                qt_quarto_2++;
                qt2.setText("" + qt_quarto_2);
                break;
        }
    }

    public void subButton(View v){

        TextView qt1 = findViewById(R.id.qt_textView_1);
        TextView qt2 = findViewById(R.id.qt_textView_2);

        //Checa qual Button foi pressionado
        switch (v.getId()){
            case R.id.sub_button_1:
                if(qt_quarto_1 > 0){
                    qt_quarto_1--;
                    qt1.setText("" + qt_quarto_1);
                }
                break;
            case R.id.sub_button_2:
                if(qt_quarto_2 > 0) {
                    qt_quarto_2--;
                    qt2.setText("" + qt_quarto_2);
                }
                break;
        }
    }

}
