package com.example.pangxiezi.single.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pangxiezi.single.R;
import com.example.pangxiezi.single.api.ApiConstant;
import com.example.pangxiezi.single.bean.PageDataEntity;
import com.example.pangxiezi.single.bean.PageEntity;
import com.example.pangxiezi.single.presenter.impl.PagePresenterImpl;
import com.example.pangxiezi.single.ui.adapter.DateAdapter;
import com.example.pangxiezi.single.view.PageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DateActivity extends BaseActivity implements PageView, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {

    @Bind(R.id.mylist_date)
    ListView listView;
    private PagePresenterImpl presenter;
    private DateAdapter adapter;
    private List<PageDataEntity> datas = new ArrayList<PageDataEntity>();
    private int mFirstVisibleItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        initData();
        initView();
    }

    private void initView() {
        adapter = new DateAdapter(this,datas,listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);

    }

    private void initData() {
        presenter = new PagePresenterImpl(1,4,0,0,this);
        presenter.getEntityData();
    }

    @Override
    public void getData(PageEntity entity) {
        datas.addAll(entity.getDatas());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void shoeError() {
        Toast.makeText(this,"网络有问题",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,WebActivity.class);
        intent.putExtra(ApiConstant.DefaultKey.HTML_KEY,datas.get(position).getHtml5());
        startActivity(intent);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if(scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE){
            //获取第一个item的top
            int top= getSScrollY();
            if (top == 0)
                return;
            //绝对值不为0时，如果绝对值大于mItemHeight的一半，则收缩，即显示下一个Item
            if(Math.abs(top) > 300){
                listView.setSelection(mFirstVisibleItem + 1);
            }
            else //绝对值不为0时，如果绝对值小于于mItemHeight的一半，则展开，显示当前完整的Item
            {
                listView.setSelection(mFirstVisibleItem);
            }
        }

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        mFirstVisibleItem = listView.getFirstVisiblePosition();
    }
    public int getSScrollY() {
        View c = listView.getChildAt(0);
        if (c == null) {
            return 0;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int top = c.getTop();
        return -top + firstVisiblePosition * c.getHeight() ;
    }
}
