package klep.oksvas.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import klep.oksvas.DB.Code;
import klep.oksvas.R;

/**
 * Created by klep.io on 10.03.16.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {
    WebView webView;
    Button back;
    Button next;
    private String name;
    public Callback callback;
    private View v;


    public interface Callback {
        void loadSuccess();

        void next(String html);

        void back(String html);
    }

    ;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callback = (Callback) activity;
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.farg, container, false);
        webView = (WebView) v.findViewById(R.id.webView);
        back = (Button) v.findViewById(R.id.back);
        next = (Button) v.findViewById(R.id.next);

        webView.setWebViewClient(new OverrideWebView());
        back.setOnClickListener(this);
        next.setOnClickListener(this);
        callback.loadSuccess();

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                callback.back(name);
                break;
            case R.id.next:
                callback.next(name);
                break;
        }
    }

    public void load(String name) {
        this.name = name;
        webView.loadUrl(name);
    }

    public View getViewFragment() {
        return v;
    }

    private class OverrideWebView extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intent intent = new Intent(getActivity(), ActivityCompile.class);

            switch (url.split("/")[4]) {
                case "1_1":
                    intent.putExtra("CODE", Code.oneOne);
                    break;

                case "2_1":
                    intent.putExtra("CODE", Code.twoOne);
                    break;

                case "2_2":
                    intent.putExtra("CODE", Code.twoTwo);
                    break;

                case "2_3":
                    intent.putExtra("CODE", Code.twoThree);
                    break;

                case "2_4":
                    intent.putExtra("CODE", Code.twoFour);
                    break;

                case "3_1":
                    intent.putExtra("CODE", Code.threeOne);
                    break;

                case "4_1":
                    intent.putExtra("CODE", Code.fourOne);
                    break;

                case "5_1":
                    intent.putExtra("CODE", Code.fiveOne);
                    break;

                case "5_2":
                    intent.putExtra("CODE", Code.fiveTwo);
                    break;

            }

            getActivity().startActivityForResult(intent, 1488);

            return true;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
