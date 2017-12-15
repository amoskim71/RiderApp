package com.daslab.das.rider.Common;

import com.daslab.das.rider.Remote.FCMClient;
import com.daslab.das.rider.Remote.IFCMService;
import com.daslab.das.rider.Remote.IGoogleAPI;
import com.daslab.das.rider.Remote.ReterofitClient;

/**
 * Created by User on 12/8/2017.
 */

public class Common {

public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String picup_request_tbl = "PickUpRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com/";




    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }



}
