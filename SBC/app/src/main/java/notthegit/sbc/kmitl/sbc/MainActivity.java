package notthegit.sbc.kmitl.sbc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String id = "132323"; //เลขบัญชี
        float money = 10; //เงิน

        TextView idtextview = (TextView) findViewById(R.id.idtextView);
        TextView moneytextview = (TextView) findViewById(R.id.moneytextView);
        idtextview.setText(id);
        moneytextview.setText(String.valueOf(money));
    }

    private void viewFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentlayout, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void onClick(View view){
        if (view == findViewById(R.id.ouracc)) {
            viewFragment(new Ouracc());
        } else if (view == findViewById(R.id.otheracc)) {
            viewFragment(new Otheracc());
        } else if (view == findViewById(R.id.payfrag)){
            viewFragment(new Payfrag());
        }
    }
}
