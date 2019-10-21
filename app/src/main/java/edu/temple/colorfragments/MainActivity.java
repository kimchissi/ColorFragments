package edu.temple.colorfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements PaletteFragment.OnFragmentInteractionListener {

    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Color Fragment Activity");
        Resources res = this.getResources();
        final String[] colors = res.getStringArray(R.array.color_array);
        final String[] colorsHex = res.getStringArray(R.array.color_hex_array);
        final Spinner spinner = findViewById(R.id.colorSpinner);
        final ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors, colorsHex);
        paletteFragment = PaletteFragment.newInstance(colors, colorsHex);
        getSupportFragmentManager().beginTransaction().add(R.id.mainLayout, paletteFragment).commit();
        //canvasFragment = CanvasFragment.newInstance();
    }

    @Override
    public void onFragmentInteraction(int position) {
        if (position > 0) {

        }
    }
}
