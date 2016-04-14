package klep.oksvas.base;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import klep.oksvas.R;

/**
 * Created by klep.io on 10.04.16 with love.
 */
public class CompileFragment extends Fragment {

    Ok ok;

    interface Ok {
        public void userRight();
    }

    @Bind(R.id.viewCode)
    TextView viewCode;

    @Bind(R.id.editCode)
    EditText editCode;

    @Bind(R.id.checkCode)
    Button checkCode;
    View view;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ok = (Ok)activity;
    }

    public static CompileFragment getInstance(Bundle bundle) {

        CompileFragment fragment = new CompileFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.compile, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        this.view = view;
        viewCode.setText(getArguments().getString("CODE"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.checkCode)
    public void checkCode() {
        String userCode = editCode.getText().toString().replaceAll("\\s+", "");
        String code = viewCode.getText().toString().replaceAll("\\s+", "");
        if (userCode.equals(code)) {
            ok.userRight();
        }
        else {
            Snackbar.make(view,"Ошибка! проверьте правильность ввода",Snackbar.LENGTH_SHORT).show();
        }
    }
}
