package com.mygdx.hastypastry;

import com.google.firebase.database.DataSnapshot;

public interface OnGetDataListener {
    //make new interface for call back
    void onSuccess(DataSnapshot dataSnapshot);
    void onStart();
    void onFailure();
}
