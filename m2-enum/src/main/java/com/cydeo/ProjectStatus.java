package com.cydeo;

import javax.print.DocFlavor;

public enum ProjectStatus {
    OPEN ,CLOSED, PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }


    ProjectStatus() {

    }
}
