package net.orangehat.myappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * Called when the user touches the button
     */
    public void sendMessage(View view) {

        int id = view.getId();
        if (id == R.id.firstpage_button_1) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_1));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
//            R.string.firstpage_button_1
        }
        if (id == R.id.firstpage_button_2) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_2));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        if (id == R.id.firstpage_button_3) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_3));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if (id == R.id.firstpage_button_4) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_4));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        if (id == R.id.firstpage_button_5) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_5));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        if (id == R.id.firstpage_button_6) {
            Context context = getApplicationContext();
            Resources resources = getResources();
            CharSequence text = String.format(resources.getString(R.string.toast_message),resources.getString(R.string.firstpage_button_6));
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        // Do something in response to button click
    }

}
