package model;

public class Result {
    private int taskNumber;
    private String taskDesc;
    private String resString;
    private Plane plane;
    private Plane[] resPlanes;

    public Result(String taskDesc, String resString , int taskNumber) {
        this.taskDesc = taskDesc;
        this.resString = resString;
        this.taskNumber = taskNumber;
    }

    public Result(String taskDesc, Plane plane,int taskNumber) {
        this.taskDesc = taskDesc;
        this.plane = plane;
        this.taskNumber = taskNumber;

    }

    public Result(String taskDesc, Plane[] resPlanes,int taskNumber ) {
        this.taskDesc = taskDesc;
        this.taskNumber = taskNumber;
        this.resPlanes = resPlanes;
    }

}
