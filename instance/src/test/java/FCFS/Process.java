package FCFS;

/**
 * @author Jianshu
 * @time 20200722
 */
public class Process {

    public String name;
    Float arriveTime;
    Float serverTime;
    Float startTime;
    Float finishedTime;
    Float roundTime;
    Float weightTime;

    public Process(String name, Float arriveTime, Float serverTime) {
        this.name = name;
        this.arriveTime = arriveTime;
        this.serverTime = serverTime;
    }
}
