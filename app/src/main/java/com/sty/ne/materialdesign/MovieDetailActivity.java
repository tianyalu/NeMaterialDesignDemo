package com.sty.ne.materialdesign;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.sty.ne.materialdesign.utils.AppBarStateChangeEvent;

/**
 * Created by tian on 2019/10/19.
 */

public class MovieDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);


        String url = getIntent().getStringExtra("URL");
        String name = getIntent().getStringExtra("NAME");

        final Toolbar toolbar = findViewById(R.id.tb_amd_toolbar);
        if (toolbar != null) {
            toolbar.setTitle(name);
            setSupportActionBar(toolbar);
        }

        //使用CollapsingToolbarLayout必须把title设置到CollapsingToolbarLayout上，设置到Toolbar上则不会显示
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle("CollapsingToolbarLayout");
        //通过CollapsingToolbarLayout修改字体颜色
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);//设置还没收缩时状态下字体颜色
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.BLACK);//设置收缩后Toolbar上字体的颜色

        AppBarLayout appBarLayout = findViewById(R.id.appBar);

        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeEvent() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeEvent.State state, int verticalOffset) {
                if (toolbar == null) return;
                if (state == AppBarStateChangeEvent.State.COLLAPSED){
                    toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }else{
                    toolbar.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });

        ImageView iv = findViewById(R.id.iv_movie_icon);
        iv.setImageResource(R.mipmap.time);

        TextView tv = findViewById(R.id.tv_content);
        tv.setText(
                "　深圳的九月其实和八月是没有任何区别的，深南大道上把公交当宝马开的司机没有，楼下的士多店那个永远不会笑的靓仔没有，包括路上的行人都似乎无增无减。但我还是发现了，新碧水薄防晒露比上个月上涨了三块钱，一直吃的那家酸辣粉某天从五块变成了六块钱一碗。还有某个一直活跃在八点档的明星突然跳楼了，一直路过的某个路口悄然多出了一家奶茶店。\n" +
                        "　　我觉得我象活在温水里的青蛙，慢慢的慢慢的被生活就煮熟了，或者熟了也好，起码不再受罪。陈青青总说我乐观主义者里的极度悲观者，我对这句自相矛盾的话嗤之以鼻。然后她用行动告诉我，只有吃才能解决一切问题，因此在她的房间，永远不会缺零食，我甚至觉得哪怕2012" +
                        "真来了，她也会先跑去牛厨狂买三四个购物袋的零食一起逃命。\n" +
                        "　　她觉得我是杞人忧天的80后，我觉得她是无可救药的90后。\n" +
                        "　　当然，在宿舍里，陈青青的理论从未赢过，不是因为她的理论不够强大，而是因为她的声音永远盖不过另一个80后，苏晚晴。\n" +
                        "　　正常情况下，我都是属于点火者，陈青青和苏晚晴这两把干柴便能烧成火焰山，谁也扑不了。大多时候，我都隔岸观火，顺便扇扇风加点油，然后在她们把彼此掐死之前及时递上两瓶冷饮。所以，她们都说，温如夏人如其名。\n" +
                        "　　但今天晚上我点了火，那两把干柴却意外的找不着燃点了，我纳闷了半天，看着她们两个拿着手机死劲按着什么，我夺过陈青青手里的手机，计算器上显示233" +
                        "，我迷惑的看着她，她讪讪的笑，然后靠近我一点，又靠近一点，两团肉压到我背上，我鸡皮疙瘩集体起立。“干嘛？”我提防的看着她，这种时候，肯定没好事。\n" +
                        "　　“夏夏姐？”她吐气如兰。我尖叫一声跳起来，“你，你别过来，虽然老娘我爱看腐文，也支持les" +
                        "和同志，但不代表我的行动也跟着上。”我颤抖着手，气急败坏的指着她。“夏夏！”苏晚晴也朝我笑，那笑，怎么看怎么淫荡。我紧紧抓着门框，决定，她们两个如果敢同时扑上来，我就，我就，要不要从呢？\n" +
                        "　　“切？你的脑袋里正进行什么龌蹉的联想呢？像我们两个貌美如花的美女肯定是要留着资本傍大款的。今天嘛，我和青青主要是想跟你商量点事，那个，你也知道，我们公司发工资一向准时，本来昨天就该发的，但财务说老板的爷爷过世了回家奔丧要月底回来才发。我上个月的工资都打给我妹了。所以，这个月的房租延迟到月底给你。”关键时刻，苏晚晴以绝对向现实低头的姿态和陈青青站到了同一战线。\n" +
                        "　　我拍着胸口，松了一口气。“什么？月底才给我房租，那我在海雅看上的那条连衣裙被别人买走了怎么办？”我失声尖叫。苏晚晴嘿嘿的笑，“夏夏，要不我把我刚买的那两条牛仔裤抵给你？”\n");
    }
}
