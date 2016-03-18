package com.example.pangxiezi.single.ui.activity;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class VideoActivity extends BaseActivity {

    TextView pulltolist;
    TextView pulltolist1;
    /*
   List<HomeDataEntity> list = new ArrayList<>();
    Context context;
    VideoAdapter adapter;
    PagePresenterImpl presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
       pulltolist = (PullToRefreshListView) findViewById(R.id.pulllist);
        init();
        context = this;
    }

    private void init() {
        initData();
        initView();
    }

    private void initView() {
        pulltolist.setMode(PullToRefreshBase.Mode.PULL_FROM_START);
        pulltolist.setOnRefreshListener(this);
        adapter = new VideoAdapter(list,this);
        pulltolist.setAdapter(adapter);

    }

    private void initData() {
        presenter=new PagePresenterImpl(1,2,0,0,this);
        presenter.getEntityData();

    }

    @Override
    public void getData(HomeEntity entity) {
        list.addAll(entity.getDatas());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void shoeError() {
        Toast.makeText(this,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onRefresh(PullToRefreshBase<ListView> refreshView) {
        presenter=new PagePresenterImpl(1,2,0,0,this);
    }*/
}
