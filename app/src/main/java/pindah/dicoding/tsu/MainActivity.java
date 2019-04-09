package pindah.dicoding.tsu;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};


    ViewPager viewPager;
    List<ModelPager> models;
    AdapterPager adapterPager;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new ModelPager(R.drawable.brochure, "Brocure", "Brocure blabla blabla blabla blablabla blablabla blablabla blablabla"));
        models.add(new ModelPager(R.drawable.sticker, "Sticker", "Sticker blabla blabla blabla blablabla blablabla blablabla blablabla"));
        models.add(new ModelPager(R.drawable.poster, "Poster", "Poster blabla blabla blabla blablabla blablabla blablabla blablabla"));
        models.add(new ModelPager(R.drawable.namecard, "Namecard", "Namecard blabla blabla blabla blablabla blablabla blablabla blablabla"));

        adapterPager = new AdapterPager(models,this);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapterPager);
        viewPager.setPadding(130,0,130,0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
    public void programmer(View view){
        Intent intent = new Intent(this, ProgrammerActivity.class);
        startActivity(intent);
    }

    public void designer(View view){
        Intent intent = new Intent(this, DesignerActivity.class);
        startActivity(intent);
    }

    public void database(View view){
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void sys(View view){
        Intent intent = new Intent(this, SysActivity.class);
        startActivity(intent);
    }

    public void cloud(View view){
        Intent intent = new Intent(this, CloudActivity.class);
        startActivity(intent);
    }

    public void websecur(View view){
        Intent intent = new Intent(this, WebsecurActivity.class);
        startActivity(intent);
    }
}
