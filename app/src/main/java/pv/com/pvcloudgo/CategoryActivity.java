package pv.com.pvcloudgo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CategoryActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_title)
    TextView toolbarTitle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ButterKnife.bind(this);


        initToolBar();

    }


    private void initToolBar() {
        setupToolbar(toolbar, true);

        toolbarTitle.setText("全部分类");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }

}
