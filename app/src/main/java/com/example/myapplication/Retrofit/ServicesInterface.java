package com.example.myapplication.Retrofit;



import com.example.myapplication.Model.CommonModel;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;

/**
 * Created by mahipal on 26/Sep/19.
 */

public interface ServicesInterface {


  /*  @FormUrlEncoded
    @POST(AppConstants.LOGIN)
    Call<CommonModel> login(@Field("email") String email,
                            @Field("password") String password,
                            @Field("deviceType") String deviceType,
                            @Field("deviceToken") String deviceToken);


    @FormUrlEncoded
    @POST(AppConstants.CONTACT_TEAM_ASEC)
    Call<CommonModel> contactTeamAsec(@Field("token") String token,
                                      @Field("user_id") String user_id,
                                      @Field("msg") String msg);


    @Multipart
    @POST(AppConstants.EDIT_PROFILE)
    Call<CommonModel> editprofile(@PartMap Map<String, RequestBody> part,
                                  @Part MultipartBody.Part file);

    @Multipart
    @POST(AppConstants.EDIT_PROFILE)
    Call<CommonModel> editprofile(@PartMap Map<String, RequestBody> part);


    @FormUrlEncoded
    @POST(AppConstants.SENDOTP)
    Call<CommonModel> sendotp(@Field("phone") String phone);

    @FormUrlEncoded
    @POST(AppConstants.ADD_TO_MYFAV)
    Call<CommonModel> addToMyFav(@Field("token") String token,
                                 @Field("user_id") String user_id,
                                 @Field("course_id") String course_id);


    @GET(AppConstants.VIEW_COUNT + "{user_id}" + "/" + "{instance_id}")
    Call<CommonModel> view_count(@Path("user_id") String user_id
            , @Path("instance_id") String instance_id);


    @GET(AppConstants.VIEW_COUNT_ONE + "{user_id}" + "/" + "{instance_id}")
    Call<CommonModel> view_count_one(@Path("user_id") String user_id
            , @Path("instance_id") String instance_id);



    @FormUrlEncoded
    @POST(AppConstants.NOTIFICATION)
    Call<CommonModel> notiOnOff(@Field("token") String token,
                                @Field("user_id") String user_id);


    @FormUrlEncoded
    @POST(AppConstants.VIEWPROFILE)
    Call<CommonModel> viewprofile(@Field("user_id") String user_id,
                                  @Field("token") String token);


    @FormUrlEncoded
    @POST(AppConstants.FORGOT_PASS)
    Call<CommonModel> forgotPass(@Field("email") String email);


    @FormUrlEncoded
    @POST(AppConstants.SIGNUP)
    Call<CommonModel> signup(@Field("fullname") String fullname,
                             @Field("email") String email,
                             @Field("phone") String phone,
                             @Field("deviceType") String deviceType,
                             @Field("deviceToken") String deviceToken,
                             @Field("password") String password,
                             @Field("password_confirmation") String password_confirmation);




    @FormUrlEncoded
    @POST(AppConstants.GETQUESTIONS)
    Call<CommonModel> getquestions(@Field("token") String token,
                                   @Field("user_id") String user_id,
                                   @Field("test_id") String test_id,
                                   @Field("priorites") String priorites,
                                   @Field("question_id") String question_id,
                                   @Field("type") String type,
                                   @Field("answer") String answer,
                                   @Field("ans_record") String ans_record);

    @FormUrlEncoded
    @POST(AppConstants.VIEW_ANSWER_SHEET)
    Call<CommonModel> viewanswers(@Field("token") String token,
                                  @Field("user_id") String user_id,
                                  @Field("test_id") String test_id,
                                  @Field("testresult_id") String testresult_id,
                                  @Field("priorites") String priorites,
                                  @Field("question_id") String question_id,
                                  @Field("type") String type);


    @FormUrlEncoded
    @POST(AppConstants.VIEW_RESULT)
    Call<CommonModel> viewresult(@Field("token") String token,
                                 @Field("user_id") String user_id,
                                 @Field("test_id") String test_id,
                                 @Field("testresult_id") String testresult_id);

    @FormUrlEncoded
    @POST(AppConstants.DOWNLAOD_TEST_RESULT)
    Call<CommonModel> downlaodTestResult(@Field("user_id") String user_id,
                                         @Field("test_id") String test_id,
                                         @Field("ans_record") String ans_record);



    @GET(AppConstants.HOME)
    Call<CommonModel> homeBanner();

    @GET(AppConstants.STUDY_BANNER)
    Call<CommonModel> studyMaterialBanner();

    @GET(AppConstants.FREE_COURSE+"{token}"+"/"+"{user_id}")
    Call<CommonModel> freecourse(@Path("token") String token, @Path("user_id") String userId);


    @GET(AppConstants.TESTLIST)
    Call<CommonModel> testlist();

    @GET(AppConstants.PAID_COURSE)
    Call<CommonModel> paidcourse();

    @GET(AppConstants.BOOKLIST+"{token}"+"/"+"{user_id}")
    Call<CommonModel> bookDetailList(@Path("token") String token, @Path("user_id") String userId);

    @GET(AppConstants.DISCUSSION_LIST)
    Call<CommonModel> discussionlist();

    @GET(AppConstants.MY_FORUM_VIDEO)
    Call<CommonModel> myforumvideo();


    @GET(AppConstants.SUBSCRIPTION)
    Call<CommonModel> subsctiptonList();


    @GET(AppConstants.FAQ_HELP)
    Call<CommonModel> helpAndfaq();

    @GET(AppConstants.ASSIGNMENT)
    Call<CommonModel> assignmentlist();

    @FormUrlEncoded
    @POST(AppConstants.CHANGE_PASS)
    Call<CommonModel> changePassword(@Field("token") String token,
                                     @Field("user_id") String user_id,
                                     @Field("password") String password,
                                     @Field("oldpassword") String oldpassword);

    @FormUrlEncoded
    @POST(AppConstants.SEND_MESSAGE)
    Call<CommonModel> sendmsg(@Field("token") String token,
                              @Field("user_id") String user_id,
                              @Field("topic_id") String topic_id,
                              @Field("msg") String msg);

    @FormUrlEncoded
    @POST(AppConstants.REPLY)
    Call<CommonModel> reply(@Field("token") String token,
                            @Field("user_id") String user_id,
                            @Field("thread_id") String thread_id,
                            @Field("msg") String msg);

    @FormUrlEncoded
    @POST(AppConstants.Discussion_JOIN)
    Call<CommonModel> discussionjoinbyuser(@Field("token") String token,
                                           @Field("user_id") String user_id,
                                           @Field("topic_id") String topic_id);


    @FormUrlEncoded
    @POST(AppConstants.COUPON)
    Call<CommonModel> cupon_code(@Field("token") String token,
                                 @Field("user_id") String user_id,
                                 @Field("course_id") String course_id,
                                 @Field("cupon_code") String cupon_code);


    @FormUrlEncoded
    @POST(AppConstants.PLACE_ORDER)
    Call<CommonModel> placeorder(@Field("token") String token,
                                 @Field("user_id") String user_id,
                                 @Field("book_id") String book_id,
                                 @Field("address1") String address1,
                                 @Field("city") String city,
                                 @Field("pincode") String pincode,
                                 @Field("address2") String address2);


//    @GET("user/{userId}")
//    Call<GetUserResponse> getUser(@Path("userId") String userId);
//

    @GET(AppConstants.MY_FORUM_VIDEO_ID + "{video_id}")
    Call<CommonModel> myforumvideoId(@Path("video_id") String video_id);

    @GET(AppConstants.MY_FREE_COURSE + "{user_id}")
    Call<CommonModel> myFreeCourse(@Path("user_id") String user_id);


    @GET(AppConstants.MY_PAID_COURSE + "{user_id}")
    Call<CommonModel> myPaidCourseList(@Path("user_id") String user_id);




    @GET(AppConstants.NOTIFICATION_HISTORY + "{user_id}")
    Call<CommonModel> notifylist(@Path("user_id") String user_id);



    @GET(AppConstants.MY_ORDER + "{user_id}")
    Call<CommonModel> myorder(@Path("user_id") String user_id);


    @GET(AppConstants.Discussion_COMMENT_LIST + "{topic_id}" + "/" + "{user_id}")
    Call<CommonModel> discussioncommentlist(@Path("topic_id") String topic_id
            , @Path("user_id") String user_id);


    @GET(AppConstants.BOOKDETAIL + "{book_id}")
    Call<CommonModel> booklistDetail(@Path("book_id") String book_id);


    @GET(AppConstants.PAID_COURSE_DETAIL + "{course_id}"+"/"+"{user_id}"+"/"+"{token}")
    Call<CommonModel> paidcoursedetails(@Path("course_id") String course_id, @Path("user_id") String userId, @Path("token") String token);

    @GET(AppConstants.FREE_COURSE_DETAIL +"{token}"+"/"+"{user_id}"+"/"+"{course_id}")
    Call<FreeCourseModel> freeCoursedetails(@Path("token") String token, @Path("user_id") String userId, @Path("course_id") String course_id);

    @GET(AppConstants.DOUBT_SESSION)
    Call<CommonModel> doubtSessionDetails();

    @GET(AppConstants.REGISTER_AND_ADMIT_CARD + "{user_id}" + "/" + "{event_id}")
    Call<CommonModel> getAdmitCard(@Path("user_id") String user_id,
                                   @Path("event_id") String event_id);

    @GET(AppConstants.LIVE_STREAMING+"{course_id}"+"/"+"{token}"+"/"+"{user_id}")
    Call<CommonModel> getLiveStreamingCourses(@Path("course_id") String course_id, @Path("token") String token, @Path("user_id") String userId);
*/
}






