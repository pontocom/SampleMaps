package pt.iscte_iul.samplemaps;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleMapOpen(View v) {
        startActivity(new Intent(MainActivity.this, SimpleMapActivity.class));
    }

    public void positionAndZoomOpen(View v) {
        startActivity(new Intent(MainActivity.this, PositionAndZoomActivity.class));
    }

    public void changeMapTypeOpen(View v) {
        startActivity(new Intent(MainActivity.this, ChangeMapTypeActivity.class));
    }

    public void indoorMapsOpen(View v) {
        startActivity(new Intent(MainActivity.this, IndoorMapsActivity.class));
    }

    public void cameraAnimationOpen(View v) {
        startActivity(new Intent(MainActivity.this, CameraAnimationActivity.class));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
