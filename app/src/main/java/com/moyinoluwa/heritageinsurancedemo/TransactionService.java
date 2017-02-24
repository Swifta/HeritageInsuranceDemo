package com.moyinoluwa.heritageinsurancedemo;

import com.moyinoluwa.heritageinsurancedemo.mobilemoney.MobileMoneyRequest;
import com.moyinoluwa.heritageinsurancedemo.mobilemoney.MobileMoneyResponse;

import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by moyinoluwa on 10/11/16.
 */

public interface TransactionService {

    @POST(Url.MOBILE_MONEY)
    Observable<MobileMoneyResponse> performMobileMoneyTransaction(@Header("Authorization") String
                                                                authorization, @Body MobileMoneyRequest mobileMoneyRequest);

}
