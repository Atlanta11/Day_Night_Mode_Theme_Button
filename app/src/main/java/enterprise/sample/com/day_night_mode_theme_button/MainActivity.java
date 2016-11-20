package enterprise.sample.com.day_night_mode_theme_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Button daybutton,nightbutton ;
    ImageView imageView ;
    RelativeLayout relativeLayout ;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daybutton = (Button)findViewById(R.id.button);

        nightbutton = (Button)findViewById(R.id.button2);

        imageView = (ImageView)findViewById(R.id.imageview1);

        relativeLayout = (RelativeLayout)findViewById(R.id.activity_main);

        daybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DayThemeMode();

            }
        });



        nightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NightThemeMode();

            }
        });
    }

    public void DayThemeMode(){

        handler = new Handler();

        imageView.setImageResource(R.drawable.o_43658);

        imageView.setVisibility(View.VISIBLE);

        relativeLayout.setBackgroundColor(getResources().getColor(R.color.dayBackground));

        runnable = new Runnable() {

            @Override
            public void run() {

                //Hiding image after 4 seconds

                imageView.setVisibility(View.INVISIBLE);

            }
        };
        handler.postDelayed(runnable, 4000);

    }

    public void NightThemeMode(){

        handler = new Handler();

        imageView.setImageResource(R.drawable.d1_moon);

        imageView.setVisibility(View.VISIBLE);

        relativeLayout.setBackgroundColor(getResources().getColor(R.color.nightBackground));

        runnable = new Runnable() {

            @Override
            public void run() {

                //Hiding image after 4 seconds

                imageView.setVisibility(View.INVISIBLE);

            }
        };
        handler.postDelayed(runnable, 4000);

    }
}
