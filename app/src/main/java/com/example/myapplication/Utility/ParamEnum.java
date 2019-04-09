package com.example.myapplication.Utility;

/**
 * Created by Mahipal on 2/11/18.
 */
public enum ParamEnum {

    MyCourses("My Courses"),
    MyOrders("My Orders"),
    MYTHOUGHTS("My Thoughts"),
    Success("SUCCESS"),
    FROM("from"),
    INSTANCE_ID("instance_id"),
    VIEW_LINK("view_link"),
    ASEC_FORUM("ASEC Forum"),
    TEST_RESULT_ID("test_result_id"),
    TEST_ID("testId"),
    QUES_ANS("question_answer"),
    ANSWER_RECORD("answer_record"),
    TEST_TITLE("test_title"),
    NEXT("Next"),
    TOPIC_ID("topic_id"),
    PREV("Prev"),
    SUBMIT("Submit"),
    ZERO("0"),
    ONE("1"),
    TOTAL_QUESTIONS("total_questions"),
    TOTAL_CORRECT_ANSWER("total_correct_answer"),
    HOME("Home"),
    BOOK_ID("book_id"),
    VIDEO("Video"),
    VIDEO_URL("Video Url"),
    SIGN_UP("SignUp"),
    VERIFICATION("Verification"),
    PAYMENT("Payment"),
    TEST("Test"),
    COURSE_DETAIL("Course Details"),
    FREE_LEC("Free Lectures"),
    LOGIN("login"),
    LOGOUT("logout"),
    EAZY_PAY_PAYMENT("payment"),
    PAYMENT_TYPE("payment_type"),
    OFF_DOUBT_SESS("Offline Doubt Session"),
    ANDROID("android"),
    TEST_ANSWER("Test Answer"),
    TEST_RESULT("Test Result"),
    NOTI("Notifications"),
    DOWNLAODING(" downloading"),
    PDF_EXT(".pdf"),
    ONGOING("Ongoing"),
    Assigments("Assignments"),
    DOWN_Assigments("Download Assignment"),
    SOL_Assigments("Solution to Assignment"),
    PAID("Paid"),
    PASS("Pass"),
    C_PASS("Confirm Pass"),
    OFFSUPPOR_MAT("Offline Support Material"),
    FREE("Free"),
    OTP("Otp"),
    EMAIL("Email"),
    PHONE("Phone Number"),
    FULL_NAME("Full Name"),
    SETTINGS("Settings"),
    SIGNUP("Sign Up"),
    PRIORITY("prior"),
    DISCUSS("Discussion"),
    VIDEOS("Videos"),
    TYPE("type"),
    DURATION("duration"),
    CHAT("chat"),
    CHAT_HEAD("chat_data"),
    LIVE_START("livestart"),
    LIVE_LECTURE_SCHEDULE("livecreate"),
    NEW_TEST_ADDED("testcreate"),
    MSG("message"),
    COURSE_ID("Course Id"),
    CHangePass("Change Password"),
    PAST("Past"),
    WEB_URL("URL"),
    ASEC("asec"),
    TOKEN_EXPIRE("tokenexpire"),
    VIDEO_ID("video_id");

    private final String value;

    ParamEnum(String value) {
        this.value=value;
    }

    ParamEnum(){
     this.value=null;
    }

    public String theValue() {
        return this.value;
    }

}