
package Firstdroid.Tutorial.Gps;



import android.R.layout;
import android.app.Activity;

import android.content.Context;

import android.location.Location;

import android.location.LocationListener;

import android.location.LocationManager;

import android.os.Bundle;

import android.widget.Toast;


public class MainActivity extends Activity

{
    
     public double latitude;
    public double longitude;    

/** Called when the activity is first created. */

@Override

public void onCreate(Bundle savedInstanceState)

{

super.onCreate(savedInstanceState);

setContentView(R.layout.main);


/* Use the LocationManager class to obtain GPS locations */

LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

LocationListener mlocListener = new MyLocationListener();


mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);


}


/* Class My Location Listener */

public class MyLocationListener implements LocationListener

{

@Override

public void onLocationChanged(Location loc)

{

latitude = loc.getLatitude();

longitude = loc.getLongitude();

String Text = "My current location is: " +

"Latitud = " + latitude +

"Longitud = " + longitude;


Toast.makeText( getApplicationContext(), Text, Toast.LENGTH_SHORT).show();



}

@Override

public void onProviderDisabled(String provider)

{

Toast.makeText( getApplicationContext(), "Gps Disabled",Toast.LENGTH_SHORT ).show();

}


@Override

public void onProviderEnabled(String provider)

{

Toast.makeText( getApplicationContext(), "Gps Enabled",Toast.LENGTH_SHORT).show();

}


@Override

public void onStatusChanged(String provider, int status, Bundle extras)

{


}

}
}/* End of Class MyLocationListener */

