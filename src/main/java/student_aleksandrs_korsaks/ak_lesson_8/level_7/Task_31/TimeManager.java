package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.time.LocalDateTime;

class TimeManager {
    LocalDateTime currentDateAndTime;
    LocalDateTime setDeadLine;

    public TimeManager(LocalDateTime currentDateAndTime, LocalDateTime setDeadLine) {
        this.currentDateAndTime = currentDateAndTime;
        this.setDeadLine = setDeadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeManager that)) return false;
        return currentDateAndTime.equals(that.currentDateAndTime) && setDeadLine.equals(that.setDeadLine);
    }

    @Override
    public String toString() {
        return "TimeManager{" +
                "currentDateAndTime=" + currentDateAndTime +
                ", setDeadLine=" + setDeadLine +
                '}';
    }
}
