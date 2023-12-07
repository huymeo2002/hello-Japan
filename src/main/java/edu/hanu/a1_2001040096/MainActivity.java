package edu.hanu.a1_2001040096;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //switch charts
        TextView textView = (TextView)findViewById(R.id.textView);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        Button buttonHira = (Button)findViewById(R.id.buttonHira);
        Button buttonKata = (Button)findViewById(R.id.buttonKata);

        buttonHira.setOnClickListener(view -> {
            textView.setText("Hiragana");
            imageView.setImageResource(R.drawable.hiragana);
        });

        buttonKata.setOnClickListener(view -> {
            textView.setText("Katakana");
            imageView.setImageResource(R.drawable.katakana);
        });

        //play media
        MediaPlayer amp = MediaPlayer.create(this, R.raw.a);
        Button a = (Button) findViewById(R.id.a);
        a.setOnClickListener(view -> amp.start());

        MediaPlayer imp = MediaPlayer.create(this, R.raw.i);
        Button i = (Button) findViewById(R.id.i);
        i.setOnClickListener(view -> imp.start());

        MediaPlayer ump = MediaPlayer.create(this, R.raw.u);
        Button u = (Button) findViewById(R.id.u);
        u.setOnClickListener(view -> ump.start());

        MediaPlayer emp = MediaPlayer.create(this, R.raw.e);
        Button e = (Button) findViewById(R.id.e);
        e.setOnClickListener(view -> emp.start());

        MediaPlayer omp = MediaPlayer.create(this, R.raw.o);
        Button o = (Button) findViewById(R.id.o);
        o.setOnClickListener(view -> omp.start());

        MediaPlayer kamp = MediaPlayer.create(this, R.raw.ka);
        Button ka = (Button) findViewById(R.id.ka);
        ka.setOnClickListener(view -> kamp.start());

        MediaPlayer kimp = MediaPlayer.create(this, R.raw.ki);
        Button ki = (Button) findViewById(R.id.ki);
        ki.setOnClickListener(view -> kimp.start());

        MediaPlayer kump = MediaPlayer.create(this, R.raw.ku);
        Button ku = (Button) findViewById(R.id.ku);
        ku.setOnClickListener(view -> kump.start());

        MediaPlayer kemp = MediaPlayer.create(this, R.raw.ke);
        Button ke = (Button) findViewById(R.id.ke);
        ke.setOnClickListener(view -> kemp.start());

        MediaPlayer komp = MediaPlayer.create(this, R.raw.ko);
        Button ko = (Button) findViewById(R.id.ko);
        ko.setOnClickListener(view -> komp.start());

        MediaPlayer samp = MediaPlayer.create(this, R.raw.sa);
        Button sa = (Button) findViewById(R.id.sa);
        sa.setOnClickListener(view -> samp.start());

        MediaPlayer shimp = MediaPlayer.create(this, R.raw.shi);
        Button shi = (Button) findViewById(R.id.shi);
        shi.setOnClickListener(view -> shimp.start());

        MediaPlayer sump = MediaPlayer.create(this, R.raw.su);
        Button su = (Button) findViewById(R.id.su);
        su.setOnClickListener(view -> sump.start());

        MediaPlayer semp = MediaPlayer.create(this, R.raw.se);
        Button se = (Button) findViewById(R.id.se);
        se.setOnClickListener(view -> semp.start());

        MediaPlayer somp = MediaPlayer.create(this, R.raw.so);
        Button so = (Button) findViewById(R.id.so);
        so.setOnClickListener(view -> somp.start());

        MediaPlayer tamp = MediaPlayer.create(this, R.raw.ta);
        Button ta = (Button) findViewById(R.id.ta);
        ta.setOnClickListener(view -> tamp.start());

        MediaPlayer chimp = MediaPlayer.create(this, R.raw.chi);
        Button chi = (Button) findViewById(R.id.chi);
        chi.setOnClickListener(view -> chimp.start());

        MediaPlayer tsump = MediaPlayer.create(this, R.raw.tsu);
        Button tsu = (Button) findViewById(R.id.tsu);
        tsu.setOnClickListener(view -> tsump.start());

        MediaPlayer temp = MediaPlayer.create(this, R.raw.te);
        Button te = (Button) findViewById(R.id.te);
        te.setOnClickListener(view -> temp.start());

        MediaPlayer tomp = MediaPlayer.create(this, R.raw.to);
        Button to = (Button) findViewById(R.id.to);
        to.setOnClickListener(view -> tomp.start());

        MediaPlayer namp = MediaPlayer.create(this, R.raw.na);
        Button na = (Button) findViewById(R.id.na);
        na.setOnClickListener(view -> namp.start());

        MediaPlayer nimp = MediaPlayer.create(this, R.raw.ni);
        Button ni = (Button) findViewById(R.id.ni);
        ni.setOnClickListener(view -> nimp.start());

        MediaPlayer nump = MediaPlayer.create(this, R.raw.nu);
        Button nu = (Button) findViewById(R.id.nu);
        nu.setOnClickListener(view -> nump.start());

        MediaPlayer nemp = MediaPlayer.create(this, R.raw.ne);
        Button ne = (Button) findViewById(R.id.ne);
        ne.setOnClickListener(view -> nemp.start());

        MediaPlayer nomp = MediaPlayer.create(this, R.raw.no);
        Button no = (Button) findViewById(R.id.no);
        no.setOnClickListener(view -> nomp.start());

        MediaPlayer hamp = MediaPlayer.create(this, R.raw.ha);
        Button ha = (Button) findViewById(R.id.ha);
        ha.setOnClickListener(view -> hamp.start());

        MediaPlayer himp = MediaPlayer.create(this, R.raw.hi);
        Button hi = (Button) findViewById(R.id.hi);
        hi.setOnClickListener(view -> himp.start());

        MediaPlayer fump = MediaPlayer.create(this, R.raw.fu);
        Button fu = (Button) findViewById(R.id.fu);
        fu.setOnClickListener(view -> fump.start());

        MediaPlayer hemp = MediaPlayer.create(this, R.raw.he);
        Button he = (Button) findViewById(R.id.he);
        he.setOnClickListener(view -> hemp.start());

        MediaPlayer homp = MediaPlayer.create(this, R.raw.ho);
        Button ho = (Button) findViewById(R.id.ho);
        ho.setOnClickListener(view -> homp.start());

        MediaPlayer mamp = MediaPlayer.create(this, R.raw.ma);
        Button ma = (Button) findViewById(R.id.ma);
        ma.setOnClickListener(view -> mamp.start());

        MediaPlayer mimp = MediaPlayer.create(this, R.raw.mi);
        Button mi = (Button) findViewById(R.id.mi);
        mi.setOnClickListener(view -> mimp.start());

        MediaPlayer mump = MediaPlayer.create(this, R.raw.mu);
        Button mu = (Button) findViewById(R.id.mu);
        mu.setOnClickListener(view -> mump.start());

        MediaPlayer memp = MediaPlayer.create(this, R.raw.me);
        Button me = (Button) findViewById(R.id.me);
        me.setOnClickListener(view -> memp.start());

        MediaPlayer momp = MediaPlayer.create(this, R.raw.mo);
        Button mo = (Button) findViewById(R.id.mo);
        mo.setOnClickListener(view -> momp.start());

        MediaPlayer ramp = MediaPlayer.create(this, R.raw.ra);
        Button ra = (Button) findViewById(R.id.ra);
        ra.setOnClickListener(view -> ramp.start());

        MediaPlayer rimp = MediaPlayer.create(this, R.raw.ri);
        Button ri = (Button) findViewById(R.id.ri);
        ri.setOnClickListener(view -> rimp.start());

        MediaPlayer rump = MediaPlayer.create(this, R.raw.ru);
        Button ru = (Button) findViewById(R.id.ru);
        ru.setOnClickListener(view -> rump.start());

        MediaPlayer remp = MediaPlayer.create(this, R.raw.re);
        Button re = (Button) findViewById(R.id.re);
        re.setOnClickListener(view -> remp.start());

        MediaPlayer romp = MediaPlayer.create(this, R.raw.ro);
        Button ro = (Button) findViewById(R.id.ro);
        ro.setOnClickListener(view -> romp.start());

        MediaPlayer yamp = MediaPlayer.create(this, R.raw.ya);
        Button ya = (Button) findViewById(R.id.ya);
        ya.setOnClickListener(view -> yamp.start());

        MediaPlayer yump = MediaPlayer.create(this, R.raw.yu);
        Button yu = (Button) findViewById(R.id.yu);
        yu.setOnClickListener(view -> yump.start());

        MediaPlayer yomp = MediaPlayer.create(this, R.raw.yo);
        Button yo = (Button) findViewById(R.id.yo);
        yo.setOnClickListener(view -> yomp.start());

        MediaPlayer wamp = MediaPlayer.create(this, R.raw.wa);
        Button wa = (Button) findViewById(R.id.wa);
        wa.setOnClickListener(view -> wamp.start());

        MediaPlayer womp = MediaPlayer.create(this, R.raw.wo);
        Button wo = (Button) findViewById(R.id.wo);
        wo.setOnClickListener(view -> womp.start());

        MediaPlayer nmp = MediaPlayer.create(this, R.raw.n);
        Button n = (Button) findViewById(R.id.n);
        n.setOnClickListener(view -> nmp.start());

    }
}