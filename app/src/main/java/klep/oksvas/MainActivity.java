package klep.oksvas;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

import java.util.ArrayList;

import klep.oksvas.base.BaseFragment;

public class MainActivity extends FragmentActivity implements BaseFragment.Callback {


    public static final String LIT = "Lit";
    //    private String one = "file:///android_asset/four.html";
    private ArrayList<String> html;
    WebView webView;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        html = new ArrayList<>();


        html.add("file:///android_asset/first.html");
        html.add("file:///android_asset/two.html");
        html.add("file:///android_asset/three.html");
        html.add("file:///android_asset/four.html");
        html.add("file:///android_asset/five.html");
//        html.add("file:///android_asset/six.html");
//        html.add("file:///android_asset/seven.html");
//        html.add("file:///android_asset/eight.html");
//        html.add("file:///android_asset/nine.html");
//        html.add("file:///android_asset/ten.html");

        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.place, new BaseFragment(), LIT)
                .commit();
    }


    @Override
    public void loadSuccess() {

        Fragment fragment = getFragment();
        ((BaseFragment) fragment).load(html.get(0));
    }

    @Override
    public void next(String url) {
        try {


            for (int i = 0; i < html.size(); i++) {
                if (html.get(i).equals(url)) {
                    ((BaseFragment) getFragment()).load(html.get(i + 1));
                    Snackbar.make(((BaseFragment) getFragment()).getViewFragment(), i + 1 + " из " + 4, Snackbar.LENGTH_SHORT).show();
                }
            }
        } catch (IndexOutOfBoundsException e) {
            Toast.makeText(this, "Нет новых уроков", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void back(String url) {
        try {
            for (int i = 0; i < html.size(); i++) {
                if (html.get(i).equals(url)) {
                    ((BaseFragment) getFragment()).load(html.get(i - 1));
                    Snackbar.make(((BaseFragment) getFragment()).getViewFragment(), i - 1 + " из " + 9, Snackbar.LENGTH_SHORT).show();

                }
            }
        } catch (IndexOutOfBoundsException e) {
            Toast.makeText(this, "Первый Урок", Toast.LENGTH_SHORT).show();
        }
    }


    private Fragment getFragment() {
        return getFragmentManager().findFragmentByTag(LIT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("sda","sda");
    }
}

