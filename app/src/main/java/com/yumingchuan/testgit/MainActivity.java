package com.yumingchuan.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //第一次提交
        //第二次提交
        //第三次提交


        //第四次提交，修改本地分支dev为dev1,删除了本地,远程分支dev，建立本地分支的上传流、


        //第五次提交,在beta的分支下创建了dev2分支，模拟两个开发者，同时向beta分支提交内容的情形。


        //beta分支提交了新的修改。


        //dev1 分支进行了部分项目的开发，现在要切换到到beta分支进行修复bug，，修复完成了


        //工作做了一般了，要修复bug这个时候用stash,

        //回复stash保存的内容，修复了bug，继续工作，

        //从某个分支拉去最新的代码的方法，步骤
            //1：git fetch(+分支名) 获取所有分支的更新（或者某一个分支的更新）
            //2：然后是使用git checkout -b tmp origin/分支名  创建某个分支分的分支，并切换到该分支
            //3：然后是用git merge origin/分支名 把分支origin/分支名的内容合并
            //4：在切换到dev1分支，使用git merge tmp 进行合并，这个时候，dev1已经是最新的代码了
            //5：最后删除tmp分支，git branch -d tmp

    }
}
