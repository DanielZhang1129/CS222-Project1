package org.example;

import java.util.List;

public class Output {
    public void print(String message) {
        System.out.println(message);
    }

    public void printErorrMessage(Exception e) {
        System.out.println(e.getMessage());
    }

    public void print(List<Revision> revisions) {
        if (revisions.isEmpty()) {
            System.out.println("No revisions found");
            return;
        }

        for (Revision revision : revisions) {
            System.out.println(revision.getTimestamp() + " " + revision.getUser());
        }
    }
}
