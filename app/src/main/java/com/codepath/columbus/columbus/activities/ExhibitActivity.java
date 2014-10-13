package com.codepath.columbus.columbus.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.codepath.columbus.columbus.R;
import com.codepath.columbus.columbus.fragments.exhibit.ExhibitContentFragment;
import com.codepath.columbus.columbus.fragments.exhibit.ExhibitHeaderFragment;

public class ExhibitActivity extends SherlockFragmentActivity {

  private ExhibitHeaderFragment headerFragment;
  private ExhibitContentFragment contentFragment;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_exhibit);

    headerFragment = new ExhibitHeaderFragment();
    contentFragment = new ExhibitContentFragment();

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.headerLayout, headerFragment);
    fragmentTransaction.add(R.id.contentLayout, contentFragment);
    fragmentTransaction.commit();

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
//    getMenuInflater().inflate(R.menu.exhibit, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
