package com.anhhoang.knighthacks;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{
    HashMap<Card, Integer> cardMap = new HashMap<>();
    ImageButton buttonStart;
    ImageButton buttonCardShow1;
    ImageButton buttonCardShow2 ;
    ImageButton buttonCardShow3 ;
    ImageButton buttonCardShow4;
    TextView textViewScore;
    ProgressBar progressBar;
    ArrayList<Card> arrayListCard = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapStuff();
        initCard();
        buttonStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onProgressBarTime();
                Collections.shuffle(arrayListCard);
                buttonCardShow1.setImageBitmap(arrayListCard.get(0).getImage());
                buttonCardShow2.setImageBitmap(arrayListCard.get(1).getImage());
                buttonCardShow3.setImageBitmap(arrayListCard.get(2).getImage());
                buttonCardShow4.setImageBitmap(arrayListCard.get(3).getImage());
            }
        });

    }

    private void mapStuff()
    {
        buttonCardShow1 = findViewById(R.id.imageButton_cardShow_1);
        buttonCardShow2 = findViewById(R.id.imageButton_cardShow_2);
        buttonCardShow3 = findViewById(R.id.imageButton_cardShow_3);
        buttonCardShow4 = findViewById(R.id.imageButton_cardShow_4);
        progressBar = findViewById(R.id.progressBar);
        textViewScore = findViewById(R.id.textViewScore);
        buttonStart = findViewById(R.id.buttonStart);
    }

    private void onProgressBarTime()
    {
        CountDownTimer countDownTimer = new CountDownTimer(10000, 100)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                int curr = progressBar.getProgress();
                curr = curr + 1;
                if (curr == progressBar.getMax()) progressBar.setProgress(0);
                progressBar.setProgress(curr);
            }

            @Override
            public void onFinish()
            {
                progressBar.setProgress(0);
                this.start();
            }
        };
        countDownTimer.start();
    }

    public void initCard()
    {
        Bitmap card_2s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_2s);
        Bitmap card_3s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_3s);
        Bitmap card_4s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_4s);
        Bitmap card_5s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_5s);
        Bitmap card_6s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_6s);
        Bitmap card_7s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_7s);
        Bitmap card_8s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_8s);
        Bitmap card_9s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_9s);
        Bitmap card_10s = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_10s);
        Bitmap card_js = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_js);
        Bitmap card_qs = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_qs);
        Bitmap card_ks = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_ks);
        Bitmap card_as = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_as);

        Bitmap card_2h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_2h);
        Bitmap card_3h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_3h);
        Bitmap card_4h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_4h);
        Bitmap card_5h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_5h);
        Bitmap card_6h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_6h);
        Bitmap card_7h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_7h);
        Bitmap card_8h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_8h);
        Bitmap card_9h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_9h);
        Bitmap card_10h = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_10h);
        Bitmap card_jh = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_jh);
        Bitmap card_qh = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_qh);
        Bitmap card_kh = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_kh);
        Bitmap card_ah = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_ah);

        Bitmap card_2d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_2d);
        Bitmap card_3d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_3d);
        Bitmap card_4d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_4d);
        Bitmap card_5d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_5d);
        Bitmap card_6d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_6d);
        Bitmap card_7d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_7d);
        Bitmap card_8d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_8d);
        Bitmap card_9d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_9d);
        Bitmap card_10d = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_10d);
        Bitmap card_jd = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_jd);
        Bitmap card_qd = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_qd);
        Bitmap card_kd = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_kd);
        Bitmap card_ad = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_ad);

        Bitmap card_2c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_2c);
        Bitmap card_3c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_3c);
        Bitmap card_4c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_4c);
        Bitmap card_5c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_5c);
        Bitmap card_6c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_6c);
        Bitmap card_7c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_7c);
        Bitmap card_8c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_8c);
        Bitmap card_9c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_9c);
        Bitmap card_10c = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_10c);
        Bitmap card_jc = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_jc);
        Bitmap card_qc = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_qc);
        Bitmap card_kc = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_kc);
        Bitmap card_ac = BitmapFactory.decodeResource(this.getResources(), R.drawable.card_ac);

        Card two_of_spade = new Card("two_of_spade", card_2s, 2);
        Card three_of_spade = new Card("three_of_spade", card_3s, 3);
        Card four_of_spade = new Card("four_of_spade", card_4s, 4);
        Card five_of_spade = new Card("five_of_spade", card_5s, 5);
        Card six_of_spade = new Card("six_of_spade", card_6s, 6);
        Card seven_of_spade = new Card("seven_of_spade", card_7s, 7);
        Card eight_of_spade = new Card("eight_of_spade", card_8s, 8);
        Card nine_of_spade = new Card("nine_of_spade", card_9s, 9);
        Card ten_of_spade = new Card("ten_of_spade", card_10s, 10);
        Card jack_of_spade = new Card("jack_of_spade", card_js, 1);
        Card queen_of_spade = new Card("queen_of_spade", card_qs, 2);
        Card king_of_spade = new Card("king_of_spade", card_ks, 3);
        Card aces_of_spade = new Card("aces_of_spade", card_as, 1);

        cardMap.put(two_of_spade, two_of_spade.getCardNum());
        cardMap.put(three_of_spade, three_of_spade.getCardNum());
        cardMap.put(four_of_spade, four_of_spade.getCardNum());
        cardMap.put(five_of_spade, five_of_spade.getCardNum());
        cardMap.put(six_of_spade, six_of_spade.getCardNum());
        cardMap.put(seven_of_spade,seven_of_spade.getCardNum());
        cardMap.put(eight_of_spade,eight_of_spade.getCardNum());
        cardMap.put(nine_of_spade,nine_of_spade.getCardNum());
        cardMap.put(ten_of_spade,ten_of_spade.getCardNum());
        cardMap.put(jack_of_spade,jack_of_spade.getCardNum());
        cardMap.put(queen_of_spade,queen_of_spade.getCardNum());
        cardMap.put(king_of_spade,king_of_spade.getCardNum());
        cardMap.put(aces_of_spade,aces_of_spade.getCardNum());

        Card two_of_heart = new Card("two_of_heart", card_2h, 2);
        Card three_of_heart = new Card("three_of_heart", card_3h, 3);
        Card four_of_heart = new Card("four_of_heart", card_4h, 4);
        Card five_of_heart = new Card("five_of_heart", card_5h, 5);
        Card six_of_heart = new Card("six_of_heart", card_6h, 6);
        Card seven_of_heart = new Card("seven_of_heart", card_7h, 7);
        Card eight_of_heart = new Card("eight_of_heart", card_8h, 8);
        Card nine_of_heart = new Card("nine_of_heart", card_9h, 9);
        Card ten_of_heart = new Card("ten_of_heart", card_10h, 10);
        Card jack_of_heart = new Card("jack_of_heart", card_jh, 1);
        Card queen_of_heart = new Card("queen_of_heart", card_qh, 2);
        Card king_of_heart = new Card("king_of_heart", card_kh, 3);
        Card aces_of_heart = new Card("aces_of_heart", card_ah, 1);

        cardMap.put(two_of_heart, two_of_heart.getCardNum());
        cardMap.put(three_of_heart, three_of_heart.getCardNum());
        cardMap.put(four_of_heart, four_of_heart.getCardNum());
        cardMap.put(five_of_heart, five_of_heart.getCardNum());
        cardMap.put(six_of_heart, six_of_heart.getCardNum());
        cardMap.put(seven_of_heart,seven_of_heart.getCardNum());
        cardMap.put(eight_of_heart,eight_of_heart.getCardNum());
        cardMap.put(nine_of_heart,nine_of_heart.getCardNum());
        cardMap.put(ten_of_heart,ten_of_heart.getCardNum());
        cardMap.put(jack_of_heart,jack_of_heart.getCardNum());
        cardMap.put(queen_of_heart,queen_of_heart.getCardNum());
        cardMap.put(king_of_heart,king_of_heart.getCardNum());
        cardMap.put(aces_of_heart,aces_of_heart.getCardNum());

        Card two_of_diamond = new Card("two_of_diamond", card_2d, 2);
        Card three_of_diamond = new Card("three_of_diamond", card_3d, 3);
        Card four_of_diamond = new Card("four_of_diamond", card_4d, 4);
        Card five_of_diamond = new Card("five_of_diamond", card_5d, 5);
        Card six_of_diamond = new Card("six_of_diamond", card_6d, 6);
        Card seven_of_diamond = new Card("seven_of_diamond", card_7d, 7);
        Card eight_of_diamond = new Card("eight_of_diamond", card_8d, 8);
        Card nine_of_diamond = new Card("nine_of_diamond", card_9d, 9);
        Card ten_of_diamond = new Card("ten_of_diamond", card_10d, 10);
        Card jack_of_diamond = new Card("jack_of_diamond", card_jd, 1);
        Card queen_of_diamond = new Card("queen_of_diamond", card_qd, 2);
        Card king_of_diamond = new Card("king_of_diamond", card_kd, 3);
        Card aces_of_diamond = new Card("aces_of_diamond", card_ad, 1);

        cardMap.put(two_of_diamond, two_of_diamond.getCardNum());
        cardMap.put(three_of_diamond, three_of_diamond.getCardNum());
        cardMap.put(four_of_diamond, four_of_diamond.getCardNum());
        cardMap.put(five_of_diamond, five_of_diamond.getCardNum());
        cardMap.put(six_of_diamond, six_of_diamond.getCardNum());
        cardMap.put(seven_of_diamond,seven_of_diamond.getCardNum());
        cardMap.put(eight_of_diamond,eight_of_diamond.getCardNum());
        cardMap.put(nine_of_diamond,nine_of_diamond.getCardNum());
        cardMap.put(ten_of_diamond,ten_of_diamond.getCardNum());
        cardMap.put(jack_of_diamond,jack_of_diamond.getCardNum());
        cardMap.put(queen_of_diamond,queen_of_diamond.getCardNum());
        cardMap.put(king_of_diamond,king_of_diamond.getCardNum());
        cardMap.put(aces_of_diamond,aces_of_diamond.getCardNum());

        Card two_of_clubs = new Card("two_of_clubs", card_2c, 2);
        Card three_of_clubs = new Card("three_of_clubs", card_3c, 3);
        Card four_of_clubs = new Card("four_of_clubs", card_4c, 4);
        Card five_of_clubs = new Card("five_of_clubs", card_5c, 5);
        Card six_of_clubs = new Card("six_of_clubs", card_6c, 6);
        Card seven_of_clubs = new Card("seven_of_clubs", card_7c, 7);
        Card eight_of_clubs = new Card("eight_of_clubs", card_8c, 8);
        Card nine_of_clubs = new Card("nine_of_clubs", card_9c, 9);
        Card ten_of_clubs = new Card("ten_of_clubs", card_10c, 10);
        Card jack_of_clubs = new Card("jack_of_clubs", card_jc, 1);
        Card queen_of_clubs = new Card("queen_of_clubs", card_qc, 2);
        Card king_of_clubs = new Card("king_of_clubs", card_kc, 3);
        Card aces_of_clubs = new Card("aces_of_clubs", card_ac, 1);

        cardMap.put(two_of_clubs, two_of_clubs.getCardNum());
        cardMap.put(three_of_clubs, three_of_clubs.getCardNum());
        cardMap.put(four_of_clubs, four_of_clubs.getCardNum());
        cardMap.put(five_of_clubs, five_of_clubs.getCardNum());
        cardMap.put(six_of_clubs, six_of_clubs.getCardNum());
        cardMap.put(seven_of_clubs,seven_of_clubs.getCardNum());
        cardMap.put(eight_of_clubs,eight_of_clubs.getCardNum());
        cardMap.put(nine_of_clubs,nine_of_clubs.getCardNum());
        cardMap.put(ten_of_clubs,ten_of_clubs.getCardNum());
        cardMap.put(jack_of_clubs,jack_of_clubs.getCardNum());
        cardMap.put(queen_of_clubs,queen_of_clubs.getCardNum());
        cardMap.put(king_of_clubs,king_of_clubs.getCardNum());
        cardMap.put(aces_of_clubs,aces_of_spade.getCardNum());
        Iterator it = cardMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            arrayListCard.add((Card) pair.getKey());
        }
    }
}
