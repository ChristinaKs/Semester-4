# **Application Development 02**
## *Practice Notes*

> For tutorials on Android Studio app, you can visit https://developer.android.com

# Chapter 02
## View Defined in XML
```XML
<TextView
    android:id="@+id/show_count"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/myBackgroundColor"
    android:text="@string/count_initial_value"
    android:textColor="@color/colorPrimary"
    android:textSize="@dimen/count_text_size"
    android:textStyle="bold" 
/>
```

## View attributes in XML
android:<property_name>="<property_value>"

Example: 
```XML
android:layout_width="match_parent"
```

android:<property_name>="@<resource_type>/resource_id"
Example: 
```XML
android:text="@string/button_label_next"
```

android:<property_name>="@+id/view_id"
Example:
```XML 
android:id="@+id/show_count"
```

## Create View in Java code
In an Activity:
```java
TextView myText = new TextView(this);
myText.setText("Display this text!");
```

## Context
Get the context:
```java
Context context = getApplicationContext();
```

An Activity is its own context:
```Java
TextView myText = new TextView(this);
``` 

## Layout Created in XML
```XML
<LinearLayout
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
        <Button
            .../>
        <TextView
            .../>
        <Button
            .../>
</LinearLayout
```

## Layout Created in Java Activity Code
```Java
LinearLayout linearL = new LinearLayout(this);
linearL.setOrientation(LinearLayout.VERTICAL);

TextView myText = new TextView(this);
myText.setText("Display this text!");

linearL.addView(myText);
setContentView(linearL);
```

## Set Width and Height in Java Code
Setting the width and height of a view:
```java
LinearLayout.LayoutParams layoutParams = 
    new Linear.LayoutParams(
        LayoutParams.MATCH_PARENT, 
        LayoutParams.MATCH_CONTENT);
myView.setLayoutParams(layoutParams);
```

## Attach handler to view in XML layout
```XML
android:onClick="showToast"
```

## Implement handler in Java activity
```java
public void showToast(View view) {
    String msg = "Hello Toast!";
    Toast toast = Toast.makeText(
        this, msg, duration);
    toast.show();
    }
}
```

## Alternative: Set click handler in Java
```java
final Button button = (Button) findViewById(R.id.button_id);
button.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(this, msg, duration);
        toast.show();
    }
});
```

## Refer to resources in code
* layout
   ```
   R.layout.activity_main
   setContentView(R.layout.activity_main);
   ```
* View

   ```
   R.id.recyclerview
   rv = (RecyclerView) findViewById(R.id.recyclerview);
   ```
* String
   * Java
   ```java
   R.string.title
   ```
   * XML
   ```XML
   android:text="@string/title"
   ```
