Android学习笔记

# 布局管理器
线性布局(LinearLayout)
相对布局(RelativeLayout)
## 线性布局
最常用属性:
```
android:id; android:layout_width; android:layout_height; android:background
android:layout_margin; android:layout_padding; android:orientation; android:layout_weight

<LinearLayout
        android:id="@+id/ll_1"
        android:layout_width="200dp"
        android:layout_height="200dp"
        android:orientation="vertical"
        android:background="#000000"
        android:paddingLeft="20dp"
        android:paddingRight="20dp"
        android:paddingTop="50dp"
        android:paddingBottom="10dp">
        <View
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#FF0033"/>
    </LinearLayout>
```
## 相对布局
最常用属性
```
android:layout_toLetfOf; android:layout_toRightOf; android:layout_below;
android:layout_alignBottom; android:layout_alignParentBottom
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <View
        android:id="@+id/view_1"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="#000000"/>
    <View
        android:id="@+id/view_2"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="#FF0033"
        android:layout_below="@+id/view_1"/>
</RelativeLayout>

```

# TextView
文字大小、颜色  
显示不下使用   
文字+icon  
中划线、下划线  
跑马灯  

# Button
# EditText
# RadioButton
