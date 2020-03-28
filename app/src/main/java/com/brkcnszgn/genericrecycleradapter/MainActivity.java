package com.brkcnszgn.genericrecycleradapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.brkcnszgn.genericrecycleradapter.v2.NewAdapter;
import com.brkcnszgn.genericrecycleradapter.v2.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);



        List<User> user =
                new ArrayList<>();
        User user3 = new User(0,"burak", "sezgin", true);

        User user2 = new User(1,"asdasdasd", "sezgin", false);

        User user4 = new User(1,"burak", "asdasdasd", true);

        User user5 = new User(0,"sasdsad", "asdasdas", false);


        user.add(user2);
       // user.add(user3);
      //  user.add(user4);
        user.add(user5);

        NewAdapter<User> baseAdapter = new NewAdapter<>(this, user);

        baseAdapter.addHolder(R.layout.row_item_layout, 0, new ISetItemView<User>() {
            @Override
            public void setItemView(View v, User item) {
            //    TextView tw1 = v.findViewById(R.id.txtT2);
                TextView tw2 = v.findViewById(R.id.txtTv1);

              //  tw1.setText(item.getName());
                tw2.setText(item.getSurname());
            }
        }, new IOnRecyclerViewItemClickListener<User>() {
            @Override
            public void onRecyclerItemListener(View v, User item) {
            }
        });

        baseAdapter.addHolder(R.layout.row_item_2, 1, new ISetItemView<User>() {
            @Override
            public void setItemView(View v, User item) {
                CheckBox cb = v.findViewById(R.id.chkRemember);

                cb.setChecked(item.isRememberMe());
            }
        }, new IOnRecyclerViewItemClickListener<User>() {
            @Override
            public void onRecyclerItemListener(View v, User item) {
            }
        });
//        BaseAdapter<String> baseAdapter = new BaseAdapter<String>(this, R.layout.row_item_layout, asd);
//
//        baseAdapter.setItemView(new ISetItemView<String>() {
//            @Override
//            public void setItemView(View v, String item) {
//                TextView itemView = v.findViewById(R.id.tvTest);
//                itemView.setText(item);
//            }
//        });
//
//        baseAdapter.setiOnRecyclerViewItemClickListener(new IOnRecyclerViewItemClickListener() {
//            @Override
//            public void onRecyclerItemListener(View v, Object item) {
//                //on click
//            }
//        });
//
        recyclerView.setAdapter(baseAdapter);
    }
}
