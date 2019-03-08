package com.example.reminders;

public class Reminder {
    String mReminderText;

    @Override
    public String toString() {return mReminderText; }


    public String getmReminderText() { return mReminderText; }

    public void setmReminderText(String mReminderText) { this.mReminderText = mReminderText; }


    public Reminder(String mReminderText) { this.mReminderText = mReminderText; }
}
