package klep.oksvas.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import klep.oksvas.R;

/**
 * Created by klep.io on 11.04.16 with love.
 */
public class ActivityCompile extends FragmentActivity implements CompileFragment.Ok{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compile);

        Bundle bundle = getIntent().getExtras();

        getFragmentManager().beginTransaction()
                .replace(R.id.place, CompileFragment.getInstance(bundle))
                .commit();
    }

    @Override
    public void userRight() {

        finish();
    }
}
