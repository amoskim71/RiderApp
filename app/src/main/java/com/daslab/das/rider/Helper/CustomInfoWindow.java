package com.daslab.das.rider.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.daslab.das.rider.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by User on 12/15/2017.
 */

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter{

    View myView;


    public CustomInfoWindow(Context context)
    {
       myView = LayoutInflater.from(context)
                            .inflate(R.layout.custom_rider_information_window,null);

    }


    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickUpTitle = myView.findViewById(R.id.txtPickupInfo);
        txtPickUpTitle.setText(marker.getTitle());

        TextView txtPickUpSnippet = myView.findViewById(R.id.txtPickupSnippet);
        txtPickUpSnippet.setText(marker.getSnippet());

        return myView;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
