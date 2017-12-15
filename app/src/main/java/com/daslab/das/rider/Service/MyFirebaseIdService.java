package com.daslab.das.rider.Service;

import com.daslab.das.rider.Common.Common;
import com.daslab.das.rider.Model.Token;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


/**
 * Created by User on 12/15/2017.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService{

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
       // Common.curretToken = refreshedToken;

        updateTokenToServer(refreshedToken);//when refrash to token , we need to update



    }

    private void updateTokenToServer(String refreshedToken) {

        FirebaseDatabase db  = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference(Common.token_tbl);

        Token token = new Token(refreshedToken);

        if (FirebaseAuth.getInstance().getCurrentUser() !=null) //if already login , must update Token

            tokens.child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(token);


    }
}

