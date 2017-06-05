package com.example.nishant.cards;

import android.content.Context;
import android.preference.SwitchPreference;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button shuffleBtn;
    private Button dealonecardBtn;
    String cardnumber;
    int count = 1;
    Toast toast1;
    Toast toast2;
    Random rand = new Random();
    public static int[] cards = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
                                 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =(ImageView)findViewById(R.id.card_image);
        shuffleBtn = (Button) findViewById(R.id.shuffle_btn);
        dealonecardBtn =(Button)findViewById(R.id.dealonecard_btn);

        Context context = getApplicationContext();
        CharSequence text1 = "CARDS SHUFFLED";
        CharSequence text2 = "ALL CARDS OVER, RESHUFFLE AND PLAY AGAIN";
        int duration = Toast.LENGTH_SHORT;
        toast1= Toast.makeText(context, text1, duration);
        toast2= Toast.makeText(context, text2, duration);


        shuffleBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             callShuffle();
            }
        });


        dealonecardBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            callDealOne();
            }
        });
    }


    public void callShuffle()
    {

        int n = cards.length-1;
        for (int i = n; i >= 1; i--)
        {
            // Pick a random index from 0 to i
            int j = rand.nextInt(n)+1;

            // Swap arr[i] with the element at random index
            swap(i, j);
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.letsplay));
        toast1.show();

    }

    public void callDealOne()
    {
      if(count < 52) {
          switch (cards[count])
          {
              case 1:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a1));
                  break;
              case 2:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a2));
                  break;
              case 3:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a3));
                  break;
              case 4:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a4));
              break;
              case 5:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a5));
              break;
              case 6:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a6));
              break;
              case 7:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a7));
                  break;
              case 8:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a8));
                  break;
              case 9:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a9));
                  break;
              case 10:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a10));
                  break;
              case 11:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a11));
                  break;
              case 12:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a12));
                  break;
              case 13:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a13));
                  break;
              case 14:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a14));
                  break;
              case 15:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a15));
                  break;
              case 16:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a16));
                  break;
              case 17:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a17));
                  break;
              case 18:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a18));
                  break;
              case 19:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a19));
                  break;
              case 20:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a20));
                  break;
              case 21:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a21));
                  break;
              case 22:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a22));
                  break;
              case 23:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a23));
                  break;
              case 24:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a24));
                  break;
              case 25:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a25));
                  break;
              case 26:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a26));
                  break;
              case 27:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a27));
                  break;
              case 28:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a28));
                  break;
              case 29:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a29));
                  break;
              case 30:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a30));
                  break;
              case 31:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a31));
                  break;
              case 32:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a32));
                  break;
              case 33:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a33));
                  break;
              case 34:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a34));
                  break;
              case 35:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a35));
                  break;
              case 36:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a36));
                  break;
              case 37:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a37));
                  break;
              case 38:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a38));
                  break;
              case 39:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a39));
                  break;
              case 40:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a40));
                  break;
              case 41:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a41));
                  break;
              case 42:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a42));
                  break;
              case 43:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a43));
                  break;
              case 44:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a44));
                  break;
              case 45:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a45));
                  break;
              case 46:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a46));
                  break;
              case 47:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a47));
                  break;
              case 48:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a48));
                  break;
              case 49:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a49));
                  break;
              case 50:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a50));
                  break;
              case 51:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a51));
                  break;
              case 52:
                  imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.a52));
                  break;
          }
          count++;
      }
      else {
          toast2.show();
          imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.letsplay));
      }


    }


    public void swap(int i, int j)
    {
     int temp = cards[i];
        cards[i]= cards[j];
        cards[j]= temp;
    }

}
