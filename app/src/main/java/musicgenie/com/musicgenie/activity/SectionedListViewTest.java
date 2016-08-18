package musicgenie.com.musicgenie.activity;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import musicgenie.com.musicgenie.R;
import musicgenie.com.musicgenie.adapters.TrendingItemsGridAdapter;
import musicgenie.com.musicgenie.models.TrendingSongModel;
import musicgenie.com.musicgenie.utilities.FontManager;

public class SectionedListViewTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trending_layout);

        // test data
        ArrayList<TrendingSongModel> list = new ArrayList<>();
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));
        list.add(new TrendingSongModel("Sanam Re","03:15","ankit","","","","100,000",""));

        GridView trendingGrid = (GridView) findViewById(R.id.gridView);
        TrendingItemsGridAdapter adapter = TrendingItemsGridAdapter.getInstance(this);
        adapter.setTrendingItems(list);
        trendingGrid.setAdapter(adapter);

    }

    private void init() {

        Typeface fontawesome = FontManager.getInstance(this).getTypeFace(FontManager.FONT_AWESOME);
        Typeface ralewayTf = FontManager.getInstance(this).getTypeFace(FontManager.FONT_RALEWAY_REGULAR);
        // material
        TextView downloadBtn = (TextView) findViewById(R.id.download_btn_card);
        TextView uploader_icon = (TextView) findViewById(R.id.uploader_icon);
        TextView views_icon = (TextView) findViewById(R.id.views_icon);
        downloadBtn.setTypeface(fontawesome);
        uploader_icon.setTypeface(fontawesome);
        views_icon.setTypeface(fontawesome);

        // regular raleway
        TextView content_length = (TextView) findViewById(R.id.song_time_length);
        TextView uploader = (TextView) findViewById(R.id.uploader_name);
        TextView views = (TextView) findViewById(R.id.views_text);
        content_length.setTypeface(ralewayTf);
        uploader.setTypeface(ralewayTf);
        views.setTypeface(ralewayTf);
        // plain text
        TextView popMenuBtn = (TextView) findViewById(R.id.popUpMenuIcon);



    }


}
