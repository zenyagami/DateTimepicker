DateTimepicker
==============

DateTimePicker 4.4 kitKat style Backported for 2.3+ using nineoldandroid
This is based on Gooogle AOSP source code, an amazing work,
i just back ported to 2.3 (maybe can work for 2.1+ i did not tested yet)

There are 2 dialogs, Date Picker and Time Picker. both can work from a fragment or fragmentActivity
The library needs (in libs folder) nineoldAndroid for animations
LDPI resolution its working ;)

![DatePicker](https://raw.github.com/zenyagami/DateTimepicker/jb-mr2-release/Screenshot_2014-02-25-12-57-40.png)
![TimePicker](https://raw.github.com/zenyagami/DateTimepicker/jb-mr2-release/Screenshot_2014-02-25-12-57-54.png)
# Usage:
Date:
```
#!java
DatePickerDialog date =DatePickerDialog.newInstance(OnDateSetListener,int year,int month,boolean vibrate);
date.show(getSupportFragmentManager(), TAG);

```
Time:
```
#!java
TimePickerDialog time = TimePickerDialog.newInstance(OnTimeSetListener callback,int hourOfDay, int minute, boolean is24HourMode);
time.show(getSupportFragmentManager(), TAG);
```
