public class Time
{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick()
    {
        if((seconds + 1) == 60)
        {
            if((minutes + 1) == 60)
            {
                if ((hours + 1) == 24)
                {
                    hours = 0;
                }
                else
                {
                    hours++;
                }
                minutes = 0;
            }
            else
            {
                minutes++;
            }
            seconds = 0;
        }
        else
        {
            seconds++;
        }
    }

    public int getHours()
    {
        return hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void add(Time object)
    {
        seconds = seconds + object.getSeconds();
        minutes = minutes + object.getMinutes();
        hours = hours + object.getHours();
        if(seconds >= 60)
        {
            minutes++;
            seconds = seconds - 60;
        }
        if(minutes >= 60)
        {
            hours++;
            minutes = minutes - 60;
        }
        if(hours >= 24)
        {
            hours = hours - 24;
        }
    }

    public String toString()
    {
        String hour = Integer.toString(hours);
        String minute = Integer.toString(minutes);
        String second = Integer.toString(seconds);
        if(hour.length() == 1)
        {
            hour = "0" + hour;
        }
        if(minute.length() == 1)
        {
            minute = "0" + minute;
        }
        if(second.length() == 1)
        {
            second = "0" + second;
        }
        return(hour + ":" + minute + ":" + second);
    }
}