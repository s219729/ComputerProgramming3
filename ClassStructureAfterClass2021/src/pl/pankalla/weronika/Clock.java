// 20.	Define a class Clock that represents a digital clock.
// It has two attributes: hour and minute.
// The hour value ranges from 0 to 23.
// The minute value ranges from 0 to 59.

// Next, define the following constructors:
//a.	Clock() – initialises clock to 00:00
//b.	Clock(hour,minute) – initialises clock to hour:minute

//Then, define methods:
//c.	setClock(hour,minute)
//d.	setClock() - reset clock to 00:00
//e.	displayTime()
//f.	addOneMinute()

//After that, write a program that:
//g.	creates a clock with starting time 12:47
//h.	displays time
//i.	sets a clock to 18:14
//j.	displays time
//k.	sets a clock to 09:03
//l.	displays time
//m.	sets a clock to 23:58
//n.	displays time
//o.	adds one minute
//p.	displays time
//q.	adds one minute
//r.	displays time

//21.	Add an alarm function to the clock.
// Complete the class definition with the attributes: alarmHour, alarmMinute.
// Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!" alarm sound.
// Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method).

package pl.pankalla.weronika;

public class Clock {
    int hour;
    int minute;
    // set to -1 to avoid running alarm on 00:00
    int alarmHour = -1;
    int alarmMinute = -1;


    Clock(){
        this.hour = 0;
        this.minute = 0;
        displayTime();
    }

    Clock(int hour, int minute){
        if(hour>=24 || hour<0) {
            System.out.println("Hour should be in the range of [0-23]. Setting hour to 0");
            this.hour=0;
        }
        else {
            this.hour = hour;
        }
        if(minute>=59 || minute<0) {
            System.out.println("Minute should be in the range of [0-59]. Setting minute to 0");
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        displayTime();
    }

    // setClock(hour,minute)

    public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }


    // setClock() - reset clock to 00:00

    public void setClock(){
        setClock(0,0);
    }

    // displayTime()
    public void displayTime(){
        System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minute));
    }




    // addOneMinute()
    public void addOneMinute(){
        if(this.minute == 59) {
            if(this.hour==23){
                this.hour=0;
            }
            else {
                this.hour += 1;
            }
            this.minute = 0;
        }
        else {
            this.minute += 1;
        }
        if(this.hour == alarmHour && this.minute == alarmMinute){
            runAlarm();
        }
    }


    // Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!" alarm sound.
    //// Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method).

    public void setAlarm(int hour, int minute){
        alarmHour = hour;
        alarmMinute = minute;
    }

    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }


}